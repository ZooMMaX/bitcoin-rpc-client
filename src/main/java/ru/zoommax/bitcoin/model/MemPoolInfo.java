package ru.zoommax.bitcoin.model;

import ru.zoommax.bitcoin.JsonRpcResult;

/**
 * The type Mem pool info.
 */
public class MemPoolInfo {

    /**
     * The type Result.
     */
    public static class Result extends JsonRpcResult<MemPoolInfo> {
    }

    /**
     * The Size.
     */
    private int size;
    /**
     * The Bytes.
     */
    private long bytes;
    /**
     * The Usage.
     */
    private long usage;
    /**
     * The Maxmempool.
     */
    private long maxmempool;
    /**
     * The Mempoolminfee.
     */
    private double mempoolminfee;
    /**
     * The Minrelaytxfee.
     */
    private double minrelaytxfee;
    /**
     * The Loaded.
     */
    private boolean loaded;
    /**
     * The Total fee.
     */
    private double total_fee;
    /**
     * The Incrementalrelayfee.
     */
    private double incrementalrelayfee;
    /**
     * The Unbroadcastcount.
     */
    private int unbroadcastcount;
    /**
     * The Fullrbf.
     */
    private boolean fullrbf;

    /**
     * Sets fullrbf.
     *
     * @param fullrbf the fullrbf
     */
    public void setFullrbf(boolean fullrbf) {
        this.fullrbf = fullrbf;
    }

    /**
     * Gets fullrbf.
     *
     * @return the fullrbf
     */
    public boolean getFullrbf() {
        return fullrbf;
    }

    /**
     * Sets unbroadcastcount.
     *
     * @param unbroadcastcount the unbroadcastcount
     */
    public void setUnbroadcastcount(int unbroadcastcount) {
        this.unbroadcastcount = unbroadcastcount;
    }

    /**
     * Gets unbroadcastcount.
     *
     * @return the unbroadcastcount
     */
    public int getUnbroadcastcount() {
        return unbroadcastcount;
    }

    /**
     * Sets incrementalrelayfee.
     *
     * @param incrementalrelayfee the incrementalrelayfee
     */
    public void setIncrementalrelayfee(double incrementalrelayfee) {
        this.incrementalrelayfee = incrementalrelayfee;
    }

    /**
     * Gets incrementalrelayfee.
     *
     * @return the incrementalrelayfee
     */
    public double getIncrementalrelayfee() {
        return incrementalrelayfee;
    }

    /**
     * Sets total fee.
     *
     * @param total_fee the total fee
     */
    public void setTotal_fee(double total_fee) {
        this.total_fee = total_fee;
    }

    /**
     * Gets total fee.
     *
     * @return the total fee
     */
    public double getTotal_fee() {
        return total_fee;
    }

    /**
     * Sets loaded.
     *
     * @param loaded the loaded
     */
    public void setLoaded(boolean loaded) {
        this.loaded = loaded;
    }

    /**
     * Gets loaded.
     *
     * @return the loaded
     */
    public boolean getLoaded() {
        return loaded;
    }

    /**
     * Sets size.
     *
     * @param size the size
     */
    public void setSize(int size) {
        this.size = size;
    }

    /**
     * Gets size.
     *
     * @return the size
     */
    public int getSize() {
        return size;
    }

    /**
     * Sets bytes.
     *
     * @param bytes the bytes
     */
    public void setBytes(long bytes) {
        this.bytes = bytes;
    }

    /**
     * Gets bytes.
     *
     * @return the bytes
     */
    public long getBytes() {
        return bytes;
    }

    /**
     * Sets usage.
     *
     * @param usage the usage
     */
    public void setUsage(long usage) {
        this.usage = usage;
    }

    /**
     * Gets usage.
     *
     * @return the usage
     */
    public long getUsage() {
        return usage;
    }

    /**
     * Sets maxmempool.
     *
     * @param maxmempool the maxmempool
     */
    public void setMaxmempool(long maxmempool) {
        this.maxmempool = maxmempool;
    }

    /**
     * Gets maxmempool.
     *
     * @return the maxmempool
     */
    public long getMaxmempool() {
        return maxmempool;
    }

    /**
     * Sets mempoolminfee.
     *
     * @param mempoolminfee the mempoolminfee
     */
    public void setMempoolminfee(double mempoolminfee) {
        this.mempoolminfee = mempoolminfee;
    }

    /**
     * Gets mempoolminfee.
     *
     * @return the mempoolminfee
     */
    public double getMempoolminfee() {
        return mempoolminfee;
    }

    /**
     * Sets minrelaytxfee.
     *
     * @param minrelaytxfee the minrelaytxfee
     */
    public void setMinrelaytxfee(double minrelaytxfee) {
        this.minrelaytxfee = minrelaytxfee;
    }

    /**
     * Gets minrelaytxfee.
     *
     * @return the minrelaytxfee
     */
    public double getMinrelaytxfee() {
        return minrelaytxfee;
    }
}