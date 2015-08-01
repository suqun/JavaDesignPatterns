package com.larry.creational.abstractfactory;

/**
 * Created by larry on 15-8-1.
 *
 */
public interface KingdomFactory {

    Castle createCastle();

    King createKing();

    Army createArmy();
}
