package ru.zoommax.bitcoin;

/**
 * The type Rpc exception.
 */
public class RpcException extends RuntimeException {

	/**
	 *
	 */
	private static final long serialVersionUID = -1714457950922012659L;

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
