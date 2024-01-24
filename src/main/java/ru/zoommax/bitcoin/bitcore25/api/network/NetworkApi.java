package ru.zoommax.bitcoin.bitcore25.api.network;

import ru.zoommax.bitcoin.JsonRpc20;
import ru.zoommax.bitcoin.JsonRpcClient;
import ru.zoommax.bitcoin.annotation.ErrorBody;
import ru.zoommax.bitcoin.bitcore25.model.network.ListBanned;
import ru.zoommax.bitcoin.bitcore25.model.network.NodeAddress;
import ru.zoommax.bitcoin.bitcore25.model.network.PeerInfo;
import ru.zoommax.bitcoin.bitcore25.model.network.addednode.AddedNodeInfo;
import ru.zoommax.bitcoin.bitcore25.model.network.nettotals.NetTraffic;
import ru.zoommax.bitcoin.bitcore25.model.network.networkinfo.NetworkInfo;
import ru.zoommax.bitcoin.bitcore25.model.useany.LongValue;

@ErrorBody
public class NetworkApi extends JsonRpcClient {

	public NetworkApi(String username, String password, String url) {
		super(username, password, url);
	}

	public void addNode(String node, String command) {
		this.post(new JsonRpc20.Builder().setMethod("addnode").appendParams(node).appendParams(command).getJson(), null);
	}

	public void clearBanned() {
		this.post(new JsonRpc20.Builder().setMethod("clearbanned").getJson(), null);
	}

	public void disconnectNode() {
		this.post(new JsonRpc20.Builder().setMethod("disconnectnode").getJson(), null);
	}

	public void disconnectNode(String address) {
		this.post(new JsonRpc20.Builder().setMethod("disconnectnode").appendParams(address).getJson(), null);
	}

	public void disconnectNode(String address, long nodeid) {
		this.post(new JsonRpc20.Builder().setMethod("disconnectnode").appendParams(address).appendParams(nodeid).getJson(), null);
	}

	public AddedNodeInfo[] getAddedNodeInfo() {
		return this.post(new JsonRpc20.Builder().setMethod("getaddednodeinfo").getJson(), AddedNodeInfo.Result.class);
	}

	public AddedNodeInfo[] getAddedNodeInfo(String node) {
		return this.post(new JsonRpc20.Builder().setMethod("getaddednodeinfo").appendParams(node).getJson(), AddedNodeInfo.Result.class);
	}

	public Long getConnectionCount() {
		return this.post(new JsonRpc20.Builder().setMethod("getconnectioncount").getJson(), LongValue.class);
	}

	public NetTraffic getNetTotals() {
		return this.post(new JsonRpc20.Builder().setMethod("getnettotals").getJson(), NetTraffic.Result.class);
	}

	public NetworkInfo getNetworkInfo() {
		return this.post(new JsonRpc20.Builder().setMethod("getnetworkinfo").getJson(), NetworkInfo.Result.class);
	}

	public NodeAddress[] getNodeAddresses() {
		return this.post(new JsonRpc20.Builder().setMethod("getnodeaddresses").getJson(), NodeAddress.Result.class);
	}

	public NodeAddress[] getNodeAddresses(long count) {
		return this.post(new JsonRpc20.Builder().setMethod("getnodeaddresses").appendParams(count).getJson(), NodeAddress.Result.class);
	}

	public NodeAddress[] getNodeAddresses(long count, String network) {
		return this.post(new JsonRpc20.Builder().setMethod("getnodeaddresses").appendParams(count).appendParams(network).getJson(), NodeAddress.Result.class);
	}

	public PeerInfo[] getPeerInfo() {
		return this.post(new JsonRpc20.Builder().setMethod("getpeerinfo").getJson(), PeerInfo.Result.class);
	}

	public ListBanned[] listBanned() {
		return this.post(new JsonRpc20.Builder().setMethod("listbanned").getJson(), ListBanned.Result.class);
	}

	public void ping() {
		this.post(new JsonRpc20.Builder().setMethod("ping").getJson(), null);
	}

	public void setBan(String subnet, String command) {
		this.post(new JsonRpc20.Builder().setMethod("setban").appendParams(subnet).appendParams(command).getJson(), null);
	}

	public void setBan(String subnet, String command, long bantime, boolean absolute) {
		this.post(new JsonRpc20.Builder().setMethod("setban").appendParams(subnet).appendParams(command).appendParams(bantime).appendParams(absolute).getJson(), null);
	}

	public void setNetworkActive(boolean state) {
		this.post(new JsonRpc20.Builder().setMethod("setnetworkactive").appendParams(state).getJson(), null);
	}


}
