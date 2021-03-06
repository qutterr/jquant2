/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package test.thosttraderapi;

public class CThostFtdcSyncingInvestorPositionField {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected CThostFtdcSyncingInvestorPositionField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcSyncingInvestorPositionField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        thosttradeapiJNI.delete_CThostFtdcSyncingInvestorPositionField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setInstrumentID(String value) {
    thosttradeapiJNI.CThostFtdcSyncingInvestorPositionField_InstrumentID_set(swigCPtr, this, value);
  }

  public String getInstrumentID() {
    return thosttradeapiJNI.CThostFtdcSyncingInvestorPositionField_InstrumentID_get(swigCPtr, this);
  }

  public void setBrokerID(String value) {
    thosttradeapiJNI.CThostFtdcSyncingInvestorPositionField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return thosttradeapiJNI.CThostFtdcSyncingInvestorPositionField_BrokerID_get(swigCPtr, this);
  }

  public void setInvestorID(String value) {
    thosttradeapiJNI.CThostFtdcSyncingInvestorPositionField_InvestorID_set(swigCPtr, this, value);
  }

  public String getInvestorID() {
    return thosttradeapiJNI.CThostFtdcSyncingInvestorPositionField_InvestorID_get(swigCPtr, this);
  }

  public void setPosiDirection(char value) {
    thosttradeapiJNI.CThostFtdcSyncingInvestorPositionField_PosiDirection_set(swigCPtr, this, value);
  }

  public char getPosiDirection() {
    return thosttradeapiJNI.CThostFtdcSyncingInvestorPositionField_PosiDirection_get(swigCPtr, this);
  }

  public void setHedgeFlag(char value) {
    thosttradeapiJNI.CThostFtdcSyncingInvestorPositionField_HedgeFlag_set(swigCPtr, this, value);
  }

  public char getHedgeFlag() {
    return thosttradeapiJNI.CThostFtdcSyncingInvestorPositionField_HedgeFlag_get(swigCPtr, this);
  }

  public void setPositionDate(char value) {
    thosttradeapiJNI.CThostFtdcSyncingInvestorPositionField_PositionDate_set(swigCPtr, this, value);
  }

  public char getPositionDate() {
    return thosttradeapiJNI.CThostFtdcSyncingInvestorPositionField_PositionDate_get(swigCPtr, this);
  }

  public void setYdPosition(int value) {
    thosttradeapiJNI.CThostFtdcSyncingInvestorPositionField_YdPosition_set(swigCPtr, this, value);
  }

  public int getYdPosition() {
    return thosttradeapiJNI.CThostFtdcSyncingInvestorPositionField_YdPosition_get(swigCPtr, this);
  }

  public void setPosition(int value) {
    thosttradeapiJNI.CThostFtdcSyncingInvestorPositionField_Position_set(swigCPtr, this, value);
  }

  public int getPosition() {
    return thosttradeapiJNI.CThostFtdcSyncingInvestorPositionField_Position_get(swigCPtr, this);
  }

  public void setLongFrozen(int value) {
    thosttradeapiJNI.CThostFtdcSyncingInvestorPositionField_LongFrozen_set(swigCPtr, this, value);
  }

  public int getLongFrozen() {
    return thosttradeapiJNI.CThostFtdcSyncingInvestorPositionField_LongFrozen_get(swigCPtr, this);
  }

  public void setShortFrozen(int value) {
    thosttradeapiJNI.CThostFtdcSyncingInvestorPositionField_ShortFrozen_set(swigCPtr, this, value);
  }

  public int getShortFrozen() {
    return thosttradeapiJNI.CThostFtdcSyncingInvestorPositionField_ShortFrozen_get(swigCPtr, this);
  }

  public void setLongFrozenAmount(double value) {
    thosttradeapiJNI.CThostFtdcSyncingInvestorPositionField_LongFrozenAmount_set(swigCPtr, this, value);
  }

