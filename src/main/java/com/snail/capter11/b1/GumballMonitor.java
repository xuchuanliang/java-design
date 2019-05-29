package com.snail.capter11.b1;

/**
 * @author xuchuanliangbt
 * @title: GumballMonitor
 * @projectName java-design
 * @description:
 * @date 2019/5/2819:12
 * @Version
 */
public class GumballMonitor {
    private GumbalMachine gumbalMachine;

    public GumballMonitor(GumbalMachine gumbalMachine) {
        this.gumbalMachine = gumbalMachine;
    }

    public void report(){
        System.out.println(gumbalMachine.getCount());
        System.out.println(gumbalMachine.getState());
        System.out.println(gumbalMachine.getLocation());
    }
}
