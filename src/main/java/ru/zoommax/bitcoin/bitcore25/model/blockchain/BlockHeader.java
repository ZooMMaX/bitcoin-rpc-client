package ru.zoommax.bitcoin.bitcore25.model.blockchain;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import ru.zoommax.bitcoin.JsonRpcResult;

@Getter
@Setter
public class BlockHeader {

    public static class Result extends JsonRpcResult<BlockHeader> {
    }

    private String hash;
    private long confirmations;
    private long height;
    private long version;
    private String versionHex;
    private String merkleroot;
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
}
