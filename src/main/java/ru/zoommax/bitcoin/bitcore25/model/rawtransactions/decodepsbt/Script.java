package ru.zoommax.bitcoin.bitcore25.model.rawtransactions.decodepsbt;

import lombok.Getter;
import lombok.Setter;

/**
 * The type Script.
 */
@Getter @Setter public class Script {
    /**
     * The Asm.
     */
    private String asm;
    /**
     * The Hex.
     */
    private String hex;
    /**
     * The Type.
     */
    private String type;
}