package com.po.futures;

import java.io.Serializable;

/**
 * Created by zcy on 2017/8/11.11:57:12
 */
public class CtpData implements Serializable{
    private static final long serialVersionUID = 5455735676804983352L;
    //业务日期
    private String actionDay;
    //申卖价一
    private Double askPrice1;
    //申卖价二
    private Double askPrice2;
    //申卖价三
    private Double askPrice3;
    //申卖价四
    private Double askPrice4;
    //申卖价五
    private Double askPrice5;
    //申卖量一
    private Integer askVolume1;
    //申卖量二
    private Integer askVolume2;
    //申卖量三
    private Integer askVolume3;
    //申卖量四
    private Integer askVolume4;
    //申卖量五
    private Integer askVolume5;
    //当日均价
    private Double averagePrice;
    //申买价一
    private Double bidPrice1;
    //申买价二
    private Double bidPrice2;
    //申买价三
    private Double bidPrice3;
    //申买价四
    private Double bidPrice4;
    //申买价五
    private Double bidPrice5;
    //申买量一
    private Integer bidVolume1;
    //申买量二
    private Integer bidVolume2;
    //申买量三
    private Integer bidVolume3;
    //申买量四
    private Integer bidVolume4;
    //申买量五
    private Integer bidVolume5;
    //今收盘
    private Double closePrice;
    //今虚实度
    private Double currDelta;
    //交易所代码
    private String exchangeID;
    //合约在交易所的代码
    private String exchangeInstID;
    //最高价
    private Double highestPrice;
    //合约代码
    private String instrumentID;
    //最新价
    private Double lastPrice;
    //跌停板价
    private Double lowerLimitPrice;
    //最低价
    private Double lowestPrice;
    //持仓量
    private Double openInterest;
    //开仓价
    private Double openPrice;
    //昨收盘
    private Double preClosePrice;
    //昨虚实度
    private Double preDelta;
    //昨持仓量
    private Double preOpenInterest;
    //上次结算价
    private Double preSettlementPrice;
    //本次结算价
    private Double settlementPrice;
    //交易日
    private String tradingDay;
    //成交金额
    private Double turnover;
    //最后修改毫秒
    private Integer updateMillisec;
    //最后修改时间
    private String updateTime;
    //涨停板价
    private Double upperLimitPrice;
    //数量
    private Integer volume;

    public String getActionDay() {
        return actionDay;
    }

    public void setActionDay(String actionDay) {
        this.actionDay = actionDay;
    }

    public Double getAskPrice1() {
        return askPrice1;
    }

    public void setAskPrice1(Double askPrice1) {
        this.askPrice1 = askPrice1;
    }

    public Double getAskPrice2() {
        return askPrice2;
    }

    public void setAskPrice2(Double askPrice2) {
        this.askPrice2 = askPrice2;
    }

    public Double getAskPrice3() {
        return askPrice3;
    }

    public void setAskPrice3(Double askPrice3) {
        this.askPrice3 = askPrice3;
    }

    public Double getAskPrice4() {
        return askPrice4;
    }

    public void setAskPrice4(Double askPrice4) {
        this.askPrice4 = askPrice4;
    }

    public Double getAskPrice5() {
        return askPrice5;
    }

    public void setAskPrice5(Double askPrice5) {
        this.askPrice5 = askPrice5;
    }

    public Integer getAskVolume1() {
        return askVolume1;
    }

    public void setAskVolume1(Integer askVolume1) {
        this.askVolume1 = askVolume1;
    }

    public Integer getAskVolume2() {
        return askVolume2;
    }

    public void setAskVolume2(Integer askVolume2) {
        this.askVolume2 = askVolume2;
    }

    public Integer getAskVolume3() {
        return askVolume3;
    }

    public void setAskVolume3(Integer askVolume3) {
        this.askVolume3 = askVolume3;
    }

    public Integer getAskVolume4() {
        return askVolume4;
    }

    public void setAskVolume4(Integer askVolume4) {
        this.askVolume4 = askVolume4;
    }

