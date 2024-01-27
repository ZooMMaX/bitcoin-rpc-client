package ru.zoommax.bitcoin.bitcore25.model.blockchain.txspendingprevout;

import java.util.HashMap;

import lombok.Getter;
import lombok.Setter;
import ru.zoommax.bitcoin.JsonRpcResult;

/**
 * The type Tx spending prevout.
 */
@SuppressWarnings("serial")
@Getter
@Setter
public class TxSpendingPrevout extends HashMap<String, Txs> {
	/**
	 * The type Result.
	 */
	public static class Result extends JsonRpcResult<TxSpendingPrevout> {
	}
}
