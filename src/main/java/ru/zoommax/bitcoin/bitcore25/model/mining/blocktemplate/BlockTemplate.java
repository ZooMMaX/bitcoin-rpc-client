package ru.zoommax.bitcoin.bitcore25.model.mining.blocktemplate;

import java.util.Map;

import lombok.Getter;
import lombok.Setter;
import ru.zoommax.bitcoin.JsonRpcResult;
import ru.zoommax.bitcoin.bitcore25.model.useany.StringValue;

@Getter
@Setter
public class BlockTemplate {

	public static class Result extends JsonRpcResult<BlockTemplate> {
	}

	public static class ResultNonProposal extends JsonRpcResult<StringValue> {
	}

	private long version;
	private String[] rules;
	private Map<String, Long> vbavailable;
	private String[] capabilities;
	private long vbrequired;
	private String previousblockhash;
	private Object transactions; // TODO
	private Map<String,String> coinbaseaux;
	private long coinbasevalue;
	private String longpollid;
	private String target;
	private long mintime;
	private String[] mutable;
	private String noncerange;
	private long sigoplimit;
	private long sizelimit;
	private long weightlimit;
	private long curtime;
	private String bits;
	private long height;
	private String signet_challenge;
	private String default_witness_commitment;

}
