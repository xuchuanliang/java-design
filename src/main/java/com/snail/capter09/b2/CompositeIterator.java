package com.snail.capter09.b2;

import java.util.Iterator;
import java.util.Stack;

/**
 * 组合迭代器
 */
public class CompositeIterator implements Iterator<MenuComponent>{

    private Stack<Iterator<MenuComponent>> stack = new Stack<>();

    public CompositeIterator(Iterator<MenuComponent> iterator) {
        stack.push(iterator);
    }

    @Override
    public boolean hasNext() {
        if(stack.empty()){
            return false;
        }else{
            Iterator<MenuComponent> peek = stack.peek();
            if(!peek.hasNext()){
                stack.pop();
                return hasNext();
            }else {
                return true;
            }
        }
    }

    @Override
    public MenuComponent next() {
        if(hasNext()){
            Iterator<MenuComponent> peek = stack.peek();
            MenuComponent next = peek.next();
            if(next instanceof Menu){
                stack.push(next.createIterator());
            }
            return next;
        }else {
            return null;
        }
    }
}
