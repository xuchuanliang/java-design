package com.snail.capter03;

/**
 *被装饰的某种饮料
 * 浓缩咖啡
 */
public class Espresso extends Beverage{
    public Espresso() {
        description = "Espresso";
    }

    @Override
    public double cost() {
        return 1.99;
    }
}
