package com.snail.capter12;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * 使用组合模式管理一组鸭子
 * 这里继承了Quackable的木器是为了实现树状结构
 * 迭代器模式
 */
public class Flock implements Quackable{
    private List<Quackable> quackables = new ArrayList<>();
    private Observable observable;

    public Flock() {
        observable = new Observable(this);
    }

    public void addQuackable(Quackable quackable){
        quackables.add(quackable);
    }

    @Override
    public void quack() {
        Iterator<Quackable> iterator = quackables.iterator();
        while (iterator.hasNext()){
            iterator.next().quack();
            notifyObservers();
        }
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
