package ru.zoommax.bitcoin.bitcore25.model.rawtransactions;

import lombok.Getter;
import lombok.Setter;
import ru.zoommax.bitcoin.JsonRpcResult;

@Getter
@Setter
public class FinalizedPSBT {

	public static class Result extends JsonRpcResult<FinalizedPSBT> {
	}

	private String pbst;
	private String hex;
	private boolean complete;

}
