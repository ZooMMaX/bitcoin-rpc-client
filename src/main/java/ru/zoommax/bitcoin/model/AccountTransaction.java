package ru.zoommax.bitcoin.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import ru.zoommax.bitcoin.JsonRpcResult;

import java.util.List;

public class AccountTransaction {
    public static class Result extends JsonRpcResult<AccountTransaction[]> {
    }

    public static final String CATEGORY_RECEIVE = "receive";
    public static final String CATEGORY_SEND = "send";

    private String account;
    private String address;
    private String category;
    private double amount;
    private String label;
    private int vout;
    private double fee;
    private int confirmations;
    private boolean trusted;
    private String txid;
    private List<?> walletconflicts;
    private long time;
    private long timereceived;
    @JsonProperty("bip125-replaceable")
    private String bip125replaceable;
    private boolean abandoned;

    private String blockhash;
    private int blockindex;
    private long blocktime;

    private String comment;
    private String to; // comment_to
    private boolean generated;

    public TransactionInput toTransactionInput() {
        return new TransactionInput(this.getTxid(), this.vout);
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public int getVout() {
        return vout;
    }

    public void setVout(int vout) {
        this.vout = vout;
    }

    public double getFee() {
        return fee;
    }

    public void setFee(double fee) {
        this.fee = fee;
    }

    public int getConfirmations() {
        return confirmations;
    }

    public void setConfirmations(int confirmations) {
        this.confirmations = confirmations;
    }

    public boolean isTrusted() {
        return trusted;
    }

    public void setTrusted(boolean trusted) {
        this.trusted = trusted;
    }

    public String getTxid() {
        return txid;
    }

    public void setTxid(String txid) {
        this.txid = txid;
    }

    public List<?> getWalletconflicts() {
        return walletconflicts;
    }

    public void setWalletconflicts(List<?> walletconflicts) {
        this.walletconflicts = walletconflicts;
    }

    public long getTime() {
        return time;
    }

    public void setTime(long time) {
        this.time = time;
    }

    public long getTimereceived() {
        return timereceived;
    }

    public void setTimereceived(long timereceived) {
        this.timereceived = timereceived;
    }

    public String getBip125replaceable() {
        return bip125replaceable;
    }

    public void setBip125replaceable(String bip125replaceable) {
        this.bip125replaceable = bip125replaceable;
    }

    public boolean isAbandoned() {
        return abandoned;
    }

    public void setAbandoned(boolean abandoned) {
        this.abandoned = abandoned;
    }

    public String getBlockhash() {
        return blockhash;
    }

    public void setBlockhash(String blockhash) {
        this.blockhash = blockhash;
    }

    public int getBlockindex() {
        return blockindex;
    }

    public void setBlockindex(int blockindex) {
        this.blockindex = blockindex;
    }

    public long getBlocktime() {
        return blocktime;
    }

    public void setBlocktime(long blocktime) {
        this.blocktime = blocktime;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public boolean isGenerated() {
        return generated;
    }

    public void setGenerated(boolean generated) {
        this.generated = generated;
    }
}