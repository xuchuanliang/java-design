package com.snail.capter06;

/**
 * 灯的命令实现类
 */
public class LigntCommand implements Command{
    private Light light;

    public LigntCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }
}
