package ru.zoommax.bitcoin.bitcore25.model.rawtransactions.decodepsbt;

import lombok.Getter;
import lombok.Setter;

/**
 * The type Taproot script path sig.
 */
@Getter @Setter public class TaprootScriptPathSig {
    /**
     * The Pubkey.
     */
    private String pubkey;
    /**
     * The Leaf hash.
     */
    private String leaf_hash;
    /**
     * The Sig.
     */
    private String sig;
}