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
import ru.zoommax.bitcoin.bitcore25.model.useany.NullValue;

/**
 * The type Network api.
 */
@ErrorBody
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
	 * Add node.
	 *
	 * @param node    the node
	 * @param command the command
	 */
	public void addNode(String node, String command) {
		this.post(new JsonRpc20.Builder().setMethod("addnode").appendParams(node).appendParams(command).getJson(), NullValue.class);
	}

	/**
	 * Clear banned.
	 */
	public void clearBanned() {
		this.post(new JsonRpc20.Builder().setMethod("clearbanned").getJson(), NullValue.class);
	}

	/**
	 * Disconnect node.
	 */
	public void disconnectNode() {
		this.post(new JsonRpc20.Builder().setMethod("disconnectnode").getJson(), NullValue.class);
	}

	/**
	 * Disconnect node.
	 *
	 * @param address the address
	 */
	public void disconnectNode(String address) {
		this.post(new JsonRpc20.Builder().setMethod("disconnectnode").appendParams(address).getJson(), NullValue.class);
	}

	/**
	 * Disconnect node.
	 *
	 * @param address the address
	 * @param nodeid  the nodeid
	 */
	public void disconnectNode(String address, long nodeid) {
		this.post(new JsonRpc20.Builder().setMethod("disconnectnode").appendParams(address).appendParams(nodeid).getJson(), NullValue.class);
	}

	/**
	 * Get added node info added node info [ ].
	 *
	 * @return the added node info [ ]
	 */
	public AddedNodeInfo[] getAddedNodeInfo() {
		return this.post(new JsonRpc20.Builder().setMethod("getaddednodeinfo").getJson(), AddedNodeInfo.Result.class);
	}

	/**
	 * Get added node info added node info [ ].
	 *
	 * @param node the node
	 * @return the added node info [ ]
	 */
	public AddedNodeInfo[] getAddedNodeInfo(String node) {
		return this.post(new JsonRpc20.Builder().setMethod("getaddednodeinfo").appendParams(node).getJson(), AddedNodeInfo.Result.class);
	}

	/**
	 * Gets connection count.
	 *
	 * @return the connection count
	 */
	public long getConnectionCount() {
		return this.post(new JsonRpc20.Builder().setMethod("getconnectioncount").getJson(), LongValue.class);
	}

	/**
	 * Gets net totals.
	 *
	 * @return the net totals
	 */
	public NetTraffic getNetTotals() {
		return this.post(new JsonRpc20.Builder().setMethod("getnettotals").getJson(), NetTraffic.Result.class);
	}

	/**
	 * Gets network info.
	 *
	 * @return the network info
	 */
	public NetworkInfo getNetworkInfo() {
		return this.post(new JsonRpc20.Builder().setMethod("getnetworkinfo").getJson(), NetworkInfo.Result.class);
	}

	/**
	 * Get node addresses node address [ ].
	 *
	 * @return the node address [ ]
	 */
	public NodeAddress[] getNodeAddresses() {
		return this.post(new JsonRpc20.Builder().setMethod("getnodeaddresses").getJson(), NodeAddress.Result.class);
	}

	/**
	 * Get node addresses node address [ ].
	 *
	 * @param count the count
	 * @return the node address [ ]
	 */
	public NodeAddress[] getNodeAddresses(long count) {
		return this.post(new JsonRpc20.Builder().setMethod("getnodeaddresses").appendParams(count).getJson(), NodeAddress.Result.class);
	}

	/**
	 * Get node addresses node address [ ].
	 *
	 * @param count   the count
	 * @param network the network
	 * @return the node address [ ]
	 */
	public NodeAddress[] getNodeAddresses(long count, String network) {
		return this.post(new JsonRpc20.Builder().setMethod("getnodeaddresses").appendParams(count).appendParams(network).getJson(), NodeAddress.Result.class);
	}

	/**
	 * Get peer info peer info [ ].
	 *
	 * @return the peer info [ ]
	 */
	public PeerInfo[] getPeerInfo() {
		return this.post(new JsonRpc20.Builder().setMethod("getpeerinfo").getJson(), PeerInfo.Result.class);
	}

	/**
	 * List banned list banned [ ].
	 *
	 * @return the list banned [ ]
	 */
	public ListBanned[] listBanned() {
		return this.post(new JsonRpc20.Builder().setMethod("listbanned").getJson(), ListBanned.Result.class);
	}

	/**
	 * Ping.
	 */
	public void ping() {
		this.post(new JsonRpc20.Builder().setMethod("ping").getJson(), NullValue.class);
	}

	/**
	 * Sets ban.
	 *
	 * @param subnet  the subnet
	 * @param command the command
	 */
	public void setBan(String subnet, String command) {
		this.post(new JsonRpc20.Builder().setMethod("setban").appendParams(subnet).appendParams(command).getJson(), NullValue.class);
	}

	/**
	 * Sets ban.
	 *
	 * @param subnet   the subnet
	 * @param command  the command
	 * @param bantime  the bantime
	 * @param absolute the absolute
	 */
	public void setBan(String subnet, String command, long bantime, boolean absolute) {
		this.post(new JsonRpc20.Builder().setMethod("setban").appendParams(subnet).appendParams(command).appendParams(bantime).appendParams(absolute).getJson(), NullValue.class);
	}

	/**
	 * Sets network active.
	 *
	 * @param state the state
	 */
	public void setNetworkActive(boolean state) {
		this.post(new JsonRpc20.Builder().setMethod("setnetworkactive").appendParams(state).getJson(), NullValue.class);
	}


}
