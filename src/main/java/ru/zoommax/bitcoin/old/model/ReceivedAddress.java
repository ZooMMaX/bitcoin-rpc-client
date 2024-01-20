package ru.zoommax.bitcoin.old.model;

import ru.zoommax.bitcoin.bitcore25.model.ArrayValue;

/**
 * The type Received address.
 */
public class ReceivedAddress {
    /**
     * The type Array.
     */
    public static class Array extends ArrayValue<ReceivedAddress> {
    }

    /**
     * The Address.
     */
    private String address;
    /**
     * The Account.
     */
    private String account;
    /**
     * The Amount.
     */
    private double amount;
    /**
     * The Confirmations.
     */
    private int confirmations;
    /**
     * The Label.
     */
    private String label;
    /**
     * The Txids.
     */
    private String[] txids;

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
     * Sets amount.
     *
     * @param amount the amount
     */
    public void setAmount(double amount) {
        this.amount = amount;
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
     * Get txids string [ ].
     *
     * @return the string [ ]
     */
    public String[] getTxids() {
        return txids;
    }

    /**
     * Sets txids.
     *
     * @param txids the txids
     */
    public void setTxids(String[] txids) {
        this.txids = txids;
    }
}