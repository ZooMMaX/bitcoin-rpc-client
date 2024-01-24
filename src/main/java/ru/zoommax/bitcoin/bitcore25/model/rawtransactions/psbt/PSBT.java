package ru.zoommax.bitcoin.bitcore25.model.rawtransactions.psbt;

import lombok.Getter;
import lombok.Setter;
import ru.zoommax.bitcoin.JsonRpcResult;

@Getter
@Setter
public class PSBT {

	public static class Result extends JsonRpcResult<PSBT> {
	}

	private Inputs[] inputs;
	private long estimated_vsize;
	private double estimated_feerate;
	private double fee;
	private String next;
	private String error;

}
