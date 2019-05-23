package com.snail.capter09.b1;

/**
 * 服务员
 */
public class Waitress {
    private DinerMenu dinerMenu;
    private PancakeHouseMenu pancakeHouseMenu;

    public Waitress(DinerMenu dinerMenu, PancakeHouseMenu pancakeHouseMenu) {
        this.dinerMenu = dinerMenu;
        this.pancakeHouseMenu = pancakeHouseMenu;
    }

    public void printMenu(){
        print(dinerMenu.createIterator());
        print(pancakeHouseMenu.createIterator());
    }

    private void print(Iterator<MenuItem> iterator){
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
