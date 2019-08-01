package com.sunguanjun.demo.designpattern.singleton.lazyDoubleCheck;

/**
 * @Author hzsunguanjun@corp.netease.com
 * @Date 2019/8/1
 */
public class Singleton {
    private Singleton(){}

    private static Singleton INSTANCE = null;

    /**
     * 双重判定的设计原理是：
     * 1. 大部分情况下，INSTANCE 是有值的，为了提升性能，锁的粒度要越小越好，所以这一层不加锁
     * 2. 为了防止出现并发问题，真正要去做初始化工作的时候需要加锁
     *
     * 所以这边会判断两次，并且里面的判断要放入到同步块中。
     * @return
     */
    public static Singleton getInstance(){
        if (INSTANCE == null){
            synchronized (Singleton.class){
                if (INSTANCE == null){
                    INSTANCE = new Singleton();
                }
            }
        }
        return INSTANCE;
    }
}
