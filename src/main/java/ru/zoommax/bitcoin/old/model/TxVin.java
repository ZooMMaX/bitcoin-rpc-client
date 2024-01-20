package ru.zoommax.bitcoin.old.model;

/**
 * The type Tx vin.
 */
public class TxVin {

    /**
     * The Sequence.
     */
    private long sequence;
    /**
     * The Txinwitness.
     */
    String[] txinwitness; // comment , option

    /**
     * The Coinbase.
     */
// 币基
    private String coinbase;

    /**
     * The Txid.
     */
// 非币基交易
    private String txid;
    /**
     * The Vout.
     */
    private int vout;
    /**
     * The Script sig.
     */
    private ScriptSig scriptSig;

    /**
     * Sets txid.
     *
     * @param txid the txid
     */
    public void setTxid(String txid) {
        this.txid = txid;
    }

    /**
     * Gets txid.
     *
     * @return the txid
     */
    public String getTxid() {
        return txid;
    }

    /**
     * Sets vout.
     *
     * @param vout the vout
     */
    public void setVout(int vout) {
        this.vout = vout;
    }

    /**
     * Gets vout.
     *
     * @return the vout
     */
    public int getVout() {
        return vout;
    }

    /**
     * Gets script sig.
     *
     * @return the script sig
     */
    public ScriptSig getScriptSig() {
        return scriptSig;
    }

    /**
     * Sets script sig.
     *
     * @param scriptSig the script sig
     */
    public void setScriptSig(ScriptSig scriptSig) {
        this.scriptSig = scriptSig;
    }

    /**
     * Gets sequence.
     *
     * @return the sequence
     */
    public long getSequence() {
        return sequence;
    }

    /**
     * Sets sequence.
     *
     * @param sequence the sequence
     */
    public void setSequence(long sequence) {
        this.sequence = sequence;
    }

    /**
     * Gets coinbase.
     *
     * @return the coinbase
     */
    public String getCoinbase() {
        return coinbase;
    }

    /**
     * Sets coinbase.
     *
     * @param coinbase the coinbase
     */
    public void setCoinbase(String coinbase) {
        this.coinbase = coinbase;
    }

    /**
     * Get txinwitness string [ ].
     *
     * @return the string [ ]
     */
    public String[] getTxinwitness() {
        return txinwitness;
    }

    /**
     * Sets txinwitness.
     *
     * @param txinwitness the txinwitness
     */
    public void setTxinwitness(String[] txinwitness) {
        this.txinwitness = txinwitness;
    }
}