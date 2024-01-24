package ru.zoommax.bitcoin.bitcore25.model.rawtransactions.decodepsbt;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter public class Taproot {
	private long depth;
	private long leaf_ver;
	private String script;
}