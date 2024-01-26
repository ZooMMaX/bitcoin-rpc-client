package ru.zoommax.bitcoin.bitcore25.model.rawtransactions.utxoupdatepsbt;

import lombok.Getter;
import lombok.Setter;

/**
 * The type Descriptor.
 */
@Getter
@Setter
public class Descriptor {
    /**
     * The Desc.
     */
    private String desc;
    /**
     * The Range.
     */
    private long[] range;
}
