package ru.zoommax.bitcoin.model;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The type Network.
 */
public class Network {

    /**
     * The Name.
     */
    private String name;
    /**
     * The Limited.
     */
    private boolean limited;
    /**
     * The Reachable.
     */
    private boolean reachable;
    /**
     * The Proxy.
     */
    private String proxy;
    /**
     * The Proxy randomize credentials.
     */
    @JsonProperty("proxy_randomize_credentials")
    private boolean proxyRandomizeCredentials;

    /**
     * Sets name.
     *
     * @param name the name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets name.
     *
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * Sets limited.
     *
     * @param limited the limited
     */
    public void setLimited(boolean limited) {
        this.limited = limited;
    }

    /**
     * Gets limited.
     *
     * @return the limited
     */
    public boolean getLimited() {
        return limited;
    }

    /**
     * Sets reachable.
     *
     * @param reachable the reachable
     */
    public void setReachable(boolean reachable) {
        this.reachable = reachable;
    }

    /**
     * Gets reachable.
     *
     * @return the reachable
     */
    public boolean getReachable() {
        return reachable;
    }

    /**
     * Sets proxy.
     *
     * @param proxy the proxy
     */
    public void setProxy(String proxy) {
        this.proxy = proxy;
    }

    /**
     * Gets proxy.
     *
     * @return the proxy
     */
    public String getProxy() {
        return proxy;
    }

    /**
     * Is proxy randomize credentials boolean.
     *
     * @return the boolean
     */
    public boolean isProxyRandomizeCredentials() {
        return proxyRandomizeCredentials;
    }

    /**
     * Sets proxy randomize credentials.
     *
     * @param proxyRandomizeCredentials the proxy randomize credentials
     */
    public void setProxyRandomizeCredentials(boolean proxyRandomizeCredentials) {
        this.proxyRandomizeCredentials = proxyRandomizeCredentials;
    }
}