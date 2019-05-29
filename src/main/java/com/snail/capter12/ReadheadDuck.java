package com.snail.capter12;

/**
 * @author xuchuanliangbt
 * @title: ReadheadDuck
 * @projectName java-design
 * @description:
 * @date 2019/5/2920:17
 * @Version
 */
public class ReadheadDuck implements Quackable{
    private Observable observable = new Observable(this);

    @Override
    public void quack() {
        System.out.println("readhead");
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
