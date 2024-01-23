package ru.zoommax.bitcoin.bitcore25.model.blockchain;

import lombok.Getter;
import lombok.Setter;
import ru.zoommax.bitcoin.JsonRpcResult;
import ru.zoommax.bitcoin.bitcore25.model.useany.Transaction;

/**
 * The type Mempool entry.
 */
@Getter
@Setter
public class MempoolEntry extends Transaction {
    /**
     * The type Result.
     */
    public static class Result extends JsonRpcResult<MempoolEntry> {
    }
}
