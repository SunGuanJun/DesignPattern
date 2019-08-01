package com.sunguanjun.demo.designpattern.Strategy.basic;

/**
 * @Author hzsunguanjun@corp.netease.com
 * @Date 2018/12/10
 */
public class StrategyPattern {
    public static void main(String[] args){

        new SalesMan("A").SalesManShow();
        new SalesMan("B").SalesManShow();
        new SalesMan("C").SalesManShow();
    }
}
