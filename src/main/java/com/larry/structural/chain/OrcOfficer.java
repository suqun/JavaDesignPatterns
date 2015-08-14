package com.larry.structural.chain;

/**
 * Created by larry on 15-8-14.
 *
 */
public class OrcOfficer  extends  RequestHandler{
    public OrcOfficer(RequestHandler next) {
        super(next);
    }

    public void handleRequest(Request req){
        if (req.getRequestType().equals(RequestType.TORTURE_PRISONER)) {
            printHandling(req);
        } else {
            super.handleRequest(req);
        }
    }

    @Override
    public String toString() {
        return " Orc officer";
    }
}
