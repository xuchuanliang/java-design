package com.snail.capter02.b1;

/**
 * 观察者
 */
public interface Observer {
    /**
     * 当观察者需要被通知时，调用次更新方法
     * @param temp 温度
     * @param humidity 湿度
     * @param pressure 气压
     */
    void update(float temp,float humidity,float pressure);
}
