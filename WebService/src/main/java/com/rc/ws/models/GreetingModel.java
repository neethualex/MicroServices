package com.rc.ws.models;

/**
 * Created by root on 2/27/17.
 */
public class GreetingModel {

    private String id;
    private String content;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public GreetingModel(String id, String content) {
        this.id = id;
        this.content = content;
    }

    public String getContent() {
        return content;

    }

    public void setContent(String content) {
        this.content = content;
    }
}
