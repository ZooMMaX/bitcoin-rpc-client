package ru.zoommax.bitcoin.bitcore25.model.rawtransactions.decodescript;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter public class SegWit {
	private String asm;
	private String hex;
	private String type;
	private String address;
	private String desc;
	@JsonProperty("p2sh-segwit")
	private String p2sh_segwit;
}