package com.jquent2.calc;

/**
 * Created by zcy on 2017/8/13.15:57:05
 */
public class FutureConst {
    //是否下载数据中
    private volatile boolean rblock;
    private volatile boolean lock;
    private volatile boolean hclock;

    public boolean isRblock() {
        return rblock;
    }

    public void setRblock(boolean rblock) {
        this.rblock = rblock;
    }

    public boolean isHclock() {
        return hclock;
    }

    public void setHclock(boolean hclock) {
        this.hclock = hclock;
    }

    public boolean isLock() {
        return lock;
    }

    public void setLock(boolean lock) {
        this.lock = lock;
    }

    private static FutureConst ourInstance = new FutureConst();

    public static FutureConst getInstance() {
        return ourInstance;
    }

    private FutureConst() {
    }
}
