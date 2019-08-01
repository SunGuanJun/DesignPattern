package com.sunguanjun.demo.designpattern.Strategy.improvedByLambda;

/**
 * @Author hzsunguanjun@corp.netease.com
 * @Date 2019/8/1
 */
public class App {

    public static void main(String[] args){
        new SalesMan(()->System.out.println("促销活动A")).salesManShow();
        new SalesMan(()->System.out.println("促销活动B")).salesManShow();
        new SalesMan(()->System.out.println("促销活动C")).salesManShow();
    }
}
