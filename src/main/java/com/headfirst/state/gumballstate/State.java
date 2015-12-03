package com.headfirst.state.gumballstate;

/**
 * Created on 15/12/3.
 * 状态接口
 */
public interface State {
    void insertQuarter();

    void ejectQuarter();

    void turnCrank();

    void dispense();

    void refill();
}
