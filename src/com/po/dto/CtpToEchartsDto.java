package com.po.dto;

import java.util.Date;

/**
 * Created by zcy on 2017/8/18.18:13:55
 */
public class CtpToEchartsDto {
    //时间点
    private Date datetime;
    //卖一价
    private Double ask;
    //成交量
    private Integer volume;
    //持仓量
    private Double interest;

    public Date getDatetime() {
        return datetime;
    }

    public void setDatetime(Date datetime) {
        this.datetime = datetime;
    }

    public Double getAsk() {
        return ask;
    }

    public void setAsk(Double ask) {
        this.ask = ask;
    }

    public Integer getVolume() {
        return volume;
    }

    public void setVolume(Integer volume) {
        this.volume = volume;
    }

    public Double getInterest() {
        return interest;
    }

    public void setInterest(Double interest) {
        this.interest = interest;
    }
}
