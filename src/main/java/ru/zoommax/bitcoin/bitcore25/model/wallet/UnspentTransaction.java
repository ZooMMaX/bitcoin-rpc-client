package ru.zoommax.bitcoin.bitcore25.model.wallet;

import lombok.Getter;
import lombok.Setter;
import ru.zoommax.bitcoin.JsonRpcResult;

/**
 * The type Unspent transaction.
 */
@Getter
@Setter
public class UnspentTransaction {

    /**
     * The type Result.
     */
    public static class Result extends JsonRpcResult<UnspentTransaction> {
	}

    /**
     * The type Result array.
     */
    public static class ResultArray extends JsonRpcResult<UnspentTransaction[]> {
	}

    /**
     * The Txid.
     */
    private String txid;
    /**
     * The Vout.
     */
    private long vout;
    /**
     * The Address.
     */
    private String address;
    /**
     * The Label.
     */
    private String label;
    /**
     * The Script pub key.
     */
    private String scriptPubKey;
    /**
     * The Amount.
     */
    private double amount;
    /**
     * The Confirmations.
     */
    private long confirmations;
    /**
     * The Ancestorcount.
     */
    private long ancestorcount;
    /**
     * The Ancestorsize.
     */
    private long ancestorsize;
    /**
     * The Ancestorfees.
     */
    private double ancestorfees;
    /**
     * The Redeem script.
     */
    private String redeemScript;
    /**
     * The Witness script.
     */
    private String witnessScript;
    /**
     * The Spendable.
     */
    private boolean spendable;
    /**
     * The Solvable.
     */
    private boolean solvable;
    /**
     * The Reused.
     */
    private boolean reused;
    /**
     * The Desc.
     */
    private String desc;
    /**
     * The Parent descs.
     */
    private String[] parent_descs;
    /**
     * The Safe.
     */
    private boolean safe;

}
