package ru.zoommax.bitcoin.bitcore25.model.blockchain;

import lombok.Getter;
import lombok.Setter;
import ru.zoommax.bitcoin.JsonRpcResult;

@Getter
@Setter
public class ChainTxStats {
    public static class Result extends JsonRpcResult<ChainTxStats> {
    }

    private long time;
    private long txcount;
    private String window_final_block_hash;
    private long window_final_block_height;
    private long window_block_count;
    private long window_tx_count;
    private long window_interval;
    private double txrate;
}
