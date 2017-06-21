package com.jquent2.calc;

/**
 * Created by qutterr on 2017/6/17.22:22:30
 */
public class Const {
    private boolean lock;

    public boolean isLock() {
        return lock;
    }

    public void setLock(boolean lock) {
        this.lock = lock;
    }

    private static Const ourInstance = new Const();

    public static Const getInstance() {
        return ourInstance;
    }

    private Const() {
    }
}
