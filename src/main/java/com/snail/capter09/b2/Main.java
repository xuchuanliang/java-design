package com.snail.capter09.b2;

import java.util.Stack;

/**
 * @author xuchuanliangbt
 * @title: Main
 * @projectName java-design
 * @description:
 * @date 2019/5/2318:17
 * @Version
 */
public class Main {
    private static Stack stack;
    public static void main(String[] args){
        stack = new Stack();
        for(int i=0;i<10;i++){
            stack.push(i);
        }
        while (null!=stack.peek()){
            System.out.println(stack.pop());
        }

        System.out.println("----------");
        System.out.println(stack);
    }
}
