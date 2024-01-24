package ru.zoommax.bitcoin.bitcore25.model.rawtransactions.decoderawtransaction;

import lombok.Getter;
import lombok.Setter;
import ru.zoommax.bitcoin.bitcore25.model.useany.ScriptPubKey;

@Getter @Setter public class VirtualOutput {
	private double value;
	private long index;
	private ScriptPubKey scriptPubKey;
}