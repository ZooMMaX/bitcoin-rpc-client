package ru.zoommax.bitcoin.bitcore25.model.util;

import java.util.Map;

import lombok.Getter;
import lombok.Setter;
import ru.zoommax.bitcoin.JsonRpcResult;

@Getter
@Setter
public class IndexInfo {

	public static class ResultMap extends JsonRpcResult<Map<String,IndexInfo>> {
	}

	private boolean synced;
	private long best_block_height;

}
