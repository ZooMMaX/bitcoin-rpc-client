package ru.zoommax.bitcoin.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import ru.zoommax.bitcoin.JsonRpcResult;

public class RescanHeight {
    public static class Result extends JsonRpcResult<RescanHeight> {
    }

    @JsonProperty("start_height")
    private int startHeight;
    @JsonProperty("stop_height")
    private int stopHeight;

    public int getStartHeight() {
        return startHeight;
    }

    public void setStartHeight(int startHeight) {
        this.startHeight = startHeight;
    }

    public int getStopHeight() {
        return stopHeight;
    }

    public void setStopHeight(int stopHeight) {
        this.stopHeight = stopHeight;
    }

}
