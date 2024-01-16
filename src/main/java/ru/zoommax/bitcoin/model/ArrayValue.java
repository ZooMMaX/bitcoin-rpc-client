package ru.zoommax.bitcoin.model;

import ru.zoommax.bitcoin.JsonRpcResult;

/**
 * The type Array value.
 *
 * @param <T> the type parameter
 */
public class ArrayValue<T> extends JsonRpcResult<T[]> {
    /**
     * Get value t [ ].
     *
     * @return the t [ ]
     */
    public T[] getValue() {
        return this.getResult();
    }

    /**
     * The type String array.
     */
    public static class StringArray extends ArrayValue<String> {
    }

    /**
     * The type Three array.
     */
    public static class ThreeArray extends JsonRpcResult<Object[][][]> {
    }
}
