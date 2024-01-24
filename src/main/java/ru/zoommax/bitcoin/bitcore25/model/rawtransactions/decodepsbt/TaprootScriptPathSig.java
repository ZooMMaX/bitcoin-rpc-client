package ru.zoommax.bitcoin.bitcore25.model.rawtransactions.decodepsbt;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter public class TaprootScriptPathSig {
	private String pubkey;
	private String leaf_hash;
	private String sig;
}