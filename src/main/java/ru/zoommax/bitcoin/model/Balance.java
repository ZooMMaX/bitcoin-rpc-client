package ru.zoommax.bitcoin.model;

import java.math.BigDecimal;

public class Balance {

    private String address;
    private BigDecimal balance;
    private String account;

    public Balance() {
    }

    public Balance(String address, BigDecimal balance, String account) {
        this.address = address;
        this.balance = balance;
        this.account = account;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }
}