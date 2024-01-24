package ru.zoommax.bitcoin.bitcore25.model.rawtransactions.decodepsbt;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Proprietary {
	private String identifier;
	private long subtype;
	private String key;
	private String value;
}
