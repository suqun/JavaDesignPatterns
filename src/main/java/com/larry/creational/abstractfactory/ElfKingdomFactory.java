package com.larry.creational.abstractfactory;

/**
 * Created by larry on 15-8-1.
 * Concrete factory
 */
public class ElfKingdomFactory implements  KingdomFactory{

    public Castle createCastle() {
        return new ElfCastle();
    }

    public King createKing() {
        return new ElfKing();
    }

    public Army createArmy() {
        return new ElfArmy();
    }
}
