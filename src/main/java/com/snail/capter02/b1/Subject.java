package com.snail.capter02.b1;

/**
 * 观察者模式-主题
 */
public interface Subject {
    /**
     * 注册观察者
     * @param o
     */
    void registerObserver(Observer o);

    /**
     * 移除观察者
     * @param o
     */
    void removeObserver(Observer o);

    /**
     * 通知观察者
     */
    void notifyObservers();
}
