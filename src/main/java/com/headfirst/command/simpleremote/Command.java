package com.headfirst.command.simpleremote;

/**
 * Created by larry on 15/11/14.
 * Command为所有命令声明了一个接口。调用命令对象的execute方法，就可以让接收者进行相关的动作。
 */
public interface Command {
    public void execute();//只需要一个方法execute()
}
