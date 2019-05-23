package com.snail.capter09.b2;

import java.util.Iterator;

/**
 * @author xuchuanliangbt
 * @title: NullIterator
 * @projectName java-design
 * @description:
 * @date 2019/5/2318:06
 * @Version
 */
public class NullIterator implements Iterator<MenuComponent> {
    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public MenuComponent next() {
        return null;
    }
}
