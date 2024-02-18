package ru.zoommax.bitcoin.bitcore25.model.wallet.descriptors;

import lombok.Getter;
import lombok.Setter;
import ru.zoommax.bitcoin.JsonRpcResult;

/**
 * The type List descriptors.
 */
@Getter
@Setter
public class ListDescriptors {

    /**
     * The type Result.
     */
    public static class Result extends JsonRpcResult<ListDescriptors> {
	}

    /**
     * The Wallet name.
     */
    private String wallet_name;
    /**
     * The Descriptors.
     */
    private Descriptor[] descriptors;

}
