package jquant2.util;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/**
 * Created by zcy on 2017/8/14.15:54:08
 */
public class TradeDayUtil {
    public static SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
    public static String[] holidays = {"20171001", "20171002", "20171003", "20171004", "20171005", "20171006", "20171007","20171008"};
    /**
     * 获取下一天
     *
     * @param day 当前日期yyyyMMdd
     * @return
     */
    public  static  String getNextDay(String day) {
        Calendar cal = formatYYYYMMDD(day);
        cal.add(Calendar.DAY_OF_MONTH, 1);
        return  sdf.format(cal.getTime());
    }

    /**
     * 如果当前日期处于周末，则返回下周一
     *
     * @param day 当前日期yyyyMMdd
     * @return
     */
    public  static  String getDayExceptWeekend(String day) {
        Calendar cal = formatYYYYMMDD(day);
        if  (cal.get(Calendar.DAY_OF_WEEK) == Calendar.SATURDAY) {
            cal.add(Calendar.DAY_OF_MONTH, 2);
        } else  if  (cal.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY) {
            cal.add(Calendar.DAY_OF_MONTH, 1);
        }
        return  sdf.format(cal.getTime());
    }

    public  static  String getDayAfterHoliday(String nextDay, List<String> holidayList) {
        nextDay = getDayExceptWeekend(nextDay);
        if  (null  != holidayList) {
            for  (int  i = 0; i < holidayList.size(); i++) {
                if  (holidayList.get(i).equals(nextDay)) {
                    nextDay = getDayAfterHoliday(getNextDay(nextDay), holidayList);
                }
            }
        }
        return  nextDay;
    }

    /**
     * 将字符串类型日期转换为Calendar
     *
     * @param day 当前日期yyyyMMdd
     * @return
     */
    public  static  Calendar formatYYYYMMDD(String day) {
        Calendar cal = Calendar.getInstance();
        cal.set(Integer.parseInt(day.substring(0, 4)), (Integer.parseInt(day.substring(4, 6)) - 1), Integer.parseInt(day.substring(6)));
        return  cal;
    }

    public  static  void  main(String[] args) {
        System.out.println(getNextTradeDay());
    }

    public static String getNextTradeDay(){
        Calendar cal = Calendar.getInstance();
        DateFormat df = new SimpleDateFormat("yyyyMMdd HH:mm:ss");//创建日期转换对象HH:mm:ss为时分秒
        // 待确认交易日：23:03点之前取当前日期，23:03点之后取下一交易日
        String nextDay = sdf.format(new Date());
        try {
            Date compareDay = df.parse(nextDay+" "+"22:59:00");
            if(new Date().getTime()>compareDay.getTime()){
                if (cal.get(Calendar.DAY_OF_WEEK) == Calendar.FRIDAY) {
                    cal.add(Calendar.DAY_OF_MONTH, 3);
                    nextDay = sdf.format(cal.getTime());
                } else {
                    nextDay = getNextDay(nextDay);
                }
            }
            List<String> holidayList = Arrays.asList(holidays);
            String _date = getDayAfterHoliday(nextDay, holidayList);
            return _date;
        } catch (ParseException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static Date stringToDate(String str) {
        DateFormat format = new SimpleDateFormat("yyyyMMdd");
        Date date = null;
        try {
            date = format.parse(str);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return date;
    }
}
