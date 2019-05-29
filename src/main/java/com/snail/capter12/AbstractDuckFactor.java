package com.snail.capter12;

/**
 * 创建鸭子产品组的抽象工厂类
 */
public abstract class AbstractDuckFactor {
    abstract Quackable createMallardDuck();
    abstract Quackable createReadHeadDuck();
    abstract Quackable createDuckCall();
    abstract Quackable createRubberDuck();
}
