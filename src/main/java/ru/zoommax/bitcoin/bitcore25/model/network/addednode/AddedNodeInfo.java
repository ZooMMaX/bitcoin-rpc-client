package ru.zoommax.bitcoin.bitcore25.model.network.addednode;

import lombok.Getter;
import lombok.Setter;
import ru.zoommax.bitcoin.JsonRpcResult;

/**
 * The type Added node info.
 */
@Getter
@Setter
public class AddedNodeInfo {

    /**
     * The type Result.
     */
    public static class Result extends JsonRpcResult<AddedNodeInfo[]> {
	}

    /**
     * The Addednode.
     */
// is it correct ?
	// https://bitcoincore.org/en/doc/25.0.0/rpc/network/getaddednodeinfo/
	private String addednode;
    /**
     * The Connected.
     */
    private boolean connected;
    /**
     * The Addresses.
     */
    private Address[] addresses;
}
