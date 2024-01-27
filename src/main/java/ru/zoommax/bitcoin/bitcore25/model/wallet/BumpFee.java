package ru.zoommax.bitcoin.bitcore25.model.wallet;

import lombok.Getter;
import lombok.Setter;
import ru.zoommax.bitcoin.JsonRpcResult;

@Getter
@Setter
public class BumpFee {

	public static class Result extends JsonRpcResult<BumpFee> {
	}

	private String txid;
	private double origfee;
	private double fee;
	private String[] errors;

}
