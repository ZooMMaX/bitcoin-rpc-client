package ru.zoommax.bitcoin.bitcore25.model.useany;

import ru.zoommax.bitcoin.JsonRpcResult;

/**
 * The type Null value.
 */
public class NullValue extends JsonRpcResult<Object> {
    /**
     * Gets value.
     *
     * @return the value
     */
    public Object getValue() {
        return this.getResult();
    }
}
