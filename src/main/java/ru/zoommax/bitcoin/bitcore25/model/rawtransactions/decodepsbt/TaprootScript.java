package ru.zoommax.bitcoin.bitcore25.model.rawtransactions.decodepsbt;

import lombok.Getter;
import lombok.Setter;

/**
 * The type Taproot script.
 */
@Getter @Setter public class TaprootScript {
    /**
     * The Script.
     */
    private String script;
    /**
     * The Leaf ver.
     */
    private long leaf_ver;
    /**
     * The Control blocks.
     */
    private String[] control_blocks;
}