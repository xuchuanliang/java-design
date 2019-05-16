package com.snail.capter03;

/**
 * 被装饰的某种饮料
 * @author xuchuanliangbt
 * @title: Decaf
 * @projectName java-design
 * @description:
 * @date 2019/5/1517:13
 * @Version
 */
public class Decaf extends Beverage {

    public Decaf() {
        description = "Decaf";
    }

    @Override
    public double cost() {
        return 0.11;
    }
}
