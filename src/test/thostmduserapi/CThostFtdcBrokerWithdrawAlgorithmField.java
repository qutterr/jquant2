/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package test.thostmduserapi;

public class CThostFtdcBrokerWithdrawAlgorithmField {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected CThostFtdcBrokerWithdrawAlgorithmField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcBrokerWithdrawAlgorithmField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        thostmdapiJNI.delete_CThostFtdcBrokerWithdrawAlgorithmField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setBrokerID(String value) {
    thostmdapiJNI.CThostFtdcBrokerWithdrawAlgorithmField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return thostmdapiJNI.CThostFtdcBrokerWithdrawAlgorithmField_BrokerID_get(swigCPtr, this);
  }

  public void setWithdrawAlgorithm(char value) {
    thostmdapiJNI.CThostFtdcBrokerWithdrawAlgorithmField_WithdrawAlgorithm_set(swigCPtr, this, value);
  }

  public char getWithdrawAlgorithm() {
    return thostmdapiJNI.CThostFtdcBrokerWithdrawAlgorithmField_WithdrawAlgorithm_get(swigCPtr, this);
  }

  public void setUsingRatio(double value) {
    thostmdapiJNI.CThostFtdcBrokerWithdrawAlgorithmField_UsingRatio_set(swigCPtr, this, value);
  }

  public double getUsingRatio() {
    return thostmdapiJNI.CThostFtdcBrokerWithdrawAlgorithmField_UsingRatio_get(swigCPtr, this);
  }

  public void setIncludeCloseProfit(char value) {
    thostmdapiJNI.CThostFtdcBrokerWithdrawAlgorithmField_IncludeCloseProfit_set(swigCPtr, this, value);
  }

  public char getIncludeCloseProfit() {
    return thostmdapiJNI.CThostFtdcBrokerWithdrawAlgorithmField_IncludeCloseProfit_get(swigCPtr, this);
  }

  public void setAllWithoutTrade(char value) {
    thostmdapiJNI.CThostFtdcBrokerWithdrawAlgorithmField_AllWithoutTrade_set(swigCPtr, this, value);
  }

  public char getAllWithoutTrade() {
    return thostmdapiJNI.CThostFtdcBrokerWithdrawAlgorithmField_AllWithoutTrade_get(swigCPtr, this);
  }

  public void setAvailIncludeCloseProfit(char value) {
    thostmdapiJNI.CThostFtdcBrokerWithdrawAlgorithmField_AvailIncludeCloseProfit_set(swigCPtr, this, value);
  }

  public char getAvailIncludeCloseProfit() {
    return thostmdapiJNI.CThostFtdcBrokerWithdrawAlgorithmField_AvailIncludeCloseProfit_get(swigCPtr, this);
  }

  public void setIsBrokerUserEvent(int value) {
    thostmdapiJNI.CThostFtdcBrokerWithdrawAlgorithmField_IsBrokerUserEvent_set(swigCPtr, this, value);
  }

  public int getIsBrokerUserEvent() {
    return thostmdapiJNI.CThostFtdcBrokerWithdrawAlgorithmField_IsBrokerUserEvent_get(swigCPtr, this);
  }

  public void setCurrencyID(String value) {
    thostmdapiJNI.CThostFtdcBrokerWithdrawAlgorithmField_CurrencyID_set(swigCPtr, this, value);
  }

  public String getCurrencyID() {
    return thostmdapiJNI.CThostFtdcBrokerWithdrawAlgorithmField_CurrencyID_get(swigCPtr, this);
  }

  public void setFundMortgageRatio(double value) {
    thostmdapiJNI.CThostFtdcBrokerWithdrawAlgorithmField_FundMortgageRatio_set(swigCPtr, this, value);
  }

  public double getFundMortgageRatio() {
    return thostmdapiJNI.CThostFtdcBrokerWithdrawAlgorithmField_FundMortgageRatio_get(swigCPtr, this);
  }

  public void setBalanceAlgorithm(char value) {
    thostmdapiJNI.CThostFtdcBrokerWithdrawAlgorithmField_BalanceAlgorithm_set(swigCPtr, this, value);
  }

  public char getBalanceAlgorithm() {
    return thostmdapiJNI.CThostFtdcBrokerWithdrawAlgorithmField_BalanceAlgorithm_get(swigCPtr, this);
  }

  public CThostFtdcBrokerWithdrawAlgorithmField() {
    this(thostmdapiJNI.new_CThostFtdcBrokerWithdrawAlgorithmField(), true);
  }

}
