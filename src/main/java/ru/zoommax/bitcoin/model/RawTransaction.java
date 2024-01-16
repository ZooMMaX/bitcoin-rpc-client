package ru.zoommax.bitcoin.model;

import ru.zoommax.bitcoin.JsonRpcResult;

public class RawTransaction {
    public static class Result extends JsonRpcResult<RawTransaction> {
    }

    private String txid;
    private String hash;
    private int version;
    private int size;
    private int vsize;
    private int weight;
    private int locktime;
    private TxVin[] vin;
    private TxVout[] vout;
    private String hex;
    private String blockhash;
    private int confirmations;
    private int time;
    private int blocktime;

    public void setTxid(String txid) {
        this.txid = txid;
    }

    public String getTxid() {
        return txid;
    }

    public void setHash(String hash) {
        this.hash = hash;
    }

    public String getHash() {
        return hash;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    public int getVersion() {
        return version;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    public void setVsize(int vsize) {
        this.vsize = vsize;
    }

    public int getVsize() {
        return vsize;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    public void setLocktime(int locktime) {
        this.locktime = locktime;
    }

    public int getLocktime() {
        return locktime;
    }

    public TxVin[] getVin() {
        return vin;
    }

    public void setVin(TxVin[] vin) {
        this.vin = vin;
    }

    public TxVout[] getVout() {
        return vout;
    }

    public void setVout(TxVout[] vout) {
        this.vout = vout;
    }

    public String getHex() {
        return hex;
    }

    public void setHex(String hex) {
        this.hex = hex;
    }

    public String getBlockhash() {
        return blockhash;
    }

    public void setBlockhash(String blockhash) {
        this.blockhash = blockhash;
    }

    public int getConfirmations() {
        return confirmations;
    }

    public void setConfirmations(int confirmations) {
        this.confirmations = confirmations;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public int getBlocktime() {
        return blocktime;
    }

    public void setBlocktime(int blocktime) {
        this.blocktime = blocktime;
    }
}