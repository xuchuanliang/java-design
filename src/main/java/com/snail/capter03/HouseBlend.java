package com.snail.capter03;

/**
 * 被装饰的某种饮料
 * 星 巴 兹 咖 啡
 */
public class HouseBlend extends Beverage{

    public HouseBlend(){
        description = "HouseBlend";
    }

    @Override
    public double cost() {
        return 0.89;
    }
}
