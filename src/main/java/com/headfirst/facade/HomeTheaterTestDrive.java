package com.headfirst.facade;

/**
 * Created on 2015/11/20.
 *
 */
public class HomeTheaterTestDrive {
    public static void main(String[] args) {
        //我们就在这个测试程序中，直接建立了这些组件。正常情况下，某个外观全被指派给客户使用，而不需要客户自己创建外观。
        Amplifier amp = new Amplifier("Top-O-Line Amplifier");
        Tuner tuner = new Tuner("Top-O-Line AM/FM Tuner", amp);
        DvdPlayer dvd = new DvdPlayer("Top-O-Line DVD Player", amp);
        CdPlayer cd = new CdPlayer("Top-O-Line CD Player", amp);
        Projector projector = new Projector("Top-O-Line Projector", dvd);
        TheaterLights lights = new TheaterLights("Theater Ceiling Lights");
        Screen screen = new Screen("Theater Screen");
        PopcornPopper popper = new PopcornPopper("Popcorn Popper");

        //根据子系统所有组件实例化外观
        HomeTheaterFacade homeTheater =
                new HomeTheaterFacade(amp, tuner, dvd, cd,
                        projector, lights, screen, popper);

        //使用简化的接口，先开启电影，然后关闭电影
        homeTheater.watchMovie("Raiders of the Lost Ark");
        homeTheater.endMovie();
    }
}

//        Get ready to watch a movie ...
//        Popcorn Popper on
//        Popcorn Popper popping popcorn!
//        Theater Ceiling Lights dimming to 10%
//        Theater Screen going down
//        Top-O-Line Projector on
//        Top-O-Line Projector in wide screen mode (16x9 aspect ratio)
//        Top-O-Line Amplifier on
//        Top-O-Line Amplifier setting DVD player to Top-O-Line DVD Player
//        Top-O-Line Amplifier surround sound on (5 speakers, 1 subwoofer)
//        Top-O-Line Amplifier setting volume to 5
//        Top-O-Line DVD Player on
//        Top-O-Line DVD Player playing "Raiders of the Lost Ark"
//        Shutting movie theater down...
//        Popcorn Popper off
//        Theater Ceiling Lights on
//        Theater Screen going up
//        Top-O-Line Projector off
//        Top-O-Line Amplifier off
//        Top-O-Line DVD Player stopped "Raiders of the Lost Ark"
//        Top-O-Line DVD Player eject
//        Top-O-Line DVD Player off
