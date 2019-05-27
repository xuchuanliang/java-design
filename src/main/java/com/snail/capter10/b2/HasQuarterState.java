package com.snail.capter10.b2;

import java.util.Random;

/**
 * @author xuchuanliangbt
 * @title: HasQuarterState
 * @projectName java-design
 * @description:
 * @date 2019/5/2712:08
 * @Version
 */
public class HasQuarterState extends State{

    private GumbalMachine gumbalMachine;

    Random random = new Random(System.currentTimeMillis());

    public HasQuarterState(GumbalMachine gumbalMachine) {
        this.gumbalMachine = gumbalMachine;
    }

    @Override
    public void ejectQuarter() {
        System.out.println("退给你钱");
        gumbalMachine.setState(gumbalMachine.getNoQuarterState());
    }

    @Override
    public void turnCarnk() {
        System.out.println("转动了");
        int winner = random.nextInt(10);
        if(winner ==0 && gumbalMachine.getCount()>0){
            gumbalMachine.setState(gumbalMachine.getWinnerState());
        }else{
            gumbalMachine.setState(gumbalMachine.getSoldState());
        }
    }
}
