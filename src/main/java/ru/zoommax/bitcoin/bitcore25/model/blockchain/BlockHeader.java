package ru.zoommax.bitcoin.bitcore25.model.blockchain;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;
import ru.zoommax.bitcoin.JsonRpcResult;

/**
 * The type Block header.
 */
@Getter
@Setter
public class BlockHeader {

    /**
     * The type Result.
     */
    public static class Result extends JsonRpcResult<BlockHeader> {
	}

    /**
     * The Hash.
     */
    private String hash;
    /**
     * The Confirmations.
     */
    private long confirmations;
    /**
     * The Height.
     */
    private long height;
    /**
     * The Version.
     */
    private long version;
    /**
     * The Version hex.
     */
    private String versionHex;
    /**
     * The Merkleroot.
     */
    private String merkleroot;
    /**
     * The Time.
     */
    private long time;
    /**
     * The Mediantime.
     */
    private long mediantime;
    /**
     * The Nonce.
     */
    private long nonce;
    /**
     * The Bits.
     */
    private String bits;
    /**
     * The Difficulty.
     */
    private double difficulty;
    /**
     * The Chainwork.
     */
    private String chainwork;
    /**
     * The Ntx.
     */
    @JsonProperty("nTx")
	private long ntx;
    /**
     * The Previousblockhash.
     */
    private String previousblockhash;
    /**
     * The Nextblockhash.
     */
    private String nextblockhash;
}
