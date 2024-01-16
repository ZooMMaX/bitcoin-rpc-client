package ru.zoommax.bitcoin.model;

import ru.zoommax.bitcoin.JsonRpcResult;

public class ScriptPubKey {

    public class Result extends JsonRpcResult<ScriptPubKey> {
    }

    private String asm;
    private String hex;
    private String type;
    // type:: nulldata , OVER

    // type: pubkey
    private int reqSigs;
    private String[] addresses;

    // DecodeScript
    private String p2sh;

    private String desc;
    private String address;

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getDesc() {
        return desc;
    }


    public void setAsm(String asm) {
        this.asm = asm;
    }

    public String getAsm() {
        return asm;
    }

    public void setHex(String hex) {
        this.hex = hex;
    }

    public String getHex() {
        return hex;
    }

    public void setReqSigs(int reqSigs) {
        this.reqSigs = reqSigs;
    }

    public int getReqSigs() {
        return reqSigs;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public String[] getAddresses() {
        return addresses;
    }

    public void setAddresses(String[] addresses) {
        this.addresses = addresses;
    }

    public String getP2sh() {
        return p2sh;
    }

    public void setP2sh(String p2sh) {
        this.p2sh = p2sh;
    }
}