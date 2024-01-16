package ru.zoommax.bitcoin.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class UploadTarget {

    private long timeframe;
    private int target;
    @JsonProperty("target_reached")
    private boolean targetReached;
    @JsonProperty("serve_historical_blocks")
    private boolean serveHistoricalBlocks;
    @JsonProperty("bytes_left_in_cycle")
    private int bytesLeftInCycle;
    @JsonProperty("time_left_in_cycle")
    private int timeLeftInCycle;

    public long getTimeframe() {
        return timeframe;
    }

    public void setTimeframe(long timeframe) {
        this.timeframe = timeframe;
    }

    public int getTarget() {
        return target;
    }

    public void setTarget(int target) {
        this.target = target;
    }

    public boolean isTargetReached() {
        return targetReached;
    }

    public void setTargetReached(boolean targetReached) {
        this.targetReached = targetReached;
    }

    public boolean isServeHistoricalBlocks() {
        return serveHistoricalBlocks;
    }

    public void setServeHistoricalBlocks(boolean serveHistoricalBlocks) {
        this.serveHistoricalBlocks = serveHistoricalBlocks;
    }

    public int getBytesLeftInCycle() {
        return bytesLeftInCycle;
    }

    public void setBytesLeftInCycle(int bytesLeftInCycle) {
        this.bytesLeftInCycle = bytesLeftInCycle;
    }

    public int getTimeLeftInCycle() {
        return timeLeftInCycle;
    }

    public void setTimeLeftInCycle(int timeLeftInCycle) {
        this.timeLeftInCycle = timeLeftInCycle;
    }
}