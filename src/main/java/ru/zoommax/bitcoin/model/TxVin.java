package ru.zoommax.bitcoin.model;

public class TxVin {

    private long sequence;
    String[] txinwitness; // comment , option

    // 币基
    private String coinbase;

    // 非币基交易
    private String txid;
    private int vout;
    private ScriptSig scriptSig;

    public void setTxid(String txid) {
        this.txid = txid;
    }

    public String getTxid() {
        return txid;
    }

    public void setVout(int vout) {
        this.vout = vout;
    }

    public int getVout() {
        return vout;
    }

    public ScriptSig getScriptSig() {
        return scriptSig;
    }

    public void setScriptSig(ScriptSig scriptSig) {
        this.scriptSig = scriptSig;
    }

    public long getSequence() {
        return sequence;
    }

    public void setSequence(long sequence) {
        this.sequence = sequence;
    }

    public String getCoinbase() {
        return coinbase;
    }

    public void setCoinbase(String coinbase) {
        this.coinbase = coinbase;
    }

    public String[] getTxinwitness() {
        return txinwitness;
    }

    public void setTxinwitness(String[] txinwitness) {
        this.txinwitness = txinwitness;
    }
}