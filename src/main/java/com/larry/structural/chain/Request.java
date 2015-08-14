package com.larry.structural.chain;

/**
 * Created by larry on 15-8-14.
 *
 */
public class Request {
    private String requestDescription;
    private RequestType requestType;

    public Request(RequestType requestType,String requestDescription) {
        this.requestDescription = requestDescription;
        this.requestType = requestType;
    }

    public String getRequestDescription() {
        return requestDescription;
    }

    public void setRequestDescription(String requestDescription) {
        this.requestDescription = requestDescription;
    }

    public RequestType getRequestType() {
        return requestType;
    }

    public void setRequestType(RequestType requestType) {
        this.requestType = requestType;
    }

    @Override
    public String toString() {
        return getRequestDescription();
    }
}
