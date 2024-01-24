package ru.zoommax.bitcoin.bitcore25.model.rawtransactions.decoderawtransaction;

import lombok.Getter;
import lombok.Setter;
import ru.zoommax.bitcoin.bitcore25.model.useany.ScriptSig;

@Getter @Setter public class VirtualInput {
	private String coinbase;
	private String txid;
	private long vout;
	private ScriptSig scriptSig;
	private String[] txinwitness;
	private long sequence;
}