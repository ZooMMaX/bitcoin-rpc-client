package ru.zoommax.bitcoin.bitcore25.model.useany;

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
