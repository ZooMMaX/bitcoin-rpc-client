package ru.zoommax.bitcoin.bitcore25.model.wallet;

import lombok.Getter;
import lombok.Setter;
import ru.zoommax.bitcoin.JsonRpcResult;

@Getter
@Setter
public class WalletCreate {

	public static class Result extends JsonRpcResult<WalletCreate> {
	}

	private String name;
	private String warning; // This var is deprecated from rpcapi side, check warnings[] first
	private String[] warnings;

}
