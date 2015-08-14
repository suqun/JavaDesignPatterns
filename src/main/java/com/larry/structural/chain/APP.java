package com.larry.structural.chain;

/**
 * Created by larry on 15-8-14.
 *
 * Chain of Responsibility organizes request handlers (RequestHandler) into a
 * chain where each handler has a chance to act on the request on its turn. In
 * this example the king (OrcKing) makes requests and the military orcs
 * (OrcCommander, OrcOfficer, OrcSoldier) form the handler chain.
 *
 */
public class APP {

    public static void main (String[] args){
        OrcKing king = new OrcKing();
        king.makeRequest(new Request(RequestType.DEFEND_CASTLE, "defend castle"));
        king.makeRequest(new Request(RequestType.TORTURE_PRISONER,
                "torture prisoner"));
        king.makeRequest(new Request(RequestType.COLLECT_TAX, "collect tax"));
    }

}
