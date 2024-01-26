package ru.zoommax.bitcoin.bitcore25.model.rawtransactions;

import lombok.Getter;
import lombok.Setter;
import ru.zoommax.bitcoin.JsonRpcResult;

/**
 * The type Fund result.
 */
@Getter
@Setter
public class FundResult {

    /**
     * The type Result.
     */
    public static class Result extends JsonRpcResult<FundResult> {
	}

    /**
     * The Hex.
     */
    private String hex;
    /**
     * The Fee.
     */
    private double fee;
    /**
     * The Changepos.
     */
    private long changepos;

}
