package jquant2.futures;

import com.alibaba.fastjson.JSON;
import jquant2.util.FileUtil;
import test.thostmduserapi.*;
import test.thostmduserapi.CThostFtdcDepthMarketDataField;
import test.thostmduserapi.CThostFtdcReqUserLoginField;
import test.thostmduserapi.CThostFtdcRspInfoField;
import test.thostmduserapi.CThostFtdcRspUserLoginField;
import test.thostmduserapi.CThostFtdcSpecificInstrumentField;
import test.thosttraderapi.*;

/**
 * Created by zcy on 2017/7/21.10:46:55
 */
public class MdSpiImpl extends CThostFtdcMdSpi {
    final static String m_BrokerId = "9999";
    final static String m_UserId = "097545";
    final static String m_InvestorId = "097545";
    final static String m_PassWord = "iHi3mGGmrzo";
    final static String m_TradingDay = "20161111";
    final static String m_AccountId = "000326";
    final static String m_CurrencyId = "CNY";

    private static final String LINE_SEPARATOR = System.getProperty("line.separator");

    MdSpiImpl(CThostFtdcMdApi mdApi)
    {
        m_mdapi =  mdApi;
    }

    private CThostFtdcMdApi m_mdapi;

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
        String[] ppInstrumentID = new String[1];
        ppInstrumentID[0] = "rb1801";
        //ppInstrumentID[1] = "hc1801";
        int i = m_mdapi.SubscribeMarketData(ppInstrumentID,1);
        System.out.println(i);
    }

    @Override
    public void OnFrontDisconnected(int nReason) {
        /*
        如果客户端到行情前置的无身份验证连接建立失败，这个函数被调用。其中的参数说明连接失败的原因
         */
        super.OnFrontDisconnected(nReason);
        System.out.println("连接失败!!!" + nReason);
    }

    /*
    交易系统对客户端的请求登录消息作出的响应
     */
    @Override
    public void OnRspUserLogin(CThostFtdcRspUserLoginField pRspUserLogin, CThostFtdcRspInfoField pRspInfo, int nRequestID, boolean bIsLast) {
        //super.OnRspUserLogin(pRspUserLogin, pRspInfo, nRequestID, bIsLast);
        if (pRspInfo != null && pRspInfo.getErrorID() != 0)
        {
            System.out.printf("Login ErrorID[%d] ErrMsg[%s]\n", pRspInfo.getErrorID(), pRspInfo.getErrorMsg());

            return;
        }
        System.out.println("Login success!!!");
        System.out.println("BrokerID:" + pRspUserLogin.getBrokerID());
        System.out.println("CZCETime:"+pRspUserLogin.getCZCETime());
        System.out.println("MaxOrderRef:"+pRspUserLogin.getMaxOrderRef());
        System.out.println("UserID:"+pRspUserLogin.getUserID());
        System.out.println("FrontID:"+pRspUserLogin.getFrontID());
        System.out.println("SessionID:"+pRspUserLogin.getSessionID());
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
        /*String hc1710 = "C:\\2016\\hc1710.txt";
        String rb1710 = "C:\\2016\\rb1710.txt";
        Long time = System.currentTimeMillis();
        Double buyprice = pDepthMarketData.getBidPrice1();
        Double sellprice = pDepthMarketData.getAskPrice1();
        String log = time.toString()+"#"+buyprice.toString()+"#"+sellprice.toString()+LINE_SEPARATOR;
        if(pDepthMarketData.getInstrumentID().equalsIgnoreCase("hc1710")){
            FileUtil.savelog(hc1710, log, true);
        }else if(pDepthMarketData.getInstrumentID().equalsIgnoreCase("rb1710")){
            FileUtil.savelog(rb1710, log, true);
        }else{
        }*/

        System.out.println(JSON.toJSONString(pDepthMarketData));


        //System.out.println("%"+pDepthMarketData.getInstrumentID()+"AskPrice1:"+pDepthMarketData.getAskPrice1()+"&&&&&&BidPrice1:"+pDepthMarketData.getBidPrice1());
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
}