  public double getLongFrozenAmount() {
    return thosttradeapiJNI.CThostFtdcSyncingInvestorPositionField_LongFrozenAmount_get(swigCPtr, this);
  }

  public void setShortFrozenAmount(double value) {
    thosttradeapiJNI.CThostFtdcSyncingInvestorPositionField_ShortFrozenAmount_set(swigCPtr, this, value);
  }

  public double getShortFrozenAmount() {
    return thosttradeapiJNI.CThostFtdcSyncingInvestorPositionField_ShortFrozenAmount_get(swigCPtr, this);
  }

  public void setOpenVolume(int value) {
    thosttradeapiJNI.CThostFtdcSyncingInvestorPositionField_OpenVolume_set(swigCPtr, this, value);
  }

  public int getOpenVolume() {
    return thosttradeapiJNI.CThostFtdcSyncingInvestorPositionField_OpenVolume_get(swigCPtr, this);
  }

  public void setCloseVolume(int value) {
    thosttradeapiJNI.CThostFtdcSyncingInvestorPositionField_CloseVolume_set(swigCPtr, this, value);
  }

  public int getCloseVolume() {
    return thosttradeapiJNI.CThostFtdcSyncingInvestorPositionField_CloseVolume_get(swigCPtr, this);
  }

  public void setOpenAmount(double value) {
    thosttradeapiJNI.CThostFtdcSyncingInvestorPositionField_OpenAmount_set(swigCPtr, this, value);
  }

  public double getOpenAmount() {
    return thosttradeapiJNI.CThostFtdcSyncingInvestorPositionField_OpenAmount_get(swigCPtr, this);
  }

  public void setCloseAmount(double value) {
    thosttradeapiJNI.CThostFtdcSyncingInvestorPositionField_CloseAmount_set(swigCPtr, this, value);
  }

  public double getCloseAmount() {
    return thosttradeapiJNI.CThostFtdcSyncingInvestorPositionField_CloseAmount_get(swigCPtr, this);
  }

  public void setPositionCost(double value) {
    thosttradeapiJNI.CThostFtdcSyncingInvestorPositionField_PositionCost_set(swigCPtr, this, value);
  }

  public double getPositionCost() {
    return thosttradeapiJNI.CThostFtdcSyncingInvestorPositionField_PositionCost_get(swigCPtr, this);
  }

  public void setPreMargin(double value) {
    thosttradeapiJNI.CThostFtdcSyncingInvestorPositionField_PreMargin_set(swigCPtr, this, value);
  }

  public double getPreMargin() {
    return thosttradeapiJNI.CThostFtdcSyncingInvestorPositionField_PreMargin_get(swigCPtr, this);
  }

  public void setUseMargin(double value) {
    thosttradeapiJNI.CThostFtdcSyncingInvestorPositionField_UseMargin_set(swigCPtr, this, value);
  }

  public double getUseMargin() {
    return thosttradeapiJNI.CThostFtdcSyncingInvestorPositionField_UseMargin_get(swigCPtr, this);
  }

  public void setFrozenMargin(double value) {
    thosttradeapiJNI.CThostFtdcSyncingInvestorPositionField_FrozenMargin_set(swigCPtr, this, value);
  }

  public double getFrozenMargin() {
    return thosttradeapiJNI.CThostFtdcSyncingInvestorPositionField_FrozenMargin_get(swigCPtr, this);
  }

  public void setFrozenCash(double value) {
    thosttradeapiJNI.CThostFtdcSyncingInvestorPositionField_FrozenCash_set(swigCPtr, this, value);
  }

  public double getFrozenCash() {
    return thosttradeapiJNI.CThostFtdcSyncingInvestorPositionField_FrozenCash_get(swigCPtr, this);
  }

  public void setFrozenCommission(double value) {
    thosttradeapiJNI.CThostFtdcSyncingInvestorPositionField_FrozenCommission_set(swigCPtr, this, value);
  }

