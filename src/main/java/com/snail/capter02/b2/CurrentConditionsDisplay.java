package com.snail.capter02.b2;

import java.util.Observable;
import java.util.Observer;

public class CurrentConditionsDisplay implements Observer {

    private Observable observable;

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

    public CurrentConditionsDisplay(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {
        if(o instanceof WeatherData){
            WeatherData weatherData = (WeatherData)o;
            this.temp = weatherData.getTemp();
            this.humidity = weatherData.getHumidity();
            this.pressure = weatherData.getPressure();
            this.display();
        }
    }

    public void display() {
        System.out.println( "CurrentConditionsDisplay{" +
                "observable=" + observable +
                ", temp=" + temp +
                ", humidity=" + humidity +
                ", pressure=" + pressure +
                '}');
    }
}
