package com.snail.capter09.b1;

import java.util.ArrayList;

/**
 * 煎饼屋菜单实现
 */
public class PancakeHouseMenu {

    private ArrayList<MenuItem> menuItems;

    public PancakeHouseMenu(){
        menuItems = new ArrayList<>();

    }

    public void addMenuItem(String name, String description, boolean vegetarian, double price){
        menuItems.add(new MenuItem(name,description,vegetarian,price));
    }

    public ArrayList<MenuItem> getMenuItems() {
        return menuItems;
    }

    public Iterator<MenuItem> createIterator(){
        return new PancakeHouseIterator(menuItems);
    }
}
