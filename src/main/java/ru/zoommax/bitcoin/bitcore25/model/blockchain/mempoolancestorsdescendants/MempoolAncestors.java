package ru.zoommax.bitcoin.bitcore25.model.blockchain.mempoolancestorsdescendants;

import lombok.Getter;
import lombok.Setter;
import ru.zoommax.bitcoin.JsonRpcResult;
import ru.zoommax.bitcoin.bitcore25.model.useany.Transaction;

import java.util.HashMap;

/**
 * The type Mempool ancestors.
 */
@Getter
@Setter
public class MempoolAncestors {
    /**
     * The type Result array.
     */
    public static class ResultArray extends JsonRpcResult<String[]> {
    }

    /**
     * The type Result hash map.
     */
    public static class ResultHashMap extends JsonRpcResult<HashMap<String, Transaction>> {
    }

}
