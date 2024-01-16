package ru.zoommax.bitcoin;

/**
 * The type Rpc exception.
 */
public class RpcException extends RuntimeException {

    /**
     * Instantiates a new Rpc exception.
     *
     * @param format the format
     * @param param  the param
     */
    public RpcException(String format, Object... param) {
        this(null, format, param);
    }

    /**
     * Instantiates a new Rpc exception.
     *
     * @param cause  the cause
     * @param format the format
     * @param param  the param
     */
    public RpcException(Throwable cause, String format, Object... param) {
        super(String.format(format, param), cause);
    }
}
