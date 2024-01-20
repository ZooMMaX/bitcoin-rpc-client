package ru.zoommax.bitcoin.old.api;

import ru.zoommax.bitcoin.JsonRpc20;
import ru.zoommax.bitcoin.JsonRpcClient;
import ru.zoommax.bitcoin.JsonRpcResult;
import ru.zoommax.bitcoin.annotation.NoComplete;
import ru.zoommax.bitcoin.bitcore25.model.ArrayValue;
import ru.zoommax.bitcoin.bitcore25.model.BigDecimalValue;
import ru.zoommax.bitcoin.bitcore25.model.MapValue;
import ru.zoommax.bitcoin.bitcore25.model.StringValue;
import ru.zoommax.bitcoin.old.model.*;

import java.math.BigDecimal;
import java.util.*;

/**
 * The type Wallet api.
 */
public class WalletApi extends JsonRpcClient {

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

    /**
     * Abandon transaction.
     *
     * @param txid the txid
     */
// anandontransaction 调用可以将一个钱包交易及其后代标记为放弃，这样 该交易中的输入UTXO就可以重新利用。
    // abandontransaction "txid"
    public void abandonTransaction(String txid) {
        JsonRpc20 json = new JsonRpc20.Builder().setMethod("abandontransaction").appendParams(txid).getJson();
        this.post(json, StringValue.class);
    }

    /**
     * Abort rescan.
     */
// Stops current wallet rescan triggered by an RPC call, e.g. by an importprivkey call.
    public void abortRescan() {
        JsonRpc20 json = new JsonRpc20.Builder().setMethod("abortrescan").getJson();
        this.post(json, StringValue.class);
    }

    /**
     * Addmultisigaddress multi sign address.
     *
     * @param number      the number
     * @param address     the address
     * @param lable       the lable
     * @param addressType the address type
     * @return the multi sign address
     */
    public MultiSignAddress addmultisigaddress(int number, String[] address, String lable, AccountType addressType) {
        JsonRpc20.Builder builder = new JsonRpc20.Builder().setMethod("addmultisigaddress").appendParams(number).appendParams(address);
        if (lable != null) {
            builder.appendParams(lable);
            if (addressType != null) {
                builder.appendParams(addressType.getType());
            }
        }
        return this.post(builder.getJson(), MultiSignAddress.Result.class);
    }

    /**
     * Backup wallet.
     *
     * @param destination the destination
     */
    public void backupWallet(String destination) {
        JsonRpc20 json = new JsonRpc20.Builder().setMethod("backupwallet").appendParams(destination).getJson();
        this.post(json, StringValue.class);
    }

    /**
     * Bump fee bump fee . bump transaction fee.
     *
     * @param txid    the txid
     * @param options the options
     * @return the bump fee . bump transaction fee
     */
    public BumpFee.BumpTransactionFee bumpFee(String txid, BumpFee.Options options) {
        JsonRpc20.Builder builder = new JsonRpc20.Builder().setMethod("bumpfee").appendParams(txid);
        if (options != null) {
            builder.appendParams(options);
        }
        return this.post(builder.getJson(), BumpFee.Result.class);
    }

    /**
     * Create wallet wallet name.
     *
     * @param name                 the name
     * @param disable_private_keys the disable private keys
     * @return the wallet name
     */
// createwallet "wallet_name" ( disable_private_keys )
    public WalletName createWallet(String name, boolean disable_private_keys) {
        JsonRpc20.Builder builder = new JsonRpc20.Builder().setMethod("createwallet").appendParams(name);
        builder.appendParams(disable_private_keys);
        return this.post(builder.getJson(), WalletName.Result.class);
    }

    /**
     * The type Wallet name.
     */
    public static class WalletName {
        /**
         * The type Result.
         */
        public static class Result extends JsonRpcResult<WalletName> {
        }

        /**
         * The Name.
         */
        private String name;
        /**
         * The Warning.
         */
        private String warning;

        /**
         * Gets name.
         *
         * @return the name
         */
        public String getName() {
            return name;
        }

