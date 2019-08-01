package com.sunguanjun.demo.designpattern.templateMethod;

/**
 * @Author hzsunguanjun@corp.netease.com
 * @Date 2018/11/6
 */
public abstract class Cook {
    public void cook(){
        // 1. 倒油
        addOil();
        // 2. 热油
        heatOil();
        // 3. 倒菜
        addFoodMaterial();
        // 4. 加调料
        flavour();
        // 5. 翻炒
        heat();
    }

    public void addOil(){
        System.out.println("倒油");
    }

    public void heatOil(){
        System.out.println("热油");
    }

    public void addFoodMaterial(){
        System.out.println("倒食材");
    }

    public void flavour(){
        System.out.println("加调料");
    }

    public void heat(){
        System.out.println("翻炒");
    }
}
