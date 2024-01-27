package ru.zoommax.bitcoin.bitcore25.model.wallet;

import java.util.Map;

import lombok.Getter;
import lombok.Setter;
import ru.zoommax.bitcoin.JsonRpcResult;

@Getter
@Setter
public class AddressPurpose {

	public static class ResultMap extends JsonRpcResult<Map<String,AddressPurpose>> {
	}

	private String purpose;

}
