package ru.zoommax.bitcoin.bitcore25.model.blockchain.chaintips;

public enum ChainTipStatus {
    ACTIVE("active"),
    VALID_FORK("valid-fork"),
    VALID_HEADERS("valid-headers"),
    HEADERS_ONLY("headers-only"),
    INVALID("invalid");

    private String status;

    ChainTipStatus(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

    public static ChainTipStatus fromString(String status) {
        for (ChainTipStatus chainTipStatus : ChainTipStatus.values()) {
            if (chainTipStatus.getStatus().equals(status)) {
                return chainTipStatus;
            }
        }
        return null;
    }

}
