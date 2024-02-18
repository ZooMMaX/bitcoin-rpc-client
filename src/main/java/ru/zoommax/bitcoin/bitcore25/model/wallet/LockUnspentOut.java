package ru.zoommax.bitcoin.bitcore25.model.wallet;

import lombok.Getter;
import lombok.Setter;
import ru.zoommax.bitcoin.JsonRpcResult;

/**
 * The type Lock unspent out.
 */
@Getter
@Setter
public class LockUnspentOut {

    /**
     * The type Result.
     */
    public static class Result extends JsonRpcResult<LockUnspentOut[]> {
	}

    /**
     * The Txid.
     */
    private String txid;
    /**
     * The Vout.
     */
    private long vout;

}
