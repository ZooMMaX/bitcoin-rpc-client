package ru.zoommax.bitcoin.bitcore25.model.wallet;

import lombok.Getter;
import lombok.Setter;
import ru.zoommax.bitcoin.JsonRpcResult;
import ru.zoommax.bitcoin.bitcore25.model.wallet.gettransaction.WTransaction;

/**
 * The type List transactions.
 */
@Getter
@Setter
public class ListTransactions {

    /**
     * The type Result.
     */
    public static class Result extends JsonRpcResult<ListTransactions> {
	}

    /**
     * The Transactions.
     */
    private WTransaction[] transactions;
    /**
     * The Removed.
     */
    private WTransaction[] removed;
    /**
     * The Lastblock.
     */
    private String lastblock;

}
