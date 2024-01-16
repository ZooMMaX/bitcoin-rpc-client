package ru.zoommax.bitcoin.model;

public class TransactionInput {
    private String txid;
    private int vout;
    //(numeric, optional, default=depends on the value of the 'replaceable' and 'locktime' arguments) The sequence number
    private Long sequence;

    public TransactionInput() {
    }

    public TransactionInput(String txid, int vout) {
        this.txid = txid;
        this.vout = vout;
    }

    public String getTxid() {
        return txid;
    }

    public void setTxid(String txid) {
        this.txid = txid;
    }

    public int getVout() {
        return vout;
    }

    public void setVout(int vout) {
        this.vout = vout;
    }

    public Long getSequence() {
        return sequence;
    }

    public void setSequence(Long sequence) {
        this.sequence = sequence;
    }
}
