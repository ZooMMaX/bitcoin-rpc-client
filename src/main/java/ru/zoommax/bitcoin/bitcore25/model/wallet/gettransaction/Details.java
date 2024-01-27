package ru.zoommax.bitcoin.bitcore25.model.wallet.gettransaction;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter public class Details {
	private boolean involvesWatchonly;
	private String address;
	private String category;
	private double amount;
	private String label;
	private double vout;
	private double fee;
	private boolean abandoned;
	private String[] parent_descs;
}