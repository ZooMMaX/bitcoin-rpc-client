package ru.zoommax.bitcoin.bitcore25.model.network.networkinfo;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LocalAddress {

	private String address;
	private int port;
	private double score;

}
