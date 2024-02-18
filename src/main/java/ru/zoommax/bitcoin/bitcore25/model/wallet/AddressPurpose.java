package ru.zoommax.bitcoin.bitcore25.model.wallet;

import java.util.Map;

import lombok.Getter;
import lombok.Setter;
import ru.zoommax.bitcoin.JsonRpcResult;

/**
 * The type Address purpose.
 */
@Getter
@Setter
public class AddressPurpose {

    /**
     * The type Result map.
     */
    public static class ResultMap extends JsonRpcResult<Map<String,AddressPurpose>> {
	}

    /**
     * The Purpose.
     */
    private String purpose;

}
