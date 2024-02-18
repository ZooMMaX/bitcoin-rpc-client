package ru.zoommax.bitcoin.bitcore25.model.wallet.gettransaction;

import lombok.Getter;
import lombok.Setter;
import ru.zoommax.bitcoin.JsonRpcResult;
import ru.zoommax.bitcoin.bitcore25.model.useany.decoderawtransaction.DecodedRawTransaction;

/**
 * The type W transaction.
 */
@Getter
@Setter
public class WTransaction {

    /**
     * The type Result.
     */
    public static class Result extends JsonRpcResult<WTransaction> {
	}

    /**
     * The type Result array.
     */
    public static class ResultArray extends JsonRpcResult<WTransaction[]> {
	}

    /**
     * The Amount.
     */
    private double amount;
    /**
     * The Fee.
     */
    private double fee;
    /**
     * The Confirmations.
     */
    private long confirmations;
    /**
     * The Generated.
     */
    private boolean generated;
    /**
     * The Trusted.
     */
    private boolean trusted;
    /**
     * The Blockhash.
     */
    private String blockhash;
    /**
     * The Blockheight.
     */
    private long blockheight;
    /**
     * The Blockindex.
     */
    private long blockindex;
    /**
     * The Blocktime.
     */
    private long blocktime;
    /**
     * The Txid.
     */
    private String txid;
    /**
     * The Wtxid.
     */
    private String wtxid;
    /**
     * The Walletconflicts.
     */
    private String[] walletconflicts;
    /**
     * The Replaced by txid.
     */
    private String replaced_by_txid;
    /**
     * The Replaces txid.
     */
    private String replaces_txid;
    /**
     * The To.
     */
    private String to;
    /**
     * The Time.
     */
    private long time;
    /**
     * The Timereceived.
     */
    private long timereceived;
    /**
     * The Comment.
     */
    private String comment;
    /**
     * The Bip 125 replaceable.
     */
    private String bip125_replaceable;
    /**
     * The Parent descs.
     */
    private String[] parent_descs;
    /**
     * The Details.
     */
    private Details[] details;
    /**
     * The Hex.
     */
    private String hex;
    /**
     * The Decoded.
     */
    private DecodedRawTransaction decoded;

}
