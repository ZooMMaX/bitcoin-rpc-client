package ru.zoommax.bitcoin.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import ru.zoommax.bitcoin.JsonRpcResult;

/**
 * The type Rescan height.
 */
public class RescanHeight {
    /**
     * The type Result.
     */
    public static class Result extends JsonRpcResult<RescanHeight> {
    }

    /**
     * The Start height.
     */
    @JsonProperty("start_height")
    private int startHeight;
    /**
     * The Stop height.
     */
    @JsonProperty("stop_height")
    private int stopHeight;

    /**
     * Gets start height.
     *
     * @return the start height
     */
    public int getStartHeight() {
        return startHeight;
    }

    /**
     * Sets start height.
     *
     * @param startHeight the start height
     */
    public void setStartHeight(int startHeight) {
        this.startHeight = startHeight;
    }

    /**
     * Gets stop height.
     *
     * @return the stop height
     */
    public int getStopHeight() {
        return stopHeight;
    }

    /**
     * Sets stop height.
     *
     * @param stopHeight the stop height
     */
    public void setStopHeight(int stopHeight) {
        this.stopHeight = stopHeight;
    }

}
