/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package test.thostmduserapi;

public class CThostFtdcCommPhaseField {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected CThostFtdcCommPhaseField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcCommPhaseField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        thostmdapiJNI.delete_CThostFtdcCommPhaseField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setTradingDay(String value) {
    thostmdapiJNI.CThostFtdcCommPhaseField_TradingDay_set(swigCPtr, this, value);
  }

  public String getTradingDay() {
    return thostmdapiJNI.CThostFtdcCommPhaseField_TradingDay_get(swigCPtr, this);
  }

  public void setCommPhaseNo(short value) {
    thostmdapiJNI.CThostFtdcCommPhaseField_CommPhaseNo_set(swigCPtr, this, value);
  }

  public short getCommPhaseNo() {
    return thostmdapiJNI.CThostFtdcCommPhaseField_CommPhaseNo_get(swigCPtr, this);
  }

  public void setSystemID(String value) {
    thostmdapiJNI.CThostFtdcCommPhaseField_SystemID_set(swigCPtr, this, value);
  }

  public String getSystemID() {
    return thostmdapiJNI.CThostFtdcCommPhaseField_SystemID_get(swigCPtr, this);
  }

  public CThostFtdcCommPhaseField() {
    this(thostmdapiJNI.new_CThostFtdcCommPhaseField(), true);
  }

}
