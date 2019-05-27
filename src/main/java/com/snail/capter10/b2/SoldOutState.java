package com.snail.capter10.b2;

/**
 * @author xuchuanliangbt
 * @title: SoldOutState
 * @projectName java-design
 * @description:
 * @date 2019/5/2712:07
 * @Version
 */
public class SoldOutState implements State{
    private GumbalMachine gumbalMachine;

    public SoldOutState(GumbalMachine gumbalMachine) {
        this.gumbalMachine = gumbalMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("已经卖完了，不要在投钱了");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("没有钱可以退给你");
    }

    @Override
    public void turnCarnk() {
        System.out.println("已售罄，没有糖果可以给你");
    }

    @Override
    public void dispense() {
        System.out.println("已售罄，没有糖果给你");
    }
}
