package ru.zoommax.bitcoin.model;

import ru.zoommax.bitcoin.JsonRpcResult;

/**
 * The type Long value.
 */
public class LongValue extends JsonRpcResult<Long> {

    /**
     * Gets value.
     *
     * @return the value
     */
    public long getValue() {
        return this.getResult().longValue();
    }
}
