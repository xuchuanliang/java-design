package com.snail.capter02;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * 天气数据类
 */
public class WeatherData implements Subject{
    private final List<Observer> observers;

    /**
     * 温度
     */
    private float temp;

    /**
     * 湿度
     */
    private float humidity;

    /**
     * 气压
     */
    private float pressure;

    public WeatherData() {
        this.observers = new CopyOnWriteArrayList<>();
    }

    @Override
    public void registerObserver(Observer o) {
        this.observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        this.observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        observers.forEach(o->o.update(temp,humidity,pressure));
    }

    public void measuermentsChanged(){
        notifyObservers();
    }

    public void setMesurements(float temp,float humidity,float pressure){
        this.temp = temp;
        this.humidity = humidity;
        this.pressure = pressure;
    }
}
