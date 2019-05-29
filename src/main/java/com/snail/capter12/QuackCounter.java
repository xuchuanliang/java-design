package com.snail.capter12;

/**
 * 统计鸭子呱呱叫的装饰者类
 */
public class QuackCounter implements Quackable{

    private Quackable quackable;
    private static int count = 0;

    public QuackCounter(Quackable quackable) {
        this.quackable = quackable;
    }

    @Override
    public void quack() {
        quackable.quack();
        count++;
    }

    public static int getCount(){
        return count;
    }

    @Override
    public void registerObserver(Observer observer) {
        quackable.registerObserver(observer);
    }

    @Override
    public void notifyObservers() {
        quackable.notifyObservers();
    }
}
