package ru.zoommax.bitcoin.model;

import ru.zoommax.bitcoin.JsonRpcResult;

public class MiningInfo {

    public static class Result extends JsonRpcResult<MiningInfo> {
    }

    private int blocks;
    private int currentblockweight;
    private int currentblocktx;
    private double difficulty;
    private double networkhashps;
    private int pooledtx;
    private String chain;
    private String warnings;

    public void setBlocks(int blocks) {
        this.blocks = blocks;
    }

    public int getBlocks() {
        return blocks;
    }

    public void setCurrentblockweight(int currentblockweight) {
        this.currentblockweight = currentblockweight;
    }

    public int getCurrentblockweight() {
        return currentblockweight;
    }

    public void setCurrentblocktx(int currentblocktx) {
        this.currentblocktx = currentblocktx;
    }

    public int getCurrentblocktx() {
        return currentblocktx;
    }

    public void setDifficulty(double difficulty) {
        this.difficulty = difficulty;
    }

    public double getDifficulty() {
        return difficulty;
    }

    public void setNetworkhashps(double networkhashps) {
        this.networkhashps = networkhashps;
    }

    public double getNetworkhashps() {
        return networkhashps;
    }

    public void setPooledtx(int pooledtx) {
        this.pooledtx = pooledtx;
    }

    public int getPooledtx() {
        return pooledtx;
    }

    public void setChain(String chain) {
        this.chain = chain;
    }

    public String getChain() {
        return chain;
    }

    public void setWarnings(String warnings) {
        this.warnings = warnings;
    }

    public String getWarnings() {
        return warnings;
    }

}