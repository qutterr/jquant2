/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package test.thostmduserapi;

public class CThostFtdcUserSessionField {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected CThostFtdcUserSessionField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcUserSessionField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        thostmdapiJNI.delete_CThostFtdcUserSessionField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setFrontID(int value) {
    thostmdapiJNI.CThostFtdcUserSessionField_FrontID_set(swigCPtr, this, value);
  }

  public int getFrontID() {
    return thostmdapiJNI.CThostFtdcUserSessionField_FrontID_get(swigCPtr, this);
  }

  public void setSessionID(int value) {
    thostmdapiJNI.CThostFtdcUserSessionField_SessionID_set(swigCPtr, this, value);
  }

  public int getSessionID() {
    return thostmdapiJNI.CThostFtdcUserSessionField_SessionID_get(swigCPtr, this);
  }

  public void setBrokerID(String value) {
    thostmdapiJNI.CThostFtdcUserSessionField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return thostmdapiJNI.CThostFtdcUserSessionField_BrokerID_get(swigCPtr, this);
  }

  public void setUserID(String value) {
    thostmdapiJNI.CThostFtdcUserSessionField_UserID_set(swigCPtr, this, value);
  }

  public String getUserID() {
    return thostmdapiJNI.CThostFtdcUserSessionField_UserID_get(swigCPtr, this);
  }

  public void setLoginDate(String value) {
    thostmdapiJNI.CThostFtdcUserSessionField_LoginDate_set(swigCPtr, this, value);
  }

  public String getLoginDate() {
    return thostmdapiJNI.CThostFtdcUserSessionField_LoginDate_get(swigCPtr, this);
  }

  public void setLoginTime(String value) {
    thostmdapiJNI.CThostFtdcUserSessionField_LoginTime_set(swigCPtr, this, value);
  }

  public String getLoginTime() {
    return thostmdapiJNI.CThostFtdcUserSessionField_LoginTime_get(swigCPtr, this);
  }

  public void setIPAddress(String value) {
    thostmdapiJNI.CThostFtdcUserSessionField_IPAddress_set(swigCPtr, this, value);
  }

  public String getIPAddress() {
    return thostmdapiJNI.CThostFtdcUserSessionField_IPAddress_get(swigCPtr, this);
  }

  public void setUserProductInfo(String value) {
    thostmdapiJNI.CThostFtdcUserSessionField_UserProductInfo_set(swigCPtr, this, value);
  }

  public String getUserProductInfo() {
    return thostmdapiJNI.CThostFtdcUserSessionField_UserProductInfo_get(swigCPtr, this);
  }

  public void setInterfaceProductInfo(String value) {
    thostmdapiJNI.CThostFtdcUserSessionField_InterfaceProductInfo_set(swigCPtr, this, value);
  }

  public String getInterfaceProductInfo() {
    return thostmdapiJNI.CThostFtdcUserSessionField_InterfaceProductInfo_get(swigCPtr, this);
  }

  public void setProtocolInfo(String value) {
    thostmdapiJNI.CThostFtdcUserSessionField_ProtocolInfo_set(swigCPtr, this, value);
  }

  public String getProtocolInfo() {
    return thostmdapiJNI.CThostFtdcUserSessionField_ProtocolInfo_get(swigCPtr, this);
  }

  public void setMacAddress(String value) {
    thostmdapiJNI.CThostFtdcUserSessionField_MacAddress_set(swigCPtr, this, value);
  }

  public String getMacAddress() {
    return thostmdapiJNI.CThostFtdcUserSessionField_MacAddress_get(swigCPtr, this);
  }

  public void setLoginRemark(String value) {
    thostmdapiJNI.CThostFtdcUserSessionField_LoginRemark_set(swigCPtr, this, value);
  }

  public String getLoginRemark() {
    return thostmdapiJNI.CThostFtdcUserSessionField_LoginRemark_get(swigCPtr, this);
  }

  public CThostFtdcUserSessionField() {
    this(thostmdapiJNI.new_CThostFtdcUserSessionField(), true);
  }

}
