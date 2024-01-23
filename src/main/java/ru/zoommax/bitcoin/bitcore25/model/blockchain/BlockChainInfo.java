package ru.zoommax.bitcoin.bitcore25.model.blockchain;

import lombok.Getter;
import lombok.Setter;
import ru.zoommax.bitcoin.JsonRpcResult;

/**
 * The type Block chain info.
 */
@Getter
@Setter
public class BlockChainInfo {
    /**
     * The type Result.
     */
    public static class Result extends JsonRpcResult<BlockChainInfo> {
    }

    /**
     * The Chain.
     */
    private String chain;
    /**
     * The Blocks.
     */
    private long blocks;
    /**
     * The Headers.
     */
    private long headers;
    /**
     * The Bestblockhash.
     */
    private String bestblockhash;
    /**
     * The Difficulty.
     */
    private double difficulty;
    /**
     * The Time.
     */
    private long time;
    /**
     * The Mediantime.
     */
    private long mediantime;
    /**
     * The Verificationprogress.
     */
    private double verificationprogress;
    /**
     * The Initialblockdownload.
     */
    private boolean initialblockdownload;
    /**
     * The Chainwork.
     */
    private String chainwork;
    /**
     * The Size on disk.
     */
    private long size_on_disk;
    /**
     * The Pruned.
     */
    private boolean pruned;
    /**
     * The Pruneheight.
     */
    private boolean pruneheight;
    /**
     * The Automatic pruning.
     */
    private boolean automatic_pruning;
    /**
     * The Prune target size.
     */
    private long prune_target_size;
    /**
     * The Warnings.
     */
    private String warnings;
}
