package com.snail.capter12;

/**
 * @author xuchuanliangbt
 * @title: DuckSimulator
 * @projectName java-design
 * @description:
 * @date 2019/5/2920:19
 * @Version
 */
public class DuckSimulator {
    public static void main(String[] args){
        DuckSimulator duckSimulator = new DuckSimulator();
        duckSimulator.simulate();
    }
    public void simulate(){
        Quackable mallardDuck = new QuackCounter(new MallardDuck());
        Quackable readheadDuck = new QuackCounter(new ReadheadDuck());
        Quackable duckCall = new QuackCounter(new DuckCall());
        Quackable rubberDuck = new QuackCounter(new RubberDuck());
        Quackable gooseAdpter = new QuackCounter(new GooseAdpter(new Goose()));
        simulate(mallardDuck);
        simulate(readheadDuck);
        simulate(duckCall);
        simulate(rubberDuck);
        simulate(gooseAdpter);
        System.out.println("一共叫了几次："+QuackCounter.getCount());
    }
    void simulate(Quackable quackable){
        quackable.quack();
    }
}