        /**
         * Sets name.
         *
         * @param name the name
         */
        public void setName(String name) {
            this.name = name;
        }

        /**
         * Gets warning.
         *
         * @return the warning
         */
        public String getWarning() {
            return warning;
        }

        /**
         * Sets warning.
         *
         * @param warning the warning
         */
        public void setWarning(String warning) {
            this.warning = warning;
        }
    }

    /**
     * Dump private key string.
     *
     * @param address the address
     * @return the string
     */
//dumpprivkey "address"
    public String dumpPrivateKey(String address) {
        JsonRpc20 json = new JsonRpc20.Builder().setMethod("dumpprivkey").appendParams(address).getJson();
        return this.post(json, StringValue.class);
    }

    /**
     * Dump wallet string.
     *
     * @param filename the filename
     * @return the string
     */
// dumpwallet "filename"
    public String dumpWallet(String filename) {
        JsonRpc20 json = new JsonRpc20.Builder().setMethod("dumpwallet").appendParams(filename).getJson();
        return (String) this.post(json, MapValue.class).get("filename");
    }

    /**
     * Encrypt wallet.
     *
     * @param passphrase the passphrase
     */
// encryptwallet "passphrase"
    public void encryptWallet(String passphrase) {
        JsonRpc20 json = new JsonRpc20.Builder().setMethod("encryptwallet").appendParams(passphrase).getJson();
        this.post(json, StringValue.class);
    }

    /**
     * Gets account.
     *
     * @param address the address
     * @return the account
     */
//getaccount "address"
    @Deprecated
    public String getAccount(String address) {
        JsonRpc20 json = new JsonRpc20.Builder().setMethod("getaccount").appendParams(address).getJson();
        return this.post(json, StringValue.class);
    }

    /**
     * Gets account address.
     *
     * @param account the account
     * @return the account address
     */
//getaccountaddress "account"
    @Deprecated
    public String getAccountAddress(String account) {
        JsonRpc20 json = new JsonRpc20.Builder().setMethod("getaccountaddress").appendParams(account).getJson();
        return this.post(json, StringValue.class);
    }

    /**
     * Get addresses by account string [ ].
     *
     * @param account the account
     * @return the string [ ]
     */
//getaddressesbyaccount "account"
    @Deprecated
    public String[] getAddressesByAccount(String account) {
        JsonRpc20 json = new JsonRpc20.Builder().setMethod("getaddressesbyaccount").appendParams(account).getJson();
        return this.post(json, ArrayValue.StringArray.class);
    }

    /**
     * Get addresses by label string [ ].
     *
     * @param label the label
     * @return the string [ ]
     */
//getaddressesbylabel "label"
    public String[] getAddressesByLabel(String label) {
        JsonRpc20 json = new JsonRpc20.Builder().setMethod("getaddressesbylabel").appendParams(label).getJson();
        return this.post(json, ArrayValue.StringArray.class);
    }

    /**
     * Gets address info.
     *
     * @param address the address
     * @return the address info
     */
    @NoComplete //getaddressinfo "address"
    public AddressInfo getAddressInfo(String address) {
        JsonRpc20 json = new JsonRpc20.Builder().setMethod("getaddressinfo").appendParams(address).getJson();
        return this.post(json, AddressInfo.Result.class);
    }

    /**
     * Gets balance.
     *
     * @return the balance
     */
    public double getBalance() {
        return this.getBalance("*", 0, false);
    }

    /**
     * Gets balance.
     *
     * @param account          the account
     * @param minConfirmed     the min confirmed
     * @param includeWatchOnly the include watch only
     * @return the balance
     */
//getbalance ( "account" minconf include_watchonly )
    public double getBalance(String account, int minConfirmed, boolean includeWatchOnly) {
        JsonRpc20 json = new JsonRpc20.Builder().setMethod("getbalance").appendParams(account).getJson();
        return this.post(json, BigDecimalValue.class).doubleValue();
    }

