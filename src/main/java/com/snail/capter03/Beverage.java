package com.snail.capter03;

/**
 * 装饰者模式超类--咖啡
 * 抽象被装饰类
 */
public abstract class Beverage {
    String description = "base abstract beverage";

    public String getDescription() {
        return description;
    }

    /**
     * 计算花费
     * @return
     */
    public abstract double cost();
}
