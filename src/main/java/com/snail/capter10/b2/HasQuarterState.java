package com.snail.capter10.b2;

/**
 * @author xuchuanliangbt
 * @title: HasQuarterState
 * @projectName java-design
 * @description:
 * @date 2019/5/2712:08
 * @Version
 */
public class HasQuarterState implements State{

    private GumbalMachine gumbalMachine;

    public HasQuarterState(GumbalMachine gumbalMachine) {
        this.gumbalMachine = gumbalMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("已经有钱了，不能在继续增加");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("退给你钱");
        gumbalMachine.setState(gumbalMachine.getNoQuarterState());
    }

    @Override
    public void turnCarnk() {
        System.out.println("转动了");
        gumbalMachine.setState(gumbalMachine.getSoldState());
    }

    @Override
    public void dispense() {
        System.out.println("不可以");
    }
}
