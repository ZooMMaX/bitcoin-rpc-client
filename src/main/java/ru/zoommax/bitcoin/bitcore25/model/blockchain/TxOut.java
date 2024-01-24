package ru.zoommax.bitcoin.bitcore25.model.blockchain;

import lombok.Getter;
import lombok.Setter;
import ru.zoommax.bitcoin.JsonRpcResult;
import ru.zoommax.bitcoin.bitcore25.model.useany.ScriptPubKey;

/**
 * The type Tx out.
 */
@Getter
@Setter
public class TxOut {
    /**
     * The type Result.
     */
    public static class Result extends JsonRpcResult<TxOut> {
    }

    /**
     * The Bestblock.
     */
    private String bestblock;
    /**
     * The Confirmations.
     */
    private long confirmations;
    /**
     * The Value.
     */
    private double value;
    /**
     * The Script pub key.
     */
    private ScriptPubKey scriptPubKey;
    /**
     * The Coinbase.
     */
    private boolean coinbase;
}
