package ru.zoommax.bitcoin.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import ru.zoommax.bitcoin.JsonRpcResult;

/**
 * The type Tx out set info.
 */
public class TxOutSetInfo {
    /**
     * The type Result.
     */
    public static class Result extends JsonRpcResult<TxOutSetInfo> {
    }

    /**
     * The Height.
     */
    private long height;
    /**
     * The Bestblock.
     */
    private String bestblock;
    /**
     * The Transactions.
     */
    private long transactions;
    /**
     * The Txouts.
     */
    private long txouts;
    /**
     * The Bytes serialized.
     */
    @JsonProperty("bytes_serialized")
    private long bytesSerialized;
    /**
     * The Hash serialized.
     */
    @JsonProperty("hash_serialized")
    private String hashSerialized;
    /**
     * The Total amount.
     */
    @JsonProperty("total_amount")
    private double totalAmount;

    /**
     * Sets height.
     *
     * @param height the height
     */
    public void setHeight(long height) {
        this.height = height;
    }

    /**
     * Gets height.
     *
     * @return the height
     */
    public long getHeight() {
        return height;
    }

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
     * Sets transactions.
     *
     * @param transactions the transactions
     */
    public void setTransactions(long transactions) {
        this.transactions = transactions;
    }

    /**
     * Gets transactions.
     *
     * @return the transactions
     */
    public long getTransactions() {
        return transactions;
    }

    /**
     * Sets txouts.
     *
     * @param txouts the txouts
     */
    public void setTxouts(long txouts) {
        this.txouts = txouts;
    }

    /**
     * Gets txouts.
     *
     * @return the txouts
     */
    public long getTxouts() {
        return txouts;
    }

    /**
     * Gets bytes serialized.
     *
     * @return the bytes serialized
     */
    public long getBytesSerialized() {
        return bytesSerialized;
    }

    /**
     * Sets bytes serialized.
     *
     * @param bytesSerialized the bytes serialized
     */
    public void setBytesSerialized(long bytesSerialized) {
        this.bytesSerialized = bytesSerialized;
    }

    /**
     * Gets hash serialized.
     *
     * @return the hash serialized
     */
    public String getHashSerialized() {
        return hashSerialized;
    }

    /**
     * Sets hash serialized.
     *
     * @param hashSerialized the hash serialized
     */
    public void setHashSerialized(String hashSerialized) {
        this.hashSerialized = hashSerialized;
    }

    /**
     * Gets total amount.
     *
     * @return the total amount
     */
    public double getTotalAmount() {
        return totalAmount;
    }

    /**
     * Sets total amount.
     *
     * @param totalAmount the total amount
     */
    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }
}