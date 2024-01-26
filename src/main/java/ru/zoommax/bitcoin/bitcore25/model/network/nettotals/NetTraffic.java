package ru.zoommax.bitcoin.bitcore25.model.network.nettotals;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;
import ru.zoommax.bitcoin.JsonRpcResult;

/**
 * The type Net traffic.
 */
@Getter
@Setter
public class NetTraffic {
    /**
     * The type Result.
     */
    public static class Result extends JsonRpcResult<NetTraffic> {
	}

    /**
     * The Total bytes received.
     */
    @JsonProperty("totalbytesrecv")
	private long totalBytesReceived;
    /**
     * The Total bytes sent.
     */
    @JsonProperty("totalbytessent")
	private long totalBytesSent;
    /**
     * The Timemillis.
     */
    private long timemillis;
    /**
     * The Uploadtarget.
     */
    private UploadTarget uploadtarget;

}
