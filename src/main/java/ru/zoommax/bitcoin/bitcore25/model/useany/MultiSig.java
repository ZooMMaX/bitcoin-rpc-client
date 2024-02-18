package ru.zoommax.bitcoin.bitcore25.model.useany;

import lombok.Getter;
import lombok.Setter;
import ru.zoommax.bitcoin.JsonRpcResult;

/**
 * The type Multi sig.
 */
@Getter
@Setter
public class MultiSig {

    /**
     * The type Result.
     */
    public static class Result extends JsonRpcResult<MultiSig> {
	}

    /**
     * The Address.
     */
    private String address;
    /**
     * The Redeem script.
     */
    private String redeemScript;
    /**
     * The Descriptor.
     */
    private String descriptor;
    /**
     * The Warnings.
     */
    private String[] warnings;

}
