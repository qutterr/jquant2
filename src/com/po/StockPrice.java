package com.po;

import java.util.Date;

/**
 * Created by zcy on 2017/8/10.17:47:29
 */
public class StockPrice {
    private String secID;

    private String ticker;

    private String secShortName;

    private String secShortNameEN;

    private String exchangeCD;

    private Date tradeDate;

    private double preClosePrice;

    private double openPrice;

    private double highestPrice;

    private double lowestPrice;

    private double closePrice;

    private double turnoverVol;

    private double turnovervalue;

    private double dealAmount;

    public String getSecID() {
        return secID;
    }

    public void setSecID(String secID) {
        this.secID = secID;
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

    public String getSecShortNameEN() {
        return secShortNameEN;
    }

    public void setSecShortNameEN(String secShortNameEN) {
        this.secShortNameEN = secShortNameEN;
    }

    public String getExchangeCD() {
        return exchangeCD;
    }

    public void setExchangeCD(String exchangeCD) {
        this.exchangeCD = exchangeCD;
    }

    public Date getTradeDate() {
        return tradeDate;
    }

    public void setTradeDate(Date tradeDate) {
        this.tradeDate = tradeDate;
    }

    public double getPreClosePrice() {
        return preClosePrice;
    }

    public void setPreClosePrice(double preClosePrice) {
        this.preClosePrice = preClosePrice;
    }

    public double getOpenPrice() {
        return openPrice;
    }

    public void setOpenPrice(double openPrice) {
        this.openPrice = openPrice;
    }

    public double getHighestPrice() {
        return highestPrice;
    }

    public void setHighestPrice(double highestPrice) {
        this.highestPrice = highestPrice;
    }

    public double getLowestPrice() {
        return lowestPrice;
    }

    public void setLowestPrice(double lowestPrice) {
        this.lowestPrice = lowestPrice;
    }

    public double getClosePrice() {
        return closePrice;
    }

    public void setClosePrice(double closePrice) {
        this.closePrice = closePrice;
    }

    public double getTurnoverVol() {
        return turnoverVol;
    }

    public void setTurnoverVol(double turnoverVol) {
        this.turnoverVol = turnoverVol;
    }

    public double getTurnovervalue() {
        return turnovervalue;
    }

    public void setTurnovervalue(double turnovervalue) {
        this.turnovervalue = turnovervalue;
    }

    public double getDealAmount() {
        return dealAmount;
    }

    public void setDealAmount(double dealAmount) {
        this.dealAmount = dealAmount;
    }
}
