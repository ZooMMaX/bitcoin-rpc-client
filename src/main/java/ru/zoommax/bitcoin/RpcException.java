package ru.zoommax.bitcoin;

public class RpcException extends RuntimeException {

    public RpcException(String format, Object... param) {
        this(null, format, param);
    }

    public RpcException(Throwable cause, String format, Object... param) {
        super(String.format(format, param), cause);
    }
}
