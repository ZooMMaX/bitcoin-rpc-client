package ru.zoommax.bitcoin.model;

import ru.zoommax.bitcoin.JsonRpcResult;

public class BooleanValue extends JsonRpcResult<Boolean> {
    public boolean getValue() {
        return this.getResult().booleanValue();
    }
}
