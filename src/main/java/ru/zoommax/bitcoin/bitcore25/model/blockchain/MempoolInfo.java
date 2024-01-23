package ru.zoommax.bitcoin.bitcore25.model.blockchain;

import lombok.Getter;
import lombok.Setter;
import ru.zoommax.bitcoin.JsonRpcResult;

/**
 * The type Mempool info.
 */
@Getter
@Setter
public class MempoolInfo {
    /**
     * The type Result.
     */
    public static class Result extends JsonRpcResult<MempoolInfo> {
    }

    /**
     * The Loaded.
     */
    private boolean loaded;
    /**
     * The Size.
     */
    private long size;
    /**
     * The Bytes.
     */
    private long bytes;
    /**
     * The Usage.
     */
    private long usage;
    /**
     * The Total fee.
     */
    private long total_fee;
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
     * The Incrementalrelayfee.
     */
    private double incrementalrelayfee;
    /**
     * The Unbroadcastcount.
     */
    private long unbroadcastcount;
    /**
     * The Fullrbf.
     */
    private boolean fullrbf;
}
