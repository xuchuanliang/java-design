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

    public abstract void prepare();

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
