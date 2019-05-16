package com.snail.capter03;

/**
 * 装饰类-某种调料
 * @author xuchuanliangbt
 * @title: Soy
 * @projectName java-design
 * @description:
 * @date 2019/5/1517:21
 * @Version
 */
public class Soy extends CondimentDecorator {
    /**
     * 装饰者需要持有被装饰者的引用，用于装饰
     */
    private Beverage beverage;

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription()+" Soy";
    }

    @Override
    public double cost() {
        return 0.55+beverage.cost();
    }
}
