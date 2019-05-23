package com.snail.capter09.b1;

/**
 * @author xuchuanliangbt
 * @title: DinerMenuIterator
 * @projectName java-design
 * @description:
 * @date 2019/5/2316:41
 * @Version
 */
public class DinerMenuIterator implements Iterator<MenuItem> {

    private final MenuItem[] menuItems;
    private int position = 0;

    public DinerMenuIterator(MenuItem[] menuItems) {
        this.menuItems = menuItems;
    }

    @Override
    public boolean hasNext() {
        return position < menuItems.length || null != menuItems[position];
    }

    @Override
    public MenuItem next() {
        return menuItems[position++];
    }
}
