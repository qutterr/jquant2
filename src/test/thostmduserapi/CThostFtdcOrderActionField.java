/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package test.thostmduserapi;

public class CThostFtdcOrderActionField {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected CThostFtdcOrderActionField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcOrderActionField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        thostmdapiJNI.delete_CThostFtdcOrderActionField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setBrokerID(String value) {
    thostmdapiJNI.CThostFtdcOrderActionField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return thostmdapiJNI.CThostFtdcOrderActionField_BrokerID_get(swigCPtr, this);
  }

  public void setInvestorID(String value) {
    thostmdapiJNI.CThostFtdcOrderActionField_InvestorID_set(swigCPtr, this, value);
  }

  public String getInvestorID() {
    return thostmdapiJNI.CThostFtdcOrderActionField_InvestorID_get(swigCPtr, this);
  }

  public void setOrderActionRef(int value) {
    thostmdapiJNI.CThostFtdcOrderActionField_OrderActionRef_set(swigCPtr, this, value);
  }

  public int getOrderActionRef() {
    return thostmdapiJNI.CThostFtdcOrderActionField_OrderActionRef_get(swigCPtr, this);
  }

  public void setOrderRef(String value) {
    thostmdapiJNI.CThostFtdcOrderActionField_OrderRef_set(swigCPtr, this, value);
  }

  public String getOrderRef() {
    return thostmdapiJNI.CThostFtdcOrderActionField_OrderRef_get(swigCPtr, this);
  }

  public void setRequestID(int value) {
    thostmdapiJNI.CThostFtdcOrderActionField_RequestID_set(swigCPtr, this, value);
  }

  public int getRequestID() {
    return thostmdapiJNI.CThostFtdcOrderActionField_RequestID_get(swigCPtr, this);
  }

  public void setFrontID(int value) {
    thostmdapiJNI.CThostFtdcOrderActionField_FrontID_set(swigCPtr, this, value);
  }

  public int getFrontID() {
    return thostmdapiJNI.CThostFtdcOrderActionField_FrontID_get(swigCPtr, this);
  }

  public void setSessionID(int value) {
    thostmdapiJNI.CThostFtdcOrderActionField_SessionID_set(swigCPtr, this, value);
  }

  public int getSessionID() {
    return thostmdapiJNI.CThostFtdcOrderActionField_SessionID_get(swigCPtr, this);
  }

  public void setExchangeID(String value) {
    thostmdapiJNI.CThostFtdcOrderActionField_ExchangeID_set(swigCPtr, this, value);
  }

  public String getExchangeID() {
    return thostmdapiJNI.CThostFtdcOrderActionField_ExchangeID_get(swigCPtr, this);
  }

  public void setOrderSysID(String value) {
    thostmdapiJNI.CThostFtdcOrderActionField_OrderSysID_set(swigCPtr, this, value);
  }

  public String getOrderSysID() {
    return thostmdapiJNI.CThostFtdcOrderActionField_OrderSysID_get(swigCPtr, this);
  }

  public void setActionFlag(char value) {
    thostmdapiJNI.CThostFtdcOrderActionField_ActionFlag_set(swigCPtr, this, value);
  }

  public char getActionFlag() {
    return thostmdapiJNI.CThostFtdcOrderActionField_ActionFlag_get(swigCPtr, this);
  }

  public void setLimitPrice(double value) {
    thostmdapiJNI.CThostFtdcOrderActionField_LimitPrice_set(swigCPtr, this, value);
  }

  public double getLimitPrice() {
    return thostmdapiJNI.CThostFtdcOrderActionField_LimitPrice_get(swigCPtr, this);
  }

  public void setVolumeChange(int value) {
    thostmdapiJNI.CThostFtdcOrderActionField_VolumeChange_set(swigCPtr, this, value);
  }

  public int getVolumeChange() {
    return thostmdapiJNI.CThostFtdcOrderActionField_VolumeChange_get(swigCPtr, this);
  }

  public void setActionDate(String value) {
    thostmdapiJNI.CThostFtdcOrderActionField_ActionDate_set(swigCPtr, this, value);
  }

  public String getActionDate() {
    return thostmdapiJNI.CThostFtdcOrderActionField_ActionDate_get(swigCPtr, this);
  }

  public void setActionTime(String value) {
    thostmdapiJNI.CThostFtdcOrderActionField_ActionTime_set(swigCPtr, this, value);
  }

  public String getActionTime() {
    return thostmdapiJNI.CThostFtdcOrderActionField_ActionTime_get(swigCPtr, this);
  }

  public void setTraderID(String value) {
    thostmdapiJNI.CThostFtdcOrderActionField_TraderID_set(swigCPtr, this, value);
  }

