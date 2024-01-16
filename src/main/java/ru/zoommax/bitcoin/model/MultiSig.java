package ru.zoommax.bitcoin.model;

import ru.zoommax.bitcoin.JsonRpcResult;

/**
 * The type Multi sig.
 */
public class MultiSig {
    /**
     * The type Result.
     */
    public static class Result extends JsonRpcResult<MultiSig> {
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
     * Sets address.
     *
     * @param address the address
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * Gets address.
     *
     * @return the address
     */
    public String getAddress() {
        return address;
    }

    /**
     * Sets redeem script.
     *
     * @param redeemScript the redeem script
     */
    public void setRedeemScript(String redeemScript) {
        this.redeemScript = redeemScript;
    }

    /**
     * Gets redeem script.
     *
     * @return the redeem script
     */
    public String getRedeemScript() {
        return redeemScript;
    }

}