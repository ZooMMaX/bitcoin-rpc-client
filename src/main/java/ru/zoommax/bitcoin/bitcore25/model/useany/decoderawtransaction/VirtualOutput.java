package ru.zoommax.bitcoin.bitcore25.model.useany.decoderawtransaction;

import lombok.Getter;
import lombok.Setter;
import ru.zoommax.bitcoin.bitcore25.model.useany.ScriptPubKey;

/**
 * The type Virtual output.
 */
@Getter @Setter public class VirtualOutput {
    /**
     * The Value.
     */
    private double value;
    /**
     * The Index.
     */
    private long index;
    /**
     * The Script pub key.
     */
    private ScriptPubKey scriptPubKey;
}