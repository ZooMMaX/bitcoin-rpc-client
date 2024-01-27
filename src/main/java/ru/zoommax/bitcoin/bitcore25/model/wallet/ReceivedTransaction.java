package ru.zoommax.bitcoin.bitcore25.model.wallet;

import lombok.Getter;
import lombok.Setter;
import ru.zoommax.bitcoin.JsonRpcResult;

@Getter
@Setter
public class ReceivedTransaction {

	public static class Result extends JsonRpcResult<ReceivedTransaction[]> {
	}

	private boolean involvesWatchonly;
	private String address;
	private double amount;
	private long confirmations;
	private String label;
	private String[] txids;

}
