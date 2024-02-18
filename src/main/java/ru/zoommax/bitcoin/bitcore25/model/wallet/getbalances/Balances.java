package ru.zoommax.bitcoin.bitcore25.model.wallet.getbalances;

import lombok.Getter;
import lombok.Setter;
import ru.zoommax.bitcoin.JsonRpcResult;

/**
 * The type Balances.
 */
@Getter
@Setter
public class Balances {

    /**
     * The type Result.
     */
    public static class Result extends JsonRpcResult<Balances> {
	}

    /**
     * The Mine.
     */
    private Mine mine;
    /**
     * The Watchonly.
     */
    private WatchOnly watchonly;

}
