package com.larry.creational.abstractfactory;

/**
 * Created by larry on 15-8-1.
 * Concrete factory
 */
public class OrcKingdomFactory implements KingdomFactory{
    public Castle createCastle() {
        return new OrcCastle();
    }

    public King createKing() {
        return new OrcKing();
    }

    public Army createArmy() {
        return new OrcArmy();
    }
}
