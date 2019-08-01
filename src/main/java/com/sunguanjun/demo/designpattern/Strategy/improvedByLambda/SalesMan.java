package com.sunguanjun.demo.designpattern.Strategy.improvedByLambda;

import com.sunguanjun.demo.designpattern.Strategy.basic.StrategyA;
import com.sunguanjun.demo.designpattern.Strategy.basic.StrategyB;
import com.sunguanjun.demo.designpattern.Strategy.basic.StrategyC;

/**
 * @Author hzsunguanjun@corp.netease.com
 * @Date 2018/12/10
 */
public class SalesMan {
    private Strategy strategy;

    public SalesMan(Strategy strategy){
        this.strategy = strategy;
    }

    public void salesManShow(){
        strategy.show();
    }
}
