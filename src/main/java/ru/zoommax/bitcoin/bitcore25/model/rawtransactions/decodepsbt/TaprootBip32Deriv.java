package ru.zoommax.bitcoin.bitcore25.model.rawtransactions.decodepsbt;

import lombok.Getter;
import lombok.Setter;

/**
 * The type Taproot bip 32 deriv.
 */
@Getter @Setter public class TaprootBip32Deriv {
    /**
     * The Pubkey.
     */
    private String pubkey;
    /**
     * The Master fingerprint.
     */
    private String master_fingerprint;
    /**
     * The Path.
     */
    private String path;
    /**
     * The Leaf hashes.
     */
    private String[] leaf_hashes;
}