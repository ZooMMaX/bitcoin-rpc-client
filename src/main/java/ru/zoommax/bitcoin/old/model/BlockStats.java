package ru.zoommax.bitcoin.old.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import ru.zoommax.bitcoin.JsonRpcResult;

/**
 * The type Block stats.
 */
public class BlockStats {
    /**
     * The type Result.
     */
    public static class Result extends JsonRpcResult<BlockStats> {
    }

    /**
     * The Avgfee.
     */
    private int avgfee;
    /**
     * The Avgfeerate.
     */
    private int avgfeerate;
    /**
     * The Avgtxsize.
     */
    private int avgtxsize;
    /**
     * The Blockhash.
     */
    private String blockhash;
    /**
     * The Feerate percentiles.
     */
    @JsonProperty("feerate_percentiles")
    private int[] feeratePercentiles;
    /**
     * The Height.
     */
    private int height;
    /**
     * The Ins.
     */
    private int ins;
    /**
     * The Maxfee.
     */
    private int maxfee;
    /**
     * The Maxfeerate.
     */
    private int maxfeerate;
    /**
     * The Maxtxsize.
     */
    private int maxtxsize;
    /**
     * The Medianfee.
     */
    private int medianfee;
    /**
     * The Mediantime.
     */
    private long mediantime;
    /**
     * The Mediantxsize.
     */
    private int mediantxsize;
    /**
     * The Minfee.
     */
    private int minfee;
    /**
     * The Minfeerate.
     */
    private int minfeerate;
    /**
     * The Mintxsize.
     */
    private int mintxsize;
    /**
     * The Outs.
     */
    private int outs;
    /**
     * The Subsidy.
     */
    private long subsidy;
    /**
     * The Swtotal size.
     */
    @JsonProperty("swtotal_size")
    private int swtotalSize;
    /**
     * The Swtotal weight.
     */
    @JsonProperty("swtotal_weight")
    private int swtotalWeight;
    /**
     * The Swtxs.
     */
    private int swtxs;
    /**
     * The Time.
     */
    private long time;
    /**
     * The Total out.
     */
    @JsonProperty("total_out")
    private int totalOut;
    /**
     * The Total size.
     */
    @JsonProperty("total_size")
    private int totalSize;
    /**
     * The Total weight.
     */
    @JsonProperty("total_weight")
    private int totalWeight;
    /**
     * The Totalfee.
     */
    private int totalfee;
    /**
     * The Txs.
     */
    private int txs;
    /**
     * The Utxo increase.
     */
    @JsonProperty("utxo_increase")
    private int utxoIncrease;
    /**
     * The Utxo size inc.
     */
    @JsonProperty("utxo_size_inc")
    private int utxoSizeInc;
    /**
     * The Utxo increase actual.
     */
    @JsonProperty("utxo_increase_actual")
    private int utxoIncreaseActual;
    /**
     * The Utxo size inc actual.
     */
    @JsonProperty("utxo_size_inc_actual")
    private int utxoSizeIncActual;

    /**
     * Gets utxo size inc actual.
     *
     * @return the utxo size inc actual
     */
    public int getUtxoSizeIncActual() {
        return utxoSizeIncActual;
    }

    /**
     * Sets utxo size inc actual.
     *
     * @param utxoSizeIncActual the utxo size inc actual
     */
    public void setUtxoSizeIncActual(int utxoSizeIncActual) {
        this.utxoSizeIncActual = utxoSizeIncActual;
    }

    /**
     * Gets utxo increase actual.
     *
     * @return the utxo increase actual
     */
    public int getUtxoIncreaseActual() {
        return utxoIncreaseActual;
    }

    /**
     * Sets utxo increase actual.
     *
     * @param utxoIncreaseActual the utxo increase actual
     */
    public void setUtxoIncreaseActual(int utxoIncreaseActual) {
        this.utxoIncreaseActual = utxoIncreaseActual;
    }

    /**
     * Gets avgfee.
     *
     * @return the avgfee
     */
    public int getAvgfee() {
        return avgfee;
    }

    /**
     * Sets avgfee.
     *
     * @param avgfee the avgfee
     */
    public void setAvgfee(int avgfee) {
        this.avgfee = avgfee;
    }

    /**
     * Gets avgfeerate.
     *
     * @return the avgfeerate
     */
    public int getAvgfeerate() {
        return avgfeerate;
    }

