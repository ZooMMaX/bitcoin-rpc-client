package ru.zoommax.bitcoin.model;

import ru.zoommax.bitcoin.JsonRpcResult;

public class AddressInfo {
    public static class Result extends JsonRpcResult<AddressInfo> {
    }

    private String address;
    private String scriptPubKey;
    private boolean ismine;
    private boolean iswatchonly;
    private boolean isscript;
    private boolean iswitness;
    private String script;
    private String hex;
    private String pubkey;
    private Embedded embedded;
    private String label;
    private String account;
    private int timestamp;
    private String hdkeypath;
    private String hdseedid;
    private String hdmasterkeyid;
    private Labels[] labels;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getScriptPubKey() {
        return scriptPubKey;
    }

    public void setScriptPubKey(String scriptPubKey) {
        this.scriptPubKey = scriptPubKey;
    }

    public boolean isIsmine() {
        return ismine;
    }

    public void setIsmine(boolean ismine) {
        this.ismine = ismine;
    }

    public boolean isIswatchonly() {
        return iswatchonly;
    }

    public void setIswatchonly(boolean iswatchonly) {
        this.iswatchonly = iswatchonly;
    }

    public boolean isIsscript() {
        return isscript;
    }

    public void setIsscript(boolean isscript) {
        this.isscript = isscript;
    }

    public boolean isIswitness() {
        return iswitness;
    }

    public void setIswitness(boolean iswitness) {
        this.iswitness = iswitness;
    }

    public String getScript() {
        return script;
    }

    public void setScript(String script) {
        this.script = script;
    }

    public String getHex() {
        return hex;
    }

    public void setHex(String hex) {
        this.hex = hex;
    }

    public String getPubkey() {
        return pubkey;
    }

    public void setPubkey(String pubkey) {
        this.pubkey = pubkey;
    }

    public Embedded getEmbedded() {
        return embedded;
    }

    public void setEmbedded(Embedded embedded) {
        this.embedded = embedded;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public int getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(int timestamp) {
        this.timestamp = timestamp;
    }

    public String getHdkeypath() {
        return hdkeypath;
    }

    public void setHdkeypath(String hdkeypath) {
        this.hdkeypath = hdkeypath;
    }

    public String getHdseedid() {
        return hdseedid;
    }

    public void setHdseedid(String hdseedid) {
        this.hdseedid = hdseedid;
    }

    public String getHdmasterkeyid() {
        return hdmasterkeyid;
    }

    public void setHdmasterkeyid(String hdmasterkeyid) {
        this.hdmasterkeyid = hdmasterkeyid;
    }

    public Labels[] getLabels() {
        return labels;
    }

    public void setLabels(Labels[] labels) {
        this.labels = labels;
    }
}