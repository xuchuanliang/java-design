package com.snail.capter05;

/**
 * 存在线程安全问题的单例模式
 */
public class SingletonV1 {
    private static SingletonV1 singletonV1;
    private SingletonV1(){}

    public static SingletonV1 getInstance(){
        if(null==singletonV1){
            singletonV1 = new SingletonV1();
        }
        return singletonV1;
    }
}
