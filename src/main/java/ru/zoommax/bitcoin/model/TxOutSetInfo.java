package ru.zoommax.bitcoin.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import ru.zoommax.bitcoin.JsonRpcResult;

public class TxOutSetInfo {
    public static class Result extends JsonRpcResult<TxOutSetInfo> {
    }

    private long height;
    private String bestblock;
    private long transactions;
    private long txouts;
    @JsonProperty("bytes_serialized")
    private long bytesSerialized;
    @JsonProperty("hash_serialized")
    private String hashSerialized;
    @JsonProperty("total_amount")
    private double totalAmount;

    public void setHeight(long height) {
        this.height = height;
    }

    public long getHeight() {
        return height;
    }

    public void setBestblock(String bestblock) {
        this.bestblock = bestblock;
    }

    public String getBestblock() {
        return bestblock;
    }

    public void setTransactions(long transactions) {
        this.transactions = transactions;
    }

    public long getTransactions() {
        return transactions;
    }

    public void setTxouts(long txouts) {
        this.txouts = txouts;
    }

    public long getTxouts() {
        return txouts;
    }

    public long getBytesSerialized() {
        return bytesSerialized;
    }

    public void setBytesSerialized(long bytesSerialized) {
        this.bytesSerialized = bytesSerialized;
    }

    public String getHashSerialized() {
        return hashSerialized;
    }

    public void setHashSerialized(String hashSerialized) {
        this.hashSerialized = hashSerialized;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }
}