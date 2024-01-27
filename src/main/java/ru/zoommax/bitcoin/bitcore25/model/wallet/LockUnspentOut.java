package ru.zoommax.bitcoin.bitcore25.model.wallet;

import lombok.Getter;
import lombok.Setter;
import ru.zoommax.bitcoin.JsonRpcResult;

@Getter
@Setter
public class LockUnspentOut {

	public static class Result extends JsonRpcResult<LockUnspentOut[]> {
	}

	private String txid;
	private long vout;

}
