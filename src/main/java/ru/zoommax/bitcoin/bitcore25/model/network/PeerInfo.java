package ru.zoommax.bitcoin.bitcore25.model.network;

import java.util.HashMap;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;
import ru.zoommax.bitcoin.JsonRpcResult;

/**
 * The type Peer info.
 */
@Getter
@Setter
public class PeerInfo {

    /**
     * The type Result.
     */
    public static class Result extends JsonRpcResult<PeerInfo[]> {
	}

    /**
     * The Id.
     */
    private long id;
    /**
     * The Session id.
     */
    private long session_id;
    /**
     * The Addr.
     */
    private String addr;
    /**
     * The Addrbind.
     */
    private String addrbind;
    /**
     * The Addrlocal.
     */
    private String addrlocal;
    /**
     * The Network.
     */
    private String network;
    /**
     * The Transport protocol type.
     */
    private String transport_protocol_type;
    /**
     * The Mapped as.
     */
    private long mapped_as;
    /**
     * The Services.
     */
    private String services;
    /**
     * The Servicesnames.
     */
    private String[] servicesnames;
    /**
     * The Relaytxes.
     */
    private boolean relaytxes;
    /**
     * The Lastsend.
     */
    private long lastsend;
    /**
     * The Lastrecv.
     */
    private long lastrecv;
    /**
     * The Last transaction.
     */
    private long last_transaction;
    /**
     * The Last block.
     */
    private long last_block;
    /**
     * The Bytes sent.
     */
    @JsonProperty("bytessent")
	private long bytesSent;
    /**
     * The Bytes received.
     */
    @JsonProperty("bytesrecv")
	private long bytesReceived;
    /**
     * The Conntime.
     */
    private long conntime;
    /**
     * The Timeoffset.
     */
    private long timeoffset;
    /**
     * The Pingtime.
     */
    private long pingtime;
    /**
     * The Minping.
     */
    private long minping;
    /**
     * The Pingwait.
     */
    private long pingwait;
    /**
     * The Version.
     */
    private long version;
    /**
     * The Subversion.
     */
    @JsonProperty("subver")
	private String subversion;
    /**
     * The Inbound.
     */
    private boolean inbound;
    /**
     * The Bip 152 hb to.
     */
    private boolean bip152_hb_to;
    /**
     * The Bip 152 hb from.
     */
    private boolean bip152_hb_from;
    /**
     * The Startingheight.
     */
    private long startingheight;
    /**
     * The Presynced headers.
     */
    private long presynced_headers;
    /**
     * The Synced headers.
     */
    private long synced_headers;
    /**
     * The Synced blocks.
     */
    private long synced_blocks;
    /**
     * The Inflight.
     */
    private long[] inflight;
    /**
     * The Addr relay enabled.
     */
    private boolean addr_relay_enabled;
    /**
     * The Addr processed.
     */
    private long addr_processed;
    /**
     * The Addr rate limited.
     */
    private long addr_rate_limited;
    /**
     * The Permissions.
     */
    private String[] permissions;
    /**
     * The Minfeefilter.
     */
    private double minfeefilter;
    /**
     * The Bytessent per msg.
     */
    private HashMap<String,Long> bytessent_per_msg;
    /**
     * The Bytesrecv per msg.
     */
    private HashMap<String,Long> bytesrecv_per_msg;
    /**
     * The Connection type.
     */
    private String connection_type;

}
