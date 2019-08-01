package com.sunguanjun.demo.designpattern.builder;

/**
 * @Author hzsunguanjun@corp.netease.com
 * @Date 2018/11/13
 */
public class Director {
    public void construct(Builder builder){
        builder.buildCPU();
        builder.buildMainboard();
        builder.buildHD();
    }
}
