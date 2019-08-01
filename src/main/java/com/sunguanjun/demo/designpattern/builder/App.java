package com.sunguanjun.demo.designpattern.builder;

/**
 * @Author hzsunguanjun@corp.netease.com
 * @Date 2018/11/13
 */
public class App {

    public static void main(String[] args){
        Director director = new Director();
        Builder builder = new Concretebuilder();

        director.construct(builder);
        Computer computer = builder.getComputer();
        computer.show();
    }
}
