package com.po;

import java.io.Serializable;
import java.util.List;

/**
 * Created by zcy on 2017/8/9.22:05:49
 */
public class RltMsg<T> implements Serializable {
    private static final long serialVersionUID = 1091311515906831278L;
    /**
     *
     */
//	private static final long serialVersionUID = 1L;
    private boolean result;//处理状态
    private String resultCode; //处理状态码，可自行设定也可统一设定
    private Object data;//其他数据
    private String msg;//消息

    private String errorMsg;
    private List<T> rows;//bootstarp分页设置每一行数据
    private Long total;//分页设置总数
    private T jsonObjects;

    public T getJsonObjects() {
        return jsonObjects;
    }

    public void setJsonObjects(T jsonObjects) {
        this.jsonObjects = jsonObjects;
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }

    public boolean getResult() {
        return result;
    }
    public void setResult(boolean result) {
        this.result = result;
    }

    public Object getData() {
        return data;
    }
    public void setData(Object data) {
        this.data = data;
    }
    public String getMsg() {
        return msg;
    }
    public void setMsg(String msg) {
        this.msg = msg;
    }
    public List<T> getRows() {
        return rows;
    }
    public void setRows(List<T> rows) {
        this.rows = rows;
    }
    public Long getTotal() {
        return total;
    }
    public void setTotal(long total2) {
        this.total = total2;
    }

    public String getResultCode() {
        return resultCode;
    }

    public void setResultCode(String resultCode) {
        this.resultCode = resultCode;
    }
    @Override
    public String toString() {
        return "ResultMsg{" +
                "result=" + result +
                ", resultCode='" + resultCode + '\'' +
                ", data=" + data +
                ", msg='" + msg + '\'' +
                ", errorMsg='" + errorMsg + '\'' +
                ", rows=" + rows +
                ", total=" + total +
                '}';
    }
}