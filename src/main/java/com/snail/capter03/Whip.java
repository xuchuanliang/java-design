package com.snail.capter03;

/**
 * 装饰类-某种调料
 * @author xuchuanliangbt
 * @title: Whip
 * @projectName java-design
 * @description:
 * @date 2019/5/1517:19
 * @Version
 */
public class Whip extends CondimentDecorator{

    /**
     * 装饰者需要持有被装饰者的引用，用于装饰
     */
    private Beverage beverage;

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription()+" Whip";
    }

    @Override
    public double cost() {
        return 12.2+beverage.cost();
    }
}
