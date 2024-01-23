package ru.zoommax.bitcoin.bitcore25.model.blockchain.scantxoutset;

import lombok.Getter;
import lombok.Setter;

/**
 * The type Unspents.
 */
@Getter
@Setter
public class Unspents {
    /**
     * The Txid.
     */
    private String txid;
    /**
     * The Vout.
     */
    private long vout;
    /**
     * The Script pub key.
     */
    private String scriptPubKey;
    /**
     * The Desc.
     */
    private String desc;
    /**
     * The Amount.
     */
    private double amount;
    /**
     * The Coinbase.
     */
    private boolean coinbase;
    /**
     * The Height.
     */
    private long height;
}
