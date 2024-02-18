package ru.zoommax.bitcoin.bitcore25.model.util;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;
import ru.zoommax.bitcoin.JsonRpcResult;

/**
 * The type Descriptor info.
 */
@Getter
@Setter
public class DescriptorInfo {

    /**
     * The type Result.
     */
    public static class Result extends JsonRpcResult<DescriptorInfo> {
	}

    /**
     * The Descriptor.
     */
    private String descriptor;
    /**
     * The Checksum.
     */
    private String checksum;
    /**
     * The Isrange.
     */
    private boolean isrange;
    /**
     * The Issolvable.
     */
    private boolean issolvable;
    /**
     * The Has private keys.
     */
    @JsonProperty("hasprivatekeys")
	private boolean hasPrivateKeys;

}
