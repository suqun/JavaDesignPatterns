package com.larry.structural.chain;

/**
 * Created by larry on 15-8-14.
 * Makes requests that are handled by the chain.
 */
public class OrcKing {
    RequestHandler chain;

    public OrcKing() {
        buildChain();
    }

    private void buildChain(){
        chain = new OrcCommander(new OrcOfficer(new OrcSoldier(null)));
    }

    public void makeRequest(Request request){
        chain.handleRequest(request);
    }
}