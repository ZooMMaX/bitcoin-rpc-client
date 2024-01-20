package ru.zoommax.bitcoin.old.model;

import ru.zoommax.bitcoin.JsonRpcResult;

/**
 * The type Script pub key.
 */
public class ScriptPubKey {

    /**
     * The type Result.
     */
    public class Result extends JsonRpcResult<ScriptPubKey> {
    }

    /**
     * The Asm.
     */
    private String asm;
    /**
     * The Hex.
     */
    private String hex;
    /**
     * The Type.
     */
    private String type;
    // type:: nulldata , OVER

    /**
     * The Req sigs.
     */
// type: pubkey
    private int reqSigs;
    /**
     * The Addresses.
     */
    private String[] addresses;

    /**
     * The P 2 sh.
     */
// DecodeScript
    private String p2sh;

    /**
     * The Desc.
     */
    private String desc;
    /**
     * The Address.
     */
    private String address;

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
     * Sets desc.
     *
     * @param desc the desc
     */
    public void setDesc(String desc) {
        this.desc = desc;
    }

    /**
     * Gets desc.
     *
     * @return the desc
     */
    public String getDesc() {
        return desc;
    }


    /**
     * Sets asm.
     *
     * @param asm the asm
     */
    public void setAsm(String asm) {
        this.asm = asm;
    }

    /**
     * Gets asm.
     *
     * @return the asm
     */
    public String getAsm() {
        return asm;
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
     * Gets hex.
     *
     * @return the hex
     */
    public String getHex() {
        return hex;
    }

    /**
     * Sets req sigs.
     *
     * @param reqSigs the req sigs
     */
    public void setReqSigs(int reqSigs) {
        this.reqSigs = reqSigs;
    }

    /**
     * Gets req sigs.
     *
     * @return the req sigs
     */
    public int getReqSigs() {
        return reqSigs;
    }

    /**
     * Sets type.
     *
     * @param type the type
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * Gets type.
     *
     * @return the type
     */
    public String getType() {
        return type;
    }

    /**
     * Get addresses string [ ].
     *
     * @return the string [ ]
     */
    public String[] getAddresses() {
        return addresses;
    }

    /**
     * Sets addresses.
     *
     * @param addresses the addresses
     */
    public void setAddresses(String[] addresses) {
        this.addresses = addresses;
    }

    /**
     * Gets p 2 sh.
     *
     * @return the p 2 sh
     */
    public String getP2sh() {
        return p2sh;
    }

    /**
     * Sets p 2 sh.
     *
     * @param p2sh the p 2 sh
     */
    public void setP2sh(String p2sh) {
        this.p2sh = p2sh;
    }
}