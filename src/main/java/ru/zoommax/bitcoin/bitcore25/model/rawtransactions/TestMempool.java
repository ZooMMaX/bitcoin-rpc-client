package ru.zoommax.bitcoin.bitcore25.model.rawtransactions;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;
import ru.zoommax.bitcoin.JsonRpcResult;

@Getter
@Setter
public class TestMempool {

	public static class Result extends JsonRpcResult<TestMempool[]> {
	}

	private String txid;
	private String wtxid;
	@JsonProperty("package-error")
	private String package_error;
	private boolean allowed;
	private long vsize;
	private Fees fees;
	@JsonProperty("reject-reason")
	private String rejectReason;

	@Getter @Setter public class Fees {
		private double base;
		@JsonProperty("effective-feerate")
		private double effectiveFeeRate;
		@JsonProperty("effective-includes")
		private String[] effectiveIncludes;
	}

}
