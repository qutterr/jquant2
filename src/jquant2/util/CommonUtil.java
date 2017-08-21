package jquant2.util;

import java.util.Date;

/**
 * Created by zcy on 2017/8/9.20:57:29
 */
public class CommonUtil {
    public static int objectToInteger(Object obj) {
        try {
            if (obj != null && !obj.toString().trim().equals(""))
                return Integer.parseInt(obj.toString());
        } catch (Exception ex) {
            ex.printStackTrace();
            return 0;
        }
        return 0;
    }

    /**
     * 得到传入时间的下n秒钟时间
     * @param currDate
     * @param n
     * @return
     */
    public static Date getNext(Date currDate,Integer n){
        Long currDateTime = currDate.getTime();
        return new Date(currDateTime+n*1000);
    }
}
