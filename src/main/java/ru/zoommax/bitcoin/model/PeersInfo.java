package ru.zoommax.bitcoin.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import ru.zoommax.bitcoin.JsonRpcResult;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PeersInfo {
    public static class Result extends JsonRpcResult<PeersInfo[]> {
    }

    private int id;
    private String addr;
    private String addrbind;
    private String addrlocal;
    private String network;
    private String services;
    private String[] servicesnames;
    private boolean relaytxes;
    private long lastsend;
    private long lastrecv;
    @JsonProperty("last_transaction")
    private long lastTransaction;
    @JsonProperty("last_block")
    private long lastBlock;
    private long bytessent;
    private long bytesrecv;
    private long conntime;
    private long timeoffset;
    private double pingtime;
    private double minping;
    private int version;
    private String subver;
    private boolean inbound;
    @JsonProperty("bip152_hb_to")
    private boolean bip152HbTo;
    @JsonProperty("bip152_hb_from")
    private boolean bip152HbFrom;
    private long startingheight;
    @JsonProperty("presynced_headers")
    private long presyncedHeaders;
    @JsonProperty("synced_headers")
    private long syncedHeaders;
    @JsonProperty("synced_blocks")
    private long syncedBlocks;
    private long[] inflight;
    @JsonProperty("addr_relay_enabled")
    private boolean addrRelayEnabled;
    @JsonProperty("addr_processed")
    private long addrProcessed;
    @JsonProperty("addr_rate_limited")
    private long addrRateLimited;
    private String[] permissions;
    private double minfeefilter;
    @JsonProperty("bytessent_per_msg")
    private BytessentPerMsg bytessentPerMsg;
    @JsonProperty("bytesrecv_per_msg")
    private BytesrecvPerMsg bytesrecvPerMsg;
    @JsonProperty("connection_type")
    private String connectionType;
    @JsonProperty("transport_protocol_type")
    private String transportProtocolType;
    @JsonProperty("session_id")
    private String sessionId;

    @Getter
    @Setter
    private static class BytessentPerMsg {
        private long addr;
        private long addrv2;
        private long feefilter;
        private long getaddr;
        private long getblocks;
        private long getblocktxn;
        private long getdata;
        private long getheaders;
        private long headers;
        private long inv;
        private long ping;
        private long pong;
        private long sendcmpct;
        private long sendheaders;
        private long tx;
        private long verack;
        private long version;
        private long sendaddrv2;
        private long wtxidrelay;
        private long notfound;
    }

    @Getter
    @Setter
    private static class BytesrecvPerMsg {
        private long addr;
        private long addrv2;
        private long block;
        private long blocktxn;
        private long cmpctblock;
        private long feefilter;
        private long getaddr;
        private long getblocktxn;
        private long getdata;
        private long getheaders;
        private long headers;
        private long inv;
        private long ping;
        private long pong;
        private long sendcmpct;
        private long sendheaders;
        private long tx;
        private long verack;
        private long version;
        private long sendaddrv2;
        private long wtxidrelay;
        private long notfound;
    }
}
