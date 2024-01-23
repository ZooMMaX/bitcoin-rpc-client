package ru.zoommax.bitcoin.bitcore25.model.blockchain.deploymentinfo;

import lombok.Getter;
import lombok.Setter;

/**
 * The type Statistic.
 */
@Getter
@Setter
public class Statistic {
    /**
     * The Period.
     */
    private long period;
    /**
     * The Threshold.
     */
    private long threshold;
    /**
     * The Elapsed.
     */
    private long elapsed;
    /**
     * The Count.
     */
    private long count;
    /**
     * The Possible.
     */
    private boolean possible;
}
