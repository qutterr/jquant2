package jquant2.futures;

import test.thosttraderapi.*;

/**
 * Created by zcy on 2017/7/11.21:01:25
 */
class TraderSpiImpl extends CThostFtdcTraderSpi{
    final static String m_BrokerId = "9999";
    //final static String m_UserId = "101050655";
    final static String m_InvestorId = "097545";
    final static String m_PassWord = "iHi3mGGmrzo";
    final static String m_TradingDay = "20161111";
    final static String m_AccountId = "000326";
    final static String m_CurrencyId = "CNY";
    TraderSpiImpl(CThostFtdcTraderApi traderapi)
    {
        m_traderapi =  traderapi;
    }

    @Override
    public void OnFrontConnected(){
        System.out.println("On Front Connected");
        CThostFtdcReqUserLoginField field = new CThostFtdcReqUserLoginField();
        field.setBrokerID(m_BrokerId);
        //field.setUserID(m_UserId);
        field.setPassword(m_PassWord);
        field.setUserProductInfo("JAVA_API");
        m_traderapi.ReqUserLogin(field,0);
        System.out.println("Send login ok");
    }

    @Override
    public void OnRspUserLogin(CThostFtdcRspUserLoginField pRspUserLogin, CThostFtdcRspInfoField pRspInfo, int nRequestID, boolean bIsLast)
    {
        if (pRspInfo != null && pRspInfo.getErrorID() != 0)
        {
            System.out.printf("Login ErrorID[%d] ErrMsg[%s]\n", pRspInfo.getErrorID(), pRspInfo.getErrorMsg());

            return;
        }
        System.out.println("Login success!!!");
        CThostFtdcQryTradingAccountField qryTradingAccount = new CThostFtdcQryTradingAccountField();
        qryTradingAccount.setBrokerID(m_BrokerId);
        //qryTradingAccount.setCurrencyID(m_CurrencyId);;
        qryTradingAccount.setInvestorID(m_InvestorId);
        m_traderapi.ReqQryTradingAccount(qryTradingAccount, 1);

    }

    @Override
    public void OnFrontDisconnected(int nReason){
        System.out.println("连接失败!!!"+nReason);
    }

    @Override
    public void OnRspQryTradingAccount(CThostFtdcTradingAccountField pTradingAccount, CThostFtdcRspInfoField pRspInfo, int nRequestID, boolean bIsLast)
    {
        if (pRspInfo != null && pRspInfo.getErrorID() != 0)
        {
            System.out.printf("OnRspQryTradingAccount ErrorID[%d] ErrMsg[%s]\n", pRspInfo.getErrorID(), pRspInfo.getErrorMsg());

            return;
        }

        if (pTradingAccount != null)
        {
            System.out.printf("Balance[%f]Available[%f]WithdrawQuota[%f]Credit[%f]\n",
                    pTradingAccount.getBalance(), pTradingAccount.getAvailable(), pTradingAccount.getWithdrawQuota(),
                    pTradingAccount.getCredit());
        }
        else
        {
            System.out.printf("NULL obj\n");
        }
    }

    private CThostFtdcTraderApi m_traderapi;
}

