package com.sunguanjun.demo.designpattern.builder;

/**
 * 定义组装的过程
 * @Author hzsunguanjun@corp.netease.com
 * @Date 2018/11/13
 */
public abstract class Builder {

    public abstract void buildCPU();

    public abstract void buildMainboard();

    public abstract void buildHD();

    public abstract Computer getComputer();
}
