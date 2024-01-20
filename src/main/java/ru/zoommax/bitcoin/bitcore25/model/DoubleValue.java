package ru.zoommax.bitcoin.bitcore25.model;

import ru.zoommax.bitcoin.JsonRpcResult;

public class DoubleValue extends JsonRpcResult<Double> {
    public double getValue() {
        return this.getResult().doubleValue();
    }
}
