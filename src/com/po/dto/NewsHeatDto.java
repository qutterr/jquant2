package com.po.dto;

import com.po.NewsHeat;

import java.util.List;

/**
 * Created by zcy on 2017/8/10.9:35:43
 */
public class NewsHeatDto {
    private int retCode;
    private String retMsg;
    private List<NewsHeat> data;

    public int getRetCode() {
        return retCode;
    }

    public void setRetCode(int retCode) {
        this.retCode = retCode;
    }

    public String getRetMsg() {
        return retMsg;
    }

    public void setRetMsg(String retMsg) {
        this.retMsg = retMsg;
    }

    public List<NewsHeat> getData() {
        return data;
    }

    public void setData(List<NewsHeat> data) {
        this.data = data;
    }
}
