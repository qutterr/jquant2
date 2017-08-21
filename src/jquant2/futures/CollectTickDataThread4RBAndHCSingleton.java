package jquant2.futures;

import test.thostmduserapi.CThostFtdcMdApi;

import java.util.Date;

/**
 * Created by zcy on 2017/8/13.20:35:29
 */
public class CollectTickDataThread4RBAndHCSingleton extends CollectTickDataThread{
    private static CollectTickDataThread4RBAndHCSingleton ourInstance;

    public static synchronized CollectTickDataThread4RBAndHCSingleton getInstance() {
        if (ourInstance == null) {
            ourInstance = new CollectTickDataThread4RBAndHCSingleton();
        }
        return ourInstance;
    }

    public synchronized void setnullInstance(){
        ourInstance = null;
    }

    private CollectTickDataThread4RBAndHCSingleton() {}

    public boolean iscollect() {
        return iscollect;
    }

    public void setIscollect(boolean iscollect) {
        this.iscollect = iscollect;
    }

    private boolean iscollect = false;

    @Override
    public void collect() {
        //锁下载状态
        System.out.println("开始收集数据"+new Date());
        iscollect = true;
        mdApi = CThostFtdcMdApi.CreateFtdcMdApi(pszFlowPath, true);
        String[] _ppInstrumentID = {"rb1801", "hc1801"};
        mdSpi = new MdSpiCollection(mdApi, _ppInstrumentID);
        mdApi.RegisterSpi(mdSpi);
        mdApi.RegisterFront(ctp1_MdAddress);
        mdApi.Init();
    }


    public void UnInitialMdApi(){
        //释放MdApi
        if(mdApi!=null){
            mdApi.RegisterSpi(null);
            mdApi.Release();
            mdApi = null;
            iscollect = false;
        }
        //释放mdSpi
        if(mdSpi != null){
            mdSpi.delete();
            mdSpi = null;
        }

    }


}
