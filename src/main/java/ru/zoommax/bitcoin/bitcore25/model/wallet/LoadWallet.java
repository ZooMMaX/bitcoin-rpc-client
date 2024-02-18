package ru.zoommax.bitcoin.bitcore25.model.wallet;

import lombok.Getter;
import lombok.Setter;
import ru.zoommax.bitcoin.JsonRpcResult;

/**
 * The type Load wallet.
 */
@Getter
@Setter
public class LoadWallet {

    /**
     * The type Result.
     */
    public static class Result extends JsonRpcResult<LoadWallet> {
	}

    /**
     * The Name.
     */
    private String name;
    /**
     * The Warning.
     */
    private String warning;
    /**
     * The Warnings.
     */
    private String[] warnings;

}
