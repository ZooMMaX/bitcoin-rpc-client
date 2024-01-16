package ru.zoommax.bitcoin.model;

import ru.zoommax.bitcoin.JsonRpcResult;

/**
 * The type Multi sign address.
 */
public class MultiSignAddress {
    /**
     * The type Result.
     */
    public static class Result extends JsonRpcResult<MultiSignAddress> {
    }

    /**
     * The Address.
     */
    private String address;
    /**
     * The Redeem script.
     */
    private String redeemScript;

    /**
     * Gets address.
     *
     * @return the address
     */
    public String getAddress() {
        return address;
    }

    /**
     * Sets address.
     *
     * @param address the address
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * Gets redeem script.
     *
     * @return the redeem script
     */
    public String getRedeemScript() {
        return redeemScript;
    }

    /**
     * Sets redeem script.
     *
     * @param redeemScript the redeem script
     */
    public void setRedeemScript(String redeemScript) {
        this.redeemScript = redeemScript;
    }

}