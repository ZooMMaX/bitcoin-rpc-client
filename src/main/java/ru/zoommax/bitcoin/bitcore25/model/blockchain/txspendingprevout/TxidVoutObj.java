package ru.zoommax.bitcoin.bitcore25.model.blockchain.txspendingprevout;

import lombok.AllArgsConstructor;

/**
 * The type Txid vout obj.
 */
@AllArgsConstructor
public class TxidVoutObj {
    /**
     * The Txid.
     */
    private String txid;
    /**
     * The Vout.
     */
    private long vout;

    /**
     * Gets json object.
     *
     * @return the json object
     */
    public String getJsonObject() {
        return "{\"txid\":\"" + txid + "\",\"vout\":" + vout + "}";
    }
}
