package ru.zoommax.bitcoin.bitcore25.model.rawtransactions.fundrawtransaction;

import lombok.Getter;
import lombok.Setter;

/**
 * The type Input weight.
 */
@Getter
@Setter
public class InputWeight {
    /**
     * The Txid.
     */
    private String txid;
    /**
     * The Vout.
     */
    private long vout;
    /**
     * The Weight.
     */
    private long weight;
}
