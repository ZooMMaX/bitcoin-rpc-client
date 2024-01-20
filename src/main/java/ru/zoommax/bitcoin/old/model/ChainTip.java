package ru.zoommax.bitcoin.old.model;

import ru.zoommax.bitcoin.JsonRpcResult;

/**
 * The type Chain tip.
 */
public class ChainTip {

    /**
     * The type Result.
     */
    public static class Result extends JsonRpcResult<ChainTip[]> {
    }

    /**
     * The Height.
     */
    private long height;
    /**
     * The Hash.
     */
    private String hash;
    /**
     * The Branchlen.
     */
    private int branchlen;
    /**
     * The Status.
     */
    private String status;

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
     * Sets branchlen.
     *
     * @param branchlen the branchlen
     */
    public void setBranchlen(int branchlen) {
        this.branchlen = branchlen;
    }

    /**
     * Gets branchlen.
     *
     * @return the branchlen
     */
    public int getBranchlen() {
        return branchlen;
    }

    /**
     * Sets status.
     *
     * @param status the status
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * Gets status.
     *
     * @return the status
     */
    public String getStatus() {
        return status;
    }

}