package ru.zoommax.bitcoin.bitcore25.model.network.nettotals;

import lombok.Getter;
import lombok.Setter;

/**
 * The type Upload target.
 */
@Getter
@Setter
public class UploadTarget {

    /**
     * The Timeframe.
     */
    private long timeframe;
    /**
     * The Target.
     */
    private long target;
    /**
     * The Target reached.
     */
    private boolean target_reached;
    /**
     * The Serve historical blocks.
     */
    private boolean serve_historical_blocks;
    /**
     * The Bytes left in cycle.
     */
    private long bytes_left_in_cycle;
    /**
     * The Time left in cycle.
     */
    private long time_left_in_cycle;

}
