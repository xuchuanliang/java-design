package com.snail.capter06;

/**
 * 灯的命令实现类
 */
public class LightOnCommand implements Command{
    private Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }
}
