package com.snail.capter08.b1;

/**
 * @author xuchuanliangbt
 * @title: Coffee
 * @projectName java-design
 * @description:
 * @date 2019/5/2120:18
 * @Version
 */
public class Coffee {

    public void prepareRecipe(){
        boilWater();
        brewCoffeeGrinds();
        pourInCup();
        addSugarAndMilk();
    }

    public void boilWater(){
        System.out.println("烧水");
    }

    public void brewCoffeeGrinds(){
        System.out.println("冲泡咖啡");
    }

    public void pourInCup(){
        System.out.println("将咖啡倒进杯子里");
    }

    public void addSugarAndMilk(){
        System.out.println("加糖和奶");
    }
}
