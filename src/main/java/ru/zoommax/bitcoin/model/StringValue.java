package ru.zoommax.bitcoin.model;

import ru.zoommax.bitcoin.JsonRpcResult;

public class StringValue extends JsonRpcResult<String> {
    public String getValue() {
        return this.getResult();
    }
}
