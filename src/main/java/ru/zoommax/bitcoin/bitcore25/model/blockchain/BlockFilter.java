package ru.zoommax.bitcoin.bitcore25.model.blockchain;

import lombok.Getter;
import lombok.Setter;
import ru.zoommax.bitcoin.JsonRpcResult;

/**
 * The type Block filter.
 */
@Getter
@Setter
public class BlockFilter {

    /**
     * The type Result.
     */
    public static class Result extends JsonRpcResult<BlockFilter> {
    }

    /**
     * The Filter.
     */
    private String filter;
    /**
     * The Header.
     */
    private String header;
}
