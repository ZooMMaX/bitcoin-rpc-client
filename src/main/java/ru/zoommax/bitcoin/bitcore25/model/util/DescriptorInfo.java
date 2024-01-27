package ru.zoommax.bitcoin.bitcore25.model.util;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;
import ru.zoommax.bitcoin.JsonRpcResult;

@Getter
@Setter
public class DescriptorInfo {

	public static class Result extends JsonRpcResult<DescriptorInfo> {
	}

	private String descriptor;
	private String checksum;
	private boolean isrange;
	private boolean issolvable;
	@JsonProperty("hasprivatekeys")
	private boolean hasPrivateKeys;

}
