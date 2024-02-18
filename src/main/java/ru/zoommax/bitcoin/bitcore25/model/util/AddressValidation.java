package ru.zoommax.bitcoin.bitcore25.model.util;

import lombok.Getter;
import lombok.Setter;
import ru.zoommax.bitcoin.JsonRpcResult;

/**
 * The type Address validation.
 */
@Getter
@Setter
public class AddressValidation {

    /**
     * The type Result.
     */
    public static class Result extends JsonRpcResult<AddressValidation> {
	}

    /**
     * The Isvalid.
     */
    private boolean isvalid;
    /**
     * The Address.
     */
    private String address;
    /**
     * The Script pub key.
     */
    private String scriptPubKey;
    /**
     * The Isscript.
     */
    private boolean isscript;
    /**
     * The Iswitness.
     */
    private boolean iswitness;
    /**
     * The Witness version.
     */
    private long witness_version;
    /**
     * The Witness program.
     */
    private String witness_program;
    /**
     * The Error.
     */
    private String error;
    /**
     * The Error locations.
     */
    private long[] error_locations;

}
