package ru.zoommax.bitcoin.model;

import ru.zoommax.bitcoin.JsonRpcResult;

public class TransactionOut {
    public static class Result extends JsonRpcResult<TransactionOut> {
    }

    private String bestblock;
    private int confirmations;
    private double value;
    private ScriptPubKey scriptPubKey;
    private boolean coinbase;

    public void setBestblock(String bestblock) {
        this.bestblock = bestblock;
    }

    public String getBestblock() {
        return bestblock;
    }

    public void setConfirmations(int confirmations) {
        this.confirmations = confirmations;
    }

    public int getConfirmations() {
        return confirmations;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public double getValue() {
        return value;
    }

    public void setScriptPubKey(ScriptPubKey scriptPubKey) {
        this.scriptPubKey = scriptPubKey;
    }

    public ScriptPubKey getScriptPubKey() {
        return scriptPubKey;
    }

    public void setCoinbase(boolean coinbase) {
        this.coinbase = coinbase;
    }

    public boolean getCoinbase() {
        return coinbase;
    }

}