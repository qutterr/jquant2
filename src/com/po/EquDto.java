package com.po;

import java.util.List;

/**
 * Created by zcy on 2017/8/9.23:09:48
 */
public class EquDto {
    private int retCode;
    private String retMsg;
    private List<EquInfo> data;

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

    public List<EquInfo> getData() {
        return data;
    }

    public void setData(List<EquInfo> data) {
        this.data = data;
    }
}
