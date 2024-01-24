package ru.zoommax.bitcoin.bitcore25.model.network.addednode;

import lombok.Getter;
import lombok.Setter;
import ru.zoommax.bitcoin.JsonRpcResult;

@Getter
@Setter
public class AddedNodeInfo {

	public static class Result extends JsonRpcResult<AddedNodeInfo[]> {
	}
	// is it correct ?
	// https://bitcoincore.org/en/doc/25.0.0/rpc/network/getaddednodeinfo/
	private String addednode;
	private boolean connected;
	private Address[] addresses;
}
