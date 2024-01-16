package ru.zoommax.bitcoin.model;

import ru.zoommax.bitcoin.JsonRpcResult;

public class UnspentTransaction extends OutTransaction {
    public static class Result extends JsonRpcResult<UnspentTransaction[]> {
    }

    private String address;
    private String account;
    private String scriptPubKey;
    private double amount;
    private int confirmations;
    private boolean spendable;
    private boolean solvable;

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getAccount() {
        return account;
    }

    public void setScriptPubKey(String scriptPubKey) {
        this.scriptPubKey = scriptPubKey;
    }

    public String getScriptPubKey() {
        return scriptPubKey;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }

    public void setConfirmations(int confirmations) {
        this.confirmations = confirmations;
    }

    public int getConfirmations() {
        return confirmations;
    }

    public void setSpendable(boolean spendable) {
        this.spendable = spendable;
    }

    public boolean getSpendable() {
        return spendable;
    }

    public void setSolvable(boolean solvable) {
        this.solvable = solvable;
    }

    public boolean getSolvable() {
        return solvable;
    }

}