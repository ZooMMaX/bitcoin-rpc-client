package ru.zoommax.bitcoin.bitcore25.model.wallet;

import lombok.Getter;
import lombok.Setter;
import ru.zoommax.bitcoin.JsonRpcResult;

/**
 * The type Received transaction.
 */
@Getter
@Setter
public class ReceivedTransaction {

    /**
     * The type Result.
     */
    public static class Result extends JsonRpcResult<ReceivedTransaction[]> {
	}

    /**
     * The Involves watchonly.
     */
    private boolean involvesWatchonly;
    /**
     * The Address.
     */
    private String address;
    /**
     * The Amount.
     */
    private double amount;
    /**
     * The Confirmations.
     */
    private long confirmations;
    /**
     * The Label.
     */
    private String label;
    /**
     * The Txids.
     */
    private String[] txids;

}
