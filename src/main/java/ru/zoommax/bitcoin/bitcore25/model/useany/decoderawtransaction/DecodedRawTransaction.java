package ru.zoommax.bitcoin.bitcore25.model.useany.decoderawtransaction;

import lombok.Getter;
import lombok.Setter;
import ru.zoommax.bitcoin.JsonRpcResult;

/**
 * The type Decoded raw transaction.
 */
@Getter
@Setter
public class DecodedRawTransaction {

    /**
     * The type Result.
     */
    public static class Result extends JsonRpcResult<DecodedRawTransaction> {
	}

    /**
     * The Txid.
     */
    private String txid;
    /**
     * The Hash.
     */
    private String hash;
    /**
     * The Size.
     */
    private long size;
    /**
     * The Vsize.
     */
    private long vsize;
    /**
     * The Weight.
     */
    private long weight;
    /**
     * The Version.
     */
    private long version;
    /**
     * The Locktime.
     */
    private long locktime;
    /**
     * The Vin.
     */
    private VirtualInput[] vin;
    /**
     * The Vout.
     */
    private VirtualOutput[] vout;

}
