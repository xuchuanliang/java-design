package com.snail.capter02;

import com.snail.capter02.b1.CurrentConditionsDisplay;
import com.snail.capter02.b1.DisplayElement;
import com.snail.capter02.b1.Subject;
import com.snail.capter02.b1.WeatherData;

import java.util.Observable;
import java.util.Observer;

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
//        test1();
        test2();
    }

    public static void test1(){
        Subject subject = new WeatherData();
        DisplayElement display = new CurrentConditionsDisplay(subject);
        ((CurrentConditionsDisplay) display).update(10,23,21);
        ((CurrentConditionsDisplay) display).update(40,22,51);
        ((CurrentConditionsDisplay) display).update(19,21,31);
    }

    public static void test2(){
        com.snail.capter02.b2.WeatherData observable = new com.snail.capter02.b2.WeatherData();
        Observer observer = new com.snail.capter02.b2.CurrentConditionsDisplay(observable);
        observable.setMesurements(10,23,21);
        observable.setMesurements(40,22,51);
        observable.setMesurements(19,21,31);
    }
}
