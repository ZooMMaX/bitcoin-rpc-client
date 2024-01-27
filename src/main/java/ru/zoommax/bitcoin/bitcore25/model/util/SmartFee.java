package ru.zoommax.bitcoin.bitcore25.model.util;

import lombok.Getter;
import lombok.Setter;
import ru.zoommax.bitcoin.JsonRpcResult;

@Getter
@Setter
public class SmartFee {

	public static class Result extends JsonRpcResult<SmartFee> {
	}

	private double feerate;
	private String[] errors;
	private long blocks;

}
