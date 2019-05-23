package com.snail.capter09.b2;

import java.util.Iterator;

/**
 * 服务员
 */
public class Waitress {
    private MenuComponent allMenus;

    public Waitress(MenuComponent allMenus) {
        this.allMenus = allMenus;
    }

    public void print(){
        allMenus.print();
    }

    public void printVegetarianMenu(){
        Iterator<MenuComponent> iterator = allMenus.createIterator();
        while (iterator.hasNext()){
            MenuComponent next = iterator.next();
            try{
                if (next.isVegetarian()){
                    next.print();
                }
            }catch (UnsupportedOperationException e){

            }
        }
    }

}
