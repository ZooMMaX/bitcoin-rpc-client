package ru.zoommax.bitcoin.old.model;

import ru.zoommax.bitcoin.JsonRpcResult;

/**
 * The type Mining info.
 */
public class MiningInfo {

    /**
     * The type Result.
     */
    public static class Result extends JsonRpcResult<MiningInfo> {
    }

    /**
     * The Blocks.
     */
    private int blocks;
    /**
     * The Currentblockweight.
     */
    private int currentblockweight;
    /**
     * The Currentblocktx.
     */
    private int currentblocktx;
    /**
     * The Difficulty.
     */
    private double difficulty;
    /**
     * The Networkhashps.
     */
    private double networkhashps;
    /**
     * The Pooledtx.
     */
    private int pooledtx;
    /**
     * The Chain.
     */
    private String chain;
    /**
     * The Warnings.
     */
    private String warnings;

    /**
     * Sets blocks.
     *
     * @param blocks the blocks
     */
    public void setBlocks(int blocks) {
        this.blocks = blocks;
    }

    /**
     * Gets blocks.
     *
     * @return the blocks
     */
    public int getBlocks() {
        return blocks;
    }

    /**
     * Sets currentblockweight.
     *
     * @param currentblockweight the currentblockweight
     */
    public void setCurrentblockweight(int currentblockweight) {
        this.currentblockweight = currentblockweight;
    }

    /**
     * Gets currentblockweight.
     *
     * @return the currentblockweight
     */
    public int getCurrentblockweight() {
        return currentblockweight;
    }

    /**
     * Sets currentblocktx.
     *
     * @param currentblocktx the currentblocktx
     */
    public void setCurrentblocktx(int currentblocktx) {
        this.currentblocktx = currentblocktx;
    }

    /**
     * Gets currentblocktx.
     *
     * @return the currentblocktx
     */
    public int getCurrentblocktx() {
        return currentblocktx;
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
     * Sets networkhashps.
     *
     * @param networkhashps the networkhashps
     */
    public void setNetworkhashps(double networkhashps) {
        this.networkhashps = networkhashps;
    }

    /**
     * Gets networkhashps.
     *
     * @return the networkhashps
     */
    public double getNetworkhashps() {
        return networkhashps;
    }

    /**
     * Sets pooledtx.
     *
     * @param pooledtx the pooledtx
     */
    public void setPooledtx(int pooledtx) {
        this.pooledtx = pooledtx;
    }

    /**
     * Gets pooledtx.
     *
     * @return the pooledtx
     */
    public int getPooledtx() {
        return pooledtx;
    }

    /**
     * Sets chain.
     *
     * @param chain the chain
     */
    public void setChain(String chain) {
        this.chain = chain;
    }

    /**
     * Gets chain.
     *
     * @return the chain
     */
    public String getChain() {
        return chain;
    }

    /**
     * Sets warnings.
     *
     * @param warnings the warnings
     */
    public void setWarnings(String warnings) {
        this.warnings = warnings;
    }

    /**
     * Gets warnings.
     *
     * @return the warnings
     */
    public String getWarnings() {
        return warnings;
    }

}