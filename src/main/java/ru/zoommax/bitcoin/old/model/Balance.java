package ru.zoommax.bitcoin.old.model;

import java.math.BigDecimal;

/**
 * The type Balance.
 */
public class Balance {

    /**
     * The Address.
     */
    private String address;
    /**
     * The Balance.
     */
    private BigDecimal balance;
    /**
     * The Account.
     */
    private String account;

    /**
     * Instantiates a new Balance.
     */
    public Balance() {
    }

    /**
     * Instantiates a new Balance.
     *
     * @param address the address
     * @param balance the balance
     * @param account the account
     */
    public Balance(String address, BigDecimal balance, String account) {
        this.address = address;
        this.balance = balance;
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
     * Gets balance.
     *
     * @return the balance
     */
    public BigDecimal getBalance() {
        return balance;
    }

    /**
     * Sets balance.
     *
     * @param balance the balance
     */
    public void setBalance(BigDecimal balance) {
        this.balance = balance;
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
}