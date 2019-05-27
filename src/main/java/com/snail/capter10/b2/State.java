package com.snail.capter10.b2;

/**
 * @author xuchuanliangbt
 * @title: State
 * @projectName java-design
 * @description:
 * @date 2019/5/2711:16
 * @Version
 */
public interface State {
    /**
     * 投入硬币
     */
    void insertQuarter();

    /**
     * 退钱
     */
    void ejectQuarter();

    /**
     * 转动曲柄
     */
    void turnCarnk();

    /**
     * 分发糖果
     */
    void dispense();
}
