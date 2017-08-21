package com.jquent2.calc;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import java.util.Timer;
import java.util.TimerTask;

/**
 * Created by qutterr on 2017/6/17.21:57:54
 */
public class StockListener implements ServletContextListener {
    public void contextInitialized (ServletContextEvent sce){
        //init operation 初始化 后执行定时刷新
        Timer timer = new Timer();
        //timer.schedule(new MyTask(), 3000, 30000);
        Const.getInstance().setLock(false);
    }
    @Override
    public void contextDestroyed(ServletContextEvent servletContextEvent) {
        //destory operation
    }
}

class MyTask extends TimerTask {
    @Override
    public void run() {
        if(Const.getInstance().isLock()){

        }else{
            //刷新
            String rlt = StockAction.shuaxin();
        }
    }
}
