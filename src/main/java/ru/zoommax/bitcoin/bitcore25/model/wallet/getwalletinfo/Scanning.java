package ru.zoommax.bitcoin.bitcore25.model.wallet.getwalletinfo;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter public class Scanning {
	private long duration;
	private double progress;
}