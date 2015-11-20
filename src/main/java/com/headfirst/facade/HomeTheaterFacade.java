package com.headfirst.facade;

/**
 * Created on 2015/11/20.
 * 家庭影院外观
 *
 * OO基础：
 *        抽象，封装，多态，继承
 * OO原则：
 *       1，找出应用中可能需要变化之处，把它们独立出来，不要和那些不变化的代码混合在一起。  封装变化
 *       2，针对接口编程，而不是针对实现编程
 *       3，多用组合，少用继承
 *       4，为交互对象之间的松耦合设计而努力 ——松耦合设计更有弹性，更能应对变化
 *       5，对扩展开放，对修改关闭
 *       6，依赖抽象，不要依赖具体类
 *       7，只和朋友交谈（最少知识原则）
 *
 * OO模式：外观模式——提供了一个统一的接口，用来访问子系统中的一群接口。外观定义了一个高层接口，让子系统更容易使用
 */
public class HomeTheaterFacade {
    //组合，我们用到的子系统组件全部放到这里
    Amplifier amp;
    Tuner tuner;
    DvdPlayer dvd;
    CdPlayer cd;
    Projector projector;
    TheaterLights lights;
    Screen screen;
    PopcornPopper popper;

    //外观将子系统中每一个组件的引用都传入它的构造器中。然后外观把他们赋值给相应的实例变量
    public HomeTheaterFacade(Amplifier amp, Tuner tuner, DvdPlayer dvd, CdPlayer cd, Projector projector, TheaterLights lights, Screen screen, PopcornPopper popper) {
        this.amp = amp;
        this.tuner = tuner;
        this.dvd = dvd;
        this.cd = cd;
        this.projector = projector;
        this.lights = lights;
        this.screen = screen;
        this.popper = popper;
    }

    public void watchMovie (String movie){
        System.out.println("Get ready to watch a movie ...");
        popper.on();
        popper.pop();
        lights.dim(10);
        screen.down();
        projector.on();
        projector.wideScreenMode();
        amp.on();
        amp.setDvd(dvd);
        amp.setSurroundSound();
        amp.setVolume(5);
        dvd.on();
        dvd.play(movie);
    }

    public void endMovie() {
        System.out.println("Shutting movie theater down...");
        popper.off();
        lights.on();
        screen.up();
        projector.off();
        amp.off();
        dvd.stop();
        dvd.eject();
        dvd.off();
    }

    public void listenToCd(String cdTitle) {
        System.out.println("Get ready for an audiopile experence...");
        lights.on();
        amp.on();
        amp.setVolume(5);
        amp.setCd(cd);
        amp.setStereoSound();
        cd.on();
        cd.play(cdTitle);
    }

    public void endCd() {
        System.out.println("Shutting down CD...");
        amp.off();
        amp.setCd(cd);
        cd.eject();
        cd.off();
    }

    public void listenToRadio(double frequency) {
        System.out.println("Tuning in the airwaves...");
        tuner.on();
        tuner.setFrequency(frequency);
        amp.on();
        amp.setVolume(5);
        amp.setTuner(tuner);
    }

    public void endRadio() {
        System.out.println("Shutting down the tuner...");
        tuner.off();
        amp.off();
    }
}
