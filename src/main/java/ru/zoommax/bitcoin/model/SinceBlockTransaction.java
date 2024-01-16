package ru.zoommax.bitcoin.model;

import ru.zoommax.bitcoin.JsonRpcResult;

/**
 * The type Since block transaction.
 */
public class SinceBlockTransaction {

    /**
     * The type Result.
     */
    public class Result extends JsonRpcResult<SinceBlockTransaction> {
    }

    /**
     * The Transactions.
     */
    private AccountTransaction[] transactions;
    /**
     * The Removed.
     */
    private AccountTransaction[] removed;
    /**
     * The Lastblock.
     */
    private String lastblock;

    /**
     * Get transactions account transaction [ ].
     *
     * @return the account transaction [ ]
     */
    public AccountTransaction[] getTransactions() {
        return transactions;
    }

    /**
     * Sets transactions.
     *
     * @param transactions the transactions
     */
    public void setTransactions(AccountTransaction[] transactions) {
        this.transactions = transactions;
    }

    /**
     * Get removed account transaction [ ].
     *
     * @return the account transaction [ ]
     */
    public AccountTransaction[] getRemoved() {
        return removed;
    }

    /**
     * Sets removed.
     *
     * @param removed the removed
     */
    public void setRemoved(AccountTransaction[] removed) {
        this.removed = removed;
    }

    /**
     * Gets lastblock.
     *
     * @return the lastblock
     */
    public String getLastblock() {
        return lastblock;
    }

    /**
     * Sets lastblock.
     *
     * @param lastblock the lastblock
     */
    public void setLastblock(String lastblock) {
        this.lastblock = lastblock;
    }
}