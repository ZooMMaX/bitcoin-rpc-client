package ru.zoommax.bitcoin.bitcore25.api.zmq;

import ru.zoommax.bitcoin.JsonRpc20;
import ru.zoommax.bitcoin.JsonRpcClient;
import ru.zoommax.bitcoin.bitcore25.model.zmq.ZMQNotifications;

/**
 * The type Zmq api.
 */
public class ZMQApi extends JsonRpcClient {

    /**
     * Instantiates a new Zmq api.
     *
     * @param username the username
     * @param password the password
     * @param url      the url
     */
    public ZMQApi(String username, String password, String url) {
		super(username, password, url);
	}

    /**
     * Get zmq notifications zmq notifications [ ].
     *
     * @return the zmq notifications [ ]
     */
    public ZMQNotifications[] getZMQNotifications() {
		return this.post(new JsonRpc20.Builder().setMethod("getzmqnotifications").getJson(), ZMQNotifications.Result.class);
	}

}
