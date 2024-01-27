package ru.zoommax.bitcoin.bitcore25.model.util;

import lombok.Getter;
import lombok.Setter;
import ru.zoommax.bitcoin.JsonRpcResult;

@Getter
@Setter
public class AddressValidation {

	public static class Result extends JsonRpcResult<AddressValidation> {
	}

	private boolean isvalid;
	private String address;
	private String scriptPubKey;
	private boolean isscript;
	private boolean iswitness;
	private long witness_version;
	private String witness_program;
	private String error;
	private long[] error_locations;

}
