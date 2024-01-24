package ru.zoommax.bitcoin.bitcore25.model.rawtransactions.decodepsbt;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter public class TaprootScript {
	private String script;
	private long leaf_ver;
	private String[] control_blocks;
}