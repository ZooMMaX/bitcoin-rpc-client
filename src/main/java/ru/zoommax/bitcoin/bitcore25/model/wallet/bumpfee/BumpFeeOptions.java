package ru.zoommax.bitcoin.bitcore25.model.wallet.bumpfee;

import lombok.Builder;
import lombok.Getter;

import java.util.HashMap;
import java.util.List;

/**
 * The type Bump fee options.
 */
@Builder
@Getter
public class BumpFeeOptions {
    /**
     * The Conf target.
     */
    long conf_target;
    /**
     * The Fee rate.
     */
    double fee_rate;
    /**
     * The Replaceable.
     */
    boolean replaceable;
    /**
     * The Estimate mode.
     */
    String estimate_mode;
    /**
     * The Outputs.
     */
    List<Object> outputs;
}
