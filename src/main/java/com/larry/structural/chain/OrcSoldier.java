package com.larry.structural.chain;

/**
 * Created by larry on 15-8-14.
 *
 */
public class OrcSoldier extends RequestHandler{

    public OrcSoldier(RequestHandler next) {
        super(next);
    }

    public void handleRequest(Request req){
        if (req.getRequestType().equals(RequestType.COLLECT_TAX)) {
            printHandling(req);
        } else {
            super.handleRequest(req);
        }
    }

    @Override
    public String toString() {
        return "Orc soldier";
    }
}
