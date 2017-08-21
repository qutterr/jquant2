package jquant2.futures;

import com.jquent2.calc.FutureConst;
import test.thostmduserapi.CThostFtdcMdApi;

/**
 * Created by zcy on 2017/8/11.12:34:20
 */
public class CollectTickData {


    public static void main(String[] args) {
        Thread collect = CollectTickDataThread4RBAndHCSingleton.getInstance();
        if(FutureConst.getInstance().isLock()){

        }else {
            collect.start();
        }

        /*try {
            Thread.sleep(3000); // 主线程延迟3秒
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(collect.getName());
        System.out.println(collect.getState());
        System.out.println(collect.isAlive());
        System.out.println(collect.isInterrupted());
        System.out.println();
        collect.interrupt();
        System.out.println(collect.getState());
        System.out.println(collect.isAlive());
        System.out.println(collect.isInterrupted());

        collect.stop();
        System.out.println();
        System.out.println(collect.getState());
        System.out.println(collect.isAlive());
        System.out.println(collect.isInterrupted());*/

    }
}
