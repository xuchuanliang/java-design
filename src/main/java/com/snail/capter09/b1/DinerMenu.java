package com.snail.capter09.b1;

/**
 * @author xuchuanliangbt
 * @title: DinerMenu
 * @projectName java-design
 * @description:
 * @date 2019/5/2311:21
 * @Version
 */
public class DinerMenu {
    private static final int MAX_ITEMS = 6;
    private int numberOfItem = 0;
    private MenuItem[] menuItems;

    public DinerMenu() {
        menuItems = new MenuItem[MAX_ITEMS];
    }

    public void addItem(String name, String description, boolean vegetarian, double price){
        if(numberOfItem >= MAX_ITEMS){
            System.out.println("菜单满了");
        }else{
            menuItems[numberOfItem++]=new MenuItem(name,description,vegetarian,price);
        }
    }

    public MenuItem[] getMenuItems() {
        return menuItems;
    }

    public Iterator<MenuItem> createIterator(){
        return new DinerMenuIterator(menuItems);
    }
}
