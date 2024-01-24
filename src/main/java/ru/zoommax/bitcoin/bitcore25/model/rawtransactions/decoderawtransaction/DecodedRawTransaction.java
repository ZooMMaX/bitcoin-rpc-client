package ru.zoommax.bitcoin.bitcore25.model.rawtransactions.decoderawtransaction;

import lombok.Getter;
import lombok.Setter;
import ru.zoommax.bitcoin.JsonRpcResult;

@Getter
@Setter
public class DecodedRawTransaction {

	public static class Result extends JsonRpcResult<DecodedRawTransaction> {
	}

	private String txid;
	private String hash;
	private long size;
	private long vsize;
	private long weight;
	private long version;
	private long locktime;
	private VirtualInput[] vin;
	private VirtualOutput[] vout;

}
