package ru.zoommax.bitcoin.model;

public class ReceivedAddress {
    public static class Array extends ArrayValue<ReceivedAddress> {
    }

    private String address;
    private String account;
    private double amount;
    private int confirmations;
    private String label;
    private String[] txids;

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

    public void setLabel(String label) {
        this.label = label;
    }

    public String getLabel() {
        return label;
    }

    public String[] getTxids() {
        return txids;
    }

    public void setTxids(String[] txids) {
        this.txids = txids;
    }
}