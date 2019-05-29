package com.snail.capter12;

/**
 * @author xuchuanliangbt
 * @title: DuckSimulatorV2
 * @projectName java-design
 * @description:
 * @date 2019/5/2920:36
 * @Version
 */
public class DuckSimulatorV3 {
    public static void main(String[] args){
        DuckSimulatorV3 duckSimulator = new DuckSimulatorV3();
        duckSimulator.simulate(new DuckFactor());
    }
    public void simulate(AbstractDuckFactor duckFactor){
        Quackable mallardDuck = duckFactor.createMallardDuck();
        Quackable readheadDuck = duckFactor.createReadHeadDuck();
        Quackable duckCall = duckFactor.createDuckCall();
        Quackable rubberDuck = duckFactor.createDuckCall();
        Flock flock = new Flock();
        flock.addQuackable(mallardDuck);
        flock.addQuackable(readheadDuck);
        flock.addQuackable(duckCall);
        flock.addQuackable(rubberDuck);
        Quackologist quackologist = new Quackologist();
        flock.registerObserver(quackologist);

        simulate(flock);
        System.out.println(QuackCounter.getCount());
    }
    void simulate(Quackable quackable){
        quackable.quack();
    }
}
