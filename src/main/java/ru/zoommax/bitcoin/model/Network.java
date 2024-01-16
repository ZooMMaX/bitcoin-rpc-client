package ru.zoommax.bitcoin.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Network {

    private String name;
    private boolean limited;
    private boolean reachable;
    private String proxy;
    @JsonProperty("proxy_randomize_credentials")
    private boolean proxyRandomizeCredentials;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setLimited(boolean limited) {
        this.limited = limited;
    }

    public boolean getLimited() {
        return limited;
    }

    public void setReachable(boolean reachable) {
        this.reachable = reachable;
    }

    public boolean getReachable() {
        return reachable;
    }

    public void setProxy(String proxy) {
        this.proxy = proxy;
    }

    public String getProxy() {
        return proxy;
    }

    public boolean isProxyRandomizeCredentials() {
        return proxyRandomizeCredentials;
    }

    public void setProxyRandomizeCredentials(boolean proxyRandomizeCredentials) {
        this.proxyRandomizeCredentials = proxyRandomizeCredentials;
    }
}