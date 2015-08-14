package com.larry.structural.chain;

/**
 * Created by larry on 15-8-14.
 *
 */
public class OrcCommander extends RequestHandler {
    public OrcCommander(RequestHandler next) {
        super(next);
    }

    public void handleRequest(Request req){
        if (req.getRequestType().equals(RequestType.DEFEND_CASTLE)) {
            printHandling(req);
        } else {
            super.handleRequest(req);
        }
    }
    @Override
    public String toString() {
        return "Orc commander";
    }
}
