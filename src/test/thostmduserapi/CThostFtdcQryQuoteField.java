/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package test.thostmduserapi;

public class CThostFtdcQryQuoteField {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected CThostFtdcQryQuoteField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcQryQuoteField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        thostmdapiJNI.delete_CThostFtdcQryQuoteField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setBrokerID(String value) {
    thostmdapiJNI.CThostFtdcQryQuoteField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return thostmdapiJNI.CThostFtdcQryQuoteField_BrokerID_get(swigCPtr, this);
  }

  public void setInvestorID(String value) {
    thostmdapiJNI.CThostFtdcQryQuoteField_InvestorID_set(swigCPtr, this, value);
  }

  public String getInvestorID() {
    return thostmdapiJNI.CThostFtdcQryQuoteField_InvestorID_get(swigCPtr, this);
  }

  public void setInstrumentID(String value) {
    thostmdapiJNI.CThostFtdcQryQuoteField_InstrumentID_set(swigCPtr, this, value);
  }

  public String getInstrumentID() {
    return thostmdapiJNI.CThostFtdcQryQuoteField_InstrumentID_get(swigCPtr, this);
  }

  public void setExchangeID(String value) {
    thostmdapiJNI.CThostFtdcQryQuoteField_ExchangeID_set(swigCPtr, this, value);
  }

  public String getExchangeID() {
    return thostmdapiJNI.CThostFtdcQryQuoteField_ExchangeID_get(swigCPtr, this);
  }

  public void setQuoteSysID(String value) {
    thostmdapiJNI.CThostFtdcQryQuoteField_QuoteSysID_set(swigCPtr, this, value);
  }

  public String getQuoteSysID() {
    return thostmdapiJNI.CThostFtdcQryQuoteField_QuoteSysID_get(swigCPtr, this);
  }

  public void setInsertTimeStart(String value) {
    thostmdapiJNI.CThostFtdcQryQuoteField_InsertTimeStart_set(swigCPtr, this, value);
  }

  public String getInsertTimeStart() {
    return thostmdapiJNI.CThostFtdcQryQuoteField_InsertTimeStart_get(swigCPtr, this);
  }

  public void setInsertTimeEnd(String value) {
    thostmdapiJNI.CThostFtdcQryQuoteField_InsertTimeEnd_set(swigCPtr, this, value);
  }

  public String getInsertTimeEnd() {
    return thostmdapiJNI.CThostFtdcQryQuoteField_InsertTimeEnd_get(swigCPtr, this);
  }

  public CThostFtdcQryQuoteField() {
    this(thostmdapiJNI.new_CThostFtdcQryQuoteField(), true);
  }

}
