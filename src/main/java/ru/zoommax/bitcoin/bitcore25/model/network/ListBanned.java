package ru.zoommax.bitcoin.bitcore25.model.network;

import lombok.Getter;
import lombok.Setter;
import ru.zoommax.bitcoin.JsonRpcResult;

/**
 * The type List banned.
 */
@Getter
@Setter
public class ListBanned {

    /**
     * The type Result.
     */
    public static class Result extends JsonRpcResult<ListBanned[]> {
	}

    /**
     * The Address.
     */
    public String address;
    /**
     * The Ban created.
     */
    private long ban_created;
    /**
     * The Banned until.
     */
    private long banned_until;
    /**
     * The Ban duration.
     */
    private long ban_duration;
    /**
     * The Time remaining.
     */
    private long time_remaining;

}