    public double getBalances() {
        JsonRpc20 json = new JsonRpc20.Builder().setMethod("getbalances").getJson();
        return this.post(json, BigDecimalValue.class).doubleValue();
    }

    /**
     * Gets new address.
     *
     * @return the new address
     */
//getnewaddress ( "label" "address_type" ) | “legacy”, “p2sh-segwit”, and “bech32”.
    public String getNewAddress() {
        JsonRpc20 json = new JsonRpc20.Builder().setMethod("getnewaddress").getJson();
        return this.post(json, StringValue.class);
    }

    /**
     * Gets new address.
     *
     * @param label the label
     * @param type  the type
     * @return the new address
     */
    public String getNewAddress(String label, AccountType type) {
        JsonRpc20 json = new JsonRpc20.Builder().setMethod("getnewaddress").appendParams(label).appendParams(type.getType()).getJson();
        return this.post(json, StringValue.class);
    }

    /**
     * Gets raw change address.
     *
     * @param address_type the address type
     * @return the raw change address
     */
    public String getRawChangeAddress(AccountType address_type) {
        JsonRpc20.Builder json = new JsonRpc20.Builder().setMethod("getrawchangeaddress");
        if (address_type != null) {
            json.appendParams(address_type);
        }
        return this.post(json.getJson(), StringValue.class);
    }

    /**
     * Gets received by label.
     *
     * @param label   the label
     * @param minconf the minconf
     * @return the received by label
     */
// getreceivedbylabel "label" ( minconf )
    public double getReceivedByLabel(String label, int minconf) {
        JsonRpc20.Builder json = new JsonRpc20.Builder().setMethod("getreceivedbylabel").appendParams(label).appendParams(minconf);
        return this.post(json.getJson(), BigDecimalValue.class).doubleValue();
    }

    /**
     * Gets received by address.
     *
     * @param address the address
     * @param minconf the minconf
     * @return the received by address
     */
// getreceivedbyaddress "address" ( minconf )
    public double getReceivedByAddress(String address, int minconf) {
        JsonRpc20.Builder json = new JsonRpc20.Builder().setMethod("getreceivedbyaddress").appendParams(address).appendParams(minconf);
        return this.post(json.getJson(), BigDecimalValue.class).doubleValue();
    }

    /**
     * Gets transaction.
     *
     * @param txhash    the txhash
     * @param watchonly the watchonly
     * @return the transaction
     */
// gettransaction "txid" ( include_watchonly )
    public WalletTransaction getTransaction(String txhash, boolean watchonly) {
        JsonRpc20 json = new JsonRpc20.Builder().setMethod("gettransaction").appendParams(txhash).appendParams(watchonly).getJson();
        return this.post(json, WalletTransaction.Result.class);
    }

    /**
     * Gets unconfirmed balance.
     *
     * @return the unconfirmed balance
     */
// getunconfirmedbalance
    public BigDecimal getUnconfirmedBalance() {
        JsonRpc20 json = new JsonRpc20.Builder().setMethod("getunconfirmedbalance").getJson();
        return this.post(json, BigDecimalValue.class);
    }

    /**
     * Gets wallet info.
     *
     * @return the wallet info
     */
// getwalletinfo
    public WalletInfo getWalletInfo() {
        JsonRpc20 json = new JsonRpc20.Builder().setMethod("getwalletinfo").getJson();
        return this.post(json, WalletInfo.Result.class);
    }

    /**
     * Import address.
     *
     * @param address the address
     * @param label   the label
     */
    public void importAddress(String address, String label) {
        this.importAddress(address, label, true, false);
    }

    /**
     * Import address.
     *
     * @param address the address
     * @param label   the label
     * @param rescan  the rescan
     * @param p2sh    the p 2 sh
     */
    public void importAddress(String address, String label, boolean rescan, boolean p2sh) {
        JsonRpc20 json = new JsonRpc20.Builder().setMethod("importaddress").appendParams(address)
                .appendParams(label)
                .appendParams(rescan)
                .appendParams(p2sh).getJson();
        this.post(json, StringValue.class);
    }

