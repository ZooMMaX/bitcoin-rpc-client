package ru.zoommax.bitcoin.bitcore25.model.rawtransactions.decodepsbt;

import lombok.Getter;
import lombok.Setter;

/**
 * The type X pub.
 */
@Getter
@Setter
public class XPub {
    /**
     * The Xpub.
     */
    private String xpub;
    /**
     * The Master fingerprint.
     */
    private String master_fingerprint;
    /**
     * The Path.
     */
    private String path;
}
