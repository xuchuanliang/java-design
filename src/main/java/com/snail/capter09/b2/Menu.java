package com.snail.capter09.b2;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * 菜单
 */
public class Menu extends MenuComponent{
    private ArrayList<MenuComponent> menuComponents = new ArrayList<>();
    private String name;
    private String description;

    public Menu(String name, String description) {
        this.name = name;
        this.description = description;
    }

    @Override
    public void add(MenuComponent menuComponent) {
        menuComponents.add(menuComponent);
    }

    @Override
    public void remove(MenuComponent menuComponent) {
        menuComponents.remove(menuComponent);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public void print() {
        System.out.println(toString());
        Iterator<MenuComponent> iterator = menuComponents.iterator();
        while (iterator.hasNext()){
            iterator.next().print();
        }
    }

    @Override
    public String toString() {
        return "Menu{" +
                "menuComponents=" + menuComponents +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                '}';
    }

    @Override
    public CompositeIterator createIterator(){
        return new CompositeIterator(menuComponents.iterator());
    }
}
