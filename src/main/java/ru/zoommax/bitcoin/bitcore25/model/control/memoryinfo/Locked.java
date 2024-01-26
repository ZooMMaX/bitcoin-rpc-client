package ru.zoommax.bitcoin.bitcore25.model.control.memoryinfo;

import lombok.Getter;
import lombok.Setter;

/**
 * The type Locked.
 */
@Getter
@Setter
public class Locked {

    /**
     * The Used.
     */
    private long used;
    /**
     * The Free.
     */
    private long free;
    /**
     * The Total.
     */
    private long total;
    /**
     * The Locked.
     */
    private long locked;
    /**
     * The Chunks used.
     */
    private long chunks_used;
    /**
     * The Chunks free.
     */
    private long chunks_free;

}
