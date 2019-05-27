package com.snail.capter10.b2;

/**
 * @author xuchuanliangbt
 * @title: SoldState
 * @projectName java-design
 * @description:
 * @date 2019/5/2712:09
 * @Version
 */
public class SoldState extends State{
    private GumbalMachine gumbalMachine;

    public SoldState(GumbalMachine gumbalMachine) {
        this.gumbalMachine = gumbalMachine;
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
