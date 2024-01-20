package ru.zoommax.bitcoin.old.model;

import ru.zoommax.bitcoin.JsonRpcResult;

/**
 * The type Transaction out.
 */
public class TransactionOut {
    /**
     * The type Result.
     */
    public static class Result extends JsonRpcResult<TransactionOut> {
    }

    /**
     * The Bestblock.
     */
    private String bestblock;
    /**
     * The Confirmations.
     */
    private int confirmations;
    /**
     * The Value.
     */
    private double value;
    /**
     * The Script pub key.
     */
    private ScriptPubKey scriptPubKey;
    /**
     * The Coinbase.
     */
    private boolean coinbase;

    /**
     * Sets bestblock.
     *
     * @param bestblock the bestblock
     */
    public void setBestblock(String bestblock) {
        this.bestblock = bestblock;
    }

    /**
     * Gets bestblock.
     *
     * @return the bestblock
     */
    public String getBestblock() {
        return bestblock;
    }

    /**
     * Sets confirmations.
     *
     * @param confirmations the confirmations
     */
    public void setConfirmations(int confirmations) {
        this.confirmations = confirmations;
    }

    /**
     * Gets confirmations.
     *
     * @return the confirmations
     */
    public int getConfirmations() {
        return confirmations;
    }

    /**
     * Sets value.
     *
     * @param value the value
     */
    public void setValue(double value) {
        this.value = value;
    }

    /**
     * Gets value.
     *
     * @return the value
     */
    public double getValue() {
        return value;
    }

    /**
     * Sets script pub key.
     *
     * @param scriptPubKey the script pub key
     */
    public void setScriptPubKey(ScriptPubKey scriptPubKey) {
        this.scriptPubKey = scriptPubKey;
    }

    /**
     * Gets script pub key.
     *
     * @return the script pub key
     */
    public ScriptPubKey getScriptPubKey() {
        return scriptPubKey;
    }

    /**
     * Sets coinbase.
     *
     * @param coinbase the coinbase
     */
    public void setCoinbase(boolean coinbase) {
        this.coinbase = coinbase;
    }

    /**
     * Gets coinbase.
     *
     * @return the coinbase
     */
    public boolean getCoinbase() {
        return coinbase;
    }

}