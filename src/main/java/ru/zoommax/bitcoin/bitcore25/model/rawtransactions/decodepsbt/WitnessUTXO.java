package ru.zoommax.bitcoin.bitcore25.model.rawtransactions.decodepsbt;

import lombok.Getter;
import lombok.Setter;
import ru.zoommax.bitcoin.bitcore25.model.useany.ScriptPubKey;

@Getter @Setter public class WitnessUTXO {
	private long amount;
	private ScriptPubKey scriptPubKey;
}