    /**
     * Sets avgfeerate.
     *
     * @param avgfeerate the avgfeerate
     */
    public void setAvgfeerate(int avgfeerate) {
        this.avgfeerate = avgfeerate;
    }

    /**
     * Gets avgtxsize.
     *
     * @return the avgtxsize
     */
    public int getAvgtxsize() {
        return avgtxsize;
    }

    /**
     * Sets avgtxsize.
     *
     * @param avgtxsize the avgtxsize
     */
    public void setAvgtxsize(int avgtxsize) {
        this.avgtxsize = avgtxsize;
    }

    /**
     * Gets blockhash.
     *
     * @return the blockhash
     */
    public String getBlockhash() {
        return blockhash;
    }

    /**
     * Sets blockhash.
     *
     * @param blockhash the blockhash
     */
    public void setBlockhash(String blockhash) {
        this.blockhash = blockhash;
    }

    /**
     * Get feerate percentiles int [ ].
     *
     * @return the int [ ]
     */
    public int[] getFeeratePercentiles() {
        return feeratePercentiles;
    }

    /**
     * Sets feerate percentiles.
     *
     * @param feeratePercentiles the feerate percentiles
     */
    public void setFeeratePercentiles(int[] feeratePercentiles) {
        this.feeratePercentiles = feeratePercentiles;
    }

    /**
     * Gets height.
     *
     * @return the height
     */
    public int getHeight() {
        return height;
    }

    /**
     * Sets height.
     *
     * @param height the height
     */
    public void setHeight(int height) {
        this.height = height;
    }

    /**
     * Gets ins.
     *
     * @return the ins
     */
    public int getIns() {
        return ins;
    }

    /**
     * Sets ins.
     *
     * @param ins the ins
     */
    public void setIns(int ins) {
        this.ins = ins;
    }

    /**
     * Gets maxfee.
     *
     * @return the maxfee
     */
    public int getMaxfee() {
        return maxfee;
    }

    /**
     * Sets maxfee.
     *
     * @param maxfee the maxfee
     */
    public void setMaxfee(int maxfee) {
        this.maxfee = maxfee;
    }

    /**
     * Gets maxfeerate.
     *
     * @return the maxfeerate
     */
    public int getMaxfeerate() {
        return maxfeerate;
    }

    /**
     * Sets maxfeerate.
     *
     * @param maxfeerate the maxfeerate
     */
    public void setMaxfeerate(int maxfeerate) {
        this.maxfeerate = maxfeerate;
    }

    /**
     * Gets maxtxsize.
     *
     * @return the maxtxsize
     */
    public int getMaxtxsize() {
        return maxtxsize;
    }

    /**
     * Sets maxtxsize.
     *
     * @param maxtxsize the maxtxsize
     */
    public void setMaxtxsize(int maxtxsize) {
        this.maxtxsize = maxtxsize;
    }

    /**
     * Gets medianfee.
     *
     * @return the medianfee
     */
    public int getMedianfee() {
        return medianfee;
    }

    /**
     * Sets medianfee.
     *
     * @param medianfee the medianfee
     */
    public void setMedianfee(int medianfee) {
        this.medianfee = medianfee;
    }

    /**
     * Gets mediantime.
     *
     * @return the mediantime
     */
    public long getMediantime() {
        return mediantime;
    }

    /**
     * Sets mediantime.
     *
     * @param mediantime the mediantime
     */
    public void setMediantime(long mediantime) {
        this.mediantime = mediantime;
    }

    /**
     * Gets mediantxsize.
     *
     * @return the mediantxsize
     */
    public int getMediantxsize() {
        return mediantxsize;
    }

    /**
     * Sets mediantxsize.
     *
     * @param mediantxsize the mediantxsize
     */
    public void setMediantxsize(int mediantxsize) {
        this.mediantxsize = mediantxsize;
    }

    /**
     * Gets minfee.
     *
     * @return the minfee
     */
    public int getMinfee() {
        return minfee;
    }

    /**
     * Sets minfee.
     *
     * @param minfee the minfee
     */
    public void setMinfee(int minfee) {
        this.minfee = minfee;
    }

    /**
     * Gets minfeerate.
     *
     * @return the minfeerate
     */
    public int getMinfeerate() {
        return minfeerate;
    }

    /**
     * Sets minfeerate.
     *
     * @param minfeerate the minfeerate
     */
    public void setMinfeerate(int minfeerate) {
        this.minfeerate = minfeerate;
    }

