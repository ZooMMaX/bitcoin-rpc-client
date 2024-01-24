package ru.zoommax.bitcoin.bitcore25.model.network;

import java.util.HashMap;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;
import ru.zoommax.bitcoin.JsonRpcResult;

@Getter
@Setter
public class PeerInfo {

	public static class Result extends JsonRpcResult<PeerInfo[]> {
	}

	private long id;
	private long session_id;
	private String addr;
	private String addrbind;
	private String addrlocal;
	private String network;
	private String transport_protocol_type;
	private long mapped_as;
	private String services;
	private String[] servicesnames;
	private boolean relaytxes;
	private long lastsend;
	private long lastrecv;
	private long last_transaction;
	private long last_block;
	@JsonProperty("bytessent")
	private long bytesSent;
	@JsonProperty("bytesrecv")
	private long bytesReceived;
	private long conntime;
	private long timeoffset;
	private long pingtime;
	private long minping;
	private long pingwait;
	private long version;
	@JsonProperty("subver")
	private String subversion;
	private boolean inbound;
	private boolean bip152_hb_to;
	private boolean bip152_hb_from;
	private long startingheight;
	private long presynced_headers;
	private long synced_headers;
	private long synced_blocks;
	private long[] inflight;
	private boolean addr_relay_enabled;
	private long addr_processed;
	private long addr_rate_limited;
	private String[] permissions;
	private double minfeefilter;
	private HashMap<String,Long> bytessent_per_msg;
	private HashMap<String,Long> bytesrecv_per_msg;
	private String connection_type;

}