    /**
     * Importmulti.
     *
     * @param requests the requests
     */
    @NoComplete
    public void importmulti(String requests) {
    }

    /**
     * Import private key.
     *
     * @param privkey the privkey
     * @param label   the label
     * @param rescan  the rescan
     */
// importprivkey "privkey" ( "label" ) ( rescan )
    public void importPrivateKey(String privkey, String label, boolean rescan) {
        JsonRpc20 json = new JsonRpc20.Builder().setMethod("importprivkey").appendParams(privkey)
                .appendParams(label)
                .appendParams(rescan).getJson();
        this.post(json, StringValue.class);
    }

    /**
     * Import pruned funds.
     *
     * @param rawtransaction the rawtransaction
     * @param txoutproof     the txoutproof
     */
// importprunedfunds
    public void importPrunedFunds(String rawtransaction, String txoutproof) {
        JsonRpc20 json = new JsonRpc20.Builder().setMethod("importprunedfunds")
                .appendParams(rawtransaction)
                .appendParams(txoutproof).getJson();
        this.post(json, StringValue.class);
    }

    /**
     * Import public key.
     *
     * @param pubkey the pubkey
     */
    public void importPublicKey(String pubkey) {
        this.importPublicKey(pubkey, "", false);
    }

    /**
     * Import public key.
     *
     * @param pubkey the pubkey
     * @param label  the label
     * @param rescan the rescan
     */
// importpubkey "pubkey" ( "label" rescan )
    public void importPublicKey(String pubkey, String label, boolean rescan) {
        JsonRpc20 json = new JsonRpc20.Builder().setMethod("importpubkey")
                .appendParams(pubkey).appendParams(label)
                .appendParams(rescan).getJson();
        this.post(json, StringValue.class);
    }

    /**
     * Import wallet.
     *
     * @param filename the filename
     */
// importwallet "filename"
    public void importWallet(String filename) {
        JsonRpc20 json = new JsonRpc20.Builder().setMethod("importwallet")
                .appendParams(filename).getJson();
        this.post(json, StringValue.class);
    }

    /**
     * Key pool refill.
     *
     * @param newsize the newsize
     */
// keypoolrefill ( newsize )
    public void keyPoolRefill(int newsize) {
        JsonRpc20 json = new JsonRpc20.Builder().setMethod("keypoolrefill")
                .appendParams(newsize).getJson();
        this.post(json, StringValue.class);
    }

    /**
     * List accounts map.
     *
     * @return the map
     */
// listaccounts ( minconf include_watchonly)
    public Map<String, Double> listAccounts() {
        JsonRpc20 json = new JsonRpc20.Builder().setMethod("listaccounts").getJson();
        return this.post(json, MapValue.class);
    }

    /**
     * List accounts name string [ ].
     *
     * @return the string [ ]
     */
    public String[] listAccountsName() {
        Set<String> keys = this.listAccounts().keySet();
        return keys.toArray(new String[keys.size()]);
    }

    /**
     * List address groupings object [ ] [ ] [ ].
     *
     * @return the object [ ] [ ] [ ]
     */
    public Object[][][] listAddressGroupings() {
        JsonRpc20 json = new JsonRpc20.Builder().setMethod("listaddressgroupings").getJson();
        return this.post(json, ArrayValue.ThreeArray.class);
    }

    /**
     * List address groupings balance map.
     *
     * @return the map
     */
    public Map<String, Balance> listAddressGroupingsBalance() {
        Object[][][] post = this.listAddressGroupings();
        Map<String, Balance> list = new HashMap<>();
        for (Object[][] o1 : post) {
            for (Object[] o2 : o1) {
                Balance ce = new Balance(null, null, "");
                if (o2.length > 1) {
                    ce.setAddress((String) o2[0]);
                    ce.setBalance(new BigDecimal(o2[1].toString())); // 必须用string 否则会有精度问题
                } else {
                    throw new RuntimeException("listAddressGroupings format error ! must: [[[address,balance,???]]]");
                }
                if (o2.length > 2) {
                    ce.setAccount((String) o2[2]);
                }
                list.put(ce.getAddress(), ce);
            }
        }
        return list;
    }

