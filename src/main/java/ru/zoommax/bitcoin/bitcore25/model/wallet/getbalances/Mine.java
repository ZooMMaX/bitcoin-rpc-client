package ru.zoommax.bitcoin.bitcore25.model.wallet.getbalances;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter public class Mine {
	private double trusted;
	private double untrusted_pending;
	private double immature;
	private double used;
}