package com.snail.capter06;

import java.util.ArrayList;
import java.util.List;

/**
 * 遥控器类
 */
public class RemoteController {
    private List<Command> onCommands;
    private List<Command> offCommands;

    public RemoteController() {
        this.onCommands = new ArrayList<>(7);
        this.offCommands = new ArrayList<>(7);
        /**
         * NoCommand对象是一个空对象，当不想返回一个有意义的对象时，空对象很有用。
         * 客户可以将处理null的责任转交给空对象
         */
        Command command = new NoCommand();
        for(int i = 0; i< onCommands.size(); i++){
            onCommands.add(i,command);
            offCommands.add(i,command);
        }
    }

    public void setCommand(int slot,Command onCommand,Command offCommand){
        onCommands.set(slot,onCommand);
        offCommands.set(slot,offCommand);
    }

    public void onButtonWasPushed(int slot){
        onCommands.get(slot).execute();
    }

    public void offButtonPushed(int slot){
        offCommands.get(slot).execute();
    }
}
