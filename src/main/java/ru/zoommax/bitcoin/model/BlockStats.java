package ru.zoommax.bitcoin.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import ru.zoommax.bitcoin.JsonRpcResult;

public class BlockStats {
    public static class Result extends JsonRpcResult<BlockStats> {
    }

    private int avgfee;
    private int avgfeerate;
    private int avgtxsize;
    private String blockhash;
    @JsonProperty("feerate_percentiles")
    private int[] feeratePercentiles;
    private int height;
    private int ins;
    private int maxfee;
    private int maxfeerate;
    private int maxtxsize;
    private int medianfee;
    private long mediantime;
    private int mediantxsize;
    private int minfee;
    private int minfeerate;
    private int mintxsize;
    private int outs;
    private long subsidy;
    @JsonProperty("swtotal_size")
    private int swtotalSize;
    @JsonProperty("swtotal_weight")
    private int swtotalWeight;
    private int swtxs;
    private long time;
    @JsonProperty("total_out")
    private int totalOut;
    @JsonProperty("total_size")
    private int totalSize;
    @JsonProperty("total_weight")
    private int totalWeight;
    private int totalfee;
    private int txs;
    @JsonProperty("utxo_increase")
    private int utxoIncrease;
    @JsonProperty("utxo_size_inc")
    private int utxoSizeInc;
    @JsonProperty("utxo_increase_actual")
    private int utxoIncreaseActual;
    @JsonProperty("utxo_size_inc_actual")
    private int utxoSizeIncActual;

    public int getUtxoSizeIncActual() {
        return utxoSizeIncActual;
    }

    public void setUtxoSizeIncActual(int utxoSizeIncActual) {
        this.utxoSizeIncActual = utxoSizeIncActual;
    }

    public int getUtxoIncreaseActual() {
        return utxoIncreaseActual;
    }

    public void setUtxoIncreaseActual(int utxoIncreaseActual) {
        this.utxoIncreaseActual = utxoIncreaseActual;
    }

    public int getAvgfee() {
        return avgfee;
    }

    public void setAvgfee(int avgfee) {
        this.avgfee = avgfee;
    }

    public int getAvgfeerate() {
        return avgfeerate;
    }

    public void setAvgfeerate(int avgfeerate) {
        this.avgfeerate = avgfeerate;
    }

    public int getAvgtxsize() {
        return avgtxsize;
    }

    public void setAvgtxsize(int avgtxsize) {
        this.avgtxsize = avgtxsize;
    }

    public String getBlockhash() {
        return blockhash;
    }

    public void setBlockhash(String blockhash) {
        this.blockhash = blockhash;
    }

    public int[] getFeeratePercentiles() {
        return feeratePercentiles;
    }

    public void setFeeratePercentiles(int[] feeratePercentiles) {
        this.feeratePercentiles = feeratePercentiles;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getIns() {
        return ins;
    }

    public void setIns(int ins) {
        this.ins = ins;
    }

    public int getMaxfee() {
        return maxfee;
    }

    public void setMaxfee(int maxfee) {
        this.maxfee = maxfee;
    }

    public int getMaxfeerate() {
        return maxfeerate;
    }

    public void setMaxfeerate(int maxfeerate) {
        this.maxfeerate = maxfeerate;
    }

    public int getMaxtxsize() {
        return maxtxsize;
    }

    public void setMaxtxsize(int maxtxsize) {
        this.maxtxsize = maxtxsize;
    }

    public int getMedianfee() {
        return medianfee;
    }

    public void setMedianfee(int medianfee) {
        this.medianfee = medianfee;
    }

    public long getMediantime() {
        return mediantime;
    }

    public void setMediantime(long mediantime) {
        this.mediantime = mediantime;
    }

    public int getMediantxsize() {
        return mediantxsize;
    }

    public void setMediantxsize(int mediantxsize) {
        this.mediantxsize = mediantxsize;
    }

    public int getMinfee() {
        return minfee;
    }

    public void setMinfee(int minfee) {
        this.minfee = minfee;
    }

    public int getMinfeerate() {
        return minfeerate;
    }

    public void setMinfeerate(int minfeerate) {
        this.minfeerate = minfeerate;
    }

    public int getMintxsize() {
        return mintxsize;
    }

    public void setMintxsize(int mintxsize) {
        this.mintxsize = mintxsize;
    }

    public int getOuts() {
        return outs;
    }

    public void setOuts(int outs) {
        this.outs = outs;
    }

    public long getSubsidy() {
        return subsidy;
    }

    public void setSubsidy(long subsidy) {
        this.subsidy = subsidy;
    }

    public int getSwtotalSize() {
        return swtotalSize;
    }

    public void setSwtotalSize(int swtotalSize) {
        this.swtotalSize = swtotalSize;
    }

    public int getSwtotalWeight() {
        return swtotalWeight;
    }

    public void setSwtotalWeight(int swtotalWeight) {
        this.swtotalWeight = swtotalWeight;
    }

    public int getSwtxs() {
        return swtxs;
    }

    public void setSwtxs(int swtxs) {
        this.swtxs = swtxs;
    }

    public long getTime() {
        return time;
    }

    public void setTime(long time) {
        this.time = time;
    }

    public int getTotalOut() {
        return totalOut;
    }

    public void setTotalOut(int totalOut) {
        this.totalOut = totalOut;
    }

    public int getTotalSize() {
        return totalSize;
    }

    public void setTotalSize(int totalSize) {
        this.totalSize = totalSize;
    }

    public int getTotalWeight() {
        return totalWeight;
    }

    public void setTotalWeight(int totalWeight) {
        this.totalWeight = totalWeight;
    }

    public int getTotalfee() {
        return totalfee;
    }

    public void setTotalfee(int totalfee) {
        this.totalfee = totalfee;
    }

    public int getTxs() {
        return txs;
    }

    public void setTxs(int txs) {
        this.txs = txs;
    }

    public int getUtxoIncrease() {
        return utxoIncrease;
    }

    public void setUtxoIncrease(int utxoIncrease) {
        this.utxoIncrease = utxoIncrease;
    }

    public int getUtxoSizeInc() {
        return utxoSizeInc;
    }

    public void setUtxoSizeInc(int utxoSizeInc) {
        this.utxoSizeInc = utxoSizeInc;
    }
}