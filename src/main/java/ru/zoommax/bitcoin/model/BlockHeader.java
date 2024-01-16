package ru.zoommax.bitcoin.model;


import com.fasterxml.jackson.annotation.JsonProperty;
import ru.zoommax.bitcoin.JsonRpcResult;

public class BlockHeader {

    public static class Result extends JsonRpcResult<BlockHeader> {
    }

    private String hash;
    private int confirmations;
    private long height;
    private long version;
    private String versionHex;
    private String merkleroot;
    private long time;
    private long mediantime;
    private long nonce;
    private String bits;
    private double difficulty;
    private String chainwork;
    @JsonProperty("nTx")
    private int nTx;
    private String previousblockhash;
    private String nextblockhash;

    public void setHash(String hash) {
        this.hash = hash;
    }

    public String getHash() {
        return hash;
    }

    public void setConfirmations(int confirmations) {
        this.confirmations = confirmations;
    }

    public int getConfirmations() {
        return confirmations;
    }

    public void setHeight(long height) {
        this.height = height;
    }

    public long getHeight() {
        return height;
    }

    public void setVersion(long version) {
        this.version = version;
    }

    public long getVersion() {
        return version;
    }

    public void setVersionHex(String versionHex) {
        this.versionHex = versionHex;
    }

    public String getVersionHex() {
        return versionHex;
    }

    public void setMerkleroot(String merkleroot) {
        this.merkleroot = merkleroot;
    }

    public String getMerkleroot() {
        return merkleroot;
    }

    public void setTime(long time) {
        this.time = time;
    }

    public long getTime() {
        return time;
    }

    public void setMediantime(long mediantime) {
        this.mediantime = mediantime;
    }

    public long getMediantime() {
        return mediantime;
    }

    public void setNonce(long nonce) {
        this.nonce = nonce;
    }

    public long getNonce() {
        return nonce;
    }

    public void setBits(String bits) {
        this.bits = bits;
    }

    public String getBits() {
        return bits;
    }

    public void setDifficulty(double difficulty) {
        this.difficulty = difficulty;
    }

    public double getDifficulty() {
        return difficulty;
    }

    public void setChainwork(String chainwork) {
        this.chainwork = chainwork;
    }

    public String getChainwork() {
        return chainwork;
    }

    public void setNTx(int nTx) {
        this.nTx = nTx;
    }

    public int getNTx() {
        return nTx;
    }

    public void setPreviousblockhash(String previousblockhash) {
        this.previousblockhash = previousblockhash;
    }

    public String getPreviousblockhash() {
        return previousblockhash;
    }

    public void setNextblockhash(String nextblockhash) {
        this.nextblockhash = nextblockhash;
    }

    public String getNextblockhash() {
        return nextblockhash;
    }

}