package ru.zoommax.bitcoin.bitcore25.model.signer;

import lombok.Getter;
import lombok.Setter;
import ru.zoommax.bitcoin.JsonRpcResult;

/**
 * The type Signers.
 */
@Getter
@Setter
public class Signers {
	/**
	 * The type Result.
	 */
	public static class Result extends JsonRpcResult<Signers[]> {
	}

	/**
	 * The Signers.
	 */
	private Signer[] signers;
}
