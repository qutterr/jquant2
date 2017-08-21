package jquant2.futures;

import com.jquent2.calc.FutureConst;
import test.thostmduserapi.CThostFtdcMdApi;

/**
 * Created by zcy on 2017/8/13.17:41:47
 */
public abstract class CollectTickDataThread extends Thread{
    static{
        System.loadLibrary("thosttraderapi");
        System.loadLibrary("thosttraderapi_wrap");
        System.loadLibrary("thostmduserapi");
        System.loadLibrary("thostmduserapi_wrap");
    }
    final static String ctp1_TradeAddress = "tcp://180.168.146.187:10000";
    //final static String ctp1_TradeAddress = "tcp://180.168.146.187:10030";
    final static String ctp1_MdAddress = "tcp://180.168.146.187:10010";
    //final static String ctp1_MdAddress = "tcp://ctp1-md5.citicsf.com:41213";
    final static String pszFlowPath = "C:\\2016\\jquant2\\out";

    protected CThostFtdcMdApi mdApi;
    protected MdSpiCollection mdSpi;

    public abstract void collect();

    @Override
    public void run() {
        //while (!exit);
        try {
            if(!isInterrupted()){
                collect();
            }
        }catch (ThreadDeath e){
            //锁下载状态
            System.out.println("终止收集数据");
            FutureConst.getInstance().setLock(false);
        }
    }


}
