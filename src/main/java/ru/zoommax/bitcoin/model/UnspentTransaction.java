package ru.zoommax.bitcoin.model;

import ru.zoommax.bitcoin.JsonRpcResult;

/**
 * The type Unspent transaction.
 */
public class UnspentTransaction extends OutTransaction {
    /**
     * The type Result.
     */
    public static class Result extends JsonRpcResult<UnspentTransaction[]> {
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
     * The Script pub key.
     */
    private String scriptPubKey;
    /**
     * The Amount.
     */
    private double amount;
    /**
     * The Confirmations.
     */
    private int confirmations;
    /**
     * The Spendable.
     */
    private boolean spendable;
    /**
     * The Solvable.
     */
    private boolean solvable;

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
     * Sets script pub key.
     *
     * @param scriptPubKey the script pub key
     */
    public void setScriptPubKey(String scriptPubKey) {
        this.scriptPubKey = scriptPubKey;
    }

    /**
     * Gets script pub key.
     *
     * @return the script pub key
     */
    public String getScriptPubKey() {
        return scriptPubKey;
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
     * Sets spendable.
     *
     * @param spendable the spendable
     */
    public void setSpendable(boolean spendable) {
        this.spendable = spendable;
    }

    /**
     * Gets spendable.
     *
     * @return the spendable
     */
    public boolean getSpendable() {
        return spendable;
    }

    /**
     * Sets solvable.
     *
     * @param solvable the solvable
     */
    public void setSolvable(boolean solvable) {
        this.solvable = solvable;
    }

    /**
     * Gets solvable.
     *
     * @return the solvable
     */
    public boolean getSolvable() {
        return solvable;
    }

}