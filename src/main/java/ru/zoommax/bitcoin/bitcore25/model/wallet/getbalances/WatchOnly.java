package ru.zoommax.bitcoin.bitcore25.model.wallet.getbalances;

import lombok.Getter;
import lombok.Setter;

/**
 * The type Watch only.
 */
@Getter @Setter public class WatchOnly {
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
}