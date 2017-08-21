package com.datayes.whale.api.util;

import com.alibaba.fastjson.JSON;
import com.po.EquDto;
import com.po.EquInfo;
import com.po.NewsHeat;
import com.po.dto.NewsHeatDto;
import jquant2.util.DbBuilder;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.ColumnListHandler;
import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.util.EntityUtils;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

/**
 * Created by zcy on 2017/8/9.22:18:36
 */
public class TestMain {
    public static void main(String[] args) {
        /*String url = "https://api.wmcloud.com/data/v1/api/subject/getNewsHeatIndexV2.json??field=&exchangeCD=&ticker=002415&secShortName=&beginDate=&endDate=";
        //String url = "https://api.wmcloud.com/data/v1/api/equity/getEqu.json";
        HttpGet httpGet = new HttpGet(url);
        //在header里加入 Bearer {token}，添加认证的token，并执行get请求获取json数据
        httpGet.addHeader("Authorization", "Bearer " + HttpUtil.ACCESS_TOKEN);
        CloseableHttpResponse response = null;
        String body = null;
        try {
            response = HttpUtil.createHttpsClient().execute(httpGet);
            HttpEntity entity = response.getEntity();
            body = EntityUtils.toString(entity);
            EquDto equDto = JSON.parseObject(body,EquDto.class);
            if(equDto.getRetCode()==1){
                DbBuilder.delete("DELETE FROM equ");
                for(EquInfo info : equDto.getData()){
                    DbBuilder.insertEqu(info);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }*/
        //DbBuilder.insert("INSERT INTO equ ( secID, ticker) VALUES (?,?)", "123", "456");
        QueryRunner runner = DbBuilder.getQueryRunner();
        try {
            List columnResult = (List) runner.query("SELECT equ.ticker FROM equ equ WHERE equ.secID IN (SELECT A.secID FROM  MSCIChinaA A)", new ColumnListHandler("ticker"));
            System.out.println();
            for(Object s : columnResult){
                String url = "https://api.wmcloud.com/data/v1/api/subject/getNewsHeatIndexV2.json??field=&exchangeCD=&ticker="+s.toString()+"&secShortName=&beginDate=&endDate=";
                HttpGet httpGet = new HttpGet(url);
                httpGet.addHeader("Authorization", "Bearer " + HttpUtil.ACCESS_TOKEN);
                CloseableHttpResponse response = HttpUtil.createHttpsClient().execute(httpGet);
                HttpEntity entity = response.getEntity();
                String body = EntityUtils.toString(entity);
                NewsHeatDto newsDto = JSON.parseObject(body,NewsHeatDto.class);
                for (NewsHeat newsHeat : newsDto.getData()){
                    DbBuilder.insertNewsHeat(newsHeat);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }catch (IOException e) {
            e.printStackTrace();
        }
    }
}
