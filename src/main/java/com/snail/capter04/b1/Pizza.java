package com.snail.capter04.b1;

import java.util.ArrayList;

/**
 * @author xuchuanliangbt
 * @title: Pizza
 * @projectName java-design
 * @description:
 * @date 2019/5/1614:55
 * @Version
 */
public abstract class Pizza {
    /**
     * 名称
     */
    String name;
    /**
     * 面料类型
     */
    String dough;
    /**
     * 酱料类型
     */
    String sauce;
    /**
     * 佐料
     */
    ArrayList toppings = new ArrayList();

    public void prepare(){
        System.out.println("准备"+name);
        System.out.println("和面中");
        System.out.println("添加酱料中");
        toppings.forEach(t->{
            System.out.println("   --"+t);
        });
    }

    public void bake(){
        System.out.println("烤中");
    }

    public void cut(){
        System.out.println("切割中");
    }

    public void box(){
        System.out.println("打包中");
    }

}
