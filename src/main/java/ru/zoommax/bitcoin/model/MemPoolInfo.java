package ru.zoommax.bitcoin.model;

import ru.zoommax.bitcoin.JsonRpcResult;

public class MemPoolInfo {

    public static class Result extends JsonRpcResult<MemPoolInfo> {
    }

    private int size;
    private long bytes;
    private long usage;
    private long maxmempool;
    private double mempoolminfee;
    private double minrelaytxfee;
    private boolean loaded;
    private double total_fee;
    private double incrementalrelayfee;
    private int unbroadcastcount;
    private boolean fullrbf;

    public void setFullrbf(boolean fullrbf) {
        this.fullrbf = fullrbf;
    }

    public boolean getFullrbf() {
        return fullrbf;
    }

    public void setUnbroadcastcount(int unbroadcastcount) {
        this.unbroadcastcount = unbroadcastcount;
    }

    public int getUnbroadcastcount() {
        return unbroadcastcount;
    }

    public void setIncrementalrelayfee(double incrementalrelayfee) {
        this.incrementalrelayfee = incrementalrelayfee;
    }

    public double getIncrementalrelayfee() {
        return incrementalrelayfee;
    }

    public void setTotal_fee(double total_fee) {
        this.total_fee = total_fee;
    }

    public double getTotal_fee() {
        return total_fee;
    }

    public void setLoaded(boolean loaded) {
        this.loaded = loaded;
    }

    public boolean getLoaded() {
        return loaded;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    public void setBytes(long bytes) {
        this.bytes = bytes;
    }

    public long getBytes() {
        return bytes;
    }

    public void setUsage(long usage) {
        this.usage = usage;
    }

    public long getUsage() {
        return usage;
    }

    public void setMaxmempool(long maxmempool) {
        this.maxmempool = maxmempool;
    }

    public long getMaxmempool() {
        return maxmempool;
    }

    public void setMempoolminfee(double mempoolminfee) {
        this.mempoolminfee = mempoolminfee;
    }

    public double getMempoolminfee() {
        return mempoolminfee;
    }

    public void setMinrelaytxfee(double minrelaytxfee) {
        this.minrelaytxfee = minrelaytxfee;
    }

    public double getMinrelaytxfee() {
        return minrelaytxfee;
    }
}