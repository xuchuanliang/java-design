package com.snail.capter02.b2;

import java.util.Observable;

/**
 * 使用java原生的观察者模式：java.unit.Observable
 */
public class WeatherData extends Observable {
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
    }

    public void setMesurements(float temp,float humidity,float pressure){
        this.temp = temp;
        this.humidity = humidity;
        this.pressure = pressure;
        super.setChanged();
        super.notifyObservers();
    }

    public float getTemp() {
        return temp;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }
}
