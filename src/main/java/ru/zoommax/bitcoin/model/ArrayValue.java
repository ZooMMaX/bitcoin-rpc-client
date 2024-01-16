package ru.zoommax.bitcoin.model;

import ru.zoommax.bitcoin.JsonRpcResult;

public class ArrayValue<T> extends JsonRpcResult<T[]> {
    public T[] getValue() {
        return this.getResult();
    }

    public static class StringArray extends ArrayValue<String> {
    }

    public static class ThreeArray extends JsonRpcResult<Object[][][]> {
    }
}
