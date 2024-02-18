package ru.zoommax.bitcoin.bitcore25.model.zmq;

import lombok.Getter;
import lombok.Setter;
import ru.zoommax.bitcoin.JsonRpcResult;

/**
 * The type Zmq notifications.
 */
@Getter
@Setter
public class ZMQNotifications {

	/**
	 * The type Result.
	 */
	public static class Result extends JsonRpcResult<ZMQNotifications[]> {
	}

	/**
	 * The Type.
	 */
	private String type;
	/**
	 * The Address.
	 */
	private String address;
	/**
	 * The Hwm.
	 */
	private long hwm;

}
