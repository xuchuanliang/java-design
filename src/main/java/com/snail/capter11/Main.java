package com.snail.capter11;

import java.lang.reflect.Proxy;

/**
 * @author xuchuanliangbt
 * @title: Main
 * @projectName java-design
 * @description:
 * @date 2019/5/2919:30
 * @Version
 */
public class Main {
    public static void main(String[] args){
        personBean(new PersonBeanImpl()).setHotOrNotRating(0);
    }
    public static PersonBean personBean(PersonBean personBean){
        return (PersonBean) Proxy.newProxyInstance(personBean.getClass().getClassLoader(), new Class[]{PersonBean.class},new OwnerInvocationHandler(personBean));
    }
}
