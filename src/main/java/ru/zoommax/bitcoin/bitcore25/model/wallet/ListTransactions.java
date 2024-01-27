package ru.zoommax.bitcoin.bitcore25.model.wallet;

import lombok.Getter;
import lombok.Setter;
import ru.zoommax.bitcoin.JsonRpcResult;
import ru.zoommax.bitcoin.bitcore25.model.wallet.gettransaction.WTransaction;

@Getter
@Setter
public class ListTransactions {

	public static class Result extends JsonRpcResult<ListTransactions> {
	}

	private WTransaction[] transactions;
	private WTransaction[] removed;
	private String lastblock;

}
