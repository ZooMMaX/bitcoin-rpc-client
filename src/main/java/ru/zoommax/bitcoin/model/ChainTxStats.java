package ru.zoommax.bitcoin.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import ru.zoommax.bitcoin.JsonRpcResult;

public class ChainTxStats {
    public static class Result extends JsonRpcResult<ChainTxStats> {
    }

    private long time;
    private long txcount;
    @JsonProperty("window_final_block_hash")
    private String windowFinalBlockHash;
    @JsonProperty("window_final_block_height")
    private long windowFinalBlockHeight;
    @JsonProperty("window_block_count")
    private int windowBlockCount;
    @JsonProperty("window_tx_count")
    private long windowTxCount;
    @JsonProperty("window_interval")
    private long windowTnterval;
    private double txrate;

    public void setWindowFinalBlockHeight(long windowFinalBlockHeight) {
        this.windowFinalBlockHeight = windowFinalBlockHeight;
    }

    public long getWindowFinalBlockHeight() {
        return windowFinalBlockHeight;
    }

    public void setTime(long time) {
        this.time = time;
    }

    public long getTime() {
        return time;
    }

    public void setTxcount(long txcount) {
        this.txcount = txcount;
    }

    public long getTxcount() {
        return txcount;
    }

    public String getWindowFinalBlockHash() {
        return windowFinalBlockHash;
    }

    public void setWindowFinalBlockHash(String windowFinalBlockHash) {
        this.windowFinalBlockHash = windowFinalBlockHash;
    }

    public int getWindowBlockCount() {
        return windowBlockCount;
    }

    public void setWindowBlockCount(int windowBlockCount) {
        this.windowBlockCount = windowBlockCount;
    }

    public long getWindowTxCount() {
        return windowTxCount;
    }

    public void setWindowTxCount(long windowTxCount) {
        this.windowTxCount = windowTxCount;
    }

    public long getWindowTnterval() {
        return windowTnterval;
    }

    public void setWindowTnterval(long windowTnterval) {
        this.windowTnterval = windowTnterval;
    }

    public void setTxrate(double txrate) {
        this.txrate = txrate;
    }

    public double getTxrate() {
        return txrate;
    }

}