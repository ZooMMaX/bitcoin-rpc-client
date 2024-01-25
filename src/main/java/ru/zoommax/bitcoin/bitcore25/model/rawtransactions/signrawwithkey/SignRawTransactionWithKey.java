package ru.zoommax.bitcoin.bitcore25.model.rawtransactions.signrawwithkey;

import lombok.Getter;
import lombok.Setter;
import ru.zoommax.bitcoin.JsonRpcResult;

@Getter
@Setter
public class SignRawTransactionWithKey {

	public static class Result extends JsonRpcResult<SignRawTransactionWithKey> {
	}

	private String hex;
	private boolean complete;
	private Error[] errors;

	@Getter @Setter public class Error {
		private String txid;
		private long vout;
		private String[] witness;
		private String scriptSig;
		private long sequence;
		private String error;
	}

}