    /**
     * List labels string [ ].
     *
     * @return the string [ ]
     */
    public String[] listLabels() {
        return this.listLabels(null);
    }

    /**
     * List labels string [ ].
     *
     * @param purpose the purpose
     * @return the string [ ]
     */
// listlabels ( "purpose" )
    public String[] listLabels(Purpose purpose) {
        JsonRpc20.Builder builder = new JsonRpc20.Builder().setMethod("listlabels");
        if (purpose != null) {
            builder.appendParams(purpose.name());
        }
        JsonRpc20 json = builder.getJson();
        return this.post(json, ArrayValue.StringArray.class);
    }

    /**
     * The enum Purpose.
     */
    public enum Purpose {
        /**
         * The Receive.
         */
        receive,
        /**
         * The Send.
         */
        send;
    }


    /**
     * List lock unspent out transaction [ ].
     *
     * @return the out transaction [ ]
     */
    public OutTransaction[] listLockUnspent() {
        JsonRpc20 json = new JsonRpc20.Builder().setMethod("listlockunspent").getJson();
        return this.post(json, OutTransaction.Result.class);
    }

    /**
     * Listreceivedbylabel.
     *
     * @param minconf           the minconf
     * @param include_empty     the include empty
     * @param include_watchonly the include watchonly
     */
    @NoComplete //listreceivedbylabel ( minconf include_empty include_watchonly)
    public void listreceivedbylabel(int minconf, boolean include_empty, boolean include_watchonly) {
    }

    /**
     * List received by address received address [ ].
     *
     * @param minconf           the minconf
     * @param include_empty     the include empty
     * @param include_watchonly the include watchonly
     * @return the received address [ ]
     */
//listreceivedbyaddress ( minconf include_empty include_watchonly address_filter )
    public ReceivedAddress[] listReceivedByAddress(int minconf, boolean include_empty, boolean include_watchonly) {
        JsonRpc20 json = new JsonRpc20.Builder().setMethod("listreceivedbyaddress")
                .appendParams(minconf).appendParams(include_empty).appendParams(include_empty).getJson();
        return this.post(json, ReceivedAddress.Array.class);
    }

    /**
     * List since block since block transaction.
     *
     * @param blockhash            the blockhash
     * @param target_confirmations the target confirmations
     * @param include_watchonly    the include watchonly
     * @param include_removed      the include removed
     * @return the since block transaction
     */
// listsinceblock ( "blockhash" target_confirmations include_watchonly include_removed )
    public SinceBlockTransaction listSinceBlock(String blockhash, int target_confirmations, boolean include_watchonly, boolean include_removed) {
        JsonRpc20 json = new JsonRpc20.Builder().setMethod("listsinceblock").appendParams(blockhash)
                .appendParams(target_confirmations).appendParams(include_watchonly).appendParams(include_removed).getJson();
        return this.post(json, SinceBlockTransaction.Result.class);
    }

    /**
     * List transactions account transaction [ ].
     *
     * @return the account transaction [ ]
     */
    public AccountTransaction[] listTransactions() {
        return listTransactions("*");
    }

    /**
     * List transactions account transaction [ ].
     *
     * @param account the account
     * @return the account transaction [ ]
     */
    public AccountTransaction[] listTransactions(String account) {
        return listTransactions(account, 10, 0, false);
    }

    /**
     * List transactions account transaction [ ].
     *
     * @param account          the account
     * @param count            the count
     * @param skip             the skip
     * @param includeWatchOnly the include watch only
     * @return the account transaction [ ]
     */
//listtransactions ( "account" count skip include_watchonly)
    public AccountTransaction[] listTransactions(String account, int count, int skip, boolean includeWatchOnly) {
        JsonRpc20 json = new JsonRpc20.Builder().setMethod("listtransactions").appendParams(account)
                .appendParams(count)
                .appendParams(skip)
                .appendParams(includeWatchOnly).getJson();
        return this.post(json, AccountTransaction.Result.class);
    }

