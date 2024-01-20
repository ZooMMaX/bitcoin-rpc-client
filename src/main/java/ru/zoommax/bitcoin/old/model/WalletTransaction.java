package ru.zoommax.bitcoin.old.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import ru.zoommax.bitcoin.JsonRpcResult;

import java.util.List;

/**
 * The type Wallet transaction.
 */
public class WalletTransaction {
    /**
     * The type Result.
     */
    public static class Result extends JsonRpcResult<WalletTransaction> {
    }

    /**
     * The Amount.
     */
    private double amount;
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
     * The Details.
     */
    private Detail[] details;
    /**
     * The Hex.
     */
    private String hex;

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
     * Get details detail [ ].
     *
     * @return the detail [ ]
     */
    public Detail[] getDetails() {
        return details;
    }

    /**
     * Sets details.
     *
     * @param details the details
     */
    public void setDetails(Detail[] details) {
        this.details = details;
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
     * The type Detail.
     */
    public static class Detail {

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
         * The Abandoned.
         */
        private boolean abandoned;

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
    }
}