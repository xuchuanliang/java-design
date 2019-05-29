package com.snail.capter12;

/**
 * 观察者
 */
public interface QuackObservable {

    void registerObserver(Observer observer);

    void notifyObservers();
}
