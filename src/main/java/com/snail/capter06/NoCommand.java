package com.snail.capter06;

/**
 * @author xuchuanliangbt
 * @title: NoCommand
 * @projectName java-design
 * @description:
 * @date 2019/5/218:23
 * @Version
 */
public class NoCommand implements Command{
    @Override
    public void execute() {
        System.out.println("kong");
    }
}
