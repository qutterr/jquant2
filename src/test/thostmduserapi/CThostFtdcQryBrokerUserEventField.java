/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package test.thostmduserapi;

public class CThostFtdcQryBrokerUserEventField {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected CThostFtdcQryBrokerUserEventField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcQryBrokerUserEventField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        thostmdapiJNI.delete_CThostFtdcQryBrokerUserEventField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setBrokerID(String value) {
    thostmdapiJNI.CThostFtdcQryBrokerUserEventField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return thostmdapiJNI.CThostFtdcQryBrokerUserEventField_BrokerID_get(swigCPtr, this);
  }

  public void setUserID(String value) {
    thostmdapiJNI.CThostFtdcQryBrokerUserEventField_UserID_set(swigCPtr, this, value);
  }

  public String getUserID() {
    return thostmdapiJNI.CThostFtdcQryBrokerUserEventField_UserID_get(swigCPtr, this);
  }

  public void setUserEventType(char value) {
    thostmdapiJNI.CThostFtdcQryBrokerUserEventField_UserEventType_set(swigCPtr, this, value);
  }

  public char getUserEventType() {
    return thostmdapiJNI.CThostFtdcQryBrokerUserEventField_UserEventType_get(swigCPtr, this);
  }

  public CThostFtdcQryBrokerUserEventField() {
    this(thostmdapiJNI.new_CThostFtdcQryBrokerUserEventField(), true);
  }

}
