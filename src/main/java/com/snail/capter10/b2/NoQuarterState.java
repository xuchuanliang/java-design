package com.snail.capter10.b2;

/**
 * @author xuchuanliangbt
 * @title: NoQuarterState
 * @projectName java-design
 * @description:
 * @date 2019/5/2712:08
 * @Version
 */
public class NoQuarterState extends State {

    private GumbalMachine gumbalMachine;

    public NoQuarterState(GumbalMachine gumbalMachine) {
        this.gumbalMachine = gumbalMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("投了钱");
        gumbalMachine.setState(gumbalMachine.getHasQuarterState());
    }

}
