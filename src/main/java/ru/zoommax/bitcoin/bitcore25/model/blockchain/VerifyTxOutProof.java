package ru.zoommax.bitcoin.bitcore25.model.blockchain;

import lombok.Getter;
import lombok.Setter;
import ru.zoommax.bitcoin.JsonRpcResult;
import ru.zoommax.bitcoin.bitcore25.model.useany.ArrayValue;

/**
 * The type Verify tx out proof.
 */
@Getter
@Setter
public class VerifyTxOutProof extends ArrayValue<String> {
    /**
     * The type Result.
     */
    public static class Result extends JsonRpcResult<VerifyTxOutProof> {
    }
}
