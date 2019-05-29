package com.snail.capter12;

/**
 * 观察者
 */
public class Quackologist implements Observer{
    @Override
    public void update(QuackObservable quackObservable) {
        System.out.println("我看到鸭子呱呱叫了");
    }
}
