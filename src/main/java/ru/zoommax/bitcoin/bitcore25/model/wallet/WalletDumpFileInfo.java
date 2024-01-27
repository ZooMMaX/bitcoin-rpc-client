package ru.zoommax.bitcoin.bitcore25.model.wallet;

import lombok.Getter;
import lombok.Setter;
import ru.zoommax.bitcoin.JsonRpcResult;

@Getter
@Setter
public class WalletDumpFileInfo {

	public static class Result extends JsonRpcResult<WalletDumpFileInfo> {
	}

	private String filename;

}
