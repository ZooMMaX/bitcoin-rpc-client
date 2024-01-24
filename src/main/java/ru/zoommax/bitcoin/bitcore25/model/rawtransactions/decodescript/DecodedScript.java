package ru.zoommax.bitcoin.bitcore25.model.rawtransactions.decodescript;

import lombok.Getter;
import lombok.Setter;
import ru.zoommax.bitcoin.JsonRpcResult;

@Getter
@Setter
public class DecodedScript {

	public static class Result extends JsonRpcResult<DecodedScript> {
	}

	private String asm;
	private String desc;
	private String type;
	private String address;
	private String p2sh;
	private SegWit segwit;

}
