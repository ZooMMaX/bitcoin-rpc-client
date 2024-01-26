package ru.zoommax.bitcoin.bitcore25.model.rawtransactions.createjson;

import lombok.Getter;
import lombok.Setter;

/**
 * The type Input.
 */
@Getter
@Setter
public class Input {
    /**
     * The Txid.
     */
    private String txid;
    /**
     * The Vout.
     */
    private long vout;
    /**
     * The Sequence.
     */
    private long sequence;
}
