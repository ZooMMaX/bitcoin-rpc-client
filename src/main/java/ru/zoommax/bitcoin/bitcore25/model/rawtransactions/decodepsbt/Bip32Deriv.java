package ru.zoommax.bitcoin.bitcore25.model.rawtransactions.decodepsbt;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter public class Bip32Deriv {
	private String pubkey;
	private String master_fingerprint;
	private String path;
}