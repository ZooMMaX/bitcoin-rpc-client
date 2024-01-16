package ru.zoommax.bitcoin.model;

import ru.zoommax.bitcoin.JsonRpcResult;

public class MultiSig {
    public static class Result extends JsonRpcResult<MultiSig> {
    }

    private String address;
    private String redeemScript;

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public void setRedeemScript(String redeemScript) {
        this.redeemScript = redeemScript;
    }

    public String getRedeemScript() {
        return redeemScript;
    }

}