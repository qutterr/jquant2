package jquant2.futures;

import com.alibaba.fastjson.JSON;
import com.jquent2.calc.FutureConst;
import com.po.futures.CtpData;
import jquant2.util.DbBuilder;
import test.thostmduserapi.*;

import java.math.BigDecimal;

/**
 * Created by zcy on 2017/8/11.12:23:48
 */
public class MdSpiCollection extends CThostFtdcMdSpi {

    final static String m_BrokerId = "9999";
    final static String m_UserId = "097545";
    final static String m_InvestorId = "097545";
    final static String m_PassWord = "iHi3mGGmrzo";
    final static String m_TradingDay = "20161111";
    final static String m_AccountId = "000326";
    final static String m_CurrencyId = "CNY";
    private static final String LINE_SEPARATOR = System.getProperty("line.separator");

    MdSpiCollection(CThostFtdcMdApi mdApi,String[] _ppInstrumentID)
    {
        m_mdapi =  mdApi;
        ppInstrumentID = _ppInstrumentID;
    }

    private CThostFtdcMdApi m_mdapi;
    private String[] ppInstrumentID;

    @Override
    public void OnFrontConnected() {
        /*
        客户端到行情前置的无身份验证连接建立之后，这个函数会被调用，用于说明连接已经建立。连接建立之后，才能请求登录
         */
        super.OnFrontConnected();
        System.out.println("On Front Connected");
        test.thostmduserapi.CThostFtdcReqUserLoginField field = new test.thostmduserapi.CThostFtdcReqUserLoginField();
        field.setBrokerID(m_BrokerId);
        field.setUserID(m_UserId);
        field.setPassword(m_PassWord);
        field.setUserProductInfo("JAVA_API");
        m_mdapi.ReqUserLogin(field, 0);
        System.out.println("Send login ok");
        String[] _ppInstrumentID = ppInstrumentID;
        int i = m_mdapi.SubscribeMarketData(_ppInstrumentID,_ppInstrumentID.length);
    }

    @Override
    public void OnFrontDisconnected(int nReason) {
        /*
        如果客户端到行情前置的无身份验证连接建立失败，这个函数被调用。其中的参数说明连接失败的原因
         */
        super.OnFrontDisconnected(nReason);
        System.out.println("连接失败!!!" + nReason);
        FutureConst.getInstance().setLock(false);
    }

    /*
   交易系统对客户端的请求登录消息作出的响应
    */
    @Override
    public void OnRspUserLogin(CThostFtdcRspUserLoginField pRspUserLogin, CThostFtdcRspInfoField pRspInfo, int nRequestID, boolean bIsLast) {
        if (pRspInfo != null && pRspInfo.getErrorID() != 0)
        {
            System.out.printf("Login ErrorID[%d] ErrMsg[%s]\n", pRspInfo.getErrorID(), pRspInfo.getErrorMsg());
            return;
        }
        System.out.println("Login success!!!");
        System.out.println("BrokerID:" + pRspUserLogin.getBrokerID());
        System.out.println("CZCETime:" + pRspUserLogin.getCZCETime());
        System.out.println("MaxOrderRef:" + pRspUserLogin.getMaxOrderRef());
        System.out.println("UserID:"+pRspUserLogin.getUserID());
        System.out.println("FrontID:"+pRspUserLogin.getFrontID());
        System.out.println("SessionID:" + pRspUserLogin.getSessionID());
        System.out.println("SystemName:" + pRspUserLogin.getSystemName());

    }

    /**
     *  交易核心认为客户端请求订阅行情的消息不合法时通过这个函数返回错误信息。订阅请求合法时，也会调用，返回错误代码为 0
     * @param pSpecificInstrument
     * @param pRspInfo
     * @param nRequestID
     * @param bIsLast
     */
    @Override
    public void OnRspSubMarketData(CThostFtdcSpecificInstrumentField pSpecificInstrument, CThostFtdcRspInfoField pRspInfo, int nRequestID, boolean bIsLast) {
        System.out.println("OnRspSubMarketData");
        super.OnRspSubMarketData(pSpecificInstrument, pRspInfo, nRequestID, bIsLast);
    }

    /**
     * 交易核心认为客户端请求退订行情的消息不合法时通过这个函数返回错误信息
     * @param pSpecificInstrument
     * @param pRspInfo
     * @param nRequestID
     * @param bIsLast
     */
    @Override
    public void OnRspUnSubMarketData(CThostFtdcSpecificInstrumentField pSpecificInstrument, CThostFtdcRspInfoField pRspInfo, int nRequestID, boolean bIsLast) {
        System.out.println("OnRspUnSubMarketData");
        super.OnRspUnSubMarketData(pSpecificInstrument, pRspInfo, nRequestID, bIsLast);
    }
    /**
     * 通过这个函数返回行情信息。频率是每秒两次
     * @param pDepthMarketData
     */
    @Override
    public void OnRtnDepthMarketData(CThostFtdcDepthMarketDataField pDepthMarketData) {
        System.out.println(pDepthMarketData.getInstrumentID()+"的价格为"+pDepthMarketData.getAskPrice1());
        DbBuilder.insertCtpData(getCtpData(pDepthMarketData));
        //System.out.println(JSON.toJSONString(getCtpData(pDepthMarketData)));
    }

    /**
     * 如果交易系统无法识别客户端发送的请求消息，就通过这个函数返回错误信息
     * @param pRspInfo
     * @param nRequestID
     * @param bIsLast
     */
    @Override
    public void OnRspError(CThostFtdcRspInfoField pRspInfo, int nRequestID, boolean bIsLast) {
        System.out.println("OnRspError");
        super.OnRspError(pRspInfo, nRequestID, bIsLast);
    }

