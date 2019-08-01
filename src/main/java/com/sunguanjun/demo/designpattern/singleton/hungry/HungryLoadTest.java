package com.sunguanjun.demo.designpattern.singleton.hungry;

/**
 * @Author hzsunguanjun@corp.netease.com
 * @Date 2019/8/1
 */
public class HungryLoadTest {
    private HungryLoadTest() {
        System.out.println("HungryLoadTest constructs");
    }

    private static HungryLoadTest INSTANCE = new HungryLoadTest();

    public static HungryLoadTest getInstance() {
        return INSTANCE;
    }

    /**
     * 输出是
     *  HungryLoadTest constructs
     *  main is running...
     *
     * 说明：
     * 1. "HungryLoadTest constructs" 在前，说明该对象是一开始就申请好的
     * @param args
     */
    public static void main(String[] args){
        System.out.println("main is running...");
        HungryLoadTest app = HungryLoadTest.getInstance();
    }
}
