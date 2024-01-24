package ru.zoommax.bitcoin.bitcore25.model.mining;

import lombok.Getter;
import lombok.Setter;
import ru.zoommax.bitcoin.JsonRpcResult;

@Getter
@Setter
public class MiningInfo {

	public static class Result extends JsonRpcResult<MiningInfo> {
	}

	private long blocks;
	private long currentblockweight;
	private long currentblocktx;
	private double difficulty;
	private long networkhashps;
	private long pooledtx;
	private String chain;
	private String warnings;
}
