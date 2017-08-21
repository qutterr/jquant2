package jquant;

import java.math.BigDecimal;

/**
 * Created by zcy on 2017/7/28.15:10:57
 */
public class HKWS {
    private static HKWS ourInstance = new HKWS();

    public static HKWS getInstance() {
        return ourInstance;
    }

    private HKWS() {
    }

    private Double price;
    private int uptimes;
    private int downtimes;

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public int getUptimes() {
        return uptimes;
    }

    public void setUptimes(int uptimes) {
        this.uptimes = uptimes;
    }

    public int getDowntimes() {
        return downtimes;
    }

    public void setDowntimes(int downtimes) {
        this.downtimes = downtimes;
    }

    @Override
    public String toString() {
        return "HKWS{" +
                "price=" + formatDouble4(price) +
                ", uptimes=" + uptimes +
                ", downtimes=" + downtimes +
                '}';
    }
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
}
