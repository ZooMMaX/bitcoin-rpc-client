package ru.zoommax.bitcoin.bitcore25.model.blockchain;

import lombok.Getter;
import lombok.Setter;
import ru.zoommax.bitcoin.JsonRpcResult;

@Getter
@Setter
public class BlockStats {

    public static class Result extends JsonRpcResult<BlockStats> {
    }

        private long avgfee;
        private long avgfeerate;
        private long avgtxsize;
        private String blockhash;
        private long[] feerate_percentiles;
        private long height;
        private long ins;
        private long maxfee;
        private long maxfeerate;
        private long maxtxsize;
        private long medianfee;
        private long mediantime;
        private long mediantxsize;
        private long minfee;
        private long minfeerate;
        private long mintxsize;
        private long outs;
        private long subsidy;
        private long swtotal_size;
        private long swtotal_weight;
        private long swtxs;
        private long time;
        private long total_out;
        private long total_size;
        private long total_weight;
        private long totalfee;
        private long txs;
        private long utxo_increase;
        private long utxo_size_inc;
        private long utxo_increase_actual;
        private long utxo_size_inc_actual;
}
