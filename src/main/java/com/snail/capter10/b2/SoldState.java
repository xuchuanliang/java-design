package com.snail.capter10.b2;

/**
 * @author xuchuanliangbt
 * @title: SoldState
 * @projectName java-design
 * @description:
 * @date 2019/5/2712:09
 * @Version
 */
public class SoldState implements State{
    private GumbalMachine gumbalMachine;

    public SoldState(GumbalMachine gumbalMachine) {
        this.gumbalMachine = gumbalMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("稍等一下再放硬币");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("正在出糖果，无法退钱");
    }

    @Override
    public void turnCarnk() {
        System.out.println("正在出糖果，不要连续操作");
    }

    @Override
    public void dispense() {
        gumbalMachine.releaseBall();
        if(gumbalMachine.getCount()>0){
            gumbalMachine.setState(gumbalMachine.getNoQuarterState());
        }else{
            gumbalMachine.setState(gumbalMachine.getSoldOutState());
        }
    }
}
