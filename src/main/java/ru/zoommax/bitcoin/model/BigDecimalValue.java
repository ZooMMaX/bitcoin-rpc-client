package ru.zoommax.bitcoin.model;

import ru.zoommax.bitcoin.JsonRpcResult;

import java.math.BigDecimal;

public class BigDecimalValue extends JsonRpcResult<BigDecimal> {
    public BigDecimal getValue() {
        return this.getResult();
    }
}