  public double getFrozenCommission() {
    return thosttradeapiJNI.CThostFtdcSyncingInvestorPositionField_FrozenCommission_get(swigCPtr, this);
  }

  public void setCashIn(double value) {
    thosttradeapiJNI.CThostFtdcSyncingInvestorPositionField_CashIn_set(swigCPtr, this, value);
  }

  public double getCashIn() {
    return thosttradeapiJNI.CThostFtdcSyncingInvestorPositionField_CashIn_get(swigCPtr, this);
  }

  public void setCommission(double value) {
    thosttradeapiJNI.CThostFtdcSyncingInvestorPositionField_Commission_set(swigCPtr, this, value);
  }

  public double getCommission() {
    return thosttradeapiJNI.CThostFtdcSyncingInvestorPositionField_Commission_get(swigCPtr, this);
  }

  public void setCloseProfit(double value) {
    thosttradeapiJNI.CThostFtdcSyncingInvestorPositionField_CloseProfit_set(swigCPtr, this, value);
  }

  public double getCloseProfit() {
    return thosttradeapiJNI.CThostFtdcSyncingInvestorPositionField_CloseProfit_get(swigCPtr, this);
  }

  public void setPositionProfit(double value) {
    thosttradeapiJNI.CThostFtdcSyncingInvestorPositionField_PositionProfit_set(swigCPtr, this, value);
  }

  public double getPositionProfit() {
    return thosttradeapiJNI.CThostFtdcSyncingInvestorPositionField_PositionProfit_get(swigCPtr, this);
  }

  public void setPreSettlementPrice(double value) {
    thosttradeapiJNI.CThostFtdcSyncingInvestorPositionField_PreSettlementPrice_set(swigCPtr, this, value);
  }

  public double getPreSettlementPrice() {
    return thosttradeapiJNI.CThostFtdcSyncingInvestorPositionField_PreSettlementPrice_get(swigCPtr, this);
  }

  public void setSettlementPrice(double value) {
    thosttradeapiJNI.CThostFtdcSyncingInvestorPositionField_SettlementPrice_set(swigCPtr, this, value);
  }

  public double getSettlementPrice() {
    return thosttradeapiJNI.CThostFtdcSyncingInvestorPositionField_SettlementPrice_get(swigCPtr, this);
  }

  public void setTradingDay(String value) {
    thosttradeapiJNI.CThostFtdcSyncingInvestorPositionField_TradingDay_set(swigCPtr, this, value);
  }

  public String getTradingDay() {
    return thosttradeapiJNI.CThostFtdcSyncingInvestorPositionField_TradingDay_get(swigCPtr, this);
  }

  public void setSettlementID(int value) {
    thosttradeapiJNI.CThostFtdcSyncingInvestorPositionField_SettlementID_set(swigCPtr, this, value);
  }

  public int getSettlementID() {
    return thosttradeapiJNI.CThostFtdcSyncingInvestorPositionField_SettlementID_get(swigCPtr, this);
  }

  public void setOpenCost(double value) {
    thosttradeapiJNI.CThostFtdcSyncingInvestorPositionField_OpenCost_set(swigCPtr, this, value);
  }

  public double getOpenCost() {
    return thosttradeapiJNI.CThostFtdcSyncingInvestorPositionField_OpenCost_get(swigCPtr, this);
  }

  public void setExchangeMargin(double value) {
    thosttradeapiJNI.CThostFtdcSyncingInvestorPositionField_ExchangeMargin_set(swigCPtr, this, value);
  }

  public double getExchangeMargin() {
    return thosttradeapiJNI.CThostFtdcSyncingInvestorPositionField_ExchangeMargin_get(swigCPtr, this);
  }

  public void setCombPosition(int value) {
    thosttradeapiJNI.CThostFtdcSyncingInvestorPositionField_CombPosition_set(swigCPtr, this, value);
  }

  public int getCombPosition() {
    return thosttradeapiJNI.CThostFtdcSyncingInvestorPositionField_CombPosition_get(swigCPtr, this);
  }

