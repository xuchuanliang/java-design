package com.snail.capter10.b2;

/**
 * @author xuchuanliangbt
 * @title: SoldOutState
 * @projectName java-design
 * @description:
 * @date 2019/5/2712:07
 * @Version
 */
public class SoldOutState extends State{
    private GumbalMachine gumbalMachine;

    public SoldOutState(GumbalMachine gumbalMachine) {
        this.gumbalMachine = gumbalMachine;
    }

}
