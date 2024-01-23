package ru.zoommax.bitcoin.bitcore25.model.blockchain;

import lombok.Getter;
import lombok.Setter;
import ru.zoommax.bitcoin.JsonRpcResult;

/**
 * The type Chain tx stats.
 */
@Getter
@Setter
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
    private String window_final_block_hash;
    /**
     * The Window final block height.
     */
    private long window_final_block_height;
    /**
     * The Window block count.
     */
    private long window_block_count;
    /**
     * The Window tx count.
     */
    private long window_tx_count;
    /**
     * The Window interval.
     */
    private long window_interval;
    /**
     * The Txrate.
     */
    private double txrate;
}
