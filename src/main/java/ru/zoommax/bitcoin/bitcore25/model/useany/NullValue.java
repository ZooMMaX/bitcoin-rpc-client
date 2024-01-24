package ru.zoommax.bitcoin.bitcore25.model.useany;

import ru.zoommax.bitcoin.JsonRpcResult;

public class NullValue extends JsonRpcResult<Object> {
    public Object getValue() {
        return this.getResult();
    }
}
