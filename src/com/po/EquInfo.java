package com.po;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by zcy on 2017/8/9.20:22:54 股票基本信息
 */
public class EquInfo implements Serializable{
    private static final long serialVersionUID = 237087783618009885L;
    private String secID;
    private String ticker;
    private String exchangeCD;
    private int ListSectorCD;
    private String ListSector;
    private String transCurrCD;
    private String secShortName;
    private String secFullName;
    private String listStatusCD;
    private Date listDate;
    private String equTypeCD;
    private String equType;
    private String exCountryCD;
    private int partyID;
    private String totalShares;
    private String nonrestFloatShares;
    private String nonrestfloatA;
    private String officeAddr;
    private String primeOperating;
    private Date endDate;
    private String TShEquity;

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

    public String getExchangeCD() {
        return exchangeCD;
    }

    public void setExchangeCD(String exchangeCD) {
        this.exchangeCD = exchangeCD;
    }

    public int getListSectorCD() {
        return ListSectorCD;
    }

    public void setListSectorCD(int listSectorCD) {
        ListSectorCD = listSectorCD;
    }

    public String getListSector() {
        return ListSector;
    }

    public void setListSector(String listSector) {
        ListSector = listSector;
    }

    public String getTransCurrCD() {
        return transCurrCD;
    }

    public void setTransCurrCD(String transCurrCD) {
        this.transCurrCD = transCurrCD;
    }

    public String getSecShortName() {
        return secShortName;
    }

    public void setSecShortName(String secShortName) {
        this.secShortName = secShortName;
    }

    public String getSecFullName() {
        return secFullName;
    }

    public void setSecFullName(String secFullName) {
        this.secFullName = secFullName;
    }

    public String getListStatusCD() {
        return listStatusCD;
    }

    public void setListStatusCD(String listStatusCD) {
        this.listStatusCD = listStatusCD;
    }

    public Date getListDate() {
        return listDate;
    }

    public void setListDate(Date listDate) {
        this.listDate = listDate;
    }

    public String getEquTypeCD() {
        return equTypeCD;
    }

    public void setEquTypeCD(String equTypeCD) {
        this.equTypeCD = equTypeCD;
    }

    public String getEquType() {
        return equType;
    }

    public void setEquType(String equType) {
        this.equType = equType;
    }

    public String getExCountryCD() {
        return exCountryCD;
    }

    public void setExCountryCD(String exCountryCD) {
        this.exCountryCD = exCountryCD;
    }

    public int getPartyID() {
        return partyID;
    }

    public void setPartyID(int partyID) {
        this.partyID = partyID;
    }

    public String getTotalShares() {
        return totalShares;
    }

    public void setTotalShares(String totalShares) {
        this.totalShares = totalShares;
    }

    public String getNonrestFloatShares() {
        return nonrestFloatShares;
    }

    public void setNonrestFloatShares(String nonrestFloatShares) {
        this.nonrestFloatShares = nonrestFloatShares;
    }

    public String getNonrestfloatA() {
        return nonrestfloatA;
    }

    public void setNonrestfloatA(String nonrestfloatA) {
        this.nonrestfloatA = nonrestfloatA;
    }

    public String getOfficeAddr() {
        return officeAddr;
    }

    public void setOfficeAddr(String officeAddr) {
        this.officeAddr = officeAddr;
    }

    public String getPrimeOperating() {
        return primeOperating;
    }

    public void setPrimeOperating(String primeOperating) {
        this.primeOperating = primeOperating;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public String getTShEquity() {
        return TShEquity;
    }

    public void setTShEquity(String TShEquity) {
        this.TShEquity = TShEquity;
    }
}
