package ru.zoommax.bitcoin.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import ru.zoommax.bitcoin.JsonRpcResult;

import java.util.List;


/**
 * The type Account transaction.
 */
public class AccountTransaction {


    /**
     * The type Result.
     */
    public static class Result extends JsonRpcResult<AccountTransaction[]> {
    }

    /**
     * The constant CATEGORY_RECEIVE.
     */
    public static final String CATEGORY_RECEIVE = "receive";
    /**
     * The constant CATEGORY_SEND.
     */
    public static final String CATEGORY_SEND = "send";

    /**
     * The Account.
     */
    private String account;
    /**
     * The Address.
     */
    private String address;
    /**
     * The Category.
     */
    private String category;
    /**
     * The Amount.
     */
    private double amount;
    /**
     * The Label.
     */
    private String label;
    /**
     * The Vout.
     */
    private int vout;
    /**
     * The Fee.
     */
    private double fee;
    /**
     * The Confirmations.
     */
    private int confirmations;
    /**
     * The Trusted.
     */
    private boolean trusted;
    /**
     * The Txid.
     */
    private String txid;
    /**
     * The Walletconflicts.
     */
    private List<?> walletconflicts;
    /**
     * The Time.
     */
    private long time;
    /**
     * The Timereceived.
     */
    private long timereceived;
    /**
     * The Bip 125 replaceable.
     */
    @JsonProperty("bip125-replaceable")
    private String bip125replaceable;
    /**
     * The Abandoned.
     */
    private boolean abandoned;

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
    private long blocktime;

    /**
     * The Comment.
     */
    private String comment;
    /**
     * The To.
     */
    private String to; // comment_to
    /**
     * The Generated.
     */
    private boolean generated;

    /**
     * To transaction input transaction input.
     *
     * @return the transaction input
     */
    public TransactionInput toTransactionInput() {
        return new TransactionInput(this.getTxid(), this.vout);
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
     * Gets category.
     *
     * @return the category
     */
    public String getCategory() {
        return category;
    }

    /**
     * Sets category.
     *
     * @param category the category
     */
    public void setCategory(String category) {
        this.category = category;
    }

    /**
     * Gets amount.
     *
     * @return the amount
     */
    public double getAmount() {
        return amount;
    }

    /**
     * Sets amount.
     *
     * @param amount the amount
     */
    public void setAmount(double amount) {
        this.amount = amount;
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
     * Gets vout.
     *
     * @return the vout
     */
    public int getVout() {
        return vout;
    }

    /**
     * Sets vout.
     *
     * @param vout the vout
     */
    public void setVout(int vout) {
        this.vout = vout;
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
     * Sets fee.
     *
     * @param fee the fee
     */
    public void setFee(double fee) {
        this.fee = fee;
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
     * Sets confirmations.
     *
     * @param confirmations the confirmations
     */
    public void setConfirmations(int confirmations) {
        this.confirmations = confirmations;
    }

    /**
     * Is trusted boolean.
     *
     * @return the boolean
     */
    public boolean isTrusted() {
        return trusted;
    }

    /**
     * Sets trusted.
     *
     * @param trusted the trusted
     */
    public void setTrusted(boolean trusted) {
        this.trusted = trusted;
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
     * Sets txid.
     *
     * @param txid the txid
     */
    public void setTxid(String txid) {
        this.txid = txid;
    }

    /**
     * Gets walletconflicts.
     *
     * @return the walletconflicts
     */
    public List<?> getWalletconflicts() {
        return walletconflicts;
    }

    /**
     * Sets walletconflicts.
     *
     * @param walletconflicts the walletconflicts
     */
    public void setWalletconflicts(List<?> walletconflicts) {
        this.walletconflicts = walletconflicts;
    }

    /**
     * Gets time.
     *
     * @return the time
     */
    public long getTime() {
        return time;
    }

    /**
     * Sets time.
     *
     * @param time the time
     */
    public void setTime(long time) {
        this.time = time;
    }

    /**
     * Gets timereceived.
     *
     * @return the timereceived
     */
    public long getTimereceived() {
        return timereceived;
    }

    /**
     * Sets timereceived.
     *
     * @param timereceived the timereceived
     */
    public void setTimereceived(long timereceived) {
        this.timereceived = timereceived;
    }

    /**
     * Gets bip 125 replaceable.
     *
     * @return the bip 125 replaceable
     */
    public String getBip125replaceable() {
        return bip125replaceable;
    }

    /**
     * Sets bip 125 replaceable.
     *
     * @param bip125replaceable the bip 125 replaceable
     */
    public void setBip125replaceable(String bip125replaceable) {
        this.bip125replaceable = bip125replaceable;
    }

    /**
     * Is abandoned boolean.
     *
     * @return the boolean
     */
    public boolean isAbandoned() {
        return abandoned;
    }

    /**
     * Sets abandoned.
     *
     * @param abandoned the abandoned
     */
    public void setAbandoned(boolean abandoned) {
        this.abandoned = abandoned;
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
     * Sets blockhash.
     *
     * @param blockhash the blockhash
     */
    public void setBlockhash(String blockhash) {
        this.blockhash = blockhash;
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
     * Sets blockindex.
     *
     * @param blockindex the blockindex
     */
    public void setBlockindex(int blockindex) {
        this.blockindex = blockindex;
    }

    /**
     * Gets blocktime.
     *
     * @return the blocktime
     */
    public long getBlocktime() {
        return blocktime;
    }

    /**
     * Sets blocktime.
     *
     * @param blocktime the blocktime
     */
    public void setBlocktime(long blocktime) {
        this.blocktime = blocktime;
    }

    /**
     * Gets comment.
     *
     * @return the comment
     */
    public String getComment() {
        return comment;
    }

    /**
     * Sets comment.
     *
     * @param comment the comment
     */
    public void setComment(String comment) {
        this.comment = comment;
    }

    /**
     * Gets to.
     *
     * @return the to
     */
    public String getTo() {
        return to;
    }

    /**
     * Sets to.
     *
     * @param to the to
     */
    public void setTo(String to) {
        this.to = to;
    }

    /**
     * Is generated boolean.
     *
     * @return the boolean
     */
    public boolean isGenerated() {
        return generated;
    }

    /**
     * Sets generated.
     *
     * @param generated the generated
     */
    public void setGenerated(boolean generated) {
        this.generated = generated;
    }
}