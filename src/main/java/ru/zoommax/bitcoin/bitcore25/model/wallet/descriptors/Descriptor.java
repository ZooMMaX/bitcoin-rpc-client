package ru.zoommax.bitcoin.bitcore25.model.wallet.descriptors;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter public class Descriptor {
	private String desc;
	private long timestamp;
	private boolean active;
	private boolean internal;
	private long[] range;
	private long next;
	private long next_index;
}