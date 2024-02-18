package ru.zoommax.bitcoin.bitcore25.model.wallet.descriptors;

import lombok.Getter;
import lombok.Setter;

/**
 * The type Descriptor.
 */
@Getter @Setter public class Descriptor {
    /**
     * The Desc.
     */
    private String desc;
    /**
     * The Timestamp.
     */
    private long timestamp;
    /**
     * The Active.
     */
    private boolean active;
    /**
     * The Internal.
     */
    private boolean internal;
    /**
     * The Range.
     */
    private long[] range;
    /**
     * The Next.
     */
    private long next;
    /**
     * The Next index.
     */
    private long next_index;
}