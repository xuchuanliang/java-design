package com.snail.capter05;

/**
 * 单例模式最优解决办法：双重加锁方式
 * 这里只存在一个问题，多个类加载器同时使用了单例模式，因为每个类加载器都有一个独立的命名空间，这里需要自行制定类加载器
 */
public class SingletonFinal {
    private volatile static SingletonFinal singletonFinal;

    private SingletonFinal() {}

    public static SingletonFinal getInstance(){
        if(singletonFinal==null){
            synchronized (SingletonFinal.class){
                if(singletonFinal==null){
                    singletonFinal = new SingletonFinal();
                }
            }
        }
        return singletonFinal;
    }
}
