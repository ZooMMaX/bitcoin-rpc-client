package ru.zoommax.bitcoin.bitcore25.model.network.networkinfo;

import lombok.Getter;
import lombok.Setter;

/**
 * The type Network.
 */
@Getter
@Setter
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
    private boolean proxy_randomize_credentials;

}
