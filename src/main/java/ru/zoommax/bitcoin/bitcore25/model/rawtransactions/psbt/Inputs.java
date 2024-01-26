package ru.zoommax.bitcoin.bitcore25.model.rawtransactions.psbt;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;

/**
 * The type Inputs.
 */
@Getter
@Setter
public class Inputs {

    /**
     * The Has utxo.
     */
    private boolean has_utxo;
    /**
     * The Isfinal.
     */
    private boolean isfinal;
    /**
     * The Missing.
     */
    private Inputs.Missing missing;
    /**
     * The Next.
     */
    private String next;

    /**
     * The type Missing.
     */
    @Getter @Setter public class Missing {

        /**
         * The Pubkeys.
         */
        private String[] pubkeys;
        /**
         * The Signatures.
         */
        private String[] signatures;
        /**
         * The Redeem script.
         */
        @JsonProperty("redeemscript")
		private String redeemScript;
        /**
         * The Withness script.
         */
        @JsonProperty("withnessscript")
		private String withnessScript;

	}

}
