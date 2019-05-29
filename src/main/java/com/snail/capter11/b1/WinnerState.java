package com.snail.capter11.b1;

/**
 * @author xuchuanliangbt
 * @title: WinnerState
 * @projectName java-design
 * @description:
 * @date 2019/5/2717:47
 * @Version
 */
public class WinnerState extends State {

    private GumbalMachine gumbalMachine;

    public WinnerState(GumbalMachine gumbalMachine) {
        this.gumbalMachine = gumbalMachine;
    }

    @Override
    public void dispense() {
        System.out.println("你是幸运者，有机会获得两个糖果");
        gumbalMachine.releaseBall();
        if(gumbalMachine.getCount()==0){
            gumbalMachine.setState(gumbalMachine.getSoldOutState());
        }else{
            gumbalMachine.releaseBall();
            if(gumbalMachine.getCount()>0){
                gumbalMachine.setState(gumbalMachine.getNoQuarterState());
            }else{
                System.out.println("没有糖果了");
                gumbalMachine.setState(gumbalMachine.getSoldOutState());
            }
        }
    }
}
