package ru.zoommax.bitcoin.model;

import ru.zoommax.bitcoin.JsonRpcResult;

/**
 * The type Transaction sign.
 */
public class TransactionSign {
    /**
     * The type Result.
     */
    public static class Result extends JsonRpcResult<TransactionSign> {
    }

    /**
     * The Hex.
     */
    private String hex;
    /**
     * The Complete.
     */
    private boolean complete;

    /**
     * Gets hex.
     *
     * @return the hex
     */
    public String getHex() {
        return hex;
    }

    /**
     * Sets hex.
     *
     * @param hex the hex
     */
    public void setHex(String hex) {
        this.hex = hex;
    }

    /**
     * Is complete boolean.
     *
     * @return the boolean
     */
    public boolean isComplete() {
        return complete;
    }

    /**
     * Sets complete.
     *
     * @param complete the complete
     */
    public void setComplete(boolean complete) {
        this.complete = complete;
    }
}
