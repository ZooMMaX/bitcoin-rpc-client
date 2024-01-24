package ru.zoommax.bitcoin.bitcore25.model.control.memoryinfo;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Locked {

	private long used;
	private long free;
	private long total;
	private long locked;
	private long chunks_used;
	private long chunks_free;

}
