package ru.zoommax.bitcoin.bitcore25.model.rawtransactions.decodepsbt;

import lombok.Getter;
import lombok.Setter;
import ru.zoommax.bitcoin.bitcore25.model.useany.ScriptPubKey;

/**
 * The type Witness utxo.
 */
@Getter @Setter public class WitnessUTXO {
    /**
     * The Amount.
     */
    private long amount;
    /**
     * The Script pub key.
     */
    private ScriptPubKey scriptPubKey;
}