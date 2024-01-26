package ru.zoommax.bitcoin.bitcore25.model.rawtransactions.decoderawtransaction;

import lombok.Getter;
import lombok.Setter;
import ru.zoommax.bitcoin.bitcore25.model.useany.ScriptSig;

/**
 * The type Virtual input.
 */
@Getter @Setter public class VirtualInput {
    /**
     * The Coinbase.
     */
    private String coinbase;
    /**
     * The Txid.
     */
    private String txid;
    /**
     * The Vout.
     */
    private long vout;
    /**
     * The Script sig.
     */
    private ScriptSig scriptSig;
    /**
     * The Txinwitness.
     */
    private String[] txinwitness;
    /**
     * The Sequence.
     */
    private long sequence;
}