  public void setCombLongFrozen(int value) {
    thosttradeapiJNI.CThostFtdcSyncingInvestorPositionField_CombLongFrozen_set(swigCPtr, this, value);
  }

  public int getCombLongFrozen() {
    return thosttradeapiJNI.CThostFtdcSyncingInvestorPositionField_CombLongFrozen_get(swigCPtr, this);
  }

  public void setCombShortFrozen(int value) {
    thosttradeapiJNI.CThostFtdcSyncingInvestorPositionField_CombShortFrozen_set(swigCPtr, this, value);
  }

  public int getCombShortFrozen() {
    return thosttradeapiJNI.CThostFtdcSyncingInvestorPositionField_CombShortFrozen_get(swigCPtr, this);
  }

  public void setCloseProfitByDate(double value) {
    thosttradeapiJNI.CThostFtdcSyncingInvestorPositionField_CloseProfitByDate_set(swigCPtr, this, value);
  }

  public double getCloseProfitByDate() {
    return thosttradeapiJNI.CThostFtdcSyncingInvestorPositionField_CloseProfitByDate_get(swigCPtr, this);
  }

  public void setCloseProfitByTrade(double value) {
    thosttradeapiJNI.CThostFtdcSyncingInvestorPositionField_CloseProfitByTrade_set(swigCPtr, this, value);
  }

  public double getCloseProfitByTrade() {
    return thosttradeapiJNI.CThostFtdcSyncingInvestorPositionField_CloseProfitByTrade_get(swigCPtr, this);
  }

  public void setTodayPosition(int value) {
    thosttradeapiJNI.CThostFtdcSyncingInvestorPositionField_TodayPosition_set(swigCPtr, this, value);
  }

  public int getTodayPosition() {
    return thosttradeapiJNI.CThostFtdcSyncingInvestorPositionField_TodayPosition_get(swigCPtr, this);
  }

  public void setMarginRateByMoney(double value) {
    thosttradeapiJNI.CThostFtdcSyncingInvestorPositionField_MarginRateByMoney_set(swigCPtr, this, value);
  }

  public double getMarginRateByMoney() {
    return thosttradeapiJNI.CThostFtdcSyncingInvestorPositionField_MarginRateByMoney_get(swigCPtr, this);
  }

  public void setMarginRateByVolume(double value) {
    thosttradeapiJNI.CThostFtdcSyncingInvestorPositionField_MarginRateByVolume_set(swigCPtr, this, value);
  }

  public double getMarginRateByVolume() {
    return thosttradeapiJNI.CThostFtdcSyncingInvestorPositionField_MarginRateByVolume_get(swigCPtr, this);
  }

  public void setStrikeFrozen(int value) {
    thosttradeapiJNI.CThostFtdcSyncingInvestorPositionField_StrikeFrozen_set(swigCPtr, this, value);
  }

  public int getStrikeFrozen() {
    return thosttradeapiJNI.CThostFtdcSyncingInvestorPositionField_StrikeFrozen_get(swigCPtr, this);
  }

  public void setStrikeFrozenAmount(double value) {
    thosttradeapiJNI.CThostFtdcSyncingInvestorPositionField_StrikeFrozenAmount_set(swigCPtr, this, value);
  }

  public double getStrikeFrozenAmount() {
    return thosttradeapiJNI.CThostFtdcSyncingInvestorPositionField_StrikeFrozenAmount_get(swigCPtr, this);
  }

  public void setAbandonFrozen(int value) {
    thosttradeapiJNI.CThostFtdcSyncingInvestorPositionField_AbandonFrozen_set(swigCPtr, this, value);
  }

  public int getAbandonFrozen() {
    return thosttradeapiJNI.CThostFtdcSyncingInvestorPositionField_AbandonFrozen_get(swigCPtr, this);
  }

  public CThostFtdcSyncingInvestorPositionField() {
    this(thosttradeapiJNI.new_CThostFtdcSyncingInvestorPositionField(), true);
  }

}
