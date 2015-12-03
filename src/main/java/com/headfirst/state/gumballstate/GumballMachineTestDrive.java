package com.headfirst.state.gumballstate;

/**
 * Created on 15/12/3
 *
 * 状态模式——允许对象在内部状态改变时改变他的行为,对象看起来好像是修改了它的类
 */
public class GumballMachineTestDrive {
    public static void main(String[] args) {
        GumballMachine gumballMachine = new GumballMachine(2);

        System.out.println(gumballMachine);

        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();

        System.out.println(gumballMachine);

        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();

        gumballMachine.refill(5);
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();

        System.out.println(gumballMachine);
    }
}

/*
        Mighty Gumball, Inc.
        Java-enabled Standing Gumball Model #2004
        Inventory: 2 gumballs
        Machine is waiting for quarter

        You inserted a quarter
        You turned...
        A gumball comes rolling out the slot...

        Mighty Gumball, Inc.
        Java-enabled Standing Gumball Model #2004
        Inventory: 1 gumball
        Machine is waiting for quarter

        You inserted a quarter
        You turned...
        A gumball comes rolling out the slot...
        Oops, out of gumballs
        You can't insert a quarter, the machine is sold out
        You turned, but there are no gumballs
        No gumball dispensed
        The gumball machine was just refilled; it's new count is: 5
        You inserted a quarter
        You turned...
        A gumball comes rolling out the slot...

        Mighty Gumball, Inc.
        Java-enabled Standing Gumball Model #2004
        Inventory: 4 gumballs
        Machine is waiting for quarter
*/