    /**
     * List unspent unspent transaction [ ].
     *
     * @param minConfirmed the min confirmed
     * @param addresses    the addresses
     * @return the unspent transaction [ ]
     */
    public UnspentTransaction[] listUnspent(int minConfirmed, String... addresses) {
        return listUnspent(minConfirmed, Integer.MAX_VALUE, addresses, true, null);
    }

    /**
     * List unspent unspent transaction [ ].
     *
     * @param minConfirmed  the min confirmed
     * @param maxCConfirmed the max c confirmed
     * @param addresses     the addresses
     * @param includeUnsafe the include unsafe
     * @param opt           the opt
     * @return the unspent transaction [ ]
     */
//listunspent ( minconf maxconf  ["addresses",...] [include_unsafe] [query_options])
    public UnspentTransaction[] listUnspent(int minConfirmed, int maxCConfirmed, String[] addresses, boolean includeUnsafe, QueryOptions opt) {
        JsonRpc20.Builder params = new JsonRpc20.Builder().setMethod("listunspent").appendParams(minConfirmed)
                .appendParams(maxCConfirmed)
                .appendParams(addresses)
                .appendParams(includeUnsafe);
        if (opt != null) {
            params.appendParams(opt.toJson());
        }
        JsonRpc20 json = params.getJson();
        return this.post(json, UnspentTransaction.Result.class);
    }

    /**
     * Listwallets.
     */
    @NoComplete
    public void listwallets() {
    }

    /**
     * Loadwallet.
     *
     * @param filename the filename
     */
    @NoComplete //loadwallet "filename"
    public void loadwallet(String filename) {
    }

    /**
     * Lock unspent boolean.
     *
     * @param unlock       the unlock
     * @param transactions the transactions
     * @return the boolean
     */
// lockunspent unlock ([{"txid":"txid","vout":n},...])
    public boolean lockUnspent(boolean unlock, OutTransaction... transactions) {
        JsonRpc20 json = new JsonRpc20.Builder().setMethod("lockunspent").appendParams(unlock)
                .appendParams(Optional.of(transactions)).getJson();
        return this.post(json, BooleanValue.class).booleanValue();
    }

    /**
     * Move boolean.
     *
     * @param fromAccount the from account
     * @param toAccount   the to account
     * @param amount      the amount
     * @param minconf     the minconf
     * @param comment     the comment
     * @return the boolean
     */
// move "fromaccount" "toaccount" amount ( minconf "comment" )
    public boolean move(String fromAccount, String toAccount, double amount, OptionalInt minconf, Optional<String> comment) {
        JsonRpc20 json = new JsonRpc20.Builder().setMethod("move").appendParams(fromAccount).appendParams(toAccount)
                .appendParams(amount).appendParams(minconf.orElse(1)).appendParams(comment).getJson();
        return this.post(json, BooleanValue.class).booleanValue();
    }

    /**
     * Remove pruned funds.
     *
     * @param txid the txid
     */
    @NoComplete("查看返回值") // removeprunedfunds "txid"
    public void removePrunedFunds(String txid) {
        JsonRpc20 json = new JsonRpc20.Builder().setMethod("removeprunedfunds").appendParams(txid).getJson();
        this.post(json, StringValue.class);
    }

    /**
     * Rescanblockchain rescan height.
     *
     * @param startHeight the start height
     * @param stopHeight  the stop height
     * @return the rescan height
     */
// rescanblockchain ("start_height") ("stop_height")
    public RescanHeight rescanblockchain(OptionalInt startHeight, Optional<Integer> stopHeight) {
        JsonRpc20 json = new JsonRpc20.Builder().setMethod("rescanblockchain")
                .appendParams(startHeight.orElse(0))
                .appendParams(stopHeight)
                .getJson();
        return this.post(json, RescanHeight.Result.class);
    }


