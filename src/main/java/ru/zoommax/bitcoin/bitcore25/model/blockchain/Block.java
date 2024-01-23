package ru.zoommax.bitcoin.bitcore25.model.blockchain;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import ru.zoommax.bitcoin.JsonRpcResult;

/**
 * The type Block.
 */
@Getter
@Setter
public class Block {
    /**
     * The type Result.
     */
    public static class Result extends JsonRpcResult<Block> {
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
     * The Size.
     */
    private long size;
    /**
     * The Strippedsize.
     */
    private long strippedsize;
    /**
     * The Weight.
     */
    private long weight;
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
     * The Tx.
     */
    private String[] tx;
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
    //Todo: add transactions in the format of the getrawtransaction RPC.
}
