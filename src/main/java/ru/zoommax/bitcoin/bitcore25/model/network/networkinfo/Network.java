package ru.zoommax.bitcoin.bitcore25.model.network.networkinfo;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Network {

	private String name;
	private boolean limited;
	private boolean reachable;
	private String proxy;
	private boolean proxy_randomize_credentials;

}
