package ru.zoommax.bitcoin.bitcore25.model.network.nettotals;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;
import ru.zoommax.bitcoin.JsonRpcResult;

@Getter
@Setter
public class NetTraffic {
	public static class Result extends JsonRpcResult<NetTraffic> {
	}

	@JsonProperty("totalbytesrecv")
	private long totalBytesReceived;
	@JsonProperty("totalbytessent")
	private long totalBytesSent;
	private long timemillis;
	private UploadTarget uploadtarget;

}
