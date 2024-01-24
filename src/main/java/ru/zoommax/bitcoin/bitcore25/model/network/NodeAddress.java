package ru.zoommax.bitcoin.bitcore25.model.network;

import lombok.Getter;
import lombok.Setter;
import ru.zoommax.bitcoin.JsonRpcResult;

@Getter
@Setter
public class NodeAddress {

	public static class Result extends JsonRpcResult<NodeAddress[]> {
	}

	private long time;
	private long services;
	private String address;
	private int port;
	private String network;

}
