package com.headfirst.command.simpleremote;

/**
 * Created by larry on 15/11/14.
 * 调用者
 * 这个调用者持有一个命令对象，并在某个时间点调用命令对象的execute()方法，将请求付诸执行。
 */
public class RemoteControlTest {
    public static void main(String[] args) {
        SimpleRemoteControl remote = new SimpleRemoteControl();

        Light light = new Light();
        LightOnCommand ligthOn = new LightOnCommand(light);

        GarageDoor door = new GarageDoor();
        GarageDoorOpenCommand doorOpen = new GarageDoorOpenCommand(door);

        remote.setCommand(ligthOn);
        remote.buttonWasPressed();

        remote.setCommand(doorOpen);
        remote.buttonWasPressed();
    }
}

    /*Light is on
      Garage Door is Open */