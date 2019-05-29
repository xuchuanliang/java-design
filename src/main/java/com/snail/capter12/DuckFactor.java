package com.snail.capter12;

/**
 * 抽象工厂实现类
 */
public class DuckFactor extends AbstractDuckFactor{
    @Override
    Quackable createMallardDuck() {
        return new QuackCounter(new MallardDuck());
    }

    @Override
    Quackable createReadHeadDuck() {
        return new QuackCounter(new ReadheadDuck());
    }

    @Override
    Quackable createDuckCall() {
        return new QuackCounter(new DuckCall());
    }

    @Override
    Quackable createRubberDuck() {
        return new QuackCounter(new RubberDuck());
    }
}
