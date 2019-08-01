package com.sunguanjun.demo.designpattern.templateMethod;

/**
 * @Author hzsunguanjun@corp.netease.com
 * @Date 2018/11/6
 */
public class Cook1 extends Cook{
    @Override
    public void addFoodMaterial() {

        System.out.println("加特别的东西");
    }

    public static void main(String[] args){
        Cook1 cook1 = new Cook1();
        cook1.cook();
    }
}
