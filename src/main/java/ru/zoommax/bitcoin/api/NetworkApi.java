package ru.zoommax.bitcoin.api;

import ru.zoommax.bitcoin.JsonRpc20;
import ru.zoommax.bitcoin.JsonRpcClient;
import ru.zoommax.bitcoin.model.*;

public class NetworkApi extends JsonRpcClient {
    public NetworkApi(String username, String password, String url) {
        super(username, password, url);
    }

    public String addNode(String node, Options opt) {
        JsonRpc20 json = new JsonRpc20.Builder().setMethod("addnode").appendParams(node).appendParams(opt.name()).getJson();
        return this.post(json, StringValue.class);
    }

    public static enum Options {
        add, remove, onetry
    }

    public String clearBanned() {
        JsonRpc20 json = new JsonRpc20.Builder().setMethod("clearbanned").getJson();
        return this.post(json, StringValue.class);
    }

    public String disconnectNode(String node) {
        JsonRpc20 json = new JsonRpc20.Builder().setMethod("disconnectnode").appendParams(node).getJson();
        return this.post(json, StringValue.class);
    }

    public String disconnectNode(int nodeId) {
        JsonRpc20 json = new JsonRpc20.Builder().setMethod("disconnectnode").appendParams(nodeId).getJson();
        return this.post(json, StringValue.class);
    }

    public AddedNodesInfo[] getAddedNodeInfo(String node) {
        JsonRpc20 json = new JsonRpc20.Builder().setMethod("getaddednodeinfo").appendParams(node).getJson();
        return this.post(json, AddedNodesInfo.Result.class);
    }

    public AddedNodesInfo[] getAddedNodeInfo() {
        JsonRpc20 json = new JsonRpc20.Builder().setMethod("getaddednodeinfo").getJson();
        return this.post(json, AddedNodesInfo.Result.class);
    }

    public Long getConnectionCount() {
        JsonRpc20 json = new JsonRpc20.Builder().setMethod("getconnectioncount").getJson();
        return this.post(json, LongValue.class);
    }

    public NetInfo getNetTotals() {
        JsonRpc20 json = new JsonRpc20.Builder().setMethod("getnettotals").getJson();
        return this.post(json, NetInfo.Result.class);
    }

    public NetworkInfo getNetworkInfo() {
        JsonRpc20 json = new JsonRpc20.Builder().setMethod("getnetworkinfo").getJson();
        return this.post(json, NetworkInfo.Result.class);
    }

    public PeersInfo[] getPeerInfo() {
        JsonRpc20 json = new JsonRpc20.Builder().setMethod("getpeerinfo").getJson();
        return this.post(json, PeersInfo.Result.class);
    }

    public String[] listBanned() {
        JsonRpc20 json = new JsonRpc20.Builder().setMethod("listbanned").getJson();
        return this.post(json, ArrayValue.StringArray.class);
    }

    public void ping() {
        JsonRpc20 json = new JsonRpc20.Builder().setMethod("ping").getJson();
        this.post(json, StringValue.class);
    }

    public void setBan(String subnet, BanOptions opt) { //String bantime, String absolute) {
        JsonRpc20 json = new JsonRpc20.Builder().setMethod("setban").appendParams(opt.name()).getJson();
        this.post(json, StringValue.class);
    }

    public boolean setNetworkActive(boolean active) {
        JsonRpc20 json = new JsonRpc20.Builder().setMethod("setnetworkactive").appendParams(active).getJson();
        return this.post(json, BooleanValue.class).booleanValue();
    }


    public static enum BanOptions {
        add, remove
    }
}
