package ru.zoommax.bitcoin.old.model;

import ru.zoommax.bitcoin.JsonRpcResult;

/**
 * The type Block.
 */
public class Block {
    /**
     * The type Result.
     */
    public static class Result extends JsonRpcResult<Block> {
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
     * The Strippedsize.
     */
    private long strippedsize;
    /**
     * The Size.
     */
    private long size;
    /**
     * The Weight.
     */
    private long weight;
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
     * The Tx.
     */
    private String[] tx;
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
     * Gets hash.
     *
     * @return the hash
     */
    public String getHash() {
        return hash;
    }

    /**
     * Sets hash.
     *
     * @param hash the hash
     */
    public void setHash(String hash) {
        this.hash = hash;
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
     * Sets confirmations.
     *
     * @param confirmations the confirmations
     */
    public void setConfirmations(int confirmations) {
        this.confirmations = confirmations;
    }

    /**
     * Gets strippedsize.
     *
     * @return the strippedsize
     */
    public long getStrippedsize() {
        return strippedsize;
    }

    /**
     * Sets strippedsize.
     *
     * @param strippedsize the strippedsize
     */
    public void setStrippedsize(long strippedsize) {
        this.strippedsize = strippedsize;
    }

    /**
     * Gets size.
     *
     * @return the size
     */
    public long getSize() {
        return size;
    }

    /**
     * Sets size.
     *
     * @param size the size
     */
    public void setSize(long size) {
        this.size = size;
    }

    /**
     * Gets weight.
     *
     * @return the weight
     */
    public long getWeight() {
        return weight;
    }

    /**
     * Sets weight.
     *
     * @param weight the weight
     */
    public void setWeight(long weight) {
        this.weight = weight;
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
     * Sets height.
     *
     * @param height the height
     */
    public void setHeight(long height) {
        this.height = height;
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
     * Sets version.
     *
     * @param version the version
     */
    public void setVersion(long version) {
        this.version = version;
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
     * Sets version hex.
     *
     * @param versionHex the version hex
     */
    public void setVersionHex(String versionHex) {
        this.versionHex = versionHex;
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
     * Sets merkleroot.
     *
     * @param merkleroot the merkleroot
     */
    public void setMerkleroot(String merkleroot) {
        this.merkleroot = merkleroot;
    }

    /**
     * Get tx string [ ].
     *
     * @return the string [ ]
     */
    public String[] getTx() {
        return tx;
    }

    /**
     * Sets tx.
     *
     * @param tx the tx
     */
    public void setTx(String[] tx) {
        this.tx = tx;
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
     * Sets time.
     *
     * @param time the time
     */
    public void setTime(long time) {
        this.time = time;
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
     * Sets mediantime.
     *
     * @param mediantime the mediantime
     */
    public void setMediantime(long mediantime) {
        this.mediantime = mediantime;
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
     * Sets nonce.
     *
     * @param nonce the nonce
     */
    public void setNonce(long nonce) {
        this.nonce = nonce;
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
     * Sets bits.
     *
     * @param bits the bits
     */
    public void setBits(String bits) {
        this.bits = bits;
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
     * Sets difficulty.
     *
     * @param difficulty the difficulty
     */
    public void setDifficulty(double difficulty) {
        this.difficulty = difficulty;
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
     * Sets chainwork.
     *
     * @param chainwork the chainwork
     */
    public void setChainwork(String chainwork) {
        this.chainwork = chainwork;
    }

    /**
     * Gets tx.
     *
     * @return the tx
     */
    public int getnTx() {
        return nTx;
    }

    /**
     * Sets tx.
     *
     * @param nTx the n tx
     */
    public void setnTx(int nTx) {
        this.nTx = nTx;
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
     * Sets previousblockhash.
     *
     * @param previousblockhash the previousblockhash
     */
    public void setPreviousblockhash(String previousblockhash) {
        this.previousblockhash = previousblockhash;
    }

    /**
     * Gets nextblockhash.
     *
     * @return the nextblockhash
     */
    public String getNextblockhash() {
        return nextblockhash;
    }

    /**
     * Sets nextblockhash.
     *
     * @param nextblockhash the nextblockhash
     */
    public void setNextblockhash(String nextblockhash) {
        this.nextblockhash = nextblockhash;
    }
}