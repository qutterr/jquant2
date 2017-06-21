package com.jquent2.calc;

import java.io.BufferedReader;
import java.io.InputStreamReader;


/**
 * Created by qutterr on 2017/6/16.16:12:49
 * 操作股票买卖的类
 */
public class StockAction {
    public final static String ACTIONFILE = "C:\\apache-tomcat-7.0.78_jquant2\\webapps\\jquent2\\action.py";
    /**
     * 买入指定股票
     * @param stockid 股票代码
     * @param price 指定价格
     * @param count 指定数量
     */
    public static String buy(String stockid,String price,String count){
        try{
            Process pr = Runtime.getRuntime().exec("  python.exe "+ACTIONFILE+" 1 "+stockid+" "+price+"  "+count+"  "  );
            BufferedReader in = new BufferedReader(new  InputStreamReader(pr.getInputStream(), "GBK"));
            String line;
            while ((line = in.readLine()) != null) {
                return line;
            }
            in.close();
            pr.waitFor();
            return "-1";
        } catch (Exception e){
            e.printStackTrace();
            return "-1";
        }
    }

    /**
     * 卖出指定股票
     * @param stockid 股票代码
     * @param price 指定价格
     * @param count 指定数量
     */
    public static String sell(String stockid,String price,String count){
        try{
            Process pr = Runtime.getRuntime().exec("  python.exe "+ACTIONFILE+" 0 "+stockid+" "+price+"  "+count+"  "  );
            BufferedReader in = new BufferedReader(new  InputStreamReader(pr.getInputStream(), "GBK"));
            String line;
            while ((line = in.readLine()) != null) {
                return line;
            }
            in.close();
            pr.waitFor();
            return "-1";
        } catch (Exception e){
            e.printStackTrace();
            return "-1";
        }
    }

    /**
     * 查询可用资金
     */
    public static String chaxunzijin(){
        try{
            Process pr = Runtime.getRuntime().exec("  python.exe "+ACTIONFILE+" 5"  );
            BufferedReader in = new BufferedReader(new  InputStreamReader(pr.getInputStream(), "GBK"));
            String line;
            while ((line = in.readLine()) != null) {
                return line;
            }
            in.close();
            pr.waitFor();
            return "-1";
        } catch (Exception e){
            e.printStackTrace();
            return "-1";
        }
    }

    /**
     * 全部撤单
     */
    public static String quanbuchedan(){
        try{
            Process pr = Runtime.getRuntime().exec("  python.exe "+ACTIONFILE+" 3"  );
            BufferedReader in = new BufferedReader(new  InputStreamReader(pr.getInputStream(), "GBK"));
            String line;
            while ((line = in.readLine()) != null) {
                return line;
            }
            in.close();
            pr.waitFor();
            return "-1";
        } catch (Exception e){
            e.printStackTrace();
            return "-1";
        }
    }

    /**
     * 刷新
     */
    public static String shuaxin(){
        try{
            Process pr = Runtime.getRuntime().exec("  python.exe "+ACTIONFILE+" 4"  );
            BufferedReader in = new BufferedReader(new  InputStreamReader(pr.getInputStream(), "GBK"));
            String line;
            while ((line = in.readLine()) != null) {
                return line;
            }
            in.close();
            pr.waitFor();
            return "-1";
        } catch (Exception e){
            e.printStackTrace();
            return "-1";
        }
    }

    public static void main(String[] args) {
        //sell("601016","2.33","100");
        //buy("601016", "2.33", "100");
        System.out.println(chaxunzijin());
    }
}
