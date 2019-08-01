package com.sunguanjun.demo.designpattern.singleton.lazySync;

/**
 * @Author hzsunguanjun@corp.netease.com
 * @Date 2019/8/1
 */
public class Singleton {
    private Singleton(){}

    private static Singleton INSTANCE = null;

    public static synchronized Singleton getInstance(){
        if (INSTANCE == null){
            INSTANCE = new Singleton();
        }
        return INSTANCE;
    }
}