    /**
     * Send from string.
     *
     * @param fromAccount the from account
     * @param toAddress   the to address
     * @param amount      the amount
     * @return the string
     */
    public String sendFrom(String fromAccount, String toAddress, double amount) {
        return sendFrom(fromAccount, toAddress, amount, 1, null, null);
    }

    /**
     * Send from string.
     *
     * @param fromAccount  the from account
     * @param toAddress    the to address
     * @param amount       the amount
     * @param minConfirmed the min confirmed
     * @param comment      the comment
     * @param commentTo    the comment to
     * @return the string
     */
// sendfrom "fromaccount" "toaddress" amount ( minconf "comment" "comment_to" )
    public String sendFrom(String fromAccount, String toAddress, double amount, int minConfirmed, String comment, String commentTo) {
        JsonRpc20 json = new JsonRpc20.Builder().setMethod("sendfrom")
                .appendParams(fromAccount).appendParams(toAddress).appendParams(amount)
                .appendParams(minConfirmed).appendParams(comment).appendParams(commentTo).getJson();
        return this.post(json, StringValue.class);
    }

    /**
     * Send many string.
     *
     * @param receivedAccount the received account
     * @param tx              the tx
     * @param minConfirmed    the min confirmed
     * @param comment         the comment
     * @param commentTo       the comment to
     * @param subtractFeeFrom the subtract fee from
     * @param replaceable     the replaceable
     * @param conf_target     the conf target
     * @param mode            the mode
     * @return the string
     */
    @NoComplete("NO TEST")
    //sendmany "" "fromaccount" {"address":amount,...} ( minconf "comment" ["address",...] replaceable conf_target "estimate_mode")
    public String sendMany(
            String receivedAccount,
            TransactionOutput.Transaction[] tx,
            OptionalInt minConfirmed,
            Optional<String> comment,
            Optional<String> commentTo,
            Optional<Boolean> subtractFeeFrom,
            Optional<Boolean> replaceable,
            Optional<Integer> conf_target,
            Optional<BumpFee.EstimateMode> mode
    ) {
        JsonRpc20.Builder builder = new JsonRpc20.Builder().setMethod("sendmany")
                .appendParams(receivedAccount)
                .appendParams(tx)
                .appendParams(minConfirmed.orElse(1));
        JsonRpc20 json = trans(builder, comment, commentTo, subtractFeeFrom, replaceable, conf_target, mode).getJson();
        return this.post(json, StringValue.class);
    }

    /**
     * Trans json rpc 20 . builder.
     *
     * @param builder         the builder
     * @param comment         the comment
     * @param commentTo       the comment to
     * @param subtractFeeFrom the subtract fee from
     * @param replaceable     the replaceable
     * @param conf_target     the conf target
     * @param mode            the mode
     * @return the json rpc 20 . builder
     */
    private JsonRpc20.Builder trans(
            JsonRpc20.Builder builder,
            Optional<String> comment,
            Optional<String> commentTo,
            Optional<Boolean> subtractFeeFrom,
            Optional<Boolean> replaceable,
            Optional<Integer> conf_target,
            Optional<BumpFee.EstimateMode> mode
    ) {
        builder.appendParams(comment.orElse(null))
                .appendParams(commentTo.orElse(null))
                .appendParams(subtractFeeFrom.orElse(Boolean.FALSE))
                .appendParams(replaceable.orElse(null))
                .appendParams(conf_target.orElse(null))
                .appendParams(mode.orElse(BumpFee.EstimateMode.UNSET));
        return builder;
    }

    /**
     * Send to address string.
     *
     * @param address         the address
     * @param amount          the amount
     * @param comment         the comment
     * @param commentTo       the comment to
     * @param subtractFeeFrom the subtract fee from
     * @param replaceable     the replaceable
     * @param conf_target     the conf target
     * @param mode            the mode
     * @return the string
     */
    @NoComplete("NO TEST")
    //sendtoaddress "address" amount ( "comment" "comment_to" subtractfeefromamount replaceable conf_target "estimate_mode")
    public String sendToAddress(
            String address,
            double amount,
            Optional<String> comment,
            Optional<String> commentTo,
            Optional<Boolean> subtractFeeFrom,
            Optional<Boolean> replaceable,
            Optional<Integer> conf_target,
            Optional<BumpFee.EstimateMode> mode
    ) {
        JsonRpc20.Builder builder = new JsonRpc20.Builder().setMethod("sendtoaddress")
                .appendParams(address).appendParams(amount);
        JsonRpc20 json = trans(builder, comment, commentTo, subtractFeeFrom, replaceable, conf_target, mode).getJson();
        return this.post(json, StringValue.class);
    }

