package ru.zoommax.bitcoin.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import ru.zoommax.bitcoin.JsonRpcResult;

/**
 * The type Network info.
 */
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
     * The Localrelay.
     */
    private boolean localrelay;
    /**
     * The Timeoffset.
     */
    private int timeoffset;
    /**
     * The Networkactive.
     */
    private boolean networkactive;
    /**
     * The Connections.
     */
    private int connections;
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
    private String[] localaddresses;
    /**
     * The Warnings.
     */
    private String warnings;
    /**
     * The Localservicesnames.
     */
    private String[] localservicesnames;
    /**
     * The Connections in.
     */
    @JsonProperty("connections_in")
    private int connectionsIn;
    /**
     * The Connections out.
     */
    @JsonProperty("connections_out")
    private int connectionsOut;

    /**
     * Gets connections out.
     *
     * @return the connections out
     */
    public int getConnectionsOut() {
        return connectionsOut;
    }

    /**
     * Sets connections out.
     *
     * @param connectionsOut the connections out
     */
    public void setConnectionsOut(int connectionsOut) {
        this.connectionsOut = connectionsOut;
    }

    /**
     * Gets connections in.
     *
     * @return the connections in
     */
    public int getConnectionsIn() {
        return connectionsIn;
    }

    /**
     * Sets connections in.
     *
     * @param connectionsIn the connections in
     */
    public void setConnectionsIn(int connectionsIn) {
        this.connectionsIn = connectionsIn;
    }

    /**
     * Get localservicesnames string [ ].
     *
     * @return the string [ ]
     */
    public String[] getLocalservicesnames() {
        return localservicesnames;
    }

    /**
     * Sets localservicesnames.
     *
     * @param localservicesnames the localservicesnames
     */
    public void setLocalservicesnames(String[] localservicesnames) {
        this.localservicesnames = localservicesnames;
    }

    /**
     * Sets version.
     *
     * @param version the version
     */
    public void setVersion(long version) {
        this.version = version;
    }

    /**
     * Gets version.
     *
     * @return the version
     */
    public long getVersion() {
        return version;
    }

    /**
     * Sets subversion.
     *
     * @param subversion the subversion
     */
    public void setSubversion(String subversion) {
        this.subversion = subversion;
    }

    /**
     * Gets subversion.
     *
     * @return the subversion
     */
    public String getSubversion() {
        return subversion;
    }

    /**
     * Sets protocolversion.
     *
     * @param protocolversion the protocolversion
     */
    public void setProtocolversion(long protocolversion) {
        this.protocolversion = protocolversion;
    }

    /**
     * Gets protocolversion.
     *
     * @return the protocolversion
     */
    public long getProtocolversion() {
        return protocolversion;
    }

    /**
     * Sets localservices.
     *
     * @param localservices the localservices
     */
    public void setLocalservices(String localservices) {
        this.localservices = localservices;
    }

    /**
     * Gets localservices.
     *
     * @return the localservices
     */
    public String getLocalservices() {
        return localservices;
    }

    /**
     * Sets localrelay.
     *
     * @param localrelay the localrelay
     */
    public void setLocalrelay(boolean localrelay) {
        this.localrelay = localrelay;
    }

    /**
     * Gets localrelay.
     *
     * @return the localrelay
     */
    public boolean getLocalrelay() {
        return localrelay;
    }

    /**
     * Sets timeoffset.
     *
     * @param timeoffset the timeoffset
     */
    public void setTimeoffset(int timeoffset) {
        this.timeoffset = timeoffset;
    }

    /**
     * Gets timeoffset.
     *
     * @return the timeoffset
     */
    public int getTimeoffset() {
        return timeoffset;
    }

    /**
     * Sets networkactive.
     *
     * @param networkactive the networkactive
     */
    public void setNetworkactive(boolean networkactive) {
        this.networkactive = networkactive;
    }

    /**
     * Gets networkactive.
     *
     * @return the networkactive
     */
    public boolean getNetworkactive() {
        return networkactive;
    }

    /**
     * Sets connections.
     *
     * @param connections the connections
     */
    public void setConnections(int connections) {
        this.connections = connections;
    }

    /**
     * Gets connections.
     *
     * @return the connections
     */
    public int getConnections() {
        return connections;
    }

    /**
     * Sets relayfee.
     *
     * @param relayfee the relayfee
     */
    public void setRelayfee(double relayfee) {
        this.relayfee = relayfee;
    }

    /**
     * Gets relayfee.
     *
     * @return the relayfee
     */
    public double getRelayfee() {
        return relayfee;
    }

    /**
     * Sets incrementalfee.
     *
     * @param incrementalfee the incrementalfee
     */
    public void setIncrementalfee(double incrementalfee) {
        this.incrementalfee = incrementalfee;
    }

    /**
     * Gets incrementalfee.
     *
     * @return the incrementalfee
     */
    public double getIncrementalfee() {
        return incrementalfee;
    }

    /**
     * Get networks network [ ].
     *
     * @return the network [ ]
     */
    public Network[] getNetworks() {
        return networks;
    }

    /**
     * Sets networks.
     *
     * @param networks the networks
     */
    public void setNetworks(Network[] networks) {
        this.networks = networks;
    }

    /**
     * Get localaddresses string [ ].
     *
     * @return the string [ ]
     */
    public String[] getLocaladdresses() {
        return localaddresses;
    }

    /**
     * Sets localaddresses.
     *
     * @param localaddresses the localaddresses
     */
    public void setLocaladdresses(String[] localaddresses) {
        this.localaddresses = localaddresses;
    }

    /**
     * Sets warnings.
     *
     * @param warnings the warnings
     */
    public void setWarnings(String warnings) {
        this.warnings = warnings;
    }

    /**
     * Gets warnings.
     *
     * @return the warnings
     */
    public String getWarnings() {
        return warnings;
    }

}