package ru.zoommax.bitcoin.bitcore25.model.wallet;

import lombok.Getter;
import lombok.Setter;
import ru.zoommax.bitcoin.JsonRpcResult;

@Getter
@Setter
public class LoadWallet {

	public static class Result extends JsonRpcResult<LoadWallet> {
	}

	private String name;
	private String warning;
	private String[] warnings;

}
