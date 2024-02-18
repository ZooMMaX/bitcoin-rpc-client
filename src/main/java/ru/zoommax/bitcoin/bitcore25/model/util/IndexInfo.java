package ru.zoommax.bitcoin.bitcore25.model.util;

import java.util.Map;

import lombok.Getter;
import lombok.Setter;
import ru.zoommax.bitcoin.JsonRpcResult;

/**
 * The type Index info.
 */
@Getter
@Setter
public class IndexInfo {

    /**
     * The type Result map.
     */
    public static class ResultMap extends JsonRpcResult<Map<String,IndexInfo>> {
	}

    /**
     * The Synced.
     */
    private boolean synced;
    /**
     * The Best block height.
     */
    private long best_block_height;

}
