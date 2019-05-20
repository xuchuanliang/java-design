package com.snail.capter06;

/**
 * 遥控器
 */
public class SimpleRemoteControl {
    Command command;

    public void setCommand(Command command){
        this.command = command;
    }

    /**
     * 按下按钮
     */
    public void buttonWasPressed(){
        command.execute();
    }
}
