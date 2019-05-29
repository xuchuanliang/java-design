package com.snail.capter12;

/**
 * @author xuchuanliangbt
 * @title: DuckSimulatorV2
 * @projectName java-design
 * @description:
 * @date 2019/5/2920:36
 * @Version
 */
public class DuckSimulatorV2 {
    public static void main(String[] args){
        DuckSimulatorV2 duckSimulator = new DuckSimulatorV2();
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

        Flock flock1 = new Flock();
        Quackable mallardDuck1 = duckFactor.createMallardDuck();
        Quackable mallardDuck2 = duckFactor.createMallardDuck();
        Quackable mallardDuck3 = duckFactor.createMallardDuck();
        Quackable mallardDuck4 = duckFactor.createMallardDuck();
        flock1.addQuackable(mallardDuck1);
        flock1.addQuackable(mallardDuck2);
        flock1.addQuackable(mallardDuck3);
        flock1.addQuackable(mallardDuck4);

        simulate(flock);
        System.out.println("---------------------");
        simulate(flock1);
        System.out.println("---------------------");
        flock.addQuackable(flock1);
        simulate(flock);
        System.out.println(QuackCounter.getCount());
    }
    void simulate(Quackable quackable){
        quackable.quack();
    }
}
