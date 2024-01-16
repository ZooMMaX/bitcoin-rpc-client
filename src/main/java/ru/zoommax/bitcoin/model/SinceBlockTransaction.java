package ru.zoommax.bitcoin.model;

import ru.zoommax.bitcoin.JsonRpcResult;

public class SinceBlockTransaction {

    public class Result extends JsonRpcResult<SinceBlockTransaction> {
    }

    private AccountTransaction[] transactions;
    private AccountTransaction[] removed;
    private String lastblock;

    public AccountTransaction[] getTransactions() {
        return transactions;
    }

    public void setTransactions(AccountTransaction[] transactions) {
        this.transactions = transactions;
    }

    public AccountTransaction[] getRemoved() {
        return removed;
    }

    public void setRemoved(AccountTransaction[] removed) {
        this.removed = removed;
    }

    public String getLastblock() {
        return lastblock;
    }

    public void setLastblock(String lastblock) {
        this.lastblock = lastblock;
    }
}