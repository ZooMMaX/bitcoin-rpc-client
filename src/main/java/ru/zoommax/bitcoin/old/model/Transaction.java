package ru.zoommax.bitcoin.old.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * The type Transaction.
 */
public class Transaction {

    /**
     * The Amount.
     */
    private int amount;
    /**
     * The Fee.
     */
    private double fee;
    /**
     * The Confirmations.
     */
    private int confirmations;
    /**
     * The Blockhash.
     */
    private String blockhash;
    /**
     * The Blockindex.
     */
    private int blockindex;
    /**
     * The Blocktime.
     */
    private int blocktime;
    /**
     * The Txid.
     */
    private String txid;
    /**
     * The Walletconflicts.
     */
    private List<String> walletconflicts;
    /**
     * The Time.
     */
    private int time;
    /**
     * The Timereceived.
     */
    private int timereceived;
    /**
     * The Bip 125 replaceable.
     */
    @JsonProperty("bip125-replaceable")
    private String bip125Replaceable;
    /**
     * The Details.
     */
    private List<TransactionDetails> details;
    /**
     * The Hex.
     */
    private String hex;

    /**
     * Sets amount.
     *
     * @param amount the amount
     */
    public void setAmount(int amount) {
        this.amount = amount;
    }

    /**
     * Gets amount.
     *
     * @return the amount
     */
    public int getAmount() {
        return amount;
    }

    /**
     * Sets fee.
     *
     * @param fee the fee
     */
    public void setFee(double fee) {
        this.fee = fee;
    }

    /**
     * Gets fee.
     *
     * @return the fee
     */
    public double getFee() {
        return fee;
    }

    /**
     * Sets confirmations.
     *
     * @param confirmations the confirmations
     */
    public void setConfirmations(int confirmations) {
        this.confirmations = confirmations;
    }

    /**
     * Gets confirmations.
     *
     * @return the confirmations
     */
    public int getConfirmations() {
        return confirmations;
    }

    /**
     * Sets blockhash.
     *
     * @param blockhash the blockhash
     */
    public void setBlockhash(String blockhash) {
        this.blockhash = blockhash;
    }

    /**
     * Gets blockhash.
     *
     * @return the blockhash
     */
    public String getBlockhash() {
        return blockhash;
    }

    /**
     * Sets blockindex.
     *
     * @param blockindex the blockindex
     */
    public void setBlockindex(int blockindex) {
        this.blockindex = blockindex;
    }

    /**
     * Gets blockindex.
     *
     * @return the blockindex
     */
    public int getBlockindex() {
        return blockindex;
    }

    /**
     * Sets blocktime.
     *
     * @param blocktime the blocktime
     */
    public void setBlocktime(int blocktime) {
        this.blocktime = blocktime;
    }

    /**
     * Gets blocktime.
     *
     * @return the blocktime
     */
    public int getBlocktime() {
        return blocktime;
    }

    /**
     * Sets txid.
     *
     * @param txid the txid
     */
    public void setTxid(String txid) {
        this.txid = txid;
    }

    /**
     * Gets txid.
     *
     * @return the txid
     */
    public String getTxid() {
        return txid;
    }

    /**
     * Sets walletconflicts.
     *
     * @param walletconflicts the walletconflicts
     */
    public void setWalletconflicts(List<String> walletconflicts) {
        this.walletconflicts = walletconflicts;
    }

    /**
     * Gets walletconflicts.
     *
     * @return the walletconflicts
     */
    public List<String> getWalletconflicts() {
        return walletconflicts;
    }

    /**
     * Sets time.
     *
     * @param time the time
     */
    public void setTime(int time) {
        this.time = time;
    }

    /**
     * Gets time.
     *
     * @return the time
     */
    public int getTime() {
        return time;
    }

    /**
     * Sets timereceived.
     *
     * @param timereceived the timereceived
     */
    public void setTimereceived(int timereceived) {
        this.timereceived = timereceived;
    }

    /**
     * Gets timereceived.
     *
     * @return the timereceived
     */
    public int getTimereceived() {
        return timereceived;
    }

    /**
     * Gets bip 125 replaceable.
     *
     * @return the bip 125 replaceable
     */
    public String getBip125Replaceable() {
        return bip125Replaceable;
    }

    /**
     * Sets bip 125 replaceable.
     *
     * @param bip125Replaceable the bip 125 replaceable
     */
    public void setBip125Replaceable(String bip125Replaceable) {
        this.bip125Replaceable = bip125Replaceable;
    }

    /**
     * Sets details.
     *
     * @param details the details
     */
    public void setDetails(List<TransactionDetails> details) {
        this.details = details;
    }

    /**
     * Gets details.
     *
     * @return the details
     */
    public List<TransactionDetails> getDetails() {
        return details;
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

}