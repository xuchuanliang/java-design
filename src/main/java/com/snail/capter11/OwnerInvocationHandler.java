package com.snail.capter11;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author xuchuanliangbt
 * @title: OwnerInvocationHandler
 * @projectName java-design
 * @description:
 * @date 2019/5/2919:26
 * @Version
 */
public class OwnerInvocationHandler implements InvocationHandler {
    private PersonBean personBean;

    public OwnerInvocationHandler(PersonBean personBean) {
        this.personBean = personBean;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("进来代理");
        if(method.getName().startsWith("get")){
            return method.invoke(personBean,args);
        }else if(method.getName().equals("setHotOrNotRating")){
            throw new IllegalAccessException();
        }else if(method.getName().startsWith("set")){
            return method.invoke(personBean,args);
        }
        return null;
    }
}
