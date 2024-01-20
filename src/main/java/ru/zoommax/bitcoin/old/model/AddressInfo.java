package ru.zoommax.bitcoin.old.model;

import ru.zoommax.bitcoin.JsonRpcResult;

/**
 * The type Address info.
 */
public class AddressInfo {
    /**
     * The type Result.
     */
    public static class Result extends JsonRpcResult<AddressInfo> {
    }

    /**
     * The Address.
     */
    private String address;
    /**
     * The Script pub key.
     */
    private String scriptPubKey;
    /**
     * The Ismine.
     */
    private boolean ismine;
    /**
     * The Iswatchonly.
     */
    private boolean iswatchonly;
    /**
     * The Isscript.
     */
    private boolean isscript;
    /**
     * The Iswitness.
     */
    private boolean iswitness;
    /**
     * The Script.
     */
    private String script;
    /**
     * The Hex.
     */
    private String hex;
    /**
     * The Pubkey.
     */
    private String pubkey;
    /**
     * The Embedded.
     */
    private Embedded embedded;
    /**
     * The Label.
     */
    private String label;
    /**
     * The Account.
     */
    private String account;
    /**
     * The Timestamp.
     */
    private int timestamp;
    /**
     * The Hdkeypath.
     */
    private String hdkeypath;
    /**
     * The Hdseedid.
     */
    private String hdseedid;
    /**
     * The Hdmasterkeyid.
     */
    private String hdmasterkeyid;
    /**
     * The Labels.
     */
    private Labels[] labels;

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
     * Gets script pub key.
     *
     * @return the script pub key
     */
    public String getScriptPubKey() {
        return scriptPubKey;
    }

    /**
     * Sets script pub key.
     *
     * @param scriptPubKey the script pub key
     */
    public void setScriptPubKey(String scriptPubKey) {
        this.scriptPubKey = scriptPubKey;
    }

    /**
     * Is ismine boolean.
     *
     * @return the boolean
     */
    public boolean isIsmine() {
        return ismine;
    }

    /**
     * Sets ismine.
     *
     * @param ismine the ismine
     */
    public void setIsmine(boolean ismine) {
        this.ismine = ismine;
    }

    /**
     * Is iswatchonly boolean.
     *
     * @return the boolean
     */
    public boolean isIswatchonly() {
        return iswatchonly;
    }

    /**
     * Sets iswatchonly.
     *
     * @param iswatchonly the iswatchonly
     */
    public void setIswatchonly(boolean iswatchonly) {
        this.iswatchonly = iswatchonly;
    }

    /**
     * Is isscript boolean.
     *
     * @return the boolean
     */
    public boolean isIsscript() {
        return isscript;
    }

    /**
     * Sets isscript.
     *
     * @param isscript the isscript
     */
    public void setIsscript(boolean isscript) {
        this.isscript = isscript;
    }

    /**
     * Is iswitness boolean.
     *
     * @return the boolean
     */
    public boolean isIswitness() {
        return iswitness;
    }

    /**
     * Sets iswitness.
     *
     * @param iswitness the iswitness
     */
    public void setIswitness(boolean iswitness) {
        this.iswitness = iswitness;
    }

    /**
     * Gets script.
     *
     * @return the script
     */
    public String getScript() {
        return script;
    }

    /**
     * Sets script.
     *
     * @param script the script
     */
    public void setScript(String script) {
        this.script = script;
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
     * Sets hex.
     *
     * @param hex the hex
     */
    public void setHex(String hex) {
        this.hex = hex;
    }

    /**
     * Gets pubkey.
     *
     * @return the pubkey
     */
    public String getPubkey() {
        return pubkey;
    }

    /**
     * Sets pubkey.
     *
     * @param pubkey the pubkey
     */
    public void setPubkey(String pubkey) {
        this.pubkey = pubkey;
    }

    /**
     * Gets embedded.
     *
     * @return the embedded
     */
    public Embedded getEmbedded() {
        return embedded;
    }

    /**
     * Sets embedded.
     *
     * @param embedded the embedded
     */
    public void setEmbedded(Embedded embedded) {
        this.embedded = embedded;
    }

    /**
     * Gets label.
     *
     * @return the label
     */
    public String getLabel() {
        return label;
    }

    /**
     * Sets label.
     *
     * @param label the label
     */
    public void setLabel(String label) {
        this.label = label;
    }

    /**
     * Gets account.
     *
     * @return the account
     */
    public String getAccount() {
        return account;
    }

    /**
     * Sets account.
     *
     * @param account the account
     */
    public void setAccount(String account) {
        this.account = account;
    }

    /**
     * Gets timestamp.
     *
     * @return the timestamp
     */
    public int getTimestamp() {
        return timestamp;
    }

    /**
     * Sets timestamp.
     *
     * @param timestamp the timestamp
     */
    public void setTimestamp(int timestamp) {
        this.timestamp = timestamp;
    }

    /**
     * Gets hdkeypath.
     *
     * @return the hdkeypath
     */
    public String getHdkeypath() {
        return hdkeypath;
    }

    /**
     * Sets hdkeypath.
     *
     * @param hdkeypath the hdkeypath
     */
    public void setHdkeypath(String hdkeypath) {
        this.hdkeypath = hdkeypath;
    }

    /**
     * Gets hdseedid.
     *
     * @return the hdseedid
     */
    public String getHdseedid() {
        return hdseedid;
    }

    /**
     * Sets hdseedid.
     *
     * @param hdseedid the hdseedid
     */
    public void setHdseedid(String hdseedid) {
        this.hdseedid = hdseedid;
    }

    /**
     * Gets hdmasterkeyid.
     *
     * @return the hdmasterkeyid
     */
    public String getHdmasterkeyid() {
        return hdmasterkeyid;
    }

    /**
     * Sets hdmasterkeyid.
     *
     * @param hdmasterkeyid the hdmasterkeyid
     */
    public void setHdmasterkeyid(String hdmasterkeyid) {
        this.hdmasterkeyid = hdmasterkeyid;
    }

    /**
     * Get labels labels [ ].
     *
     * @return the labels [ ]
     */
    public Labels[] getLabels() {
        return labels;
    }

    /**
     * Sets labels.
     *
     * @param labels the labels
     */
    public void setLabels(Labels[] labels) {
        this.labels = labels;
    }
}