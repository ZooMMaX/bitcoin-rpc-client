package ru.zoommax.bitcoin.bitcore25.model.util;

import lombok.Getter;
import lombok.Setter;
import ru.zoommax.bitcoin.JsonRpcResult;

@Getter
@Setter
public class MultiSig {

	public static class Result extends JsonRpcResult<MultiSig> {
	}

	private String address;
	private String redeemScript;
	private String descriptor;
	private String[] warnings;

}
