package ru.zoommax.bitcoin.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import ru.zoommax.bitcoin.JsonRpcResult;

/**
 * The type Wallet info.
 */
public class WalletInfo {

    /**
     * The type Result.
     */
    public static class Result extends JsonRpcResult<WalletInfo> {
    }

    /**
     * The Walletname.
     */
    private String walletname;
    /**
     * The Walletversion.
     */
    private long walletversion;
    /**
     * The Balance.
     */
    private double balance;
    /**
     * The Unconfirmed balance.
     */
    @JsonProperty("unconfirmed_balance")
    private int unconfirmedBalance;
    /**
     * The Immature balance.
     */
    @JsonProperty("immature_balance")
    private int immatureBalance;
    /**
     * The Txcount.
     */
    private int txcount;
    /**
     * The Keypoololdest.
     */
    private long keypoololdest;
    /**
     * The Keypoolsize.
     */
    private int keypoolsize;
    /**
     * The Keypoolsize hd internal.
     */
    @JsonProperty("keypoolsize_hd_internal")
    private int keypoolsizeHdInternal;
    /**
     * The Paytxfee.
     */
    private int paytxfee;
    /**
     * The Hdmasterkeyid.
     */
    private String hdmasterkeyid;

    /**
     * Sets walletname.
     *
     * @param walletname the walletname
     */
    public void setWalletname(String walletname) {
        this.walletname = walletname;
    }

    /**
     * Gets walletname.
     *
     * @return the walletname
     */
    public String getWalletname() {
        return walletname;
    }

    /**
     * Sets walletversion.
     *
     * @param walletversion the walletversion
     */
    public void setWalletversion(long walletversion) {
        this.walletversion = walletversion;
    }

    /**
     * Gets walletversion.
     *
     * @return the walletversion
     */
    public long getWalletversion() {
        return walletversion;
    }

    /**
     * Sets balance.
     *
     * @param balance the balance
     */
    public void setBalance(double balance) {
        this.balance = balance;
    }

    /**
     * Gets balance.
     *
     * @return the balance
     */
    public double getBalance() {
        return balance;
    }

    /**
     * Gets unconfirmed balance.
     *
     * @return the unconfirmed balance
     */
    public int getUnconfirmedBalance() {
        return unconfirmedBalance;
    }

    /**
     * Sets unconfirmed balance.
     *
     * @param unconfirmedBalance the unconfirmed balance
     */
    public void setUnconfirmedBalance(int unconfirmedBalance) {
        this.unconfirmedBalance = unconfirmedBalance;
    }

    /**
     * Gets immature balance.
     *
     * @return the immature balance
     */
    public int getImmatureBalance() {
        return immatureBalance;
    }

    /**
     * Sets immature balance.
     *
     * @param immatureBalance the immature balance
     */
    public void setImmatureBalance(int immatureBalance) {
        this.immatureBalance = immatureBalance;
    }

    /**
     * Gets keypoolsize hd internal.
     *
     * @return the keypoolsize hd internal
     */
    public int getKeypoolsizeHdInternal() {
        return keypoolsizeHdInternal;
    }

    /**
     * Sets keypoolsize hd internal.
     *
     * @param keypoolsizeHdInternal the keypoolsize hd internal
     */
    public void setKeypoolsizeHdInternal(int keypoolsizeHdInternal) {
        this.keypoolsizeHdInternal = keypoolsizeHdInternal;
    }

    /**
     * Sets txcount.
     *
     * @param txcount the txcount
     */
    public void setTxcount(int txcount) {
        this.txcount = txcount;
    }

    /**
     * Gets txcount.
     *
     * @return the txcount
     */
    public int getTxcount() {
        return txcount;
    }

    /**
     * Sets keypoololdest.
     *
     * @param keypoololdest the keypoololdest
     */
    public void setKeypoololdest(long keypoololdest) {
        this.keypoololdest = keypoololdest;
    }

    /**
     * Gets keypoololdest.
     *
     * @return the keypoololdest
     */
    public long getKeypoololdest() {
        return keypoololdest;
    }

    /**
     * Sets keypoolsize.
     *
     * @param keypoolsize the keypoolsize
     */
    public void setKeypoolsize(int keypoolsize) {
        this.keypoolsize = keypoolsize;
    }

    /**
     * Gets keypoolsize.
     *
     * @return the keypoolsize
     */
    public int getKeypoolsize() {
        return keypoolsize;
    }

    /**
     * Sets paytxfee.
     *
     * @param paytxfee the paytxfee
     */
    public void setPaytxfee(int paytxfee) {
        this.paytxfee = paytxfee;
    }

    /**
     * Gets paytxfee.
     *
     * @return the paytxfee
     */
    public int getPaytxfee() {
        return paytxfee;
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
     * Gets hdmasterkeyid.
     *
     * @return the hdmasterkeyid
     */
    public String getHdmasterkeyid() {
        return hdmasterkeyid;
    }

}