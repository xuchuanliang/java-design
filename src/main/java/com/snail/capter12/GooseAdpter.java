package com.snail.capter12;

/**
 * 鹅的适配器
 */
public class GooseAdpter implements Quackable{
    private Goose goose;
    private Observable observable;

    public GooseAdpter() {
        observable = new Observable(this);
    }

    public GooseAdpter(Goose goose) {
        this.goose = goose;
    }

    @Override
    public void quack() {
        goose.honk();
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
