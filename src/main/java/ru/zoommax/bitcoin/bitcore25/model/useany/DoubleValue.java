package ru.zoommax.bitcoin.bitcore25.model.useany;

import ru.zoommax.bitcoin.JsonRpcResult;

/**
 * The type Double value.
 */
public class DoubleValue extends JsonRpcResult<Double> {
    /**
     * Gets value.
     *
     * @return the value
     */
    public double getValue() {
        return this.getResult().doubleValue();
    }
}
