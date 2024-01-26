package ru.zoommax.bitcoin.bitcore25.model.signer;

import lombok.Getter;
import lombok.Setter;
import ru.zoommax.bitcoin.JsonRpcResult;

@Getter
@Setter
public class Signers {
	public static class Result extends JsonRpcResult<Signers[]> {
	}

	private Signer[] signers;
}
