package ru.zoommax.bitcoin.bitcore25.model.blockchain;

import lombok.Getter;
import lombok.Setter;
import ru.zoommax.bitcoin.JsonRpcResult;

@Getter
@Setter
public class BlockChainInfo {
    public static class Result extends JsonRpcResult<BlockChainInfo> {
    }

    private String chain;
    private long blocks;
    private long headers;
    private String bestblockhash;
    private double difficulty;
    private long time;
    private long mediantime;
    private double verificationprogress;
    private boolean initialblockdownload;
    private String chainwork;
    private long size_on_disk;
    private boolean pruned;
    private boolean pruneheight;
    private boolean automatic_pruning;
    private long prune_target_size;
    private String warnings;
}
