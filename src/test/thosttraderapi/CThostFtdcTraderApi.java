/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package test.thosttraderapi;

public class CThostFtdcTraderApi {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected CThostFtdcTraderApi(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcTraderApi obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        throw new UnsupportedOperationException("C++ destructor does not have public access");
      }
      swigCPtr = 0;
    }
  }

  public static CThostFtdcTraderApi CreateFtdcTraderApi(String pszFlowPath) {
    long cPtr = thosttradeapiJNI.CThostFtdcTraderApi_CreateFtdcTraderApi__SWIG_0(pszFlowPath);
    return (cPtr == 0) ? null : new CThostFtdcTraderApi(cPtr, false);
  }

  public static CThostFtdcTraderApi CreateFtdcTraderApi() {
    long cPtr = thosttradeapiJNI.CThostFtdcTraderApi_CreateFtdcTraderApi__SWIG_1();
    return (cPtr == 0) ? null : new CThostFtdcTraderApi(cPtr, false);
  }

  public static String GetApiVersion() {
    return thosttradeapiJNI.CThostFtdcTraderApi_GetApiVersion();
  }

  public void Release() {
    thosttradeapiJNI.CThostFtdcTraderApi_Release(swigCPtr, this);
  }

  public void Init() {
    thosttradeapiJNI.CThostFtdcTraderApi_Init(swigCPtr, this);
  }

  public int Join() {
    return thosttradeapiJNI.CThostFtdcTraderApi_Join(swigCPtr, this);
  }

  public String GetTradingDay() {
    return thosttradeapiJNI.CThostFtdcTraderApi_GetTradingDay(swigCPtr, this);
  }

  public void RegisterFront(String pszFrontAddress) {
    thosttradeapiJNI.CThostFtdcTraderApi_RegisterFront(swigCPtr, this, pszFrontAddress);
  }

  public void RegisterNameServer(String pszNsAddress) {
    thosttradeapiJNI.CThostFtdcTraderApi_RegisterNameServer(swigCPtr, this, pszNsAddress);
  }

  public void RegisterFensUserInfo(CThostFtdcFensUserInfoField pFensUserInfo) {
    thosttradeapiJNI.CThostFtdcTraderApi_RegisterFensUserInfo(swigCPtr, this, CThostFtdcFensUserInfoField.getCPtr(pFensUserInfo), pFensUserInfo);
  }

  public void RegisterSpi(CThostFtdcTraderSpi pSpi) {
    thosttradeapiJNI.CThostFtdcTraderApi_RegisterSpi(swigCPtr, this, CThostFtdcTraderSpi.getCPtr(pSpi), pSpi);
  }

  public void SubscribePrivateTopic(THOST_TE_RESUME_TYPE nResumeType) {
    thosttradeapiJNI.CThostFtdcTraderApi_SubscribePrivateTopic(swigCPtr, this, nResumeType.swigValue());
  }

  public void SubscribePublicTopic(THOST_TE_RESUME_TYPE nResumeType) {
    thosttradeapiJNI.CThostFtdcTraderApi_SubscribePublicTopic(swigCPtr, this, nResumeType.swigValue());
  }

  public int ReqAuthenticate(CThostFtdcReqAuthenticateField pReqAuthenticateField, int nRequestID) {
    return thosttradeapiJNI.CThostFtdcTraderApi_ReqAuthenticate(swigCPtr, this, CThostFtdcReqAuthenticateField.getCPtr(pReqAuthenticateField), pReqAuthenticateField, nRequestID);
  }

  public int ReqUserLogin(CThostFtdcReqUserLoginField pReqUserLoginField, int nRequestID) {
    return thosttradeapiJNI.CThostFtdcTraderApi_ReqUserLogin(swigCPtr, this, CThostFtdcReqUserLoginField.getCPtr(pReqUserLoginField), pReqUserLoginField, nRequestID);
  }

  public int ReqUserLogout(CThostFtdcUserLogoutField pUserLogout, int nRequestID) {
    return thosttradeapiJNI.CThostFtdcTraderApi_ReqUserLogout(swigCPtr, this, CThostFtdcUserLogoutField.getCPtr(pUserLogout), pUserLogout, nRequestID);
  }

  public int ReqUserPasswordUpdate(CThostFtdcUserPasswordUpdateField pUserPasswordUpdate, int nRequestID) {
    return thosttradeapiJNI.CThostFtdcTraderApi_ReqUserPasswordUpdate(swigCPtr, this, CThostFtdcUserPasswordUpdateField.getCPtr(pUserPasswordUpdate), pUserPasswordUpdate, nRequestID);
  }

  public int ReqTradingAccountPasswordUpdate(CThostFtdcTradingAccountPasswordUpdateField pTradingAccountPasswordUpdate, int nRequestID) {
    return thosttradeapiJNI.CThostFtdcTraderApi_ReqTradingAccountPasswordUpdate(swigCPtr, this, CThostFtdcTradingAccountPasswordUpdateField.getCPtr(pTradingAccountPasswordUpdate), pTradingAccountPasswordUpdate, nRequestID);
  }

  public int ReqOrderInsert(CThostFtdcInputOrderField pInputOrder, int nRequestID) {
    return thosttradeapiJNI.CThostFtdcTraderApi_ReqOrderInsert(swigCPtr, this, CThostFtdcInputOrderField.getCPtr(pInputOrder), pInputOrder, nRequestID);
  }

  public int ReqParkedOrderInsert(CThostFtdcParkedOrderField pParkedOrder, int nRequestID) {
    return thosttradeapiJNI.CThostFtdcTraderApi_ReqParkedOrderInsert(swigCPtr, this, CThostFtdcParkedOrderField.getCPtr(pParkedOrder), pParkedOrder, nRequestID);
  }

  public int ReqParkedOrderAction(CThostFtdcParkedOrderActionField pParkedOrderAction, int nRequestID) {
    return thosttradeapiJNI.CThostFtdcTraderApi_ReqParkedOrderAction(swigCPtr, this, CThostFtdcParkedOrderActionField.getCPtr(pParkedOrderAction), pParkedOrderAction, nRequestID);
  }

  public int ReqOrderAction(CThostFtdcInputOrderActionField pInputOrderAction, int nRequestID) {
    return thosttradeapiJNI.CThostFtdcTraderApi_ReqOrderAction(swigCPtr, this, CThostFtdcInputOrderActionField.getCPtr(pInputOrderAction), pInputOrderAction, nRequestID);
  }

  public int ReqQueryMaxOrderVolume(CThostFtdcQueryMaxOrderVolumeField pQueryMaxOrderVolume, int nRequestID) {
    return thosttradeapiJNI.CThostFtdcTraderApi_ReqQueryMaxOrderVolume(swigCPtr, this, CThostFtdcQueryMaxOrderVolumeField.getCPtr(pQueryMaxOrderVolume), pQueryMaxOrderVolume, nRequestID);
  }

  public int ReqSettlementInfoConfirm(CThostFtdcSettlementInfoConfirmField pSettlementInfoConfirm, int nRequestID) {
    return thosttradeapiJNI.CThostFtdcTraderApi_ReqSettlementInfoConfirm(swigCPtr, this, CThostFtdcSettlementInfoConfirmField.getCPtr(pSettlementInfoConfirm), pSettlementInfoConfirm, nRequestID);
  }

  public int ReqRemoveParkedOrder(CThostFtdcRemoveParkedOrderField pRemoveParkedOrder, int nRequestID) {
    return thosttradeapiJNI.CThostFtdcTraderApi_ReqRemoveParkedOrder(swigCPtr, this, CThostFtdcRemoveParkedOrderField.getCPtr(pRemoveParkedOrder), pRemoveParkedOrder, nRequestID);
  }

  public int ReqRemoveParkedOrderAction(CThostFtdcRemoveParkedOrderActionField pRemoveParkedOrderAction, int nRequestID) {
    return thosttradeapiJNI.CThostFtdcTraderApi_ReqRemoveParkedOrderAction(swigCPtr, this, CThostFtdcRemoveParkedOrderActionField.getCPtr(pRemoveParkedOrderAction), pRemoveParkedOrderAction, nRequestID);
  }

  public int ReqExecOrderInsert(CThostFtdcInputExecOrderField pInputExecOrder, int nRequestID) {
    return thosttradeapiJNI.CThostFtdcTraderApi_ReqExecOrderInsert(swigCPtr, this, CThostFtdcInputExecOrderField.getCPtr(pInputExecOrder), pInputExecOrder, nRequestID);
  }

  public int ReqExecOrderAction(CThostFtdcInputExecOrderActionField pInputExecOrderAction, int nRequestID) {
    return thosttradeapiJNI.CThostFtdcTraderApi_ReqExecOrderAction(swigCPtr, this, CThostFtdcInputExecOrderActionField.getCPtr(pInputExecOrderAction), pInputExecOrderAction, nRequestID);
  }

  public int ReqForQuoteInsert(CThostFtdcInputForQuoteField pInputForQuote, int nRequestID) {
    return thosttradeapiJNI.CThostFtdcTraderApi_ReqForQuoteInsert(swigCPtr, this, CThostFtdcInputForQuoteField.getCPtr(pInputForQuote), pInputForQuote, nRequestID);
  }

  public int ReqQuoteInsert(CThostFtdcInputQuoteField pInputQuote, int nRequestID) {
    return thosttradeapiJNI.CThostFtdcTraderApi_ReqQuoteInsert(swigCPtr, this, CThostFtdcInputQuoteField.getCPtr(pInputQuote), pInputQuote, nRequestID);
  }

  public int ReqQuoteAction(CThostFtdcInputQuoteActionField pInputQuoteAction, int nRequestID) {
    return thosttradeapiJNI.CThostFtdcTraderApi_ReqQuoteAction(swigCPtr, this, CThostFtdcInputQuoteActionField.getCPtr(pInputQuoteAction), pInputQuoteAction, nRequestID);
  }

  public int ReqBatchOrderAction(CThostFtdcInputBatchOrderActionField pInputBatchOrderAction, int nRequestID) {
    return thosttradeapiJNI.CThostFtdcTraderApi_ReqBatchOrderAction(swigCPtr, this, CThostFtdcInputBatchOrderActionField.getCPtr(pInputBatchOrderAction), pInputBatchOrderAction, nRequestID);
  }

  public int ReqCombActionInsert(CThostFtdcInputCombActionField pInputCombAction, int nRequestID) {
    return thosttradeapiJNI.CThostFtdcTraderApi_ReqCombActionInsert(swigCPtr, this, CThostFtdcInputCombActionField.getCPtr(pInputCombAction), pInputCombAction, nRequestID);
  }

  public int ReqQryOrder(CThostFtdcQryOrderField pQryOrder, int nRequestID) {
    return thosttradeapiJNI.CThostFtdcTraderApi_ReqQryOrder(swigCPtr, this, CThostFtdcQryOrderField.getCPtr(pQryOrder), pQryOrder, nRequestID);
  }

  public int ReqQryTrade(CThostFtdcQryTradeField pQryTrade, int nRequestID) {
    return thosttradeapiJNI.CThostFtdcTraderApi_ReqQryTrade(swigCPtr, this, CThostFtdcQryTradeField.getCPtr(pQryTrade), pQryTrade, nRequestID);
  }

  public int ReqQryInvestorPosition(CThostFtdcQryInvestorPositionField pQryInvestorPosition, int nRequestID) {
    return thosttradeapiJNI.CThostFtdcTraderApi_ReqQryInvestorPosition(swigCPtr, this, CThostFtdcQryInvestorPositionField.getCPtr(pQryInvestorPosition), pQryInvestorPosition, nRequestID);
  }

  public int ReqQryTradingAccount(CThostFtdcQryTradingAccountField pQryTradingAccount, int nRequestID) {
    return thosttradeapiJNI.CThostFtdcTraderApi_ReqQryTradingAccount(swigCPtr, this, CThostFtdcQryTradingAccountField.getCPtr(pQryTradingAccount), pQryTradingAccount, nRequestID);
  }

  public int ReqQryInvestor(CThostFtdcQryInvestorField pQryInvestor, int nRequestID) {
    return thosttradeapiJNI.CThostFtdcTraderApi_ReqQryInvestor(swigCPtr, this, CThostFtdcQryInvestorField.getCPtr(pQryInvestor), pQryInvestor, nRequestID);
  }

  public int ReqQryTradingCode(CThostFtdcQryTradingCodeField pQryTradingCode, int nRequestID) {
    return thosttradeapiJNI.CThostFtdcTraderApi_ReqQryTradingCode(swigCPtr, this, CThostFtdcQryTradingCodeField.getCPtr(pQryTradingCode), pQryTradingCode, nRequestID);
  }

  public int ReqQryInstrumentMarginRate(CThostFtdcQryInstrumentMarginRateField pQryInstrumentMarginRate, int nRequestID) {
    return thosttradeapiJNI.CThostFtdcTraderApi_ReqQryInstrumentMarginRate(swigCPtr, this, CThostFtdcQryInstrumentMarginRateField.getCPtr(pQryInstrumentMarginRate), pQryInstrumentMarginRate, nRequestID);
  }

  public int ReqQryInstrumentCommissionRate(CThostFtdcQryInstrumentCommissionRateField pQryInstrumentCommissionRate, int nRequestID) {
    return thosttradeapiJNI.CThostFtdcTraderApi_ReqQryInstrumentCommissionRate(swigCPtr, this, CThostFtdcQryInstrumentCommissionRateField.getCPtr(pQryInstrumentCommissionRate), pQryInstrumentCommissionRate, nRequestID);
  }

  public int ReqQryExchange(CThostFtdcQryExchangeField pQryExchange, int nRequestID) {
    return thosttradeapiJNI.CThostFtdcTraderApi_ReqQryExchange(swigCPtr, this, CThostFtdcQryExchangeField.getCPtr(pQryExchange), pQryExchange, nRequestID);
  }

  public int ReqQryProduct(CThostFtdcQryProductField pQryProduct, int nRequestID) {
    return thosttradeapiJNI.CThostFtdcTraderApi_ReqQryProduct(swigCPtr, this, CThostFtdcQryProductField.getCPtr(pQryProduct), pQryProduct, nRequestID);
  }

  public int ReqQryInstrument(CThostFtdcQryInstrumentField pQryInstrument, int nRequestID) {
    return thosttradeapiJNI.CThostFtdcTraderApi_ReqQryInstrument(swigCPtr, this, CThostFtdcQryInstrumentField.getCPtr(pQryInstrument), pQryInstrument, nRequestID);
  }

  public int ReqQryDepthMarketData(CThostFtdcQryDepthMarketDataField pQryDepthMarketData, int nRequestID) {
    return thosttradeapiJNI.CThostFtdcTraderApi_ReqQryDepthMarketData(swigCPtr, this, CThostFtdcQryDepthMarketDataField.getCPtr(pQryDepthMarketData), pQryDepthMarketData, nRequestID);
  }

  public int ReqQrySettlementInfo(CThostFtdcQrySettlementInfoField pQrySettlementInfo, int nRequestID) {
    return thosttradeapiJNI.CThostFtdcTraderApi_ReqQrySettlementInfo(swigCPtr, this, CThostFtdcQrySettlementInfoField.getCPtr(pQrySettlementInfo), pQrySettlementInfo, nRequestID);
  }

  public int ReqQryTransferBank(CThostFtdcQryTransferBankField pQryTransferBank, int nRequestID) {
    return thosttradeapiJNI.CThostFtdcTraderApi_ReqQryTransferBank(swigCPtr, this, CThostFtdcQryTransferBankField.getCPtr(pQryTransferBank), pQryTransferBank, nRequestID);
  }

  public int ReqQryInvestorPositionDetail(CThostFtdcQryInvestorPositionDetailField pQryInvestorPositionDetail, int nRequestID) {
    return thosttradeapiJNI.CThostFtdcTraderApi_ReqQryInvestorPositionDetail(swigCPtr, this, CThostFtdcQryInvestorPositionDetailField.getCPtr(pQryInvestorPositionDetail), pQryInvestorPositionDetail, nRequestID);
  }

  public int ReqQryNotice(CThostFtdcQryNoticeField pQryNotice, int nRequestID) {
    return thosttradeapiJNI.CThostFtdcTraderApi_ReqQryNotice(swigCPtr, this, CThostFtdcQryNoticeField.getCPtr(pQryNotice), pQryNotice, nRequestID);
  }

  public int ReqQrySettlementInfoConfirm(CThostFtdcQrySettlementInfoConfirmField pQrySettlementInfoConfirm, int nRequestID) {
    return thosttradeapiJNI.CThostFtdcTraderApi_ReqQrySettlementInfoConfirm(swigCPtr, this, CThostFtdcQrySettlementInfoConfirmField.getCPtr(pQrySettlementInfoConfirm), pQrySettlementInfoConfirm, nRequestID);
  }

  public int ReqQryInvestorPositionCombineDetail(CThostFtdcQryInvestorPositionCombineDetailField pQryInvestorPositionCombineDetail, int nRequestID) {
    return thosttradeapiJNI.CThostFtdcTraderApi_ReqQryInvestorPositionCombineDetail(swigCPtr, this, CThostFtdcQryInvestorPositionCombineDetailField.getCPtr(pQryInvestorPositionCombineDetail), pQryInvestorPositionCombineDetail, nRequestID);
  }

  public int ReqQryCFMMCTradingAccountKey(CThostFtdcQryCFMMCTradingAccountKeyField pQryCFMMCTradingAccountKey, int nRequestID) {
    return thosttradeapiJNI.CThostFtdcTraderApi_ReqQryCFMMCTradingAccountKey(swigCPtr, this, CThostFtdcQryCFMMCTradingAccountKeyField.getCPtr(pQryCFMMCTradingAccountKey), pQryCFMMCTradingAccountKey, nRequestID);
  }

  public int ReqQryEWarrantOffset(CThostFtdcQryEWarrantOffsetField pQryEWarrantOffset, int nRequestID) {
    return thosttradeapiJNI.CThostFtdcTraderApi_ReqQryEWarrantOffset(swigCPtr, this, CThostFtdcQryEWarrantOffsetField.getCPtr(pQryEWarrantOffset), pQryEWarrantOffset, nRequestID);
  }

  public int ReqQryInvestorProductGroupMargin(CThostFtdcQryInvestorProductGroupMarginField pQryInvestorProductGroupMargin, int nRequestID) {
    return thosttradeapiJNI.CThostFtdcTraderApi_ReqQryInvestorProductGroupMargin(swigCPtr, this, CThostFtdcQryInvestorProductGroupMarginField.getCPtr(pQryInvestorProductGroupMargin), pQryInvestorProductGroupMargin, nRequestID);
  }

  public int ReqQryExchangeMarginRate(CThostFtdcQryExchangeMarginRateField pQryExchangeMarginRate, int nRequestID) {
    return thosttradeapiJNI.CThostFtdcTraderApi_ReqQryExchangeMarginRate(swigCPtr, this, CThostFtdcQryExchangeMarginRateField.getCPtr(pQryExchangeMarginRate), pQryExchangeMarginRate, nRequestID);
  }

  public int ReqQryExchangeMarginRateAdjust(CThostFtdcQryExchangeMarginRateAdjustField pQryExchangeMarginRateAdjust, int nRequestID) {
    return thosttradeapiJNI.CThostFtdcTraderApi_ReqQryExchangeMarginRateAdjust(swigCPtr, this, CThostFtdcQryExchangeMarginRateAdjustField.getCPtr(pQryExchangeMarginRateAdjust), pQryExchangeMarginRateAdjust, nRequestID);
  }

  public int ReqQryExchangeRate(CThostFtdcQryExchangeRateField pQryExchangeRate, int nRequestID) {
    return thosttradeapiJNI.CThostFtdcTraderApi_ReqQryExchangeRate(swigCPtr, this, CThostFtdcQryExchangeRateField.getCPtr(pQryExchangeRate), pQryExchangeRate, nRequestID);
  }

  public int ReqQrySecAgentACIDMap(CThostFtdcQrySecAgentACIDMapField pQrySecAgentACIDMap, int nRequestID) {
    return thosttradeapiJNI.CThostFtdcTraderApi_ReqQrySecAgentACIDMap(swigCPtr, this, CThostFtdcQrySecAgentACIDMapField.getCPtr(pQrySecAgentACIDMap), pQrySecAgentACIDMap, nRequestID);
  }

  public int ReqQryProductExchRate(CThostFtdcQryProductExchRateField pQryProductExchRate, int nRequestID) {
    return thosttradeapiJNI.CThostFtdcTraderApi_ReqQryProductExchRate(swigCPtr, this, CThostFtdcQryProductExchRateField.getCPtr(pQryProductExchRate), pQryProductExchRate, nRequestID);
  }

  public int ReqQryProductGroup(CThostFtdcQryProductGroupField pQryProductGroup, int nRequestID) {
    return thosttradeapiJNI.CThostFtdcTraderApi_ReqQryProductGroup(swigCPtr, this, CThostFtdcQryProductGroupField.getCPtr(pQryProductGroup), pQryProductGroup, nRequestID);
  }

  public int ReqQryMMInstrumentCommissionRate(CThostFtdcQryMMInstrumentCommissionRateField pQryMMInstrumentCommissionRate, int nRequestID) {
    return thosttradeapiJNI.CThostFtdcTraderApi_ReqQryMMInstrumentCommissionRate(swigCPtr, this, CThostFtdcQryMMInstrumentCommissionRateField.getCPtr(pQryMMInstrumentCommissionRate), pQryMMInstrumentCommissionRate, nRequestID);
  }

  public int ReqQryMMOptionInstrCommRate(CThostFtdcQryMMOptionInstrCommRateField pQryMMOptionInstrCommRate, int nRequestID) {
    return thosttradeapiJNI.CThostFtdcTraderApi_ReqQryMMOptionInstrCommRate(swigCPtr, this, CThostFtdcQryMMOptionInstrCommRateField.getCPtr(pQryMMOptionInstrCommRate), pQryMMOptionInstrCommRate, nRequestID);
  }

  public int ReqQryInstrumentOrderCommRate(CThostFtdcQryInstrumentOrderCommRateField pQryInstrumentOrderCommRate, int nRequestID) {
    return thosttradeapiJNI.CThostFtdcTraderApi_ReqQryInstrumentOrderCommRate(swigCPtr, this, CThostFtdcQryInstrumentOrderCommRateField.getCPtr(pQryInstrumentOrderCommRate), pQryInstrumentOrderCommRate, nRequestID);
  }

  public int ReqQryOptionInstrTradeCost(CThostFtdcQryOptionInstrTradeCostField pQryOptionInstrTradeCost, int nRequestID) {
    return thosttradeapiJNI.CThostFtdcTraderApi_ReqQryOptionInstrTradeCost(swigCPtr, this, CThostFtdcQryOptionInstrTradeCostField.getCPtr(pQryOptionInstrTradeCost), pQryOptionInstrTradeCost, nRequestID);
  }

  public int ReqQryOptionInstrCommRate(CThostFtdcQryOptionInstrCommRateField pQryOptionInstrCommRate, int nRequestID) {
    return thosttradeapiJNI.CThostFtdcTraderApi_ReqQryOptionInstrCommRate(swigCPtr, this, CThostFtdcQryOptionInstrCommRateField.getCPtr(pQryOptionInstrCommRate), pQryOptionInstrCommRate, nRequestID);
  }

  public int ReqQryExecOrder(CThostFtdcQryExecOrderField pQryExecOrder, int nRequestID) {
    return thosttradeapiJNI.CThostFtdcTraderApi_ReqQryExecOrder(swigCPtr, this, CThostFtdcQryExecOrderField.getCPtr(pQryExecOrder), pQryExecOrder, nRequestID);
  }

  public int ReqQryForQuote(CThostFtdcQryForQuoteField pQryForQuote, int nRequestID) {
    return thosttradeapiJNI.CThostFtdcTraderApi_ReqQryForQuote(swigCPtr, this, CThostFtdcQryForQuoteField.getCPtr(pQryForQuote), pQryForQuote, nRequestID);
  }

  public int ReqQryQuote(CThostFtdcQryQuoteField pQryQuote, int nRequestID) {
    return thosttradeapiJNI.CThostFtdcTraderApi_ReqQryQuote(swigCPtr, this, CThostFtdcQryQuoteField.getCPtr(pQryQuote), pQryQuote, nRequestID);
  }

  public int ReqQryCombInstrumentGuard(CThostFtdcQryCombInstrumentGuardField pQryCombInstrumentGuard, int nRequestID) {
    return thosttradeapiJNI.CThostFtdcTraderApi_ReqQryCombInstrumentGuard(swigCPtr, this, CThostFtdcQryCombInstrumentGuardField.getCPtr(pQryCombInstrumentGuard), pQryCombInstrumentGuard, nRequestID);
  }

  public int ReqQryCombAction(CThostFtdcQryCombActionField pQryCombAction, int nRequestID) {
    return thosttradeapiJNI.CThostFtdcTraderApi_ReqQryCombAction(swigCPtr, this, CThostFtdcQryCombActionField.getCPtr(pQryCombAction), pQryCombAction, nRequestID);
  }

  public int ReqQryTransferSerial(CThostFtdcQryTransferSerialField pQryTransferSerial, int nRequestID) {
    return thosttradeapiJNI.CThostFtdcTraderApi_ReqQryTransferSerial(swigCPtr, this, CThostFtdcQryTransferSerialField.getCPtr(pQryTransferSerial), pQryTransferSerial, nRequestID);
  }

  public int ReqQryAccountregister(CThostFtdcQryAccountregisterField pQryAccountregister, int nRequestID) {
    return thosttradeapiJNI.CThostFtdcTraderApi_ReqQryAccountregister(swigCPtr, this, CThostFtdcQryAccountregisterField.getCPtr(pQryAccountregister), pQryAccountregister, nRequestID);
  }

  public int ReqQryContractBank(CThostFtdcQryContractBankField pQryContractBank, int nRequestID) {
    return thosttradeapiJNI.CThostFtdcTraderApi_ReqQryContractBank(swigCPtr, this, CThostFtdcQryContractBankField.getCPtr(pQryContractBank), pQryContractBank, nRequestID);
  }

  public int ReqQryParkedOrder(CThostFtdcQryParkedOrderField pQryParkedOrder, int nRequestID) {
    return thosttradeapiJNI.CThostFtdcTraderApi_ReqQryParkedOrder(swigCPtr, this, CThostFtdcQryParkedOrderField.getCPtr(pQryParkedOrder), pQryParkedOrder, nRequestID);
  }

  public int ReqQryParkedOrderAction(CThostFtdcQryParkedOrderActionField pQryParkedOrderAction, int nRequestID) {
    return thosttradeapiJNI.CThostFtdcTraderApi_ReqQryParkedOrderAction(swigCPtr, this, CThostFtdcQryParkedOrderActionField.getCPtr(pQryParkedOrderAction), pQryParkedOrderAction, nRequestID);
  }

  public int ReqQryTradingNotice(CThostFtdcQryTradingNoticeField pQryTradingNotice, int nRequestID) {
    return thosttradeapiJNI.CThostFtdcTraderApi_ReqQryTradingNotice(swigCPtr, this, CThostFtdcQryTradingNoticeField.getCPtr(pQryTradingNotice), pQryTradingNotice, nRequestID);
  }

  public int ReqQryBrokerTradingParams(CThostFtdcQryBrokerTradingParamsField pQryBrokerTradingParams, int nRequestID) {
    return thosttradeapiJNI.CThostFtdcTraderApi_ReqQryBrokerTradingParams(swigCPtr, this, CThostFtdcQryBrokerTradingParamsField.getCPtr(pQryBrokerTradingParams), pQryBrokerTradingParams, nRequestID);
  }

  public int ReqQryBrokerTradingAlgos(CThostFtdcQryBrokerTradingAlgosField pQryBrokerTradingAlgos, int nRequestID) {
    return thosttradeapiJNI.CThostFtdcTraderApi_ReqQryBrokerTradingAlgos(swigCPtr, this, CThostFtdcQryBrokerTradingAlgosField.getCPtr(pQryBrokerTradingAlgos), pQryBrokerTradingAlgos, nRequestID);
  }

  public int ReqQueryCFMMCTradingAccountToken(CThostFtdcQueryCFMMCTradingAccountTokenField pQueryCFMMCTradingAccountToken, int nRequestID) {
    return thosttradeapiJNI.CThostFtdcTraderApi_ReqQueryCFMMCTradingAccountToken(swigCPtr, this, CThostFtdcQueryCFMMCTradingAccountTokenField.getCPtr(pQueryCFMMCTradingAccountToken), pQueryCFMMCTradingAccountToken, nRequestID);
  }

  public int ReqFromBankToFutureByFuture(CThostFtdcReqTransferField pReqTransfer, int nRequestID) {
    return thosttradeapiJNI.CThostFtdcTraderApi_ReqFromBankToFutureByFuture(swigCPtr, this, CThostFtdcReqTransferField.getCPtr(pReqTransfer), pReqTransfer, nRequestID);
  }

  public int ReqFromFutureToBankByFuture(CThostFtdcReqTransferField pReqTransfer, int nRequestID) {
    return thosttradeapiJNI.CThostFtdcTraderApi_ReqFromFutureToBankByFuture(swigCPtr, this, CThostFtdcReqTransferField.getCPtr(pReqTransfer), pReqTransfer, nRequestID);
  }

  public int ReqQueryBankAccountMoneyByFuture(CThostFtdcReqQueryAccountField pReqQueryAccount, int nRequestID) {
    return thosttradeapiJNI.CThostFtdcTraderApi_ReqQueryBankAccountMoneyByFuture(swigCPtr, this, CThostFtdcReqQueryAccountField.getCPtr(pReqQueryAccount), pReqQueryAccount, nRequestID);
  }

}
