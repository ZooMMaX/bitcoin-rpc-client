package ru.zoommax.bitcoin.bitcore25.model.signer;

import lombok.Getter;
import lombok.Setter;
import ru.zoommax.bitcoin.JsonRpcResult;

@Getter
@Setter
public class SignerHolder {
	public static class Result extends JsonRpcResult<SignerHolder[]> {
	}

	private Signer[] signers;

	@Getter @Setter public class Signer {
		private String fingerprint;
		private String name;
	}

}
