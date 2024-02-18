package ru.zoommax.bitcoin.bitcore25.model.wallet;

import lombok.Getter;
import lombok.Setter;
import ru.zoommax.bitcoin.JsonRpcResult;

/**
 * The type Wallet destination.
 */
@Getter
@Setter
public class WalletDestination {

    /**
     * The type Result.
     */
    public static class Result extends JsonRpcResult<WalletDestination> {
	}

    /**
     * The Filename.
     */
    private String filename;

}
