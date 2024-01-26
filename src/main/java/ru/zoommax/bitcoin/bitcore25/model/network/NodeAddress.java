package ru.zoommax.bitcoin.bitcore25.model.network;

import lombok.Getter;
import lombok.Setter;
import ru.zoommax.bitcoin.JsonRpcResult;

/**
 * The type Node address.
 */
@Getter
@Setter
public class NodeAddress {

    /**
     * The type Result.
     */
    public static class Result extends JsonRpcResult<NodeAddress[]> {
	}

    /**
     * The Time.
     */
    private long time;
    /**
     * The Services.
     */
    private long services;
    /**
     * The Address.
     */
    private String address;
    /**
     * The Port.
     */
    private int port;
    /**
     * The Network.
     */
    private String network;

}
