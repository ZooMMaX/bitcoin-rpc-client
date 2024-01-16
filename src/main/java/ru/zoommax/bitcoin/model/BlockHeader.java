package ru.zoommax.bitcoin.model;


import com.fasterxml.jackson.annotation.JsonProperty;
import ru.zoommax.bitcoin.JsonRpcResult;

/**
 * The type Block header.
 */
public class BlockHeader {

    /**
     * The type Result.
     */
    public static class Result extends JsonRpcResult<BlockHeader> {
    }

    /**
     * The Hash.
     */
    private String hash;
    /**
     * The Confirmations.
     */
    private int confirmations;
    /**
     * The Height.
     */
    private long height;
    /**
     * The Version.
     */
    private long version;
    /**
     * The Version hex.
     */
    private String versionHex;
    /**
     * The Merkleroot.
     */
    private String merkleroot;
    /**
     * The Time.
     */
    private long time;
    /**
     * The Mediantime.
     */
    private long mediantime;
    /**
     * The Nonce.
     */
    private long nonce;
    /**
     * The Bits.
     */
    private String bits;
    /**
     * The Difficulty.
     */
    private double difficulty;
    /**
     * The Chainwork.
     */
    private String chainwork;
    /**
     * The N tx.
     */
    @JsonProperty("nTx")
    private int nTx;
    /**
     * The Previousblockhash.
     */
    private String previousblockhash;
    /**
     * The Nextblockhash.
     */
    private String nextblockhash;

    /**
     * Sets hash.
     *
     * @param hash the hash
     */
    public void setHash(String hash) {
        this.hash = hash;
    }

    /**
     * Gets hash.
     *
     * @return the hash
     */
    public String getHash() {
        return hash;
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
     * Sets version.
     *
     * @param version the version
     */
    public void setVersion(long version) {
        this.version = version;
    }

    /**
     * Gets version.
     *
     * @return the version
     */
    public long getVersion() {
        return version;
    }

    /**
     * Sets version hex.
     *
     * @param versionHex the version hex
     */
    public void setVersionHex(String versionHex) {
        this.versionHex = versionHex;
    }

    /**
     * Gets version hex.
     *
     * @return the version hex
     */
    public String getVersionHex() {
        return versionHex;
    }

    /**
     * Sets merkleroot.
     *
     * @param merkleroot the merkleroot
     */
    public void setMerkleroot(String merkleroot) {
        this.merkleroot = merkleroot;
    }

    /**
     * Gets merkleroot.
     *
     * @return the merkleroot
     */
    public String getMerkleroot() {
        return merkleroot;
    }

    /**
     * Sets time.
     *
     * @param time the time
     */
    public void setTime(long time) {
        this.time = time;
    }

    /**
     * Gets time.
     *
     * @return the time
     */
    public long getTime() {
        return time;
    }

    /**
     * Sets mediantime.
     *
     * @param mediantime the mediantime
     */
    public void setMediantime(long mediantime) {
        this.mediantime = mediantime;
    }

    /**
     * Gets mediantime.
     *
     * @return the mediantime
     */
    public long getMediantime() {
        return mediantime;
    }

    /**
     * Sets nonce.
     *
     * @param nonce the nonce
     */
    public void setNonce(long nonce) {
        this.nonce = nonce;
    }

    /**
     * Gets nonce.
     *
     * @return the nonce
     */
    public long getNonce() {
        return nonce;
    }

    /**
     * Sets bits.
     *
     * @param bits the bits
     */
    public void setBits(String bits) {
        this.bits = bits;
    }

    /**
     * Gets bits.
     *
     * @return the bits
     */
    public String getBits() {
        return bits;
    }

    /**
     * Sets difficulty.
     *
     * @param difficulty the difficulty
     */
    public void setDifficulty(double difficulty) {
        this.difficulty = difficulty;
    }

    /**
     * Gets difficulty.
     *
     * @return the difficulty
     */
    public double getDifficulty() {
        return difficulty;
    }

    /**
     * Sets chainwork.
     *
     * @param chainwork the chainwork
     */
    public void setChainwork(String chainwork) {
        this.chainwork = chainwork;
    }

    /**
     * Gets chainwork.
     *
     * @return the chainwork
     */
    public String getChainwork() {
        return chainwork;
    }

    /**
     * Sets n tx.
     *
     * @param nTx the n tx
     */
    public void setNTx(int nTx) {
        this.nTx = nTx;
    }

    /**
     * Gets n tx.
     *
     * @return the n tx
     */
    public int getNTx() {
        return nTx;
    }

    /**
     * Sets previousblockhash.
     *
     * @param previousblockhash the previousblockhash
     */
    public void setPreviousblockhash(String previousblockhash) {
        this.previousblockhash = previousblockhash;
    }

    /**
     * Gets previousblockhash.
     *
     * @return the previousblockhash
     */
    public String getPreviousblockhash() {
        return previousblockhash;
    }

    /**
     * Sets nextblockhash.
     *
     * @param nextblockhash the nextblockhash
     */
    public void setNextblockhash(String nextblockhash) {
        this.nextblockhash = nextblockhash;
    }

    /**
     * Gets nextblockhash.
     *
     * @return the nextblockhash
     */
    public String getNextblockhash() {
        return nextblockhash;
    }

}