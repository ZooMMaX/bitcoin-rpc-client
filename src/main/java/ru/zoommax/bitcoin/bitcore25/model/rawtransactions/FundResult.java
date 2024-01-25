package ru.zoommax.bitcoin.bitcore25.model.rawtransactions;

import lombok.Getter;
import lombok.Setter;
import ru.zoommax.bitcoin.JsonRpcResult;

@Getter
@Setter
public class FundResult {

	public static class Result extends JsonRpcResult<FundResult> {
	}

	private String hex;
	private double fee;
	private long changepos;

}
