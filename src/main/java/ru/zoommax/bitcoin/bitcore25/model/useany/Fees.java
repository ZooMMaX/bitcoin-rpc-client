package ru.zoommax.bitcoin.bitcore25.model.useany;

import lombok.Getter;
import lombok.Setter;

/**
 * The type Fees.
 */
@Getter
@Setter
public class Fees {
    /**
     * The Base.
     */
    private double base;
    /**
     * The Modified.
     */
    private double modified;
    /**
     * The Ancestor.
     */
    private double ancestor;
    /**
     * The Descendant.
     */
    private double descendant;
}
