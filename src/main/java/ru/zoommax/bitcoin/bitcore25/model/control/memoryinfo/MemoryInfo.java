package ru.zoommax.bitcoin.bitcore25.model.control.memoryinfo;

import lombok.Getter;
import lombok.Setter;
import ru.zoommax.bitcoin.JsonRpcResult;
import ru.zoommax.bitcoin.bitcore25.model.useany.StringValue;

@Getter
@Setter
public class MemoryInfo {

	public static class Result extends JsonRpcResult<MemoryInfo> {
	}

	public static class ResultMallocInfo extends JsonRpcResult<StringValue> {
	}

	private Locked locked;

}
