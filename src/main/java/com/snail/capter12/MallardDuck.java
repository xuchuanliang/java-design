package com.snail.capter12;

/**
 * @author xuchuanliangbt
 * @title: MallardDuck
 * @projectName java-design
 * @description:
 * @date 2019/5/2920:17
 * @Version
 */
public class MallardDuck implements Quackable {

    private Observable observable;

    public MallardDuck() {
        observable = new Observable(this);
    }

    @Override
    public void quack() {
        System.out.println("mallardDuck");
        notifyObservers();
    }

    @Override
    public void registerObserver(Observer observer) {
        observable.registerObserver(observer);
    }

    @Override
    public void notifyObservers() {
        observable.notifyObservers();
    }
}
