package ru.zoommax.bitcoin.bitcore25.model.wallet.listwalletsdir;

import lombok.Getter;
import lombok.Setter;
import ru.zoommax.bitcoin.JsonRpcResult;

/**
 * The type List wallets dir.
 */
@Getter
@Setter
public class ListWalletsDir {

    /**
     * The type Result.
     */
    public static class Result extends JsonRpcResult<ListWalletsDir> {
	}

    /**
     * The Wallets.
     */
    private WalletDir[] wallets;
}
