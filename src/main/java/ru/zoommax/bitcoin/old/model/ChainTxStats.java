package ru.zoommax.bitcoin.old.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import ru.zoommax.bitcoin.JsonRpcResult;

/**
 * The type Chain tx stats.
 */
public class ChainTxStats {
    /**
     * The type Result.
     */
    public static class Result extends JsonRpcResult<ChainTxStats> {
    }

    /**
     * The Time.
     */
    private long time;
    /**
     * The Txcount.
     */
    private long txcount;
    /**
     * The Window final block hash.
     */
    @JsonProperty("window_final_block_hash")
    private String windowFinalBlockHash;
    /**
     * The Window final block height.
     */
    @JsonProperty("window_final_block_height")
    private long windowFinalBlockHeight;
    /**
     * The Window block count.
     */
    @JsonProperty("window_block_count")
    private int windowBlockCount;
    /**
     * The Window tx count.
     */
    @JsonProperty("window_tx_count")
    private long windowTxCount;
    /**
     * The Window tnterval.
     */
    @JsonProperty("window_interval")
    private long windowTnterval;
    /**
     * The Txrate.
     */
    private double txrate;

    /**
     * Sets window final block height.
     *
     * @param windowFinalBlockHeight the window final block height
     */
    public void setWindowFinalBlockHeight(long windowFinalBlockHeight) {
        this.windowFinalBlockHeight = windowFinalBlockHeight;
    }

    /**
     * Gets window final block height.
     *
     * @return the window final block height
     */
    public long getWindowFinalBlockHeight() {
        return windowFinalBlockHeight;
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
     * Sets txcount.
     *
     * @param txcount the txcount
     */
    public void setTxcount(long txcount) {
        this.txcount = txcount;
    }

    /**
     * Gets txcount.
     *
     * @return the txcount
     */
    public long getTxcount() {
        return txcount;
    }

    /**
     * Gets window final block hash.
     *
     * @return the window final block hash
     */
    public String getWindowFinalBlockHash() {
        return windowFinalBlockHash;
    }

    /**
     * Sets window final block hash.
     *
     * @param windowFinalBlockHash the window final block hash
     */
    public void setWindowFinalBlockHash(String windowFinalBlockHash) {
        this.windowFinalBlockHash = windowFinalBlockHash;
    }

    /**
     * Gets window block count.
     *
     * @return the window block count
     */
    public int getWindowBlockCount() {
        return windowBlockCount;
    }

    /**
     * Sets window block count.
     *
     * @param windowBlockCount the window block count
     */
    public void setWindowBlockCount(int windowBlockCount) {
        this.windowBlockCount = windowBlockCount;
    }

    /**
     * Gets window tx count.
     *
     * @return the window tx count
     */
    public long getWindowTxCount() {
        return windowTxCount;
    }

    /**
     * Sets window tx count.
     *
     * @param windowTxCount the window tx count
     */
    public void setWindowTxCount(long windowTxCount) {
        this.windowTxCount = windowTxCount;
    }

    /**
     * Gets window tnterval.
     *
     * @return the window tnterval
     */
    public long getWindowTnterval() {
        return windowTnterval;
    }

    /**
     * Sets window tnterval.
     *
     * @param windowTnterval the window tnterval
     */
    public void setWindowTnterval(long windowTnterval) {
        this.windowTnterval = windowTnterval;
    }

    /**
     * Sets txrate.
     *
     * @param txrate the txrate
     */
    public void setTxrate(double txrate) {
        this.txrate = txrate;
    }

    /**
     * Gets txrate.
     *
     * @return the txrate
     */
    public double getTxrate() {
        return txrate;
    }

}