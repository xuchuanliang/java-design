package com.snail.capter02;

/**
 * @author xuchuanliangbt
 * @title: Main
 * @projectName java-design
 * @description:
 * @date 2019/5/1418:12
 * @Version
 */
public class Main {
    public static void main(String[] args){
        test1();
    }
    public static void test1(){
        Subject subject = new WeatherData();
        DisplayElement display = new CurrentConditionsDisplay(subject);
        ((CurrentConditionsDisplay) display).update(10,23,21);
        ((CurrentConditionsDisplay) display).update(40,22,51);
        ((CurrentConditionsDisplay) display).update(19,21,31);
    }
}
