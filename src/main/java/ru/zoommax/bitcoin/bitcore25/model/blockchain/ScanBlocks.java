package ru.zoommax.bitcoin.bitcore25.model.blockchain;

import lombok.Getter;
import lombok.Setter;
import ru.zoommax.bitcoin.JsonRpcResult;
import ru.zoommax.bitcoin.bitcore25.model.useany.BooleanValue;

/**
 * The type Scan blocks.
 */
@Getter
@Setter
public class ScanBlocks extends BooleanValue {
    /**
     * The type Result.
     */
    public static class Result extends JsonRpcResult<ScanBlocks> {
    }

    /**
     * The From height.
     */
    private long from_height;
    /**
     * The To height.
     */
    private long to_height;
    /**
     * The Relevant blocks.
     */
    private String[] relevant_blocks;

    /**
     * The Progress.
     */
    private double progress;
    /**
     * The Current height.
     */
    private long current_height;
}
