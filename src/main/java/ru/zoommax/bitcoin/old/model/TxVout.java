package ru.zoommax.bitcoin.old.model;

/**
 * The type Tx vout.
 */
public class TxVout {

    /**
     * The Value.
     */
    private double value;
    /**
     * The N.
     */
    private int n;
    /**
     * The Script pub key.
     */
    private ScriptPubKey scriptPubKey;

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
     * Sets n.
     *
     * @param n the n
     */
    public void setN(int n) {
        this.n = n;
    }

    /**
     * Gets n.
     *
     * @return the n
     */
    public int getN() {
        return n;
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
     * Sets script pub key.
     *
     * @param scriptPubKey the script pub key
     */
    public void setScriptPubKey(ScriptPubKey scriptPubKey) {
        this.scriptPubKey = scriptPubKey;
    }
}