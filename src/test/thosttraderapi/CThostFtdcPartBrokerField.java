/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package test.thosttraderapi;

public class CThostFtdcPartBrokerField {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected CThostFtdcPartBrokerField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcPartBrokerField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        thosttradeapiJNI.delete_CThostFtdcPartBrokerField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setBrokerID(String value) {
    thosttradeapiJNI.CThostFtdcPartBrokerField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return thosttradeapiJNI.CThostFtdcPartBrokerField_BrokerID_get(swigCPtr, this);
  }

  public void setExchangeID(String value) {
    thosttradeapiJNI.CThostFtdcPartBrokerField_ExchangeID_set(swigCPtr, this, value);
  }

  public String getExchangeID() {
    return thosttradeapiJNI.CThostFtdcPartBrokerField_ExchangeID_get(swigCPtr, this);
  }

  public void setParticipantID(String value) {
    thosttradeapiJNI.CThostFtdcPartBrokerField_ParticipantID_set(swigCPtr, this, value);
  }

  public String getParticipantID() {
    return thosttradeapiJNI.CThostFtdcPartBrokerField_ParticipantID_get(swigCPtr, this);
  }

  public void setIsActive(int value) {
    thosttradeapiJNI.CThostFtdcPartBrokerField_IsActive_set(swigCPtr, this, value);
  }

  public int getIsActive() {
    return thosttradeapiJNI.CThostFtdcPartBrokerField_IsActive_get(swigCPtr, this);
  }

  public CThostFtdcPartBrokerField() {
    this(thosttradeapiJNI.new_CThostFtdcPartBrokerField(), true);
  }

}
