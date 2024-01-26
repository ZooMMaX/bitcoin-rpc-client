package ru.zoommax.bitcoin.bitcore25.model.rawtransactions.signrawwithkey;

import lombok.Getter;
import lombok.Setter;
import ru.zoommax.bitcoin.JsonRpcResult;

/**
 * The type Sign raw transaction with key.
 */
@Getter
@Setter
public class SignRawTransactionWithKey {

    /**
     * The type Result.
     */
    public static class Result extends JsonRpcResult<SignRawTransactionWithKey> {
	}

    /**
     * The Hex.
     */
    private String hex;
    /**
     * The Complete.
     */
    private boolean complete;
    /**
     * The Errors.
     */
    private Error[] errors;

    /**
     * The type Error.
     */
    @Getter @Setter public class Error {
        /**
         * The Txid.
         */
        private String txid;
        /**
         * The Vout.
         */
        private long vout;
        /**
         * The Witness.
         */
        private String[] witness;
        /**
         * The Script sig.
         */
        private String scriptSig;
        /**
         * The Sequence.
         */
        private long sequence;
        /**
         * The Error.
         */
        private String error;
	}

}
