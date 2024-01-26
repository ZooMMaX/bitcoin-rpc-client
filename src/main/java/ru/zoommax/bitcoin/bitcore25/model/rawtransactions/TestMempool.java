package ru.zoommax.bitcoin.bitcore25.model.rawtransactions;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;
import ru.zoommax.bitcoin.JsonRpcResult;

/**
 * The type Test mempool.
 */
@Getter
@Setter
public class TestMempool {

    /**
     * The type Result.
     */
    public static class Result extends JsonRpcResult<TestMempool[]> {
	}

    /**
     * The Txid.
     */
    private String txid;
    /**
     * The Wtxid.
     */
    private String wtxid;
    /**
     * The Package error.
     */
    @JsonProperty("package-error")
	private String package_error;
    /**
     * The Allowed.
     */
    private boolean allowed;
    /**
     * The Vsize.
     */
    private long vsize;
    /**
     * The Fees.
     */
    private Fees fees;
    /**
     * The Reject reason.
     */
    @JsonProperty("reject-reason")
	private String rejectReason;

    /**
     * The type Fees.
     */
    @Getter @Setter public class Fees {
        /**
         * The Base.
         */
        private double base;
        /**
         * The Effective fee rate.
         */
        @JsonProperty("effective-feerate")
		private double effectiveFeeRate;
        /**
         * The Effective includes.
         */
        @JsonProperty("effective-includes")
		private String[] effectiveIncludes;
	}

}