  public String getTraderID() {
    return thostmdapiJNI.CThostFtdcOrderActionField_TraderID_get(swigCPtr, this);
  }

  public void setInstallID(int value) {
    thostmdapiJNI.CThostFtdcOrderActionField_InstallID_set(swigCPtr, this, value);
  }

  public int getInstallID() {
    return thostmdapiJNI.CThostFtdcOrderActionField_InstallID_get(swigCPtr, this);
  }

  public void setOrderLocalID(String value) {
    thostmdapiJNI.CThostFtdcOrderActionField_OrderLocalID_set(swigCPtr, this, value);
  }

  public String getOrderLocalID() {
    return thostmdapiJNI.CThostFtdcOrderActionField_OrderLocalID_get(swigCPtr, this);
  }

  public void setActionLocalID(String value) {
    thostmdapiJNI.CThostFtdcOrderActionField_ActionLocalID_set(swigCPtr, this, value);
  }

  public String getActionLocalID() {
    return thostmdapiJNI.CThostFtdcOrderActionField_ActionLocalID_get(swigCPtr, this);
  }

  public void setParticipantID(String value) {
    thostmdapiJNI.CThostFtdcOrderActionField_ParticipantID_set(swigCPtr, this, value);
  }

  public String getParticipantID() {
    return thostmdapiJNI.CThostFtdcOrderActionField_ParticipantID_get(swigCPtr, this);
  }

  public void setClientID(String value) {
    thostmdapiJNI.CThostFtdcOrderActionField_ClientID_set(swigCPtr, this, value);
  }

  public String getClientID() {
    return thostmdapiJNI.CThostFtdcOrderActionField_ClientID_get(swigCPtr, this);
  }

  public void setBusinessUnit(String value) {
    thostmdapiJNI.CThostFtdcOrderActionField_BusinessUnit_set(swigCPtr, this, value);
  }

  public String getBusinessUnit() {
    return thostmdapiJNI.CThostFtdcOrderActionField_BusinessUnit_get(swigCPtr, this);
  }

  public void setOrderActionStatus(char value) {
    thostmdapiJNI.CThostFtdcOrderActionField_OrderActionStatus_set(swigCPtr, this, value);
  }

  public char getOrderActionStatus() {
    return thostmdapiJNI.CThostFtdcOrderActionField_OrderActionStatus_get(swigCPtr, this);
  }

  public void setUserID(String value) {
    thostmdapiJNI.CThostFtdcOrderActionField_UserID_set(swigCPtr, this, value);
  }

  public String getUserID() {
    return thostmdapiJNI.CThostFtdcOrderActionField_UserID_get(swigCPtr, this);
  }

  public void setStatusMsg(String value) {
    thostmdapiJNI.CThostFtdcOrderActionField_StatusMsg_set(swigCPtr, this, value);
  }

  public String getStatusMsg() {
    return thostmdapiJNI.CThostFtdcOrderActionField_StatusMsg_get(swigCPtr, this);
  }

  public void setInstrumentID(String value) {
    thostmdapiJNI.CThostFtdcOrderActionField_InstrumentID_set(swigCPtr, this, value);
  }

  public String getInstrumentID() {
    return thostmdapiJNI.CThostFtdcOrderActionField_InstrumentID_get(swigCPtr, this);
  }

  public void setBranchID(String value) {
    thostmdapiJNI.CThostFtdcOrderActionField_BranchID_set(swigCPtr, this, value);
  }

  public String getBranchID() {
    return thostmdapiJNI.CThostFtdcOrderActionField_BranchID_get(swigCPtr, this);
  }

  public void setInvestUnitID(String value) {
    thostmdapiJNI.CThostFtdcOrderActionField_InvestUnitID_set(swigCPtr, this, value);
  }

  public String getInvestUnitID() {
    return thostmdapiJNI.CThostFtdcOrderActionField_InvestUnitID_get(swigCPtr, this);
  }

  public void setIPAddress(String value) {
    thostmdapiJNI.CThostFtdcOrderActionField_IPAddress_set(swigCPtr, this, value);
  }

  public String getIPAddress() {
    return thostmdapiJNI.CThostFtdcOrderActionField_IPAddress_get(swigCPtr, this);
  }

  public void setMacAddress(String value) {
    thostmdapiJNI.CThostFtdcOrderActionField_MacAddress_set(swigCPtr, this, value);
  }

  public String getMacAddress() {
    return thostmdapiJNI.CThostFtdcOrderActionField_MacAddress_get(swigCPtr, this);
  }

  public CThostFtdcOrderActionField() {
    this(thostmdapiJNI.new_CThostFtdcOrderActionField(), true);
  }

}
