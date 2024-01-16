package ru.zoommax.bitcoin.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import ru.zoommax.bitcoin.JsonRpcResult;
import lombok.Getter;
import lombok.Setter;

/**
 * The type Peers info.
 */
@Getter
@Setter
public class PeersInfo {
    /**
     * The type Result.
     */
    public static class Result extends JsonRpcResult<PeersInfo[]> {
    }

    /**
     * The Id.
     */
    private int id;
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
    @JsonProperty("last_transaction")
    private long lastTransaction;
    /**
     * The Last block.
     */
    @JsonProperty("last_block")
    private long lastBlock;
    /**
     * The Bytessent.
     */
    private long bytessent;
    /**
     * The Bytesrecv.
     */
    private long bytesrecv;
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
    private double pingtime;
    /**
     * The Minping.
     */
    private double minping;
    /**
     * The Version.
     */
    private int version;
    /**
     * The Subver.
     */
    private String subver;
    /**
     * The Inbound.
     */
    private boolean inbound;
    /**
     * The Bip 152 hb to.
     */
    @JsonProperty("bip152_hb_to")
    private boolean bip152HbTo;
    /**
     * The Bip 152 hb from.
     */
    @JsonProperty("bip152_hb_from")
    private boolean bip152HbFrom;
    /**
     * The Startingheight.
     */
    private long startingheight;
    /**
     * The Presynced headers.
     */
    @JsonProperty("presynced_headers")
    private long presyncedHeaders;
    /**
     * The Synced headers.
     */
    @JsonProperty("synced_headers")
    private long syncedHeaders;
    /**
     * The Synced blocks.
     */
    @JsonProperty("synced_blocks")
    private long syncedBlocks;
    /**
     * The Inflight.
     */
    private long[] inflight;
    /**
     * The Addr relay enabled.
     */
    @JsonProperty("addr_relay_enabled")
    private boolean addrRelayEnabled;
    /**
     * The Addr processed.
     */
    @JsonProperty("addr_processed")
    private long addrProcessed;
    /**
     * The Addr rate limited.
     */
    @JsonProperty("addr_rate_limited")
    private long addrRateLimited;
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
    @JsonProperty("bytessent_per_msg")
    private BytessentPerMsg bytessentPerMsg;
    /**
     * The Bytesrecv per msg.
     */
    @JsonProperty("bytesrecv_per_msg")
    private BytesrecvPerMsg bytesrecvPerMsg;
    /**
     * The Connection type.
     */
    @JsonProperty("connection_type")
    private String connectionType;
    /**
     * The Transport protocol type.
     */
    @JsonProperty("transport_protocol_type")
    private String transportProtocolType;
    /**
     * The Session id.
     */
    @JsonProperty("session_id")
    private String sessionId;

    /**
     * The type Bytessent per msg.
     */
    @Getter
    @Setter
    private static class BytessentPerMsg {
        /**
         * The Addr.
         */
        private long addr;
        /**
         * The Addrv 2.
         */
        private long addrv2;
        /**
         * The Feefilter.
         */
        private long feefilter;
        /**
         * The Getaddr.
         */
        private long getaddr;
        /**
         * The Getblocks.
         */
        private long getblocks;
        /**
         * The Getblocktxn.
         */
        private long getblocktxn;
        /**
         * The Getdata.
         */
        private long getdata;
        /**
         * The Getheaders.
         */
        private long getheaders;
        /**
         * The Headers.
         */
        private long headers;
        /**
         * The Inv.
         */
        private long inv;
        /**
         * The Ping.
         */
        private long ping;
        /**
         * The Pong.
         */
        private long pong;
        /**
         * The Sendcmpct.
         */
        private long sendcmpct;
        /**
         * The Sendheaders.
         */
        private long sendheaders;
        /**
         * The Tx.
         */
        private long tx;
        /**
         * The Verack.
         */
        private long verack;
        /**
         * The Version.
         */
        private long version;
        /**
         * The Sendaddrv 2.
         */
        private long sendaddrv2;
        /**
         * The Wtxidrelay.
         */
        private long wtxidrelay;
        /**
         * The Notfound.
         */
        private long notfound;
    }

    /**
     * The type Bytesrecv per msg.
     */
    @Getter
    @Setter
    private static class BytesrecvPerMsg {
        /**
         * The Addr.
         */
        private long addr;
        /**
         * The Addrv 2.
         */
        private long addrv2;
        /**
         * The Block.
         */
        private long block;
        /**
         * The Blocktxn.
         */
        private long blocktxn;
        /**
         * The Cmpctblock.
         */
        private long cmpctblock;
        /**
         * The Feefilter.
         */
        private long feefilter;
        /**
         * The Getaddr.
         */
        private long getaddr;
        /**
         * The Getblocktxn.
         */
        private long getblocktxn;
        /**
         * The Getdata.
         */
        private long getdata;
        /**
         * The Getheaders.
         */
        private long getheaders;
        /**
         * The Headers.
         */
        private long headers;
        /**
         * The Inv.
         */
        private long inv;
        /**
         * The Ping.
         */
        private long ping;
        /**
         * The Pong.
         */
        private long pong;
        /**
         * The Sendcmpct.
         */
        private long sendcmpct;
        /**
         * The Sendheaders.
         */
        private long sendheaders;
        /**
         * The Tx.
         */
        private long tx;
        /**
         * The Verack.
         */
        private long verack;
        /**
         * The Version.
         */
        private long version;
        /**
         * The Sendaddrv 2.
         */
        private long sendaddrv2;
        /**
         * The Wtxidrelay.
         */
        private long wtxidrelay;
        /**
         * The Notfound.
         */
        private long notfound;
    }
}
