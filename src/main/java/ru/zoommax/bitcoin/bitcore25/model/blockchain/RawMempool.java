package ru.zoommax.bitcoin.bitcore25.model.blockchain;

import lombok.Getter;
import lombok.Setter;
import ru.zoommax.bitcoin.JsonRpcResult;
import ru.zoommax.bitcoin.bitcore25.model.useany.Transaction;

import java.util.HashMap;
import java.util.List;

/**
 * The type Raw mempool.
 */
@Getter
@Setter
public class RawMempool extends Transaction{
    /**
     * The type Result array.
     */
    public static class ResultArray extends JsonRpcResult<String[]> {
    }

    /**
     * The type Result hash map.
     */
    public static class ResultHashMap extends JsonRpcResult<HashMap<String, RawMempool>> {
    }

    /**
     * The type Result.
     */
    public static class Result extends JsonRpcResult<HashMap<String, RawMempool>> {
    }

    //private List<String> txids;

    /**
     * The Mempool sequence.
     */
    private long mempool_sequence;
}
