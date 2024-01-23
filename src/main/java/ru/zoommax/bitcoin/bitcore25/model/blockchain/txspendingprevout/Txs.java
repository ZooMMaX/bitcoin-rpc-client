package ru.zoommax.bitcoin.bitcore25.model.blockchain.txspendingprevout;

import lombok.Getter;
import lombok.Setter;

/**
 * The type Txs.
 */
@Getter
@Setter
public class Txs {
    /**
     * The Txid.
     */
    private String txid;
    /**
     * The Vout.
     */
    private long vout;
    /**
     * The Spendingtxid.
     */
    private String spendingtxid;
}
