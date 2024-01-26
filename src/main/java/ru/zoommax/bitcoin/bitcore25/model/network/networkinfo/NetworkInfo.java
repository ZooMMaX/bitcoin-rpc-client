package ru.zoommax.bitcoin.bitcore25.model.network.networkinfo;

import lombok.Getter;
import lombok.Setter;
import ru.zoommax.bitcoin.JsonRpcResult;

/**
 * The type Network info.
 */
@Getter
@Setter
public class NetworkInfo {
    /**
     * The type Result.
     */
    public static class Result extends JsonRpcResult<NetworkInfo> {
	}

    /**
     * The Version.
     */
    private long version;
    /**
     * The Subversion.
     */
    private String subversion;
    /**
     * The Protocolversion.
     */
    private long protocolversion;
    /**
     * The Localservices.
     */
    private String localservices;
    /**
     * The Localservicesnames.
     */
    private String[] localservicesnames;
    /**
     * The Localrelay.
     */
    private boolean localrelay;
    /**
     * The Timeoffset.
     */
    private long timeoffset;
    /**
     * The Connections.
     */
    private long connections;
    /**
     * The Connections in.
     */
    private long connections_in;
    /**
     * The Connections out.
     */
    private long connections_out;
    /**
     * The Networkactive.
     */
    private boolean networkactive;
    /**
     * The Networks.
     */
    private Network[] networks;
    /**
     * The Relayfee.
     */
    private double relayfee;
    /**
     * The Incrementalfee.
     */
    private double incrementalfee;
    /**
     * The Localaddresses.
     */
    private LocalAddress[] localaddresses;
    /**
     * The Warnings.
     */
    private String warnings;

}
