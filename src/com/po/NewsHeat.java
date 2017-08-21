package com.po;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by zcy on 2017/8/9.22:12:31
 */
public class NewsHeat implements Serializable {
    private static final long serialVersionUID = 5980457629769327052L;
    private String secID;
    private String exchangeCD;
    private String exchangeName;
    private String ticker;
    private String secShortName;
    private Date newsPublishDate;
    private double heatIndex;
    private Date insertTime;
    private Date updateTime;

    public String getSecID() {
        return secID;
    }

    public void setSecID(String secID) {
        this.secID = secID;
    }

    public String getExchangeCD() {
        return exchangeCD;
    }

    public void setExchangeCD(String exchangeCD) {
        this.exchangeCD = exchangeCD;
    }

    public String getExchangeName() {
        return exchangeName;
    }

    public void setExchangeName(String exchangeName) {
        this.exchangeName = exchangeName;
    }

    public String getTicker() {
        return ticker;
    }

    public void setTicker(String ticker) {
        this.ticker = ticker;
    }

    public String getSecShortName() {
        return secShortName;
    }

    public void setSecShortName(String secShortName) {
        this.secShortName = secShortName;
    }

    public Date getNewsPublishDate() {
        return newsPublishDate;
    }

    public void setNewsPublishDate(Date newsPublishDate) {
        this.newsPublishDate = newsPublishDate;
    }

    public double getHeatIndex() {
        return heatIndex;
    }

    public void setHeatIndex(double heatIndex) {
        this.heatIndex = heatIndex;
    }

    public Date getInsertTime() {
        return insertTime;
    }

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}
