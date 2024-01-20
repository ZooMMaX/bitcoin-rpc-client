package ru.zoommax.bitcoin.old.model;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The type Upload target.
 */
public class UploadTarget {

    /**
     * The Timeframe.
     */
    private long timeframe;
    /**
     * The Target.
     */
    private int target;
    /**
     * The Target reached.
     */
    @JsonProperty("target_reached")
    private boolean targetReached;
    /**
     * The Serve historical blocks.
     */
    @JsonProperty("serve_historical_blocks")
    private boolean serveHistoricalBlocks;
    /**
     * The Bytes left in cycle.
     */
    @JsonProperty("bytes_left_in_cycle")
    private int bytesLeftInCycle;
    /**
     * The Time left in cycle.
     */
    @JsonProperty("time_left_in_cycle")
    private int timeLeftInCycle;

    /**
     * Gets timeframe.
     *
     * @return the timeframe
     */
    public long getTimeframe() {
        return timeframe;
    }

    /**
     * Sets timeframe.
     *
     * @param timeframe the timeframe
     */
    public void setTimeframe(long timeframe) {
        this.timeframe = timeframe;
    }

    /**
     * Gets target.
     *
     * @return the target
     */
    public int getTarget() {
        return target;
    }

    /**
     * Sets target.
     *
     * @param target the target
     */
    public void setTarget(int target) {
        this.target = target;
    }

    /**
     * Is target reached boolean.
     *
     * @return the boolean
     */
    public boolean isTargetReached() {
        return targetReached;
    }

    /**
     * Sets target reached.
     *
     * @param targetReached the target reached
     */
    public void setTargetReached(boolean targetReached) {
        this.targetReached = targetReached;
    }

    /**
     * Is serve historical blocks boolean.
     *
     * @return the boolean
     */
    public boolean isServeHistoricalBlocks() {
        return serveHistoricalBlocks;
    }

    /**
     * Sets serve historical blocks.
     *
     * @param serveHistoricalBlocks the serve historical blocks
     */
    public void setServeHistoricalBlocks(boolean serveHistoricalBlocks) {
        this.serveHistoricalBlocks = serveHistoricalBlocks;
    }

    /**
     * Gets bytes left in cycle.
     *
     * @return the bytes left in cycle
     */
    public int getBytesLeftInCycle() {
        return bytesLeftInCycle;
    }

    /**
     * Sets bytes left in cycle.
     *
     * @param bytesLeftInCycle the bytes left in cycle
     */
    public void setBytesLeftInCycle(int bytesLeftInCycle) {
        this.bytesLeftInCycle = bytesLeftInCycle;
    }

    /**
     * Gets time left in cycle.
     *
     * @return the time left in cycle
     */
    public int getTimeLeftInCycle() {
        return timeLeftInCycle;
    }

    /**
     * Sets time left in cycle.
     *
     * @param timeLeftInCycle the time left in cycle
     */
    public void setTimeLeftInCycle(int timeLeftInCycle) {
        this.timeLeftInCycle = timeLeftInCycle;
    }
}