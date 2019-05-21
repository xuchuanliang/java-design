package com.snail.capter06;

/**
 * @author xuchuanliangbt
 * @title: CeillingFanOnCommand
 * @projectName java-design
 * @description:
 * @date 2019/5/218:20
 * @Version
 */
public class CeillingFanOffCommand implements Command{
    private CeillingFan ceillingFan;

    public CeillingFanOffCommand(CeillingFan ceillingFan) {
        this.ceillingFan = ceillingFan;
    }

    @Override
    public void execute() {
        ceillingFan.off();
    }
}
