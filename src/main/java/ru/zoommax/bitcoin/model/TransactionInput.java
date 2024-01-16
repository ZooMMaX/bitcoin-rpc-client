package ru.zoommax.bitcoin.model;

/**
 * The type Transaction input.
 */
public class TransactionInput {
    /**
     * The Txid.
     */
    private String txid;
    /**
     * The Vout.
     */
    private int vout;
    /**
     * The Sequence.
     */
//(numeric, optional, default=depends on the value of the 'replaceable' and 'locktime' arguments) The sequence number
    private Long sequence;

    /**
     * Instantiates a new Transaction input.
     */
    public TransactionInput() {
    }

    /**
     * Instantiates a new Transaction input.
     *
     * @param txid the txid
     * @param vout the vout
     */
    public TransactionInput(String txid, int vout) {
        this.txid = txid;
        this.vout = vout;
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
     * Sets txid.
     *
     * @param txid the txid
     */
    public void setTxid(String txid) {
        this.txid = txid;
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
     * Sets vout.
     *
     * @param vout the vout
     */
    public void setVout(int vout) {
        this.vout = vout;
    }

    /**
     * Gets sequence.
     *
     * @return the sequence
     */
    public Long getSequence() {
        return sequence;
    }

    /**
     * Sets sequence.
     *
     * @param sequence the sequence
     */
    public void setSequence(Long sequence) {
        this.sequence = sequence;
    }
}
