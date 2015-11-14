package com.headfirst.command.simpleremote;

/**
 * Created by larry on 15/11/14.
 * 打开电灯的命令
 * 这个ConcreCommand定义了动作和接收者之间的绑定关系。
 * 调用者只要调用execute方法就可以发出请求，然后由ConcreCommand调用接收者的一个或多个动作。
 */
public class LightOnCommand implements Command {
    Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    public void execute() {
        light.on();
    }
}
