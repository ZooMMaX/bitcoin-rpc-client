package ru.zoommax.bitcoin.bitcore25.model.network.nettotals;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UploadTarget {

	private long timeframe;
	private long target;
	private boolean target_reached;
	private boolean serve_historical_blocks;
	private long bytes_left_in_cycle;
	private long time_left_in_cycle;

}
