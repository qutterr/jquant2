/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package test.thostmduserapi;

public class CThostFtdcQryExecOrderField {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected CThostFtdcQryExecOrderField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcQryExecOrderField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        thostmdapiJNI.delete_CThostFtdcQryExecOrderField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setBrokerID(String value) {
    thostmdapiJNI.CThostFtdcQryExecOrderField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return thostmdapiJNI.CThostFtdcQryExecOrderField_BrokerID_get(swigCPtr, this);
  }

  public void setInvestorID(String value) {
    thostmdapiJNI.CThostFtdcQryExecOrderField_InvestorID_set(swigCPtr, this, value);
  }

  public String getInvestorID() {
    return thostmdapiJNI.CThostFtdcQryExecOrderField_InvestorID_get(swigCPtr, this);
  }

  public void setInstrumentID(String value) {
    thostmdapiJNI.CThostFtdcQryExecOrderField_InstrumentID_set(swigCPtr, this, value);
  }

  public String getInstrumentID() {
    return thostmdapiJNI.CThostFtdcQryExecOrderField_InstrumentID_get(swigCPtr, this);
  }

  public void setExchangeID(String value) {
    thostmdapiJNI.CThostFtdcQryExecOrderField_ExchangeID_set(swigCPtr, this, value);
  }

  public String getExchangeID() {
    return thostmdapiJNI.CThostFtdcQryExecOrderField_ExchangeID_get(swigCPtr, this);
  }

  public void setExecOrderSysID(String value) {
    thostmdapiJNI.CThostFtdcQryExecOrderField_ExecOrderSysID_set(swigCPtr, this, value);
  }

  public String getExecOrderSysID() {
    return thostmdapiJNI.CThostFtdcQryExecOrderField_ExecOrderSysID_get(swigCPtr, this);
  }

  public void setInsertTimeStart(String value) {
    thostmdapiJNI.CThostFtdcQryExecOrderField_InsertTimeStart_set(swigCPtr, this, value);
  }

  public String getInsertTimeStart() {
    return thostmdapiJNI.CThostFtdcQryExecOrderField_InsertTimeStart_get(swigCPtr, this);
  }

  public void setInsertTimeEnd(String value) {
    thostmdapiJNI.CThostFtdcQryExecOrderField_InsertTimeEnd_set(swigCPtr, this, value);
  }

  public String getInsertTimeEnd() {
    return thostmdapiJNI.CThostFtdcQryExecOrderField_InsertTimeEnd_get(swigCPtr, this);
  }

  public CThostFtdcQryExecOrderField() {
    this(thostmdapiJNI.new_CThostFtdcQryExecOrderField(), true);
  }

}
