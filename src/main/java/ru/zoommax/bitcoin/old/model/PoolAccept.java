package ru.zoommax.bitcoin.old.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import ru.zoommax.bitcoin.JsonRpcResult;

/**
 * The type Pool accept.
 */
public class PoolAccept {
    /**
     * The type Result.
     */
    public class Result extends JsonRpcResult<PoolAccept[]> {
    }

    /**
     * The Txid.
     */
    private String txid;
    /**
     * The Allowed.
     */
    private boolean allowed;
    /**
     * The Reject reason.
     */
    @JsonProperty("reject-reason")
    private String rejectReason;

    /**
     * Gets txid.
     *
     * @return the txid
     */
    public String getTxid() {
        return txid;
    }

    /**
     * Sets txid.
     *
     * @param txid the txid
     */
    public void setTxid(String txid) {
        this.txid = txid;
    }

    /**
     * Is allowed boolean.
     *
     * @return the boolean
     */
    public boolean isAllowed() {
        return allowed;
    }

    /**
     * Sets allowed.
     *
     * @param allowed the allowed
     */
    public void setAllowed(boolean allowed) {
        this.allowed = allowed;
    }

    /**
     * Gets reject reason.
     *
     * @return the reject reason
     */
    public String getRejectReason() {
        return rejectReason;
    }

    /**
     * Sets reject reason.
     *
     * @param rejectReason the reject reason
     */
    public void setRejectReason(String rejectReason) {
        this.rejectReason = rejectReason;
    }
}
