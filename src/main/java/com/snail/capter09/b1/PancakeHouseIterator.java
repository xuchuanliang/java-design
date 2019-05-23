package com.snail.capter09.b1;

import java.util.List;

/**
 * @author xuchuanliangbt
 * @title: PancakeHouseIterator
 * @projectName java-design
 * @description:
 * @date 2019/5/2316:46
 * @Version
 */
public class PancakeHouseIterator implements Iterator<MenuItem> {

    private final List<MenuItem> menuItems;
    private int position = 0;

    public PancakeHouseIterator(List<MenuItem> menuItems) {
        this.menuItems = menuItems;
    }

    @Override
    public boolean hasNext() {
        return menuItems.size() > position || menuItems.get(position)!=null;
    }

    @Override
    public MenuItem next() {
        return menuItems.get(position++);
    }
}
