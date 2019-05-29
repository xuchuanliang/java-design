package com.snail.capter12;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author xuchuanliangbt
 * @title: Observable
 * @projectName java-design
 * @description:
 * @date 2019/5/2920:57
 * @Version
 */
public class Observable implements QuackObservable {
    ArrayList<com.snail.capter12.Observer> observers = new ArrayList<>();
    QuackObservable duck;

    public Observable(QuackObservable duck) {
        this.duck = duck;
    }

    @Override
    public void registerObserver(com.snail.capter12.Observer observer) {
        observers.add(observer);
    }

    @Override
    public void notifyObservers() {
        Iterator<Observer> iterator = observers.iterator();
        while (iterator.hasNext()){
            iterator.next().update(duck);
        }
    }
}
