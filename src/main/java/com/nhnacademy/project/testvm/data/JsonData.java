package com.nhnacademy.project.testvm.data;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonIncludeProperties;
import java.net.PortUnreachableException;
import java.util.HashMap;
import java.util.Map;

public class JsonData {

    private Map<String,String> args = new HashMap<>();

    private String data = "";

    private Map<String, String> files = new HashMap<>();

    private Map<String, String> form = new HashMap<>();

    private Map<String,String> headers = new HashMap<>();


    private String origin;

    private String url ="{}";

    public void putArgs(String key, String value){
        this.args.put(key, value);
    }

    public void putHeaders(String key, String value){
        this.headers.put(key, value);
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Map<String, String> getArgs() {
        return args;
    }

    public Map<String, String> getHeaders() {
        return headers;
    }

    public String getOrigin() {
        return origin;
    }

    public String getUrl() {
        return url;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getData() {
        return data;
    }

    public Map<String, String> getFiles() {
        return files;
    }

    public Map<String, String> getForm() {
        return form;
    }
}
