package ru.zoommax.bitcoin.bitcore25.model.wallet.bumpfee;

import lombok.Getter;
import lombok.Setter;
import ru.zoommax.bitcoin.JsonRpcResult;

/**
 * The type Bump fee.
 */
@Getter
@Setter
public class BumpFee {

	/**
	 * The type Result.
	 */
	public static class Result extends JsonRpcResult<BumpFee> {
	}

	/**
	 * The Txid.
	 */
	private String txid;
	/**
	 * The Origfee.
	 */
	private double origfee;
	/**
	 * The Fee.
	 */
	private double fee;
	/**
	 * The Errors.
	 */
	private String[] errors;

}
