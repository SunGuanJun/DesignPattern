package com.sunguanjun.demo.designpattern.Strategy.basic;

/**
 * @Author hzsunguanjun@corp.netease.com
 * @Date 2018/12/10
 */
public class SalesMan {
    private Strategy strategy;

    public SalesMan(String festival){
        switch (festival){
            case "A":
                strategy = new StrategyA();
                break;
            case "B":
                strategy = new StrategyB();
                break;
            case "C":
                strategy = new StrategyC();
                break;
        }
    }

    public void SalesManShow(){
        strategy.show();
    }
}
