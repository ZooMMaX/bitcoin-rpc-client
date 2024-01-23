package ru.zoommax.bitcoin.bitcore25.model.blockchain.txspendingprevout;

import lombok.Getter;
import lombok.Setter;
import ru.zoommax.bitcoin.JsonRpcResult;

import java.util.HashMap;

/**
 * The type Tx spending prevout.
 */
@Getter
@Setter
public class TxSpendingPrevout extends HashMap<String, Txs> {
    /**
     * The type Result.
     */
    public static class Result extends JsonRpcResult<TxSpendingPrevout> {
    }
}
