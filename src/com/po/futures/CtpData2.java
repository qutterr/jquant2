package com.po.futures;

/**
 * Created by zcy on 2017/8/18.22:28:27
 */
public class CtpData2 {
    //业务日期
    private String actionDay;
    //申卖价一
    private Double askPrice1;
    //申卖量一
    private Integer askVolume1;
    //申买价一
    private Double bidPrice1;
    //申买量一
    private Integer bidVolume1;
    //持仓量
    private Double openInterest;
    //最后修改毫秒
    private Integer updateMillisec;
    //最后修改时间
    private String updateTime;
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

    public Integer getAskVolume1() {
        return askVolume1;
    }

    public void setAskVolume1(Integer askVolume1) {
        this.askVolume1 = askVolume1;
    }

    public Double getBidPrice1() {
        return bidPrice1;
    }

    public void setBidPrice1(Double bidPrice1) {
        this.bidPrice1 = bidPrice1;
    }

    public Integer getBidVolume1() {
        return bidVolume1;
    }

    public void setBidVolume1(Integer bidVolume1) {
        this.bidVolume1 = bidVolume1;
    }

    public Double getOpenInterest() {
        return openInterest;
    }

    public void setOpenInterest(Double openInterest) {
        this.openInterest = openInterest;
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

    public Integer getVolume() {
        return volume;
    }

    public void setVolume(Integer volume) {
        this.volume = volume;
    }
}
