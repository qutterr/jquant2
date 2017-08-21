package com.jquent2.calc;

import jquant2.util.TradeDayUtil;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/**
 * Created by zcy on 2017/8/14.15:11:32
 */
public class TestCalenda {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        System.out.println("年：" + cal.get(Calendar.YEAR));
        System.out.println("月：" + (cal.get(Calendar.MONTH) + 1));
        System.out.println("日：" + cal.get(Calendar.DAY_OF_MONTH));
        System.out.println("时：" + cal.get(Calendar.HOUR_OF_DAY));
        System.out.println("分：" + cal.get(Calendar.MINUTE));
        System.out.println("秒：" + cal.get(Calendar.SECOND));
        if(cal.get(Calendar.HOUR_OF_DAY) == 19 && cal.get(Calendar.MINUTE)>=32 && cal.get(Calendar.MINUTE)<=33){
            System.out.println("1:"+cal.get(Calendar.MINUTE));
        }else{
            System.out.println("2:"+cal.get(Calendar.MINUTE));
        }
        System.out.println(TradeDayUtil.getNextTradeDay());
        System.out.println((new SimpleDateFormat("yyyyMMdd")).format(new Date()).equalsIgnoreCase(TradeDayUtil.getNextTradeDay()));

    }
}
