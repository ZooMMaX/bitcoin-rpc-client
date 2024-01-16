package ru.zoommax.bitcoin.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import ru.zoommax.bitcoin.JsonRpcResult;

public class NetworkInfo {

    public static class Result extends JsonRpcResult<NetworkInfo> {
    }

    private long version;
    private String subversion;
    private long protocolversion;
    private String localservices;
    private boolean localrelay;
    private int timeoffset;
    private boolean networkactive;
    private int connections;
    private Network[] networks;
    private double relayfee;
    private double incrementalfee;
    private String[] localaddresses;
    private String warnings;
    private String[] localservicesnames;
    @JsonProperty("connections_in")
    private int connectionsIn;
    @JsonProperty("connections_out")
    private int connectionsOut;

    public int getConnectionsOut() {
        return connectionsOut;
    }

    public void setConnectionsOut(int connectionsOut) {
        this.connectionsOut = connectionsOut;
    }

    public int getConnectionsIn() {
        return connectionsIn;
    }

    public void setConnectionsIn(int connectionsIn) {
        this.connectionsIn = connectionsIn;
    }

    public String[] getLocalservicesnames() {
        return localservicesnames;
    }

    public void setLocalservicesnames(String[] localservicesnames) {
        this.localservicesnames = localservicesnames;
    }

    public void setVersion(long version) {
        this.version = version;
    }

    public long getVersion() {
        return version;
    }

    public void setSubversion(String subversion) {
        this.subversion = subversion;
    }

    public String getSubversion() {
        return subversion;
    }

    public void setProtocolversion(long protocolversion) {
        this.protocolversion = protocolversion;
    }

    public long getProtocolversion() {
        return protocolversion;
    }

    public void setLocalservices(String localservices) {
        this.localservices = localservices;
    }

    public String getLocalservices() {
        return localservices;
    }

    public void setLocalrelay(boolean localrelay) {
        this.localrelay = localrelay;
    }

    public boolean getLocalrelay() {
        return localrelay;
    }

    public void setTimeoffset(int timeoffset) {
        this.timeoffset = timeoffset;
    }

    public int getTimeoffset() {
        return timeoffset;
    }

    public void setNetworkactive(boolean networkactive) {
        this.networkactive = networkactive;
    }

    public boolean getNetworkactive() {
        return networkactive;
    }

    public void setConnections(int connections) {
        this.connections = connections;
    }

    public int getConnections() {
        return connections;
    }

    public void setRelayfee(double relayfee) {
        this.relayfee = relayfee;
    }

    public double getRelayfee() {
        return relayfee;
    }

    public void setIncrementalfee(double incrementalfee) {
        this.incrementalfee = incrementalfee;
    }

    public double getIncrementalfee() {
        return incrementalfee;
    }

    public Network[] getNetworks() {
        return networks;
    }

    public void setNetworks(Network[] networks) {
        this.networks = networks;
    }

    public String[] getLocaladdresses() {
        return localaddresses;
    }

    public void setLocaladdresses(String[] localaddresses) {
        this.localaddresses = localaddresses;
    }

    public void setWarnings(String warnings) {
        this.warnings = warnings;
    }

    public String getWarnings() {
        return warnings;
    }

}