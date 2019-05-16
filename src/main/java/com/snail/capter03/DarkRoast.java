package com.snail.capter03;

/**
 * 被装饰的某种饮料
 * @author xuchuanliangbt
 * @title: DarkRoast
 * @projectName java-design
 * @description:
 * @date 2019/5/1517:13
 * @Version
 */
public class DarkRoast extends Beverage{

    public DarkRoast() {
        description = "DarkRoast";
    }

    @Override
    public double cost() {
        return 1.22;
    }
}
