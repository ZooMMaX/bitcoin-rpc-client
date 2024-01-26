package ru.zoommax.bitcoin.bitcore25.model.rawtransactions.decodepsbt;

import lombok.Getter;
import lombok.Setter;

/**
 * The type Taproot.
 */
@Getter @Setter public class Taproot {
    /**
     * The Depth.
     */
    private long depth;
    /**
     * The Leaf ver.
     */
    private long leaf_ver;
    /**
     * The Script.
     */
    private String script;
}