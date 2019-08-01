package com.sunguanjun.demo.designpattern.singleton.innerClass;

public class Singleton {
    private Singleton() {}

    private static class LazyHolder {
        static final Singleton INSTANCE = new Singleton();
    }

    public static Singleton getInstance() {
        return LazyHolder.INSTANCE;
    }


    public static void main(String[] args){
        Singleton singleton = Singleton.getInstance();
    }
}
