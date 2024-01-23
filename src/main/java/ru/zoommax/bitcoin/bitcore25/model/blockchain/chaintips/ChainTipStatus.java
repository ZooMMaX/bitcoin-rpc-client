package ru.zoommax.bitcoin.bitcore25.model.blockchain.chaintips;

/**
 * The enum Chain tip status.
 */
public enum ChainTipStatus {
    /**
     * The Active.
     */
    ACTIVE("active"),
    /**
     * The Valid fork.
     */
    VALID_FORK("valid-fork"),
    /**
     * The Valid headers.
     */
    VALID_HEADERS("valid-headers"),
    /**
     * The Headers only.
     */
    HEADERS_ONLY("headers-only"),
    /**
     * The Invalid.
     */
    INVALID("invalid");

    /**
     * The Status.
     */
    private String status;

    /**
     * Instantiates a new Chain tip status.
     *
     * @param status the status
     */
    ChainTipStatus(String status) {
        this.status = status;
    }

    /**
     * Gets status.
     *
     * @return the status
     */
    public String getStatus() {
        return status;
    }

    /**
     * From string chain tip status.
     *
     * @param status the status
     * @return the chain tip status
     */
    public static ChainTipStatus fromString(String status) {
        for (ChainTipStatus chainTipStatus : ChainTipStatus.values()) {
            if (chainTipStatus.getStatus().equals(status)) {
                return chainTipStatus;
            }
        }
        return null;
    }

}
