package com.sunguanjun.demo.designpattern.builder;

/**
 * @Author hzsunguanjun@corp.netease.com
 * @Date 2018/11/13
 */
public class Concretebuilder extends Builder {
    Computer computer = new Computer();

    @Override
    public void buildCPU() {
        computer.add("组装cpu");
    }

    @Override
    public void buildMainboard() {
        computer.add("组装主板");
    }

    @Override
    public void buildHD() {
        computer.add("组装硬盘");
    }

    @Override
    public Computer getComputer() {
        return computer;
    }
}
