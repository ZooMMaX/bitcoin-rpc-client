package ru.zoommax.bitcoin.bitcore25.model.rawtransactions.decodepsbt;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter public class Script {
	private String asm;
	private String hex;
	private String type;
}