    /**
     * Sets .
     *
     * @param address the address
     * @param label   the label
     */
    @NoComplete //setlabel "address" "label"
    public void setlabel(String address, String label) {
    }

    /**
     * Sets h dseed.
     */
    @NoComplete //sethdseed ( "newkeypool" "seed" )
    public void setHDseed() {
    }

    /**
     * Sets tx fee.
     *
     * @param amount the amount
     * @return the tx fee
     */
    @NoComplete //settxfee amount
    public boolean setTxFee(double amount) {
        JsonRpc20 json = new JsonRpc20.Builder().setMethod("settxfee")
                .appendParams(amount).getJson();
        return this.post(json, BooleanValue.class).booleanValue();
    }

    /**
     * Sign message string.
     *
     * @param address the address
     * @param message the message
     * @return the string
     */
    @NoComplete //signmessage "address" "message"
    public String signMessage(String address, String message) {
        JsonRpc20 json = new JsonRpc20.Builder().setMethod("signmessage")
                .appendParams(address).appendParams(message).getJson();
        return this.post(json, StringValue.class);
    }

    /**
     * Signrawtransactionwithwallet.
     *
     * @param hexstring the hexstring
     */
    @NoComplete
    //signrawtransactionwithwallet "hexstring" ( [{"txid":"id","vout":n,"scriptPubKey":"hex","redeemScript":"hex"},...] sighashtype )
    public void signrawtransactionwithwallet(String hexstring) {
    }

    /**
     * Unloadwallet.
     *
     * @param wallet the wallet
     */
    @NoComplete //unloadwallet ( "wallet_name" )
    public void unloadwallet(String wallet) {
    }

    /**
     * Walletcreatefundedpsbt.
     *
     * @param destination the destination
     */
    @NoComplete
    //walletcreatefundedpsbt [{"txid":"id","vout":n},...] [{"address":amount},{"data":"hex"},...] ( locktime ) ( replaceable ) ( options bip32derivs )
    public void walletcreatefundedpsbt(String destination) {
    }

    /**
     * Wallet lock.
     */
    @NoComplete //walletlock
    public void walletLock() {
        JsonRpc20 json = new JsonRpc20.Builder().setMethod("walletlock").getJson();
        this.post(json, StringValue.class);
    }

    /**
     * Wallet passphrase.
     *
     * @param passphrase     the passphrase
     * @param timeoutSeconds the timeout seconds
     */
    @NoComplete //walletpassphrase "passphrase" timeout
    public void walletPassphrase(String passphrase, int timeoutSeconds) {
        JsonRpc20 json = new JsonRpc20.Builder().setMethod("walletpassphrase")
                .appendParams(passphrase).appendParams(timeoutSeconds).getJson();
        this.post(json, StringValue.class);
    }

    /**
     * Wallet passphrase change.
     *
     * @param oldPass the old pass
     * @param newPass the new pass
     */
    @NoComplete //walletpassphrasechange "oldpassphrase" "newpassphrase"
    public void walletPassphraseChange(String oldPass, String newPass) {
        JsonRpc20 json = new JsonRpc20.Builder().setMethod("walletpassphrasechange")
                .appendParams(oldPass).appendParams(newPass).getJson();
        this.post(json, StringValue.class);
    }

    /**
     * Walletprocesspsbt.
     *
     * @param psbt the psbt
     */
    @NoComplete //walletprocesspsbt "psbt" ( sign "sighashtype" bip32derivs )
    public void walletprocesspsbt(String psbt) {
    }

}
