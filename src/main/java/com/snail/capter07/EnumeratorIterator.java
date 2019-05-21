package com.snail.capter07;

import java.util.Enumeration;
import java.util.Iterator;

/**
 * @author xuchuanliangbt
 * @title: EnumeratorIterator
 * @projectName java-design
 * @description:
 * @date 2019/5/2119:21
 * @Version
 */
public class EnumeratorIterator<E> implements Iterator<E> {

    private Enumeration<E> enumeration;

    public EnumeratorIterator(Enumeration<E> enumeration) {
        this.enumeration = enumeration;
    }

    @Override
    public boolean hasNext() {
        return enumeration.hasMoreElements();
    }

    @Override
    public E next() {
        return enumeration.nextElement();
    }
}
