package ru.zoommax.bitcoin.bitcore25.model.rawtransactions.psbt;

import lombok.Getter;
import lombok.Setter;
import ru.zoommax.bitcoin.JsonRpcResult;

/**
 * The type Psbt.
 */
@Getter
@Setter
public class PSBT {

    /**
     * The type Result.
     */
    public static class Result extends JsonRpcResult<PSBT> {
	}

    /**
     * The Inputs.
     */
    private Inputs[] inputs;
    /**
     * The Estimated vsize.
     */
    private long estimated_vsize;
    /**
     * The Estimated feerate.
     */
    private double estimated_feerate;
    /**
     * The Fee.
     */
    private double fee;
    /**
     * The Next.
     */
    private String next;
    /**
     * The Error.
     */
    private String error;

}
