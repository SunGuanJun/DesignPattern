package com.sunguanjun.demo.designpattern.singleton.innerClass;

/**
 * @Author hzsunguanjun@corp.netease.com
 * @Date 2019/8/1
 */
public class InnerClassLoadTest {
    private InnerClassLoadTest(){
        System.out.println("InnerClassTest constructs");
    }

    private static class Inner1{
        public Inner1(){
            System.out.println("Inner1 constructs");
        }

        static InnerClassLoadTest INSTANCE = new InnerClassLoadTest();
    }

    public static InnerClassLoadTest getInstance(){
        return Inner1.INSTANCE;
    }

    /**
     * 输出是：
     * main is running...
     * InnerClassTest constructs
     *
     * 说明：
     * 1. "InnerClassTest constructs" 在  "main is running..." 后，说明是懒加载，调用时才实例化单例。
     * 2. 没有 "Inner1 constructs"， 说明内部类只是被加载了，并没有被实例化
     *
     * @param args
     */
    public static void main(String[] args){
        System.out.println("main is running...");
        InnerClassLoadTest app = InnerClassLoadTest.getInstance();
    }
}
