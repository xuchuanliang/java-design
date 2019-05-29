package com.snail.capter12;

/**
 * @author xuchuanliangbt
 * @title: RubberDuck
 * @projectName java-design
 * @description:
 * @date 2019/5/2920:18
 * @Version
 */
public class RubberDuck implements Quackable {

    private Observable observable = new Observable(this);

    @Override
    public void quack() {
        System.out.println("rubber");
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
