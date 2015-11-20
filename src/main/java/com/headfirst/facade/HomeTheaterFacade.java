package com.headfirst.facade;

/**
 * Created on 2015/11/20.
 * ��ͥӰԺ���
 *
 * OO������
 *        ���󣬷�װ����̬���̳�
 * OOԭ��
 *       1���ҳ�Ӧ���п�����Ҫ�仯֮���������Ƕ�����������Ҫ����Щ���仯�Ĵ�������һ��  ��װ�仯
 *       2����Խӿڱ�̣����������ʵ�ֱ��
 *       3��������ϣ����ü̳�
 *       4��Ϊ��������֮����������ƶ�Ŭ�� �����������Ƹ��е��ԣ�����Ӧ�Ա仯
 *       5������չ���ţ����޸Ĺر�
 *       6���������󣬲�Ҫ����������
 *       7��ֻ�����ѽ�̸������֪ʶԭ��
 *
 * OOģʽ�����ģʽ�����ṩ��һ��ͳһ�Ľӿڣ�����������ϵͳ�е�һȺ�ӿڡ���۶�����һ���߲�ӿڣ�����ϵͳ������ʹ��
 */
public class HomeTheaterFacade {
    //��ϣ������õ�����ϵͳ���ȫ���ŵ�����
    Amplifier amp;
    Tuner tuner;
    DvdPlayer dvd;
    CdPlayer cd;
    Projector projector;
    TheaterLights lights;
    Screen screen;
    PopcornPopper popper;

    //��۽���ϵͳ��ÿһ����������ö��������Ĺ������С�Ȼ����۰����Ǹ�ֵ����Ӧ��ʵ������
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
