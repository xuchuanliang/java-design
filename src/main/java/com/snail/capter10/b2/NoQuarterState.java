package com.snail.capter10.b2;

/**
 * @author xuchuanliangbt
 * @title: NoQuarterState
 * @projectName java-design
 * @description:
 * @date 2019/5/2712:08
 * @Version
 */
public class NoQuarterState implements State {

    private GumbalMachine gumbalMachine;

    public NoQuarterState(GumbalMachine gumbalMachine) {
        this.gumbalMachine = gumbalMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("投了钱");
        gumbalMachine.setState(gumbalMachine.getHasQuarterState());
    }

    @Override
    public void ejectQuarter() {
        System.out.println("没有钱，没办法退给你");
    }

    @Override
    public void turnCarnk() {
        System.out.println("没有钱，转动了也没糖果给你");
    }

    @Override
    public void dispense() {
        System.out.println("非法操作");
    }
}