    public Integer getAskVolume5() {
        return askVolume5;
    }

    public void setAskVolume5(Integer askVolume5) {
        this.askVolume5 = askVolume5;
    }

    public Double getAveragePrice() {
        return averagePrice;
    }

    public void setAveragePrice(Double averagePrice) {
        this.averagePrice = averagePrice;
    }

    public Double getBidPrice1() {
        return bidPrice1;
    }

    public void setBidPrice1(Double bidPrice1) {
        this.bidPrice1 = bidPrice1;
    }

    public Double getBidPrice2() {
        return bidPrice2;
    }

    public void setBidPrice2(Double bidPrice2) {
        this.bidPrice2 = bidPrice2;
    }

    public Double getBidPrice3() {
        return bidPrice3;
    }

    public void setBidPrice3(Double bidPrice3) {
        this.bidPrice3 = bidPrice3;
    }

    public Double getBidPrice4() {
        return bidPrice4;
    }

    public void setBidPrice4(Double bidPrice4) {
        this.bidPrice4 = bidPrice4;
    }

    public Double getBidPrice5() {
        return bidPrice5;
    }

    public void setBidPrice5(Double bidPrice5) {
        this.bidPrice5 = bidPrice5;
    }

    public Integer getBidVolume1() {
        return bidVolume1;
    }

    public void setBidVolume1(Integer bidVolume1) {
        this.bidVolume1 = bidVolume1;
    }

    public Integer getBidVolume2() {
        return bidVolume2;
    }

    public void setBidVolume2(Integer bidVolume2) {
        this.bidVolume2 = bidVolume2;
    }

    public Integer getBidVolume3() {
        return bidVolume3;
    }

    public void setBidVolume3(Integer bidVolume3) {
        this.bidVolume3 = bidVolume3;
    }

    public Integer getBidVolume4() {
        return bidVolume4;
    }

    public void setBidVolume4(Integer bidVolume4) {
        this.bidVolume4 = bidVolume4;
    }

    public Integer getBidVolume5() {
        return bidVolume5;
    }

    public void setBidVolume5(Integer bidVolume5) {
        this.bidVolume5 = bidVolume5;
    }

    public Double getClosePrice() {
        return closePrice;
    }

    public void setClosePrice(Double closePrice) {
        this.closePrice = closePrice;
    }

    public Double getCurrDelta() {
        return currDelta;
    }

    public void setCurrDelta(Double currDelta) {
        this.currDelta = currDelta;
    }

    public String getExchangeID() {
        return exchangeID;
    }

    public void setExchangeID(String exchangeID) {
        this.exchangeID = exchangeID;
    }

    public String getExchangeInstID() {
        return exchangeInstID;
    }

    public void setExchangeInstID(String exchangeInstID) {
        this.exchangeInstID = exchangeInstID;
    }

    public Double getHighestPrice() {
        return highestPrice;
    }

    public void setHighestPrice(Double highestPrice) {
        this.highestPrice = highestPrice;
    }

    public String getInstrumentID() {
        return instrumentID;
    }

    public void setInstrumentID(String instrumentID) {
        this.instrumentID = instrumentID;
    }

    public Double getLastPrice() {
        return lastPrice;
    }

    public void setLastPrice(Double lastPrice) {
        this.lastPrice = lastPrice;
    }

    public Double getLowerLimitPrice() {
        return lowerLimitPrice;
    }

    public void setLowerLimitPrice(Double lowerLimitPrice) {
        this.lowerLimitPrice = lowerLimitPrice;
    }

    public Double getLowestPrice() {
        return lowestPrice;
    }

    public void setLowestPrice(Double lowestPrice) {
        this.lowestPrice = lowestPrice;
    }

    public Double getOpenInterest() {
        return openInterest;
    }

    public void setOpenInterest(Double openInterest) {
        this.openInterest = openInterest;
    }

    public Double getOpenPrice() {
        return openPrice;
    }

    public void setOpenPrice(Double openPrice) {
        this.openPrice = openPrice;
    }

