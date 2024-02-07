package ru.zoommax.bitcoin.bitcore25.model.wallet.listwalletsdir;

import lombok.Getter;
import lombok.Setter;
import ru.zoommax.bitcoin.JsonRpcResult;

@Getter
@Setter
public class ListWalletsDir {

	public static class Result extends JsonRpcResult<ListWalletsDir> {
	}

	private WalletDir[] wallets;
}
