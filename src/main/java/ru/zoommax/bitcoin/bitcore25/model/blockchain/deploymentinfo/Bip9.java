package ru.zoommax.bitcoin.bitcore25.model.blockchain.deploymentinfo;

import lombok.Getter;
import lombok.Setter;

/**
 * The type Bip 9.
 */
@Getter
@Setter
public class Bip9 {
    /**
     * The Bit.
     */
    private long bit;
    /**
     * The Start time.
     */
    private long start_time;
    /**
     * The Timeout.
     */
    private long timeout;
    /**
     * The Min activation height.
     */
    private long min_activation_height;
    /**
     * The Status.
     */
    private String status;
    /**
     * The Since.
     */
    private long since;
    /**
     * The Status next.
     */
    private String status_next;
    /**
     * The Statistic.
     */
    private Statistic statistic;
    /**
     * The Signalling.
     */
    private String signalling;
}
