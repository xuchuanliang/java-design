package com.snail.capter08.b1;

/**
 * @author xuchuanliangbt
 * @title: Tea
 * @projectName java-design
 * @description:
 * @date 2019/5/2120:21
 * @Version
 */
public class Tea {

    public void prepareRecipee(){
        boilWater();
        steepTeaBag();
        addLemon();
        pourInCup();
    }

    public void boilWater(){
        System.out.println("烧水");
    }

    public void steepTeaBag(){
        System.out.println("冲茶");
    }

    public void addLemon(){
        System.out.println("增加柠檬");
    }

    public void pourInCup(){
        System.out.println("导入水杯");
    }
}
