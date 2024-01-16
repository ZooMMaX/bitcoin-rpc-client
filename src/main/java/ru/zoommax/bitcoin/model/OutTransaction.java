package ru.zoommax.bitcoin.model;

import ru.zoommax.bitcoin.JsonRpcResult;

/**
 * The type Out transaction.
 */
public class OutTransaction {
    /**
     * The type Result.
     */
    public static class Result extends JsonRpcResult<OutTransaction[]> {
    }

    /**
     * The Txid.
     */
    private String txid;
    /**
     * The Vout.
     */
    private int vout;

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
}