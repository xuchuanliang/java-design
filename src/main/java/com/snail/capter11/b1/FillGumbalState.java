package com.snail.capter11.b1;

/**
 * @author xuchuanliangbt
 * @title: FillGumbalState
 * @projectName java-design
 * @description:
 * @date 2019/5/2717:57
 * @Version
 */
public class FillGumbalState extends State {

    private GumbalMachine gumbalMachine;

    public FillGumbalState(GumbalMachine gumbalMachine) {
        this.gumbalMachine = gumbalMachine;
    }

    @Override
    public void fill() {
        if(gumbalMachine.getCount()==0){
            gumbalMachine.setCount(100);
            gumbalMachine.setState(gumbalMachine.getNoQuarterState());
        }
    }
}
