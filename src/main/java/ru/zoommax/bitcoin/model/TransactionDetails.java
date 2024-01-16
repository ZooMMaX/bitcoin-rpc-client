package ru.zoommax.bitcoin.model;

/**
 * The type Transaction details.
 */
public class TransactionDetails {

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
    private int amount;
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
     * Sets account.
     *
     * @param account the account
     */
    public void setAccount(String account) {
        this.account = account;
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
     * Sets category.
     *
     * @param category the category
     */
    public void setCategory(String category) {
        this.category = category;
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
     * Sets label.
     *
     * @param label the label
     */
    public void setLabel(String label) {
        this.label = label;
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
     * Sets vout.
     *
     * @param vout the vout
     */
    public void setVout(int vout) {
        this.vout = vout;
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
     * Sets abandoned.
     *
     * @param abandoned the abandoned
     */
    public void setAbandoned(boolean abandoned) {
        this.abandoned = abandoned;
    }

    /**
     * Gets abandoned.
     *
     * @return the abandoned
     */
    public boolean getAbandoned() {
        return abandoned;
    }

}