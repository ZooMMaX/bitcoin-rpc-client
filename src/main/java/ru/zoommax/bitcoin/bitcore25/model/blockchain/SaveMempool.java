package ru.zoommax.bitcoin.bitcore25.model.blockchain;

import lombok.Getter;
import lombok.Setter;
import ru.zoommax.bitcoin.JsonRpcResult;

/**
 * The type Save mempool.
 */
@Getter
@Setter
public class SaveMempool {
    /**
     * The type Result.
     */
    public static class Result extends JsonRpcResult<SaveMempool> {
    }

    /**
     * The Filename.
     */
    private String filename;
}
