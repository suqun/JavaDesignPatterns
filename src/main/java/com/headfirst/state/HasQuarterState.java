package com.headfirst.state;

/**
 * Created on 15/12/3
 */
public class HasQuarterState implements State {
    GumballMachine gumballMachine;

    public HasQuarterState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    public void insertQuarter() {
        System.out.println("You can't insert another quarter");
    }

    public void ejectQuarter() {
        System.out.println("Quarter returned");
        gumballMachine.setState(gumballMachine.getNoQuarterState());
    }

    public void turnCrank() {
        System.out.println("You turned...");
        gumballMachine.setState(gumballMachine.getSoldState());
    }

    //这是此状态中的另一个不恰当的操作
    public void dispense() {
        System.out.println("No gumball dispensed");
    }

    public void refill() {

    }

    public String toString() {
        return "waiting for turn of crank";
    }
}
