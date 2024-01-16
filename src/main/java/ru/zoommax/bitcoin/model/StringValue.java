package ru.zoommax.bitcoin.model;

import ru.zoommax.bitcoin.JsonRpcResult;

/**
 * The type String value.
 */
public class StringValue extends JsonRpcResult<String> {
    /**
     * Gets value.
     *
     * @return the value
     */
    public String getValue() {
        return this.getResult();
    }
}
