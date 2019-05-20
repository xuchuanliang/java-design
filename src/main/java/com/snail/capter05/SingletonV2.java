package com.snail.capter05;

/**
 * 通过给方法加锁解决线程安全问题，但是如果该对象是频繁访问，那么则存在效率问题
 * 因为单例模式只有第一次访问时才需要同步，对象创建完成以后就不需要同步了，之后每一次调用获取对象方法，同步就是一个累赘
 */
public class SingletonV2 {
    private static SingletonV2 singletonV2;

    private SingletonV2(){}

    public synchronized SingletonV2 getInstance(){
        if(null==singletonV2){
            singletonV2 = new SingletonV2();
        }
        return singletonV2;
    }
}
