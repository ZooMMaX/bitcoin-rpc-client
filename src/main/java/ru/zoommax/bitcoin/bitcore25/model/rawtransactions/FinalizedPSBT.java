package ru.zoommax.bitcoin.bitcore25.model.rawtransactions;

import lombok.Getter;
import lombok.Setter;
import ru.zoommax.bitcoin.JsonRpcResult;

/**
 * The type Finalized psbt.
 */
@Getter
@Setter
public class FinalizedPSBT {

    /**
     * The type Result.
     */
    public static class Result extends JsonRpcResult<FinalizedPSBT> {
	}

    /**
     * The Pbst.
     */
    private String pbst;
    /**
     * The Hex.
     */
    private String hex;
    /**
     * The Complete.
     */
    private boolean complete;

}
