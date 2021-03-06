/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package test.thosttraderapi;

public class CThostFtdcRspSyncKeyField {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected CThostFtdcRspSyncKeyField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcRspSyncKeyField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        thosttradeapiJNI.delete_CThostFtdcRspSyncKeyField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setTradeCode(String value) {
    thosttradeapiJNI.CThostFtdcRspSyncKeyField_TradeCode_set(swigCPtr, this, value);
  }

  public String getTradeCode() {
    return thosttradeapiJNI.CThostFtdcRspSyncKeyField_TradeCode_get(swigCPtr, this);
  }

  public void setBankID(String value) {
    thosttradeapiJNI.CThostFtdcRspSyncKeyField_BankID_set(swigCPtr, this, value);
  }

  public String getBankID() {
    return thosttradeapiJNI.CThostFtdcRspSyncKeyField_BankID_get(swigCPtr, this);
  }

  public void setBankBranchID(String value) {
    thosttradeapiJNI.CThostFtdcRspSyncKeyField_BankBranchID_set(swigCPtr, this, value);
  }

  public String getBankBranchID() {
    return thosttradeapiJNI.CThostFtdcRspSyncKeyField_BankBranchID_get(swigCPtr, this);
  }

  public void setBrokerID(String value) {
    thosttradeapiJNI.CThostFtdcRspSyncKeyField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return thosttradeapiJNI.CThostFtdcRspSyncKeyField_BrokerID_get(swigCPtr, this);
  }

  public void setBrokerBranchID(String value) {
    thosttradeapiJNI.CThostFtdcRspSyncKeyField_BrokerBranchID_set(swigCPtr, this, value);
  }

  public String getBrokerBranchID() {
    return thosttradeapiJNI.CThostFtdcRspSyncKeyField_BrokerBranchID_get(swigCPtr, this);
  }

  public void setTradeDate(String value) {
    thosttradeapiJNI.CThostFtdcRspSyncKeyField_TradeDate_set(swigCPtr, this, value);
  }

  public String getTradeDate() {
    return thosttradeapiJNI.CThostFtdcRspSyncKeyField_TradeDate_get(swigCPtr, this);
  }

  public void setTradeTime(String value) {
    thosttradeapiJNI.CThostFtdcRspSyncKeyField_TradeTime_set(swigCPtr, this, value);
  }

  public String getTradeTime() {
    return thosttradeapiJNI.CThostFtdcRspSyncKeyField_TradeTime_get(swigCPtr, this);
  }

  public void setBankSerial(String value) {
    thosttradeapiJNI.CThostFtdcRspSyncKeyField_BankSerial_set(swigCPtr, this, value);
  }

  public String getBankSerial() {
    return thosttradeapiJNI.CThostFtdcRspSyncKeyField_BankSerial_get(swigCPtr, this);
  }

  public void setTradingDay(String value) {
    thosttradeapiJNI.CThostFtdcRspSyncKeyField_TradingDay_set(swigCPtr, this, value);
  }

  public String getTradingDay() {
    return thosttradeapiJNI.CThostFtdcRspSyncKeyField_TradingDay_get(swigCPtr, this);
  }

  public void setPlateSerial(int value) {
    thosttradeapiJNI.CThostFtdcRspSyncKeyField_PlateSerial_set(swigCPtr, this, value);
  }

  public int getPlateSerial() {
    return thosttradeapiJNI.CThostFtdcRspSyncKeyField_PlateSerial_get(swigCPtr, this);
  }

  public void setLastFragment(char value) {
    thosttradeapiJNI.CThostFtdcRspSyncKeyField_LastFragment_set(swigCPtr, this, value);
  }

  public char getLastFragment() {
    return thosttradeapiJNI.CThostFtdcRspSyncKeyField_LastFragment_get(swigCPtr, this);
  }

  public void setSessionID(int value) {
    thosttradeapiJNI.CThostFtdcRspSyncKeyField_SessionID_set(swigCPtr, this, value);
  }

  public int getSessionID() {
    return thosttradeapiJNI.CThostFtdcRspSyncKeyField_SessionID_get(swigCPtr, this);
  }

  public void setInstallID(int value) {
    thosttradeapiJNI.CThostFtdcRspSyncKeyField_InstallID_set(swigCPtr, this, value);
  }

  public int getInstallID() {
    return thosttradeapiJNI.CThostFtdcRspSyncKeyField_InstallID_get(swigCPtr, this);
  }

  public void setUserID(String value) {
    thosttradeapiJNI.CThostFtdcRspSyncKeyField_UserID_set(swigCPtr, this, value);
  }

  public String getUserID() {
    return thosttradeapiJNI.CThostFtdcRspSyncKeyField_UserID_get(swigCPtr, this);
  }

  public void setMessage(String value) {
    thosttradeapiJNI.CThostFtdcRspSyncKeyField_Message_set(swigCPtr, this, value);
  }

  public String getMessage() {
    return thosttradeapiJNI.CThostFtdcRspSyncKeyField_Message_get(swigCPtr, this);
  }

  public void setDeviceID(String value) {
    thosttradeapiJNI.CThostFtdcRspSyncKeyField_DeviceID_set(swigCPtr, this, value);
  }

  public String getDeviceID() {
    return thosttradeapiJNI.CThostFtdcRspSyncKeyField_DeviceID_get(swigCPtr, this);
  }

  public void setBrokerIDByBank(String value) {
    thosttradeapiJNI.CThostFtdcRspSyncKeyField_BrokerIDByBank_set(swigCPtr, this, value);
  }

  public String getBrokerIDByBank() {
    return thosttradeapiJNI.CThostFtdcRspSyncKeyField_BrokerIDByBank_get(swigCPtr, this);
  }

  public void setOperNo(String value) {
    thosttradeapiJNI.CThostFtdcRspSyncKeyField_OperNo_set(swigCPtr, this, value);
  }

  public String getOperNo() {
    return thosttradeapiJNI.CThostFtdcRspSyncKeyField_OperNo_get(swigCPtr, this);
  }

  public void setRequestID(int value) {
    thosttradeapiJNI.CThostFtdcRspSyncKeyField_RequestID_set(swigCPtr, this, value);
  }

  public int getRequestID() {
    return thosttradeapiJNI.CThostFtdcRspSyncKeyField_RequestID_get(swigCPtr, this);
  }

  public void setTID(int value) {
    thosttradeapiJNI.CThostFtdcRspSyncKeyField_TID_set(swigCPtr, this, value);
  }

  public int getTID() {
    return thosttradeapiJNI.CThostFtdcRspSyncKeyField_TID_get(swigCPtr, this);
  }

  public void setErrorID(int value) {
    thosttradeapiJNI.CThostFtdcRspSyncKeyField_ErrorID_set(swigCPtr, this, value);
  }

  public int getErrorID() {
    return thosttradeapiJNI.CThostFtdcRspSyncKeyField_ErrorID_get(swigCPtr, this);
  }

  public void setErrorMsg(String value) {
    thosttradeapiJNI.CThostFtdcRspSyncKeyField_ErrorMsg_set(swigCPtr, this, value);
  }

  public String getErrorMsg() {
    return thosttradeapiJNI.CThostFtdcRspSyncKeyField_ErrorMsg_get(swigCPtr, this);
  }

  public CThostFtdcRspSyncKeyField() {
    this(thosttradeapiJNI.new_CThostFtdcRspSyncKeyField(), true);
  }

}
