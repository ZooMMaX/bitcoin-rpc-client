package ru.zoommax.bitcoin.old.model;

import ru.zoommax.bitcoin.JsonRpcResult;

/**
 * The type Boolean value.
 */
public class BooleanValue extends JsonRpcResult<Boolean> {
    /**
     * Gets value.
     *
     * @return the value
     */
    public boolean getValue() {
        return this.getResult().booleanValue();
    }
}
