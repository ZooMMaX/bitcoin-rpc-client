package ru.zoommax.bitcoin.bitcore25.model.wallet.gettransaction;

import lombok.Getter;
import lombok.Setter;
import ru.zoommax.bitcoin.JsonRpcResult;
import ru.zoommax.bitcoin.bitcore25.model.useany.decoderawtransaction.DecodedRawTransaction;

@Getter
@Setter
public class WTransaction {

	public static class Result extends JsonRpcResult<WTransaction> {
	}

	private double amount;
	private double fee;
	private long confirmations;
	private boolean generated;
	private boolean trusted;
	private String blockhash;
	private long blockheight;
	private long blockindex;
	private long blocktime;
	private String txid;
	private String wtxid;
	private String[] walletconflicts;
	private String replaced_by_txid;
	private String replaces_txid;
	private String to;
	private long time;
	private long timereceived;
	private String comment;
	private String bip125_replaceable;
	private String[] parent_descs;
	private Details[] details;
	private String hex;
	private DecodedRawTransaction decoded;

}
