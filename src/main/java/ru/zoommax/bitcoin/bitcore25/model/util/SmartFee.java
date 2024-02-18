package ru.zoommax.bitcoin.bitcore25.model.util;

import lombok.Getter;
import lombok.Setter;
import ru.zoommax.bitcoin.JsonRpcResult;

/**
 * The type Smart fee.
 */
@Getter
@Setter
public class SmartFee {

    /**
     * The type Result.
     */
    public static class Result extends JsonRpcResult<SmartFee> {
	}

    /**
     * The Feerate.
     */
    private double feerate;
    /**
     * The Errors.
     */
    private String[] errors;
    /**
     * The Blocks.
     */
    private long blocks;

}
