package ru.zoommax.bitcoin.bitcore25.model.network.networkinfo;

import lombok.Getter;
import lombok.Setter;

/**
 * The type Local address.
 */
@Getter
@Setter
public class LocalAddress {

    /**
     * The Address.
     */
    private String address;
    /**
     * The Port.
     */
    private int port;
    /**
     * The Score.
     */
    private double score;

}
