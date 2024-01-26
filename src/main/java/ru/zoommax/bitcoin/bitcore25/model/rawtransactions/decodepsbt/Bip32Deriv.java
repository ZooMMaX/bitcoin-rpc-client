package ru.zoommax.bitcoin.bitcore25.model.rawtransactions.decodepsbt;

import lombok.Getter;
import lombok.Setter;

/**
 * The type Bip 32 deriv.
 */
@Getter @Setter public class Bip32Deriv {
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
}