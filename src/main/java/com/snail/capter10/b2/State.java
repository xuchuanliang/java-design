package com.snail.capter10.b2;

/**
 * @author xuchuanliangbt
 * @title: State
 * @projectName java-design
 * @description:
 * @date 2019/5/2711:16
 * @Version
 */
public abstract class State {
    /**
     * 投入硬币
     */
    public void insertQuarter(){
        System.out.println("error");
    }

    /**
     * 退钱
     */
    public void ejectQuarter(){
        System.out.println("error");
    }

    /**
     * 转动曲柄
     */
    public void turnCarnk(){
        System.out.println("error");
    }

    /**
     * 分发糖果
     */
    public void dispense(){
        System.out.println("error");
    }

    /**
     * 补充糖果
     */
    public void fill(){
        System.out.println("error");
    }
}
