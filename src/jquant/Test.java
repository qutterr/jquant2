package jquant;

import java.math.BigDecimal;
import java.util.Random;

/**
 * Created by zcy on 2017/7/28.15:15:58
 */
public class Test {

    /**
     * 格式化后四舍五入保留4位
     *
     * @param arg0
     * @return
     */
    private static Double formatDouble4(Double arg0) {
        //格式化后四舍五入保留两位
        BigDecimal bd = new BigDecimal(arg0);
        return bd.setScale(4, BigDecimal.ROUND_HALF_UP).doubleValue();
    }

    public static void main(String[] args) {
        HKWS hkws = HKWS.getInstance();
        for(int ii = 0 ; ii<1 ; ii++){
            //执行100次tick变动
            try {
                //设置初始价格
                hkws.setPrice(3650.0);
                hkws.setUptimes(0);
                hkws.setDowntimes(0);
                for(int i = 0;i<1000;i++){
                    //Thread.sleep(1000L);
                    Random rand = new Random();
                    double randNum = rand.nextInt(3)-1;
                    //double seed = 1.0+formatDouble4(randNum);
                    double oldprice = hkws.getPrice();
                    double newprice = oldprice+randNum;
                    if(oldprice>newprice){
                        hkws.setDowntimes(hkws.getDowntimes()+1);
                        hkws.setUptimes(0);
                        hkws.setPrice(newprice);
                    }else{
                        hkws.setUptimes(hkws.getUptimes()+1);
                        hkws.setDowntimes(0);
                        hkws.setPrice(newprice);
                    }
                    System.out.println(hkws.toString());
                }
                System.out.println(hkws.toString());

            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