    /**
     * 如果超过一定时间在客户端和系统之间没有任何消息交换发生，这个函数会发送心跳用来说明客户端到系统服务器之间的连接是活跃的。
     目前此接口已经不再起效
     * @param nTimeLapse
     */
    @Override
    public void OnHeartBeatWarning(int nTimeLapse) {
        System.out.println("OnHeartBeatWarning");
        super.OnHeartBeatWarning(nTimeLapse);
    }

    public CtpData getCtpData(CThostFtdcDepthMarketDataField depthMarketDataField){
        CtpData ctpData = new CtpData();
        ctpData.setActionDay(depthMarketDataField.getActionDay());
        ctpData.setAskPrice1(Double.MAX_VALUE == depthMarketDataField.getAskPrice1() ? null : depthMarketDataField.getAskPrice1());
        ctpData.setAskPrice2(Double.MAX_VALUE == depthMarketDataField.getAskPrice2() ? null : depthMarketDataField.getAskPrice2());
        ctpData.setAskPrice3(Double.MAX_VALUE == depthMarketDataField.getAskPrice3() ? null : depthMarketDataField.getAskPrice3());
        ctpData.setAskPrice4(Double.MAX_VALUE == depthMarketDataField.getAskPrice4() ? null : depthMarketDataField.getAskPrice4());
        ctpData.setAskPrice5(Double.MAX_VALUE == depthMarketDataField.getAskPrice5() ? null : depthMarketDataField.getAskPrice5());
        ctpData.setAskVolume1(depthMarketDataField.getAskVolume1());
        ctpData.setAskVolume2(depthMarketDataField.getAskVolume2());
        ctpData.setAskVolume3(depthMarketDataField.getAskVolume3());
        ctpData.setAskVolume4(depthMarketDataField.getAskVolume4());
        ctpData.setAskVolume5(depthMarketDataField.getAskVolume5());

        ctpData.setAveragePrice(depthMarketDataField.getAveragePrice());


        ctpData.setBidPrice1(Double.MAX_VALUE == depthMarketDataField.getBidPrice1() ? null : depthMarketDataField.getBidPrice1());
        ctpData.setBidPrice2(Double.MAX_VALUE == depthMarketDataField.getBidPrice2() ? null : depthMarketDataField.getBidPrice2());
        ctpData.setBidPrice3(Double.MAX_VALUE == depthMarketDataField.getBidPrice3() ? null : depthMarketDataField.getBidPrice3());
        ctpData.setBidPrice4(Double.MAX_VALUE == depthMarketDataField.getBidPrice4() ? null : depthMarketDataField.getBidPrice4());
        ctpData.setBidPrice5(Double.MAX_VALUE == depthMarketDataField.getBidPrice5() ? null : depthMarketDataField.getBidPrice5());

        ctpData.setBidVolume1(depthMarketDataField.getBidVolume1());
        ctpData.setBidVolume2(depthMarketDataField.getBidVolume2());
        ctpData.setBidVolume3(depthMarketDataField.getBidVolume3());
        ctpData.setBidVolume4(depthMarketDataField.getBidVolume4());
        ctpData.setBidVolume5(depthMarketDataField.getBidVolume5());
        ctpData.setClosePrice(Double.MAX_VALUE == depthMarketDataField.getClosePrice() ? null : depthMarketDataField.getClosePrice());
        ctpData.setCurrDelta(Double.MAX_VALUE == depthMarketDataField.getCurrDelta() ? null : depthMarketDataField.getCurrDelta());
        ctpData.setExchangeID(depthMarketDataField.getExchangeID());
        ctpData.setExchangeInstID(depthMarketDataField.getExchangeInstID());
        ctpData.setHighestPrice(depthMarketDataField.getHighestPrice());
        ctpData.setInstrumentID(depthMarketDataField.getInstrumentID());
        ctpData.setLastPrice(depthMarketDataField.getLastPrice());
        ctpData.setLowerLimitPrice(depthMarketDataField.getLowerLimitPrice());
        ctpData.setLowestPrice(depthMarketDataField.getLowestPrice());
        ctpData.setOpenInterest(depthMarketDataField.getOpenInterest());
        ctpData.setOpenPrice(depthMarketDataField.getOpenPrice());
        ctpData.setPreClosePrice(Double.MAX_VALUE == depthMarketDataField.getPreClosePrice() ? null : depthMarketDataField.getPreClosePrice());
        ctpData.setPreDelta(Double.MAX_VALUE == depthMarketDataField.getPreDelta() ? null : depthMarketDataField.getPreDelta());
        ctpData.setPreOpenInterest(depthMarketDataField.getPreOpenInterest());
        ctpData.setPreSettlementPrice(depthMarketDataField.getPreSettlementPrice());
        ctpData.setSettlementPrice(Double.MAX_VALUE == depthMarketDataField.getSettlementPrice() ? null : depthMarketDataField.getSettlementPrice());
        ctpData.setTradingDay(depthMarketDataField.getTradingDay());
        ctpData.setTurnover(depthMarketDataField.getTurnover());
        ctpData.setUpdateMillisec(depthMarketDataField.getUpdateMillisec());
        ctpData.setUpdateTime(depthMarketDataField.getUpdateTime());
        ctpData.setUpperLimitPrice(depthMarketDataField.getUpperLimitPrice());
        ctpData.setVolume(depthMarketDataField.getVolume());
        return  ctpData;
    }

    /**
     * 格式化后四舍五入保留6位
     *
     * @param arg0
     * @return
     */
    private static Double formatDouble6(Double arg0) {
        //格式化后四舍五入保留两位
        BigDecimal bd = new BigDecimal(arg0);
        return bd.setScale(6, BigDecimal.ROUND_HALF_UP).doubleValue();
    }
}
