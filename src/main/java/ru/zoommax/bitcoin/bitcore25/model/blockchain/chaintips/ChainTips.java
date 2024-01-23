package ru.zoommax.bitcoin.bitcore25.model.blockchain.chaintips;

import lombok.Getter;
import lombok.Setter;
import ru.zoommax.bitcoin.JsonRpcResult;

/**
 * The type Chain tips.
 */
@Getter
@Setter
public class ChainTips {
    /**
     * The type Result.
     */
    public static class Result extends JsonRpcResult<ChainTips[]> {
    }

    /**
     * The Height.
     */
    private long height;
    /**
     * The Hash.
     */
    private String hash;
    /**
     * The Branchlen.
     */
    private long branchlen;
    /**
     * The Status.
     */
    private ChainTipStatus status;

    /**
     * Sets status.
     *
     * @param status the status
     */
    public void setStatus(String status) {
        this.status = ChainTipStatus.fromString(status);
    }
}
