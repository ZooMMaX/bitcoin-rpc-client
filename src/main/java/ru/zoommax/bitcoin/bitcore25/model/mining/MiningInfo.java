package ru.zoommax.bitcoin.bitcore25.model.mining;

import lombok.Getter;
import lombok.Setter;
import ru.zoommax.bitcoin.JsonRpcResult;

/**
 * The type Mining info.
 */
@Getter
@Setter
public class MiningInfo {

    /**
     * The type Result.
     */
    public static class Result extends JsonRpcResult<MiningInfo> {
	}

    /**
     * The Blocks.
     */
    private long blocks;
    /**
     * The Currentblockweight.
     */
    private long currentblockweight;
    /**
     * The Currentblocktx.
     */
    private long currentblocktx;
    /**
     * The Difficulty.
     */
    private double difficulty;
    /**
     * The Networkhashps.
     */
    private long networkhashps;
    /**
     * The Pooledtx.
     */
    private long pooledtx;
    /**
     * The Chain.
     */
    private String chain;
    /**
     * The Warnings.
     */
    private String warnings;
}
