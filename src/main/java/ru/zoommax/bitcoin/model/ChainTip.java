package ru.zoommax.bitcoin.model;

import ru.zoommax.bitcoin.JsonRpcResult;

public class ChainTip {

    public static class Result extends JsonRpcResult<ChainTip[]> {
    }

    private long height;
    private String hash;
    private int branchlen;
    private String status;

    public void setHeight(long height) {
        this.height = height;
    }

    public long getHeight() {
        return height;
    }

    public void setHash(String hash) {
        this.hash = hash;
    }

    public String getHash() {
        return hash;
    }

    public void setBranchlen(int branchlen) {
        this.branchlen = branchlen;
    }

    public int getBranchlen() {
        return branchlen;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

}