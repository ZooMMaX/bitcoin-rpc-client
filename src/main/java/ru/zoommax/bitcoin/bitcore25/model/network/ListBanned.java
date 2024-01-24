package ru.zoommax.bitcoin.bitcore25.model.network;

import lombok.Getter;
import lombok.Setter;
import ru.zoommax.bitcoin.JsonRpcResult;

@Getter
@Setter
public class ListBanned {

	public static class Result extends JsonRpcResult<ListBanned[]> {
	}

	public String address;
	private long ban_created;
	private long banned_until;
	private long ban_duration;
	private long time_remaining;

}
