package ru.zoommax.bitcoin.bitcore25.model.control.memoryinfo;

import lombok.Getter;
import lombok.Setter;
import ru.zoommax.bitcoin.JsonRpcResult;

@Getter
@Setter
public class MemoryInfo {

	public static class Result extends JsonRpcResult<MemoryInfo> {
	}

	private Locked locked;

}