    /**
     * Gets mintxsize.
     *
     * @return the mintxsize
     */
    public int getMintxsize() {
        return mintxsize;
    }

    /**
     * Sets mintxsize.
     *
     * @param mintxsize the mintxsize
     */
    public void setMintxsize(int mintxsize) {
        this.mintxsize = mintxsize;
    }

    /**
     * Gets outs.
     *
     * @return the outs
     */
    public int getOuts() {
        return outs;
    }

    /**
     * Sets outs.
     *
     * @param outs the outs
     */
    public void setOuts(int outs) {
        this.outs = outs;
    }

    /**
     * Gets subsidy.
     *
     * @return the subsidy
     */
    public long getSubsidy() {
        return subsidy;
    }

    /**
     * Sets subsidy.
     *
     * @param subsidy the subsidy
     */
    public void setSubsidy(long subsidy) {
        this.subsidy = subsidy;
    }

    /**
     * Gets swtotal size.
     *
     * @return the swtotal size
     */
    public int getSwtotalSize() {
        return swtotalSize;
    }

    /**
     * Sets swtotal size.
     *
     * @param swtotalSize the swtotal size
     */
    public void setSwtotalSize(int swtotalSize) {
        this.swtotalSize = swtotalSize;
    }

    /**
     * Gets swtotal weight.
     *
     * @return the swtotal weight
     */
    public int getSwtotalWeight() {
        return swtotalWeight;
    }

    /**
     * Sets swtotal weight.
     *
     * @param swtotalWeight the swtotal weight
     */
    public void setSwtotalWeight(int swtotalWeight) {
        this.swtotalWeight = swtotalWeight;
    }

    /**
     * Gets swtxs.
     *
     * @return the swtxs
     */
    public int getSwtxs() {
        return swtxs;
    }

    /**
     * Sets swtxs.
     *
     * @param swtxs the swtxs
     */
    public void setSwtxs(int swtxs) {
        this.swtxs = swtxs;
    }

    /**
     * Gets time.
     *
     * @return the time
     */
    public long getTime() {
        return time;
    }

    /**
     * Sets time.
     *
     * @param time the time
     */
    public void setTime(long time) {
        this.time = time;
    }

    /**
     * Gets total out.
     *
     * @return the total out
     */
    public int getTotalOut() {
        return totalOut;
    }

    /**
     * Sets total out.
     *
     * @param totalOut the total out
     */
    public void setTotalOut(int totalOut) {
        this.totalOut = totalOut;
    }

    /**
     * Gets total size.
     *
     * @return the total size
     */
    public int getTotalSize() {
        return totalSize;
    }

    /**
     * Sets total size.
     *
     * @param totalSize the total size
     */
    public void setTotalSize(int totalSize) {
        this.totalSize = totalSize;
    }

    /**
     * Gets total weight.
     *
     * @return the total weight
     */
    public int getTotalWeight() {
        return totalWeight;
    }

    /**
     * Sets total weight.
     *
     * @param totalWeight the total weight
     */
    public void setTotalWeight(int totalWeight) {
        this.totalWeight = totalWeight;
    }

    /**
     * Gets totalfee.
     *
     * @return the totalfee
     */
    public int getTotalfee() {
        return totalfee;
    }

    /**
     * Sets totalfee.
     *
     * @param totalfee the totalfee
     */
    public void setTotalfee(int totalfee) {
        this.totalfee = totalfee;
    }

    /**
     * Gets txs.
     *
     * @return the txs
     */
    public int getTxs() {
        return txs;
    }

    /**
     * Sets txs.
     *
     * @param txs the txs
     */
    public void setTxs(int txs) {
        this.txs = txs;
    }

    /**
     * Gets utxo increase.
     *
     * @return the utxo increase
     */
    public int getUtxoIncrease() {
        return utxoIncrease;
    }

    /**
     * Sets utxo increase.
     *
     * @param utxoIncrease the utxo increase
     */
    public void setUtxoIncrease(int utxoIncrease) {
        this.utxoIncrease = utxoIncrease;
    }

    /**
     * Gets utxo size inc.
     *
     * @return the utxo size inc
     */
    public int getUtxoSizeInc() {
        return utxoSizeInc;
    }

    /**
     * Sets utxo size inc.
     *
     * @param utxoSizeInc the utxo size inc
     */
    public void setUtxoSizeInc(int utxoSizeInc) {
        this.utxoSizeInc = utxoSizeInc;
    }
}