    public Double getPreClosePrice() {
        return preClosePrice;
    }

    public void setPreClosePrice(Double preClosePrice) {
        this.preClosePrice = preClosePrice;
    }

    public Double getPreDelta() {
        return preDelta;
    }

    public void setPreDelta(Double preDelta) {
        this.preDelta = preDelta;
    }

    public Double getPreOpenInterest() {
        return preOpenInterest;
    }

    public void setPreOpenInterest(Double preOpenInterest) {
        this.preOpenInterest = preOpenInterest;
    }

    public Double getPreSettlementPrice() {
        return preSettlementPrice;
    }

    public void setPreSettlementPrice(Double preSettlementPrice) {
        this.preSettlementPrice = preSettlementPrice;
    }

    public Double getSettlementPrice() {
        return settlementPrice;
    }

    public void setSettlementPrice(Double settlementPrice) {
        this.settlementPrice = settlementPrice;
    }

    public String getTradingDay() {
        return tradingDay;
    }

    public void setTradingDay(String tradingDay) {
        this.tradingDay = tradingDay;
    }

    public Double getTurnover() {
        return turnover;
    }

    public void setTurnover(Double turnover) {
        this.turnover = turnover;
    }

    public Integer getUpdateMillisec() {
        return updateMillisec;
    }

    public void setUpdateMillisec(Integer updateMillisec) {
        this.updateMillisec = updateMillisec;
    }

    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    public Double getUpperLimitPrice() {
        return upperLimitPrice;
    }

    public void setUpperLimitPrice(Double upperLimitPrice) {
        this.upperLimitPrice = upperLimitPrice;
    }

    public Integer getVolume() {
        return volume;
    }

    public void setVolume(Integer volume) {
        this.volume = volume;
    }

    @Override
    public String toString() {
        return "CtpData{" +
                "actionDay='" + actionDay + '\'' +
                ", askPrice1=" + askPrice1 +
                ", askPrice2=" + askPrice2 +
                ", askPrice3=" + askPrice3 +
                ", askPrice4=" + askPrice4 +
                ", askPrice5=" + askPrice5 +
                ", askVolume1=" + askVolume1 +
                ", askVolume2=" + askVolume2 +
                ", askVolume3=" + askVolume3 +
                ", askVolume4=" + askVolume4 +
                ", askVolume5=" + askVolume5 +
                ", averagePrice=" + averagePrice +
                ", bidPrice1=" + bidPrice1 +
                ", bidPrice2=" + bidPrice2 +
                ", bidPrice3=" + bidPrice3 +
                ", bidPrice4=" + bidPrice4 +
                ", bidPrice5=" + bidPrice5 +
                ", bidVolume1=" + bidVolume1 +
                ", bidVolume2=" + bidVolume2 +
                ", bidVolume3=" + bidVolume3 +
                ", bidVolume4=" + bidVolume4 +
                ", bidVolume5=" + bidVolume5 +
                ", closePrice=" + closePrice +
                ", currDelta=" + currDelta +
                ", exchangeID='" + exchangeID + '\'' +
                ", exchangeInstID='" + exchangeInstID + '\'' +
                ", highestPrice=" + highestPrice +
                ", instrumentID='" + instrumentID + '\'' +
                ", lastPrice=" + lastPrice +
                ", lowerLimitPrice=" + lowerLimitPrice +
                ", lowestPrice=" + lowestPrice +
                ", openInterest=" + openInterest +
                ", openPrice=" + openPrice +
                ", preClosePrice=" + preClosePrice +
                ", preDelta=" + preDelta +
                ", preOpenInterest=" + preOpenInterest +
                ", preSettlementPrice=" + preSettlementPrice +
                ", settlementPrice=" + settlementPrice +
                ", tradingDay='" + tradingDay + '\'' +
                ", turnover=" + turnover +
                ", updateMillisec=" + updateMillisec +
                ", updateTime='" + updateTime + '\'' +
                ", upperLimitPrice=" + upperLimitPrice +
                ", volume=" + volume +
                '}';
    }
}
