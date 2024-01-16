package ru.zoommax.bitcoin.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import ru.zoommax.bitcoin.JsonRpcResult;

public class WalletInfo {

    public static class Result extends JsonRpcResult<WalletInfo> {
    }

    private String walletname;
    private long walletversion;
    private double balance;
    @JsonProperty("unconfirmed_balance")
    private int unconfirmedBalance;
    @JsonProperty("immature_balance")
    private int immatureBalance;
    private int txcount;
    private long keypoololdest;
    private int keypoolsize;
    @JsonProperty("keypoolsize_hd_internal")
    private int keypoolsizeHdInternal;
    private int paytxfee;
    private String hdmasterkeyid;

    public void setWalletname(String walletname) {
        this.walletname = walletname;
    }

    public String getWalletname() {
        return walletname;
    }

    public void setWalletversion(long walletversion) {
        this.walletversion = walletversion;
    }

    public long getWalletversion() {
        return walletversion;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public int getUnconfirmedBalance() {
        return unconfirmedBalance;
    }

    public void setUnconfirmedBalance(int unconfirmedBalance) {
        this.unconfirmedBalance = unconfirmedBalance;
    }

    public int getImmatureBalance() {
        return immatureBalance;
    }

    public void setImmatureBalance(int immatureBalance) {
        this.immatureBalance = immatureBalance;
    }

    public int getKeypoolsizeHdInternal() {
        return keypoolsizeHdInternal;
    }

    public void setKeypoolsizeHdInternal(int keypoolsizeHdInternal) {
        this.keypoolsizeHdInternal = keypoolsizeHdInternal;
    }

    public void setTxcount(int txcount) {
        this.txcount = txcount;
    }

    public int getTxcount() {
        return txcount;
    }

    public void setKeypoololdest(long keypoololdest) {
        this.keypoololdest = keypoololdest;
    }

    public long getKeypoololdest() {
        return keypoololdest;
    }

    public void setKeypoolsize(int keypoolsize) {
        this.keypoolsize = keypoolsize;
    }

    public int getKeypoolsize() {
        return keypoolsize;
    }

    public void setPaytxfee(int paytxfee) {
        this.paytxfee = paytxfee;
    }

    public int getPaytxfee() {
        return paytxfee;
    }

    public void setHdmasterkeyid(String hdmasterkeyid) {
        this.hdmasterkeyid = hdmasterkeyid;
    }

    public String getHdmasterkeyid() {
        return hdmasterkeyid;
    }

}