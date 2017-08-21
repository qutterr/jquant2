package com.jquant.tools;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import org.junit.Test;
/**
 * Created by zcy on 2017/1/15.20:58
 */
public class TestSD {
    public static void main(String[] args) {
        StandardDeviation s = new StandardDeviation();

        Double[] arr = {2.0,3.0,4.0,5.0,6.0};

        Double sum = 0.0;
        Double average =0.0 ;
        double sn  = 0.0;
        double standardDeviation = 0.0;

        for (int i = 0, len = arr.length; i < len; i++){
            sum = sum + arr[i];
            s.addSample(arr[i]);
        }
        //s.removeSample(6.0);
        System.out.println("getRunningVariance"+s.getRunningVariance());
        average = sum / arr.length;
        System.out.println("average value is = " + average);

        for (int j = 0; j < arr.length; j++){
            sn = sn + Math.pow((arr[j] - average), 2);
        }

        // 测试数据计算
        standardDeviation = Math.sqrt(sn / Double.parseDouble(String.valueOf(arr.length)));
        System.out.println("测试数据计算"+standardDeviation);

        // 通过函数计算
       /* double result = s.getRunningVariance();
        System.out.println(result);*/

        // 截取小数点后两位判断是否相等
        //NumberFormat formatter = new DecimalFormat("#0.0000");
        //String res = formatter.format(result);
        //String std = formatter.format(standardDeviation);
        //System.out.println(res+"&&&"+std);
    }
}
