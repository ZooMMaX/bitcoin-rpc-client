package ru.zoommax.bitcoin.bitcore26.api.wallet;

import ru.zoommax.bitcoin.JsonRpc20;
import ru.zoommax.bitcoin.bitcore26.model.wallet.gettransaction.WTransaction;
import ru.zoommax.bitcoin.bitcore26.model.wallet.getwalletinfo.WalletInfo;

public class WalletApi extends ru.zoommax.bitcoin.bitcore25.api.wallet.WalletApi{
    /**
     * Instantiates a new Wallet api.
     *
     * @param username the username
     * @param password the password
     * @param url      the url
     */
    public WalletApi(String username, String password, String url) {
        super(username, password, url);
    }

    public WalletInfo getWalletInfo() {
        return this.post(new JsonRpc20.Builder().setMethod("getwalletinfo").getJson(), WalletInfo.Result.class);
    }

    /**
     * Gets transaction.
     *
     * @param txid the txid
     * @return the transaction
     */
    public WTransaction getTransaction(String txid) {
        return this.post(new JsonRpc20.Builder().setMethod("gettransaction").appendParams(txid).getJson(), WTransaction.Result.class);
    }

    /**
     * Gets transaction.
     *
     * @param txid             the txid
     * @param includeWatchOnly the include watch only
     * @param verbose          the verbose
     * @return the transaction
     */
    public WTransaction getTransaction(String txid, boolean includeWatchOnly, boolean verbose) {
        return this.post(new JsonRpc20.Builder().setMethod("gettransaction").appendParams(txid).appendParams(includeWatchOnly).appendParams(verbose).getJson(), WTransaction.Result.class);
    }

    /**
     * List transactions w transaction [ ].
     *
     * @return the w transaction [ ]
     */
    public WTransaction[] listTransactions() {
        return this.post(new JsonRpc20.Builder().setMethod("listtransactions").getJson(), WTransaction.ResultArray.class);
    }

    /**
     * List transactions w transaction [ ].
     *
     * @param label            the label
     * @param count            the count
     * @param skip             the skip
     * @param includeWatchOnly the include watch only
     * @return the w transaction [ ]
     */
    public WTransaction[] listTransactions(String label, long count, long skip, boolean includeWatchOnly) {
        return this.post(new JsonRpc20.Builder().setMethod("listtransactions").appendParams(label).appendParams(count).appendParams(skip).appendParams(includeWatchOnly).getJson(), WTransaction.ResultArray.class);
    }
}
