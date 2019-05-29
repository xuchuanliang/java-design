package com.snail.capter12;

/**
 * @author xuchuanliangbt
 * @title: DuckCall
 * @projectName java-design
 * @description:
 * @date 2019/5/2920:18
 * @Version
 */
public class DuckCall implements Quackable{

    private Observable observable;

    public DuckCall() {
        observable = new Observable(this);
    }

    @Override
    public void quack() {
        System.out.println("duckCall");
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
