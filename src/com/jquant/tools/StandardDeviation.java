package com.jquant.tools;

/**
 * Created by zcy on 2017/1/15.20:56
 * 对样本进行统计, 计算样本的方差&标准差
 * Sn = Sn-1 + (xn - Mn-1)*(xn - Mn)
 * Mn = Mn-1+ (xn - Mn-1)/n
 */
public class StandardDeviation {
    /** 样本的个数*/
    private int count;

    /** 平均值*/
    private double averageVar;

    /** sn样本方差*/
    private double standardDeviationSum;

    /** 样本标准差*/
    private double standard_Deviation;

    public StandardDeviation()
    {
        this(0, 0.0, 0.0);
    }

    public StandardDeviation(int count, double standardDeviationSum, double averageVar)
    {
        this.count = count;
        this.standardDeviationSum = standardDeviationSum;
        this.averageVar = averageVar;
        recomputerstandard_Deviation();
    }

    public synchronized int getCount()
    {
        return count;
    }

    private void recomputerstandard_Deviation()
    {
        int count = getCount();
        standard_Deviation = count >= 1 ? Math.sqrt(standardDeviationSum / (count)) : Double.NaN;
    }

    /**
     *  获取运行时样本的方差
     *  @return double
     */
    public synchronized double getRunningVariance()
    {
        return standard_Deviation;
    }

    /**
     * 增加一个样本时重新计算
     * @param sample void
     */
    public synchronized void addSample(double sample)
    {
        count=count+1;
        if (count == 1)
        {
            averageVar = sample;
            standardDeviationSum = 0.0;
        }
        else
        {

            double oldaverageVar = averageVar;
            double diff = sample - oldaverageVar;
            averageVar += diff / count;
            standardDeviationSum += diff * (sample - averageVar);
        }

        recomputerstandard_Deviation();
    }

    /**
     * 移除一个样本时重新计算
     * @param sample void
     */
    public synchronized void removeSample(double sample)
    {
        int oldCount = getCount();
        double oldaverageVar = averageVar;

        if (oldCount == 0)
        {
            throw new IllegalStateException();
        }

        if (--count == 0)
        {
            averageVar = Double.NaN;
            standardDeviationSum = Double.NaN;
        }
        else
        {
            averageVar = (oldCount * oldaverageVar - sample) / (oldCount - 1);
            standardDeviationSum = (sample - averageVar) * (sample - oldaverageVar);
        }

        recomputerstandard_Deviation();
    }
}
