package ru.zoommax.bitcoin.model;

import ru.zoommax.bitcoin.JsonRpcResult;

public class LongValue extends JsonRpcResult<Long> {

    public long getValue() {
        return this.getResult().longValue();
    }
}
