package ru.zoommax.bitcoin.bitcore25.model.rawtransactions.decodepsbt;

import lombok.Getter;
import lombok.Setter;

/**
 * The type Proprietary.
 */
@Getter
@Setter
public class Proprietary {
    /**
     * The Identifier.
     */
    private String identifier;
    /**
     * The Subtype.
     */
    private long subtype;
    /**
     * The Key.
     */
    private String key;
    /**
     * The Value.
     */
    private String value;
}
