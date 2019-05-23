package com.snail.capter09.b2;

import java.util.Iterator;

/**
 * 菜单组件：为叶子节点和组合节点提供一个共同的接口
 */
public abstract class MenuComponent {

    /**
     * 组合方法
     * @param menuComponent
     */
    public void add(MenuComponent menuComponent){
        throw new UnsupportedOperationException();
    }

    public void remove(MenuComponent menuComponent){
        throw new UnsupportedOperationException();
    }

    public MenuComponent getChild(int i){
        throw new UnsupportedOperationException();
    }

    /**
     * 操作方法
     * @return
     */
    public String getName(){
        throw new UnsupportedOperationException();
    }

    public String getDescription(){
        throw new UnsupportedOperationException();
    }

    public double getPrice(){
        throw new UnsupportedOperationException();
    }

    public boolean isVegetarian(){
        throw new UnsupportedOperationException();
    }

    public void print(){
        throw new UnsupportedOperationException();
    }

    public Iterator<MenuComponent> createIterator(){
        throw new UnsupportedOperationException();
    }
}
