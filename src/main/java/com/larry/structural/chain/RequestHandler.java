package com.larry.structural.chain;

/**
 * Created by larry on 15-8-14.
 *
 */
public abstract class RequestHandler {

    private RequestHandler next;

    public RequestHandler(RequestHandler next) {
        this.next = next;
    }

    public void handleRequest(Request request){
        if (null != next) {
            next.handleRequest(request);
        }
    }

    public void printHandling(Request request){
        System.out.println(this + " handling request \"" + request + "\"");
    }

    @Override
    public abstract String toString();
}
