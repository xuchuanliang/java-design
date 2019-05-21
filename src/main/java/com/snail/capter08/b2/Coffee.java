package com.snail.capter08.b2;

/**
 * @author xuchuanliangbt
 * @title: Coffee
 * @projectName java-design
 * @description:
 * @date 2019/5/2120:27
 * @Version
 */
public class Coffee extends CaffeineBeverage{
    @Override
    void brew() {
        System.out.println("冲泡 coffee");
    }

    @Override
    void addCondiments() {
        System.out.println("咖啡加糖和奶茶");
    }
}
