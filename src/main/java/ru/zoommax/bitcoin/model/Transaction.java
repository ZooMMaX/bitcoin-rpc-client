package ru.zoommax.bitcoin.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class Transaction {

    private int amount;
    private double fee;
    private int confirmations;
    private String blockhash;
    private int blockindex;
    private int blocktime;
    private String txid;
    private List<String> walletconflicts;
    private int time;
    private int timereceived;
    @JsonProperty("bip125-replaceable")
    private String bip125Replaceable;
    private List<TransactionDetails> details;
    private String hex;

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getAmount() {
        return amount;
    }

    public void setFee(double fee) {
        this.fee = fee;
    }

    public double getFee() {
        return fee;
    }

    public void setConfirmations(int confirmations) {
        this.confirmations = confirmations;
    }

    public int getConfirmations() {
        return confirmations;
    }

    public void setBlockhash(String blockhash) {
        this.blockhash = blockhash;
    }

    public String getBlockhash() {
        return blockhash;
    }

    public void setBlockindex(int blockindex) {
        this.blockindex = blockindex;
    }

    public int getBlockindex() {
        return blockindex;
    }

    public void setBlocktime(int blocktime) {
        this.blocktime = blocktime;
    }

    public int getBlocktime() {
        return blocktime;
    }

    public void setTxid(String txid) {
        this.txid = txid;
    }

    public String getTxid() {
        return txid;
    }

    public void setWalletconflicts(List<String> walletconflicts) {
        this.walletconflicts = walletconflicts;
    }

    public List<String> getWalletconflicts() {
        return walletconflicts;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public int getTime() {
        return time;
    }

    public void setTimereceived(int timereceived) {
        this.timereceived = timereceived;
    }

    public int getTimereceived() {
        return timereceived;
    }

    public String getBip125Replaceable() {
        return bip125Replaceable;
    }

    public void setBip125Replaceable(String bip125Replaceable) {
        this.bip125Replaceable = bip125Replaceable;
    }

    public void setDetails(List<TransactionDetails> details) {
        this.details = details;
    }

    public List<TransactionDetails> getDetails() {
        return details;
    }

    public void setHex(String hex) {
        this.hex = hex;
    }

    public String getHex() {
        return hex;
    }

}