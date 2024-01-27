package ru.zoommax.bitcoin.bitcore25.model.wallet;

import lombok.Getter;
import lombok.Setter;
import ru.zoommax.bitcoin.JsonRpcResult;

@Getter
@Setter
public class UnspentTransaction {

	public static class Result extends JsonRpcResult<UnspentTransaction> {
	}

	public static class ResultArray extends JsonRpcResult<UnspentTransaction[]> {
	}

	private String txid;
	private long vout;
	private String address;
	private String label;
	private String scriptPubKey;
	private double amount;
	private long confirmations;
	private long ancestorcount;
	private long ancestorsize;
	private double ancestorfees;
	private String redeemScript;
	private String witnessScript;
	private boolean spendable;
	private boolean solvable;
	private boolean reused;
	private String desc;
	private String[] parent_descs;
	private boolean safe;

}
