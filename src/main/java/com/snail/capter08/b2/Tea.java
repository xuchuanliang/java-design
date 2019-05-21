package com.snail.capter08.b2;

/**
 * @author xuchuanliangbt
 * @title: Tea
 * @projectName java-design
 * @description:
 * @date 2019/5/2120:28
 * @Version
 */
public class Tea extends CaffeineBeverage {
    @Override
    void brew() {
        System.out.println("冲茶");
    }

    @Override
    void addCondiments() {
        System.out.println("茶增加柠檬");
    }

    /**
     * 查我不想加柠檬，所以我使用父类的钩子，不覆盖返回值
     * @return
     */
    @Override
    public boolean isAddConfiments() {
        return false;
    }
}
