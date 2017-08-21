package com.po.dto;

import com.po.StockPrice;

import java.util.List;

/**
 * Created by zcy on 2017/8/10.17:49:03
 */
public class StockPriceDto {
    private int retCode;
    private String retMsg;
    private List<StockPrice> data;

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

    public List<StockPrice> getData() {
        return data;
    }

    public void setData(List<StockPrice> data) {
        this.data = data;
    }
}
