package ru.zoommax.bitcoin.bitcore25.model.useany;

import ru.zoommax.bitcoin.JsonRpcResult;

import java.math.BigDecimal;

/**
 * The type Big decimal value.
 */
public class BigDecimalValue extends JsonRpcResult<BigDecimal> {
    /**
     * Gets value.
     *
     * @return the value
     */
    public BigDecimal getValue() {
        return this.getResult();
    }
}
