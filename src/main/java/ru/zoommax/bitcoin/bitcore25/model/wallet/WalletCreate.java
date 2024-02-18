package ru.zoommax.bitcoin.bitcore25.model.wallet;

import lombok.Getter;
import lombok.Setter;
import ru.zoommax.bitcoin.JsonRpcResult;

/**
 * The type Wallet create.
 */
@Getter
@Setter
public class WalletCreate {

    /**
     * The type Result.
     */
    public static class Result extends JsonRpcResult<WalletCreate> {
	}

    /**
     * The Name.
     */
    private String name;
    /**
     * The Warning.
     */
    private String warning; // This var is deprecated from rpcapi side, check warnings[] first
    /**
     * The Warnings.
     */
    private String[] warnings;

}
