package ru.zoommax.bitcoin.bitcore25.model.rawtransactions.psbt;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Inputs {

	private boolean has_utxo;
	private boolean isfinal;
	private Inputs.Missing missing;
	private String next;

	@Getter @Setter public class Missing {

		private String[] pubkeys;
		private String[] signatures;
		@JsonProperty("redeemscript")
		private String redeemScript;
		@JsonProperty("withnessscript")
		private String withnessScript;

	}

}
