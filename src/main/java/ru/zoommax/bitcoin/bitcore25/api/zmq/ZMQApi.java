package ru.zoommax.bitcoin.bitcore25.api.zmq;

import ru.zoommax.bitcoin.JsonRpc20;
import ru.zoommax.bitcoin.JsonRpcClient;
import ru.zoommax.bitcoin.bitcore25.model.zmq.ZMQNotifications;

public class ZMQApi extends JsonRpcClient {

	public ZMQApi(String username, String password, String url) {
		super(username, password, url);
	}

	public ZMQNotifications[] getZMQNotifications() {
		return this.post(new JsonRpc20.Builder().setMethod("getzmqnotifications").getJson(), ZMQNotifications.Result.class);
	}

}
