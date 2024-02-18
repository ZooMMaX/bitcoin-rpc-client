package ru.zoommax.bitcoin.bitcore25.model.wallet.getwalletinfo;

import lombok.Getter;
import lombok.Setter;

/**
 * The type Scanning.
 */
@Getter @Setter public class Scanning {
    /**
     * The Duration.
     */
    private long duration;
    /**
     * The Progress.
     */
    private double progress;
}