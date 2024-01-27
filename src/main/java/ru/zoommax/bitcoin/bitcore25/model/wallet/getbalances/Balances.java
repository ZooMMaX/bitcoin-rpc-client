package ru.zoommax.bitcoin.bitcore25.model.wallet.getbalances;

import lombok.Getter;
import lombok.Setter;
import ru.zoommax.bitcoin.JsonRpcResult;

@Getter
@Setter
public class Balances {

	public static class Result extends JsonRpcResult<Balances> {
	}

	private Mine mine;
	private WatchOnly watchonly;

}
