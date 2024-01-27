package ru.zoommax.bitcoin.bitcore25.model.wallet;

import lombok.Getter;
import lombok.Setter;
import ru.zoommax.bitcoin.JsonRpcResult;

@Getter
@Setter
public class ImportFeedback {

	public static class Result extends JsonRpcResult<ImportFeedback[]> {
	}

	public boolean success;
	private String warnings;
	private Object[] error; // TODO JSONRPC error
}
