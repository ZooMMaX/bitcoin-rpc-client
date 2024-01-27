package ru.zoommax.bitcoin.bitcore25.model.zmq;

import lombok.Getter;
import lombok.Setter;
import ru.zoommax.bitcoin.JsonRpcResult;

@Getter
@Setter
public class ZMQNotifications {

	public static class Result extends JsonRpcResult<ZMQNotifications[]> {
	}

	private String type;
	private String address;
	private long hwm;

}
