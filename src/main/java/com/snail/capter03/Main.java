package com.snail.capter03;

import java.io.*;

/**
 * @author xuchuanliangbt
 * @title: Main
 * @projectName java-design
 * @description:
 * @date 2019/5/1517:17
 * @Version
 */
public class Main {
    public static void main(String[] args) {
//        test1();
        test2();
    }

    public static void test1() {
        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription() + " $" + beverage.cost());

        Beverage beverage1 = new DarkRoast();
        beverage1 = new Whip(new Mocha(new Mocha(beverage1)));
        System.out.println(beverage1.getDescription() + " $" + beverage1.cost());

        Beverage beverage2 = new HouseBlend();
        beverage2 = new Whip(new Mocha(new Soy(beverage2)));
        System.out.println(beverage2.getDescription() + " $" + beverage2.cost());
    }

    public void test2() throws IOException {
        InputStream inputStream = new BufferedInputStream(new BufferedInputStream(new FileInputStream("text.text")));
        int c;
        while ((c=inputStream.read())>0){
            System.out.println(c);
        }
        inputStream.close();
    }
}