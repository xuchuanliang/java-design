package com.snail.capter05;

/**
 * 饥饿式创建单例，即直接创建
 */
public class SingletonV3 {
    private static final SingletonV3 SINGLETON_V_2 = new SingletonV3();
    private SingletonV3(){}

    public static SingletonV3 getInstance(){
        return SINGLETON_V_2;
    }
}
