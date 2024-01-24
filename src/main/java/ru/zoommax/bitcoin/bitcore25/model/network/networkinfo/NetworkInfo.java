package ru.zoommax.bitcoin.bitcore25.model.network.networkinfo;

import lombok.Getter;
import lombok.Setter;
import ru.zoommax.bitcoin.JsonRpcResult;

@Getter
@Setter
public class NetworkInfo {
	public static class Result extends JsonRpcResult<NetworkInfo> {
	}

	private long version;
	private String subversion;
	private long protocolversion;
	private String localservices;
	private String[] localservicesnames;
	private boolean localrelay;
	private long timeoffset;
	private long connections;
	private long connections_in;
	private long connections_out;
	private boolean networkactive;
	private Network[] networks;
	private double relayfee;
	private double incrementalfee;
	private LocalAddress[] localaddresses;
	private String warnings;

}
