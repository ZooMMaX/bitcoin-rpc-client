package ru.zoommax.bitcoin.bitcore25.model.blockchain.txout;

import lombok.Getter;
import lombok.Setter;

/**
 * The type Script pub key.
 */
@Getter
@Setter
public class ScriptPubKey {
    /**
     * The Asm.
     */
    private String asm;
    /**
     * The Desc.
     */
    private String desc;
    /**
     * The Hex.
     */
    private String hex;
    /**
     * The Type.
     */
    private String type;
    /**
     * The Address.
     */
    private String address;
}
