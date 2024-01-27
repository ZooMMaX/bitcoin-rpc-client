package ru.zoommax.bitcoin.bitcore25.model.wallet;

import lombok.Getter;
import lombok.Setter;
import ru.zoommax.bitcoin.JsonRpcResult;

@Getter
@Setter
public class WalletDestination {

	public static class Result extends JsonRpcResult<WalletDestination> {
	}

	private String filename;

}
