package ru.zoommax.bitcoin.bitcore25.model.blockchain;

import lombok.Getter;
import lombok.Setter;
import ru.zoommax.bitcoin.JsonRpcResult;

/**
 * The type Block stats.
 */
@Getter
@Setter
public class BlockStats {

    /**
     * The type Result.
     */
    public static class Result extends JsonRpcResult<BlockStats> {
    }

    /**
     * The Avgfee.
     */
    private long avgfee;
    /**
     * The Avgfeerate.
     */
    private long avgfeerate;
    /**
     * The Avgtxsize.
     */
    private long avgtxsize;
    /**
     * The Blockhash.
     */
    private String blockhash;
    /**
     * The Feerate percentiles.
     */
    private long[] feerate_percentiles;
    /**
     * The Height.
     */
    private long height;
    /**
     * The Ins.
     */
    private long ins;
    /**
     * The Maxfee.
     */
    private long maxfee;
    /**
     * The Maxfeerate.
     */
    private long maxfeerate;
    /**
     * The Maxtxsize.
     */
    private long maxtxsize;
    /**
     * The Medianfee.
     */
    private long medianfee;
    /**
     * The Mediantime.
     */
    private long mediantime;
    /**
     * The Mediantxsize.
     */
    private long mediantxsize;
    /**
     * The Minfee.
     */
    private long minfee;
    /**
     * The Minfeerate.
     */
    private long minfeerate;
    /**
     * The Mintxsize.
     */
    private long mintxsize;
    /**
     * The Outs.
     */
    private long outs;
    /**
     * The Subsidy.
     */
    private long subsidy;
    /**
     * The Swtotal size.
     */
    private long swtotal_size;
    /**
     * The Swtotal weight.
     */
    private long swtotal_weight;
    /**
     * The Swtxs.
     */
    private long swtxs;
    /**
     * The Time.
     */
    private long time;
    /**
     * The Total out.
     */
    private long total_out;
    /**
     * The Total size.
     */
    private long total_size;
    /**
     * The Total weight.
     */
    private long total_weight;
    /**
     * The Totalfee.
     */
    private long totalfee;
    /**
     * The Txs.
     */
    private long txs;
    /**
     * The Utxo increase.
     */
    private long utxo_increase;
    /**
     * The Utxo size inc.
     */
    private long utxo_size_inc;
    /**
     * The Utxo increase actual.
     */
    private long utxo_increase_actual;
    /**
     * The Utxo size inc actual.
     */
    private long utxo_size_inc_actual;
}
