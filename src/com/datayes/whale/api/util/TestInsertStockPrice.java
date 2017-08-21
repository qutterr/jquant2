package com.datayes.whale.api.util;

import com.alibaba.fastjson.JSON;
import com.po.NewsHeat;
import com.po.StockPrice;
import com.po.dto.NewsHeatDto;
import com.po.dto.StockPriceDto;
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
 * Created by zcy on 2017/8/10.17:37:34
 */
public class TestInsertStockPrice {
    public static void main(String[] args) {
        QueryRunner runner = DbBuilder.getQueryRunner();
        try {
            List columnResult = (List) runner.query("SELECT A.secID FROM  MSCIChinaA A", new ColumnListHandler("secID"));
            for(Object s : columnResult){
                String url = "https://api.wmcloud.com/data/v1/api/market/getMktEqudJY.json?field=&secID="+s.toString()+"&startDate=&endDate=";
                HttpGet httpGet = new HttpGet(url);
                httpGet.addHeader("Authorization", "Bearer " + HttpUtil.ACCESS_TOKEN);
                CloseableHttpResponse response = HttpUtil.createHttpsClient().execute(httpGet);
                HttpEntity entity = response.getEntity();
                String body = EntityUtils.toString(entity);
                StockPriceDto stockPriceDto = JSON.parseObject(body, StockPriceDto.class);
                for (StockPrice ss : stockPriceDto.getData()){
                    DbBuilder.insertStockPrice(ss);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }catch (IOException e) {
            e.printStackTrace();
        }
    }
}
