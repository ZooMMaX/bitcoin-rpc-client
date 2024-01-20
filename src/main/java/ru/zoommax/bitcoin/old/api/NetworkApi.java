package ru.zoommax.bitcoin.old.api;

import ru.zoommax.bitcoin.JsonRpc20;
import ru.zoommax.bitcoin.JsonRpcClient;
import ru.zoommax.bitcoin.bitcore25.model.ArrayValue;
import ru.zoommax.bitcoin.bitcore25.model.LongValue;
import ru.zoommax.bitcoin.bitcore25.model.StringValue;
import ru.zoommax.bitcoin.old.model.*;

/**
 * The type Network api.
 */
public class NetworkApi extends JsonRpcClient {
    /**
     * Instantiates a new Network api.
     *
     * @param username the username
     * @param password the password
     * @param url      the url
     */
    public NetworkApi(String username, String password, String url) {
        super(username, password, url);
    }

    /**
     * Add node string.
     *
     * @param node the node
     * @param opt  the opt
     * @return the string
     */
    public String addNode(String node, Options opt) {
        JsonRpc20 json = new JsonRpc20.Builder().setMethod("addnode").appendParams(node).appendParams(opt.name()).getJson();
        return this.post(json, StringValue.class);
    }

    /**
     * The enum Options.
     */
    public static enum Options {
        /**
         * Add options.
         */
        add,
        /**
         * Remove options.
         */
        remove,
        /**
         * Onetry options.
         */
        onetry
    }

    /**
     * Clear banned string.
     *
     * @return the string
     */
    public String clearBanned() {
        JsonRpc20 json = new JsonRpc20.Builder().setMethod("clearbanned").getJson();
        return this.post(json, StringValue.class);
    }

    /**
     * Disconnect node string.
     *
     * @param node the node
     * @return the string
     */
    public String disconnectNode(String node) {
        JsonRpc20 json = new JsonRpc20.Builder().setMethod("disconnectnode").appendParams(node).getJson();
        return this.post(json, StringValue.class);
    }

    /**
     * Disconnect node string.
     *
     * @param nodeId the node id
     * @return the string
     */
    public String disconnectNode(int nodeId) {
        JsonRpc20 json = new JsonRpc20.Builder().setMethod("disconnectnode").appendParams(nodeId).getJson();
        return this.post(json, StringValue.class);
    }

    /**
     * Get added node info added nodes info [ ].
     *
     * @param node the node
     * @return the added nodes info [ ]
     */
    public AddedNodesInfo[] getAddedNodeInfo(String node) {
        JsonRpc20 json = new JsonRpc20.Builder().setMethod("getaddednodeinfo").appendParams(node).getJson();
        return this.post(json, AddedNodesInfo.Result.class);
    }

    /**
     * Get added node info added nodes info [ ].
     *
     * @return the added nodes info [ ]
     */
    public AddedNodesInfo[] getAddedNodeInfo() {
        JsonRpc20 json = new JsonRpc20.Builder().setMethod("getaddednodeinfo").getJson();
        return this.post(json, AddedNodesInfo.Result.class);
    }

    /**
     * Gets connection count.
     *
     * @return the connection count
     */
    public Long getConnectionCount() {
        JsonRpc20 json = new JsonRpc20.Builder().setMethod("getconnectioncount").getJson();
        return this.post(json, LongValue.class);
    }

    /**
     * Gets net totals.
     *
     * @return the net totals
     */
    public NetInfo getNetTotals() {
        JsonRpc20 json = new JsonRpc20.Builder().setMethod("getnettotals").getJson();
        return this.post(json, NetInfo.Result.class);
    }

    /**
     * Gets network info.
     *
     * @return the network info
     */
    public NetworkInfo getNetworkInfo() {
        JsonRpc20 json = new JsonRpc20.Builder().setMethod("getnetworkinfo").getJson();
        return this.post(json, NetworkInfo.Result.class);
    }

    /**
     * Get peer info peers info [ ].
     *
     * @return the peers info [ ]
     */
    public PeersInfo[] getPeerInfo() {
        JsonRpc20 json = new JsonRpc20.Builder().setMethod("getpeerinfo").getJson();
        return this.post(json, PeersInfo.Result.class);
    }

    /**
     * List banned string [ ].
     *
     * @return the string [ ]
     */
    public String[] listBanned() {
        JsonRpc20 json = new JsonRpc20.Builder().setMethod("listbanned").getJson();
        return this.post(json, ArrayValue.StringArray.class);
    }

    /**
     * Ping.
     */
    public void ping() {
        JsonRpc20 json = new JsonRpc20.Builder().setMethod("ping").getJson();
        this.post(json, StringValue.class);
    }

    /**
     * Sets ban.
     *
     * @param subnet the subnet
     * @param opt    the opt
     */
    public void setBan(String subnet, BanOptions opt) { //String bantime, String absolute) {
        JsonRpc20 json = new JsonRpc20.Builder().setMethod("setban").appendParams(opt.name()).getJson();
        this.post(json, StringValue.class);
    }

    /**
     * Sets network active.
     *
     * @param active the active
     * @return the network active
     */
    public boolean setNetworkActive(boolean active) {
        JsonRpc20 json = new JsonRpc20.Builder().setMethod("setnetworkactive").appendParams(active).getJson();
        return this.post(json, BooleanValue.class).booleanValue();
    }


    /**
     * The enum Ban options.
     */
    public static enum BanOptions {
        /**
         * Add ban options.
         */
        add,
        /**
         * Remove ban options.
         */
        remove
    }
}
