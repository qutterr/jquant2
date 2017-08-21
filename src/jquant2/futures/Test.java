package jquant2.futures;

import test.thostmduserapi.CThostFtdcMdApi;
import test.thosttraderapi.CThostFtdcTraderApi;
import test.thosttraderapi.THOST_TE_RESUME_TYPE;

/**
 * Created by zcy on 2017/7/11.21:07:26
 */
public class Test {
    static{
        System.loadLibrary("thosttraderapi");
        System.loadLibrary("thosttraderapi_wrap");
        System.loadLibrary("thostmduserapi");
        System.loadLibrary("thostmduserapi_wrap");
    }
    final static String ctp1_TradeAddress = "tcp://180.168.146.187:10000";
    //final static String ctp1_TradeAddress = "tcp://180.168.146.187:10030";
    //final static String ctp1_MdAddress = "tcp://180.168.146.187:10010";
    final static String ctp1_MdAddress = "tcp://ctp1-md5.citicsf.com:41213";
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        /*CThostFtdcTraderApi traderApi = CThostFtdcTraderApi.CreateFtdcTraderApi();
        TraderSpiImpl pTraderSpi = new TraderSpiImpl(traderApi);
        traderApi.RegisterSpi(pTraderSpi);
        traderApi.RegisterFront(ctp1_TradeAddress);
        traderApi.SubscribePublicTopic(THOST_TE_RESUME_TYPE.THOST_TERT_RESTART);
        traderApi.SubscribePrivateTopic(THOST_TE_RESUME_TYPE.THOST_TERT_RESTART);
        traderApi.Init();
        System.out.println(traderApi.GetTradingDay());
        traderApi.Join();*/
        String pszFlowPath = "C:\\2016\\jquant2\\out";
        CThostFtdcMdApi mdApi = CThostFtdcMdApi.CreateFtdcMdApi(pszFlowPath,true);
        MdSpiImpl mdSpi = new MdSpiImpl(mdApi);
        mdApi.RegisterSpi(mdSpi);
        mdApi.RegisterFront(ctp1_MdAddress);
        mdApi.Init();
        mdApi.Join();

        return;
    }
}
