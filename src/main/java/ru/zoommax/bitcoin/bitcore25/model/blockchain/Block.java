package ru.zoommax.bitcoin.bitcore25.model.blockchain;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import ru.zoommax.bitcoin.JsonRpcResult;

@Getter
@Setter
public class Block {
    public static class Result extends JsonRpcResult<Block> {
    }
    private String hash;
    private long confirmations;
    private long size;
    private long strippedsize;
    private long weight;
    private long height;
    private long version;
    private String versionHex;
    private String merkleroot;
    private String[] tx;
    private long time;
    private long mediantime;
    private long nonce;
    private String bits;
    private double difficulty;
    private String chainwork;
    @JsonProperty("nTx")
    private long ntx;
    private String previousblockhash;
    private String nextblockhash;
    //Todo: add transactions in the format of the getrawtransaction RPC.
}
