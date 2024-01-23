package ru.zoommax.bitcoin.bitcore25.model.blockchain.scantxoutset;

import lombok.Getter;
import lombok.Setter;
import ru.zoommax.bitcoin.JsonRpcResult;
import ru.zoommax.bitcoin.bitcore25.model.useany.BooleanValue;

/**
 * The type Scan tx out set.
 */
@Getter
@Setter
public class ScanTxOutSet extends BooleanValue {
    /**
     * The type Result.
     */
    public static class Result extends JsonRpcResult<ScanTxOutSet> {
    }

    /**
     * The Success.
     */
    private boolean success;
    /**
     * The Txouts.
     */
    private long txouts;
    /**
     * The Height.
     */
    private long height;
    /**
     * The Bestblock.
     */
    private String bestblock;
    /**
     * The Unspents.
     */
    private Unspents[] unspents;
    /**
     * The Total amount.
     */
    private long total_amount;

    /**
     * The Progress.
     */
    private double progress;
}
