package com.sunguanjun.demo.designpattern.builder;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author hzsunguanjun@corp.netease.com
 * @Date 2018/11/13
 */
public class Computer {
    private List<String> parts = new ArrayList<>();

    public void add(String part){
        parts.add(part);
    }

    public void show(){
        for (int i=0; i<parts.size(); i++){
            System.out.println("组件" + parts.get(i) + "装好了");
        }
        System.out.println("电脑组装完成，请验收");
    }

}
