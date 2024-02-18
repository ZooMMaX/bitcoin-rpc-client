package ru.zoommax.bitcoin.bitcore25.api.wallet.arguments;

import lombok.Builder;
import lombok.Getter;

/**
 * The type Query options.
 */
@Builder
@Getter
public class QueryOptions {

    /**
     * The Minimum amount.
     */
    private double minimumAmount = 0d;
    /**
     * The Maximum amount.
     */
    private double maximumAmount = Double.POSITIVE_INFINITY;
    /**
     * The Maximum count.
     */
    private long maximumCount = Integer.MAX_VALUE;
    /**
     * The Minimum sum amount.
     */
    private double minimumSumAmount = Double.POSITIVE_INFINITY;
    /**
     * The Include immature coinbase.
     */
    private boolean include_immature_coinbase = false;

}
