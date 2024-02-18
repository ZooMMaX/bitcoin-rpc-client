package ru.zoommax.bitcoin.bitcore25.model.wallet.getbalances;

import lombok.Getter;
import lombok.Setter;

/**
 * The type Mine.
 */
@Getter @Setter public class Mine {
    /**
     * The Trusted.
     */
    private double trusted;
    /**
     * The Untrusted pending.
     */
    private double untrusted_pending;
    /**
     * The Immature.
     */
    private double immature;
    /**
     * The Used.
     */
    private double used;
}