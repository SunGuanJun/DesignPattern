package com.sunguanjun.demo.designpattern.singleton.hungry;

public class Singleton {
    private Singleton() {}

    private static Singleton INSTANCE = new Singleton();

    public static Singleton getInstance() {
        return INSTANCE;
    }

    public static void main(String[] args){
        Singleton singleton = Singleton.getInstance();
    }
}
