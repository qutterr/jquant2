package com.jquent2.calc;

import jquant2.futures.CollectTickDataThread4RBAndHCSingleton;
import jquant2.util.TradeDayUtil;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * Created by zcy on 2017/8/14.14:51:23
 * 服务器启动后启动监听器
 * 每隔一秒判断当前日期时间
 */
public class FutureListener implements ServletContextListener {

    @Override
    public void contextInitialized(ServletContextEvent servletContextEvent) {
        //init operation 初始化 后执行定时判断是否开启收集器  延迟3秒启动  每10秒执行一次StartCollectTask.run
        StartCollectTask.getInstance().setStarted(false);
        StopCollectTask.getInstance().setStoped(false);
        Timer timer = new Timer();
        //timer.schedule(StartCollectTask.getInstance(), 3000, 10000);
        //timer.schedule(StopCollectTask.getInstance(), 3000, 10000);
        //timer.schedule(new StartCollectTask2(), 3000, 10000);
    }

    @Override
    public void contextDestroyed(ServletContextEvent servletContextEvent) {

    }

}

class StartCollectTask extends TimerTask {
    private static StartCollectTask ourInstance;
    public static synchronized StartCollectTask getInstance() {
        if (ourInstance == null) {
            ourInstance = new StartCollectTask();
        }
        return ourInstance;
    }
    public synchronized void setnullInstance(){
        ourInstance = null;
    }
    private StartCollectTask() {}

    public boolean isStarted() {
        return started;
    }

    public void setStarted(boolean started) {
        this.started = started;
    }

    protected boolean started = false;//已调用开始采集

    private int times = 0;
    @Override
    public void run() {
        //如果当前处于交易日 处理
        if((new SimpleDateFormat("yyyyMMdd")).format(new Date()).equalsIgnoreCase(TradeDayUtil.getNextTradeDay())){
            if(!started){
                if(StopCollectTask.getInstance()==null){

                }else{
                    StopCollectTask.getInstance().setStoped(false);
                }
                Calendar cal = Calendar.getInstance();
                //如果执行时候当前时间介于8:55-8:56  20:50-20:52 则启动收集程序
                if(cal.get(Calendar.HOUR_OF_DAY) == 8 && cal.get(Calendar.MINUTE)>=57 && cal.get(Calendar.MINUTE)<=58){
                    this.started = true;
                    if(CollectTickDataThread4RBAndHCSingleton.getInstance().iscollect()){

                    }else {
                        try{
                            CollectTickDataThread4RBAndHCSingleton.getInstance().start();
                        }catch (IllegalThreadStateException e){
                            CollectTickDataThread4RBAndHCSingleton.getInstance().setnullInstance();
                            CollectTickDataThread4RBAndHCSingleton.getInstance().start();
                        }
                    }
                }else if(cal.get(Calendar.HOUR_OF_DAY) == 20 && cal.get(Calendar.MINUTE)>=55 && cal.get(Calendar.MINUTE)<=56){
                    this.started = true;
                    if(CollectTickDataThread4RBAndHCSingleton.getInstance().iscollect()){

                    }else {
                        try{
                            CollectTickDataThread4RBAndHCSingleton.getInstance().start();
                        }catch (IllegalThreadStateException e){
                            CollectTickDataThread4RBAndHCSingleton.getInstance().setnullInstance();
                            CollectTickDataThread4RBAndHCSingleton.getInstance().start();
                        }
                    }
                }else{
                    //this.started = false;
                }
            }else{
                //System.out.println("已启动收集程序,无需再次启动");
            }
        }
        //System.out.println("started:"+started+" times:"+times++);
    }
}

class StopCollectTask extends TimerTask {
    private static StopCollectTask ourInstance;
    public static synchronized StopCollectTask getInstance() {
        if (ourInstance == null) {
            ourInstance = new StopCollectTask();
        }
        return ourInstance;
    }
    public synchronized void setnullInstance(){
        ourInstance = null;
    }
    private StopCollectTask() {}

    public boolean isStoped() {
        return stoped;
    }

    public void setStoped(boolean stoped) {
        this.stoped = stoped;
    }

    protected boolean stoped = false;//已调用关闭采集

    private int times = 0;
    @Override
    public void run() {
        //如果当前处于交易日 处理
        //if((new SimpleDateFormat("yyyyMMdd")).format(new Date()).equalsIgnoreCase(TradeDayUtil.getNextTradeDay())){
            if(!stoped){
                if(StartCollectTask.getInstance()==null){

                }else{
                    StartCollectTask.getInstance().setStarted(false);
                }
                Calendar cal = Calendar.getInstance();
                //如果执行时候当前时间介于15:06-15:08  23:06-23:08 则停止收集程序
                if(cal.get(Calendar.HOUR_OF_DAY) == 15 && cal.get(Calendar.MINUTE)>=2 && cal.get(Calendar.MINUTE)<=3){
                    this.stoped = true;
                    if(!CollectTickDataThread4RBAndHCSingleton.getInstance().iscollect()){

                    }else {
                        CollectTickDataThread4RBAndHCSingleton.getInstance().UnInitialMdApi();
                        CollectTickDataThread4RBAndHCSingleton.getInstance().setnullInstance();
                    }
                }else if(cal.get(Calendar.HOUR_OF_DAY) == 23 && cal.get(Calendar.MINUTE)>=2 && cal.get(Calendar.MINUTE)<=3){
                    this.stoped = true;
                    if(!CollectTickDataThread4RBAndHCSingleton.getInstance().iscollect()){

                    }else {
                        CollectTickDataThread4RBAndHCSingleton.getInstance().UnInitialMdApi();
                        CollectTickDataThread4RBAndHCSingleton.getInstance().setnullInstance();
                    }
                }else{
                    //this.stoped = false;
                }
            }else{
                //System.out.println("已停止收集程序,无需再次停止");
            }
        //}
        //System.out.println("stoped:"+stoped+" times:"+times++);
    }
}

class StartCollectTask2 extends TimerTask{
    private int io = 1;
    @Override
    public void run() {
        //如果
        System.out.println("22调用StartCollectTask:"+io++);
    }
}
