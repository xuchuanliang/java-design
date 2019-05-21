package com.snail.capter08.b2;

/**
 * @author xuchuanliangbt
 * @title: CaffeineBeverage
 * @projectName java-design
 * @description:
 * @date 2019/5/2120:24
 * @Version
 */
public abstract class CaffeineBeverage {
    public final void prepareRecipe(){
        boilWater();
        brew();
        pourInCup();
        if(isAddConfiments()){
            addCondiments();
        }
    }

    abstract void brew();

    abstract void addCondiments();

    public final void boilWater(){
        System.out.println("烧水");
    }

    public final void pourInCup(){
        System.out.println("倒入被子");
    }

    /**
     * 是否增加调料的钩子
     * @return
     */
    public boolean isAddConfiments(){
        return true;
    }
}
