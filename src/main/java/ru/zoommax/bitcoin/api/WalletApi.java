package ru.zoommax.bitcoin.api;

import ru.zoommax.bitcoin.JsonRpc20;
import ru.zoommax.bitcoin.JsonRpcClient;
import ru.zoommax.bitcoin.JsonRpcResult;
import ru.zoommax.bitcoin.annotation.NoComplete;
import ru.zoommax.bitcoin.model.*;

import java.math.BigDecimal;
import java.util.*;

public class WalletApi extends JsonRpcClient {

    public WalletApi(String username, String password, String url) {
        super(username, password, url);
    }

    // anandontransaction 调用可以将一个钱包交易及其后代标记为放弃，这样 该交易中的输入UTXO就可以重新利用。
    // abandontransaction "txid"
    public void abandonTransaction(String txid) {
        JsonRpc20 json = new JsonRpc20.Builder().setMethod("abandontransaction").appendParams(txid).getJson();
        this.post(json, StringValue.class);
    }

    // Stops current wallet rescan triggered by an RPC call, e.g. by an importprivkey call.
    public void abortRescan() {
        JsonRpc20 json = new JsonRpc20.Builder().setMethod("abortrescan").getJson();
        this.post(json, StringValue.class);
    }

    /**
     * @param number      (numeric, required) The number of required signatures out of the n keys or addresses.
     * @param address     (string) bitcoin address or hex-encoded public key
     * @param lable       (string, optional) A label to assign the addresses to.
     * @param addressType (string, optional) The address type to use. Options are "legacy", "p2sh-segwit", and "bech32". Default is set by -addresstype.
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
     * backupwallet "destination"
     * <p>
     * Safely copies current wallet file to destination, which can be a directory or a path with filename.
     *
     * @param destination (string) The destination directory or file
     */
    public void backupWallet(String destination) {
        JsonRpc20 json = new JsonRpc20.Builder().setMethod("backupwallet").appendParams(destination).getJson();
        this.post(json, StringValue.class);
    }

    /**
     * Bumps the fee of an opt-in-RBF transaction T, replacing it with a new transaction B.
     * An opt-in RBF transaction with the given txid must be in the wallet.
     * The command will pay the additional fee by decreasing (or perhaps removing) its change output.
     * If the change output is not big enough to cover the increased fee, the command will currently fail
     * instead of adding new inputs to compensate. (A future implementation could improve this.)
     * The command will fail if the wallet or mempool contains a transaction that spends one of T's outputs.
     * By default, the new fee will be calculated automatically using estimatesmartfee.
     * The user can specify a confirmation target for estimatesmartfee.
     * Alternatively, the user can specify totalFee, or use RPC settxfee to set a higher fee rate.
     * At a minimum, the new fee rate must be high enough to pay an additional new relay fee (incrementalfee
     * returned by getnetworkinfo) to enter the node's mempool.
     *
     * @param txid    (string, required) The txid to be bumped
     * @param options
     * @return (object, optional), nullable
     */
    public BumpFee.BumpTransactionFee bumpFee(String txid, BumpFee.Options options) {
        JsonRpc20.Builder builder = new JsonRpc20.Builder().setMethod("bumpfee").appendParams(txid);
        if (options != null) {
            builder.appendParams(options);
        }
        return this.post(builder.getJson(), BumpFee.Result.class);
    }

    // createwallet "wallet_name" ( disable_private_keys )
    public WalletName createWallet(String name, boolean disable_private_keys) {
        JsonRpc20.Builder builder = new JsonRpc20.Builder().setMethod("createwallet").appendParams(name);
        builder.appendParams(disable_private_keys);
        return this.post(builder.getJson(), WalletName.Result.class);
    }

    public static class WalletName {
        public static class Result extends JsonRpcResult<WalletName> {
        }

        private String name;
        private String warning;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getWarning() {
            return warning;
        }

        public void setWarning(String warning) {
            this.warning = warning;
        }
    }

    //dumpprivkey "address"
    public String dumpPrivateKey(String address) {
        JsonRpc20 json = new JsonRpc20.Builder().setMethod("dumpprivkey").appendParams(address).getJson();
        return this.post(json, StringValue.class);
    }

    /**
     * Dumps all wallet keys in a human-readable format to a server-side file. This does not allow overwriting existing files.
     * Imported scripts are included in the dumpfile, but corresponding BIP173 addresses, etc. may not be added automatically by importwallet.
     * Note that if your wallet contains keys which are not derived from your HD seed (e.g. imported keys), these are not covered by
     * only backing up the seed itself, and must be backed up too (e.g. ensure you back up the whole dumpfile).
     *
     * @param filename
     */
    // dumpwallet "filename"
    public String dumpWallet(String filename) {
        JsonRpc20 json = new JsonRpc20.Builder().setMethod("dumpwallet").appendParams(filename).getJson();
        return (String) this.post(json, MapValue.class).get("filename");
    }

    // encryptwallet "passphrase"
    public void encryptWallet(String passphrase) {
        JsonRpc20 json = new JsonRpc20.Builder().setMethod("encryptwallet").appendParams(passphrase).getJson();
        this.post(json, StringValue.class);
    }

    //getaccount "address"
    public String getAccount(String address) {
        JsonRpc20 json = new JsonRpc20.Builder().setMethod("getaccount").appendParams(address).getJson();
        return this.post(json, StringValue.class);
    }

    //getaccountaddress "account"
    public String getAccountAddress(String account) {
        JsonRpc20 json = new JsonRpc20.Builder().setMethod("getaccountaddress").appendParams(account).getJson();
        return this.post(json, StringValue.class);
    }

    //getaddressesbyaccount "account"
    public String[] getAddressesByAccount(String account) {
        JsonRpc20 json = new JsonRpc20.Builder().setMethod("getaddressesbyaccount").appendParams(account).getJson();
        return this.post(json, ArrayValue.StringArray.class);
    }

    //getaddressesbylabel "label"
    public String[] getAddressesByLabel(String label) {
        JsonRpc20 json = new JsonRpc20.Builder().setMethod("getaddressesbylabel").appendParams(label).getJson();
        return this.post(json, ArrayValue.StringArray.class);
    }

    @NoComplete //getaddressinfo "address"
    public AddressInfo getAddressInfo(String address) {
        JsonRpc20 json = new JsonRpc20.Builder().setMethod("getaddressinfo").appendParams(address).getJson();
        return this.post(json, AddressInfo.Result.class);
    }

    public double getBalance() {
        return this.getBalance("*", 0, false);
    }

    /**
     * @param account          Optional, Remains for backward compatibility. Must be excluded or set to “*”.
     * @param minConfirmed     Default=0, Only include transactions confirmed at least this many times.
     * @param includeWatchOnly Default=false, Also include balance in watch-only addresses (see ‘importaddress’)
     * @return
     */
    //getbalance ( "account" minconf include_watchonly )
    public double getBalance(String account, int minConfirmed, boolean includeWatchOnly) {
        JsonRpc20 json = new JsonRpc20.Builder().setMethod("getbalance").appendParams(account).getJson();
        return this.post(json, BigDecimalValue.class).doubleValue();
    }

    //getnewaddress ( "label" "address_type" ) | “legacy”, “p2sh-segwit”, and “bech32”.
    public String getNewAddress() {
        JsonRpc20 json = new JsonRpc20.Builder().setMethod("getnewaddress").getJson();
        return this.post(json, StringValue.class);
    }

    public String getNewAddress(String label, AccountType type) {
        JsonRpc20 json = new JsonRpc20.Builder().setMethod("getnewaddress").appendParams(label).appendParams(type.getType()).getJson();
        return this.post(json, StringValue.class);
    }

    /**
     * Returns a new Bitcoin address, for receiving change.
     * This is for use with raw transactions, NOT normal use.
     *
     * @param address_type (string, optional) nullable The address type to use. Options are "legacy", "p2sh-segwit", and "bech32". Default is set by -changetype
     * @return
     */
    public String getRawChangeAddress(AccountType address_type) {
        JsonRpc20.Builder json = new JsonRpc20.Builder().setMethod("getrawchangeaddress");
        if (address_type != null) {
            json.appendParams(address_type);
        }
        return this.post(json.getJson(), StringValue.class);
    }

    // getreceivedbylabel "label" ( minconf )
    public double getReceivedByLabel(String label, int minconf) {
        JsonRpc20.Builder json = new JsonRpc20.Builder().setMethod("getreceivedbylabel").appendParams(label).appendParams(minconf);
        return this.post(json.getJson(), BigDecimalValue.class).doubleValue();
    }

    // getreceivedbyaddress "address" ( minconf )
    public double getReceivedByAddress(String address, int minconf) {
        JsonRpc20.Builder json = new JsonRpc20.Builder().setMethod("getreceivedbyaddress").appendParams(address).appendParams(minconf);
        return this.post(json.getJson(), BigDecimalValue.class).doubleValue();
    }

    // gettransaction "txid" ( include_watchonly )
    public WalletTransaction getTransaction(String txhash, boolean watchonly) {
        JsonRpc20 json = new JsonRpc20.Builder().setMethod("gettransaction").appendParams(txhash).appendParams(watchonly).getJson();
        return this.post(json, WalletTransaction.Result.class);
    }

    // getunconfirmedbalance
    public BigDecimal getUnconfirmedBalance() {
        JsonRpc20 json = new JsonRpc20.Builder().setMethod("getunconfirmedbalance").getJson();
        return this.post(json, BigDecimalValue.class);
    }

    // getwalletinfo
    public WalletInfo getWalletInfo() {
        JsonRpc20 json = new JsonRpc20.Builder().setMethod("getwalletinfo").getJson();
        return this.post(json, WalletInfo.Result.class);
    }

    public void importAddress(String address, String label) {
        this.importAddress(address, label, true, false);
    }

    /**
     * Error ::{"result":null,"error":{"code":-5,"message":"Invalid Bitcoin address or script"},"id":1},
     * NOTE :: no private key ! not transaction
     *
     * @param address
     * @param label   Default=""
     * @param rescan  Rescan the wallet for transactions
     * @param p2sh    Default=false, Add the P2SH version of the script as well
     * @return
     */
    public void importAddress(String address, String label, boolean rescan, boolean p2sh) {
        JsonRpc20 json = new JsonRpc20.Builder().setMethod("importaddress").appendParams(address)
                .appendParams(label)
                .appendParams(rescan)
                .appendParams(p2sh).getJson();
        this.post(json, StringValue.class);
    }

    /**
     * <pre>
     * 1. requests     (array, required) Data to be imported
     *   [     (array of json objects)
     *     {
     *       "scriptPubKey": "&lt;script&gt;" | { "address":"&lt;address&gt;" }, (string / json, required) Type of scriptPubKey (string for script, json for address)
     *       "timestamp": timestamp | "now"                        , (integer / string, required) Creation time of the key in seconds since epoch (Jan 1 1970 GMT),
     *                                                               or the string "now" to substitute the current synced blockchain time. The timestamp of the oldest
     *                                                               key will determine how far back blockchain rescans need to begin for missing wallet transactions.
     *                                                               "now" can be specified to bypass scanning, for keys which are known to never have been used, and
     *                                                               0 can be specified to scan the entire blockchain. Blocks up to 2 hours before the earliest key
     *                                                               creation time of all keys being imported by the importmulti call will be scanned.
     *       "redeemscript": "&lt;script&gt;"                            , (string, optional) Allowed only if the scriptPubKey is a P2SH address or a P2SH scriptPubKey
     *       "pubkeys": ["&lt;pubKey&gt;", ... ]                         , (array, optional) Array of strings giving pubkeys that must occur in the output or redeemscript
     *       "keys": ["&lt;key&gt;", ... ]                               , (array, optional) Array of strings giving private keys whose corresponding public keys must occur in the output or redeemscript
     *       "internal": &lt;true&gt;                                    , (boolean, optional, default: false) Stating whether matching outputs should be treated as not incoming payments
     *       "watchonly": &lt;true&gt;                                   , (boolean, optional, default: false) Stating whether matching outputs should be considered watched even when they're not spendable, only allowed if keys are empty
     *       "label": &lt;label&gt;                                      , (string, optional, default: '') Label to assign to the address (aka account name, for now), only allowed with internal=false
     *     }
     *   ,...
     *   ]
     * 2. options                 (json, optional)
     *   {
     *      "rescan": &lt;false&gt;,         (boolean, optional, default: true) Stating if should rescan the blockchain after all imports
     *   }
     * </pre>
     *
     * @param requests
     */
    @NoComplete
    public void importmulti(String requests) {
    }

    /**
     * 1. "privkey"          (string, required) The private key (see dumpprivkey)
     * 2. "label"            (string, optional, default="") An optional label
     * 3. rescan               (boolean, optional, default=true) Rescan the wallet for transactions
     *
     * @param privkey
     * @return
     */
    // importprivkey "privkey" ( "label" ) ( rescan )
    public void importPrivateKey(String privkey, String label, boolean rescan) {
        JsonRpc20 json = new JsonRpc20.Builder().setMethod("importprivkey").appendParams(privkey)
                .appendParams(label)
                .appendParams(rescan).getJson();
        this.post(json, StringValue.class);
    }

    // importprunedfunds
    public void importPrunedFunds(String rawtransaction, String txoutproof) {
        JsonRpc20 json = new JsonRpc20.Builder().setMethod("importprunedfunds")
                .appendParams(rawtransaction)
                .appendParams(txoutproof).getJson();
        this.post(json, StringValue.class);
    }

    public void importPublicKey(String pubkey) {
        this.importPublicKey(pubkey, "", false);
    }

    // importpubkey "pubkey" ( "label" rescan )
    public void importPublicKey(String pubkey, String label, boolean rescan) {
        JsonRpc20 json = new JsonRpc20.Builder().setMethod("importpubkey")
                .appendParams(pubkey).appendParams(label)
                .appendParams(rescan).getJson();
        this.post(json, StringValue.class);
    }

    // importwallet "filename"
    public void importWallet(String filename) {
        JsonRpc20 json = new JsonRpc20.Builder().setMethod("importwallet")
                .appendParams(filename).getJson();
        this.post(json, StringValue.class);
    }

    // keypoolrefill ( newsize )
    public void keyPoolRefill(int newsize) {
        JsonRpc20 json = new JsonRpc20.Builder().setMethod("keypoolrefill")
                .appendParams(newsize).getJson();
        this.post(json, StringValue.class);
    }

    // listaccounts ( minconf include_watchonly)
    public Map<String, Double> listAccounts() {
        JsonRpc20 json = new JsonRpc20.Builder().setMethod("listaccounts").getJson();
        return this.post(json, MapValue.class);
    }

    public String[] listAccountsName() {
        Set<String> keys = this.listAccounts().keySet();
        return keys.toArray(new String[keys.size()]);
    }

    /**
     * using {@link #listAddressGroupingsBalance() } to replace
     *
     * @return
     */
    public Object[][][] listAddressGroupings() {
        JsonRpc20 json = new JsonRpc20.Builder().setMethod("listaddressgroupings").getJson();
        return this.post(json, ArrayValue.ThreeArray.class);
    }

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

    public String[] listLabels() {
        return this.listLabels(null);
    }

    /**
     * receive / send
     *
     * @param purpose (string, optional) [receive | send] Address purpose to list labels for ('send','receive'). An empty string is the same as not providing this argument.
     * @return Label name
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

    public enum Purpose {
        receive, send;
    }


    /**
     * Returns list of temporarily unspendable outputs.
     * See the lockunspent call to lock and unlock transactions for spending.
     *
     * @return List the locked transactions
     */
    public OutTransaction[] listLockUnspent() {
        JsonRpc20 json = new JsonRpc20.Builder().setMethod("listlockunspent").getJson();
        return this.post(json, OutTransaction.Result.class);
    }

    @NoComplete //listreceivedbylabel ( minconf include_empty include_watchonly)
    public void listreceivedbylabel(int minconf, boolean include_empty, boolean include_watchonly) {
    }

    /**
     * 1. minconf           (numeric, optional, default=1) The minimum number of confirmations before payments are included.
     * 2. include_empty     (bool, optional, default=false) Whether to include addresses that haven't received any payments.
     * 3. include_watchonly (bool, optional, default=false) Whether to include watch-only addresses (see 'importaddress').
     *
     * @return
     */
    //listreceivedbyaddress ( minconf include_empty include_watchonly address_filter )
    public ReceivedAddress[] listReceivedByAddress(int minconf, boolean include_empty, boolean include_watchonly) {
        JsonRpc20 json = new JsonRpc20.Builder().setMethod("listreceivedbyaddress")
                .appendParams(minconf).appendParams(include_empty).appendParams(include_empty).getJson();
        return this.post(json, ReceivedAddress.Array.class);
    }

    /**
     * 1. "blockhash"            (string, optional) The block hash to list transactions since
     * 2. target_confirmations:    (numeric, optional, default=1) Return the nth block hash from the main chain. e.g. 1 would mean the best block hash. Note: this is not used as a filter, but only affects [lastblock] in the return value
     * 3. include_watchonly:       (bool, optional, default=false) Include transactions to watch-only addresses (see 'importaddress')
     * 4. include_removed:         (bool, optional, default=true) Show transactions that were removed due to a reorg in the "removed" array
     * (not guaranteed to work on pruned nodes)
     *
     * @return
     */
    // listsinceblock ( "blockhash" target_confirmations include_watchonly include_removed )
    public SinceBlockTransaction listSinceBlock(String blockhash, int target_confirmations, boolean include_watchonly, boolean include_removed) {
        JsonRpc20 json = new JsonRpc20.Builder().setMethod("listsinceblock").appendParams(blockhash)
                .appendParams(target_confirmations).appendParams(include_watchonly).appendParams(include_removed).getJson();
        return this.post(json, SinceBlockTransaction.Result.class);
    }

    public AccountTransaction[] listTransactions() {
        return listTransactions("*");
    }

    public AccountTransaction[] listTransactions(String account) {
        return listTransactions(account, 10, 0, false);
    }

    /**
     * @param account          Default=* , specified account label, or “*”
     * @param count            Default=10, The number of transactions to return
     * @param skip             Default=0, The number of transactions to skip (for page)
     * @param includeWatchOnly Default=false (see ‘importaddress’)
     * @return
     */
    //listtransactions ( "account" count skip include_watchonly)
    public AccountTransaction[] listTransactions(String account, int count, int skip, boolean includeWatchOnly) {
        JsonRpc20 json = new JsonRpc20.Builder().setMethod("listtransactions").appendParams(account)
                .appendParams(count)
                .appendParams(skip)
                .appendParams(includeWatchOnly).getJson();
        return this.post(json, AccountTransaction.Result.class);
    }

    public UnspentTransaction[] listUnspent(int minConfirmed, String... addresses) {
        return listUnspent(minConfirmed, Integer.MAX_VALUE, addresses, true, null);
    }

    /**
     * @param minConfirmed  Default=1, The minimum confirmations to filter
     * @param maxCConfirmed Default=9999999, The maximum confirmations to filter
     * @param addresses     Default=empty array, A json array of bitcoin addresses to filter
     * @param includeUnsafe Default=true Include outputs that are not safe to spend See description of “safe” attribute below.
     * @param opt           Optional, JSON with query options
     * @return
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

    @NoComplete
    public void listwallets() {
    }

    @NoComplete //loadwallet "filename"
    public void loadwallet(String filename) {
    }

    /**
     * @param unlock       ( boolean, required) Whether to unlock (true) or lock (false) the specified transactions
     * @param transactions (option)
     * @return true|false    (boolean) Whether the command was successful or not
     */
    // lockunspent unlock ([{"txid":"txid","vout":n},...])
    public boolean lockUnspent(boolean unlock, OutTransaction... transactions) {
        JsonRpc20 json = new JsonRpc20.Builder().setMethod("lockunspent").appendParams(unlock)
                .appendParams(Optional.of(transactions)).getJson();
        return this.post(json, BooleanValue.class).booleanValue();
    }

    /**
     * Move a specified amount from one account in your wallet to another.
     * Arguments:
     *
     * @param fromAccount "fromaccount"   (string, required) The name of the account to move funds from. May be the default account using "".
     * @param toAccount   "toaccount"     (string, required) The name of the account to move funds to. May be the default account using "".
     * @param amount      (numeric) Quantity of BTC to move between accounts.
     * @param minconf     (numeric, optional) Ignored. Remains for backward compatibility.
     * @param comment     (string, optional) An optional comment, stored in the wallet only.
     * @return
     */
    // move "fromaccount" "toaccount" amount ( minconf "comment" )
    public boolean move(String fromAccount, String toAccount, double amount, OptionalInt minconf, Optional<String> comment) {
        JsonRpc20 json = new JsonRpc20.Builder().setMethod("move").appendParams(fromAccount).appendParams(toAccount)
                .appendParams(amount).appendParams(minconf.orElse(1)).appendParams(comment).getJson();
        return this.post(json, BooleanValue.class).booleanValue();
    }

    /**
     * Deletes the specified transaction from the wallet. Meant for use with pruned wallets and as a companion to importprunedfunds.
     * This will affect wallet balances.
     *
     * @param txid (string, required) The hex-encoded id of the transaction you are deleting
     */
    @NoComplete("查看返回值") // removeprunedfunds "txid"
    public void removePrunedFunds(String txid) {
        JsonRpc20 json = new JsonRpc20.Builder().setMethod("removeprunedfunds").appendParams(txid).getJson();
        this.post(json, StringValue.class);
    }

    // rescanblockchain ("start_height") ("stop_height")
    public RescanHeight rescanblockchain(OptionalInt startHeight, Optional<Integer> stopHeight) {
        JsonRpc20 json = new JsonRpc20.Builder().setMethod("rescanblockchain")
                .appendParams(startHeight.orElse(0))
                .appendParams(stopHeight)
                .getJson();
        return this.post(json, RescanHeight.Result.class);
    }


    public String sendFrom(String fromAccount, String toAddress, double amount) {
        return sendFrom(fromAccount, toAddress, amount, 1, null, null);
    }

    /**
     * @param fromAccount
     * @param toAddress
     * @param amount
     * @param minConfirmed
     * @param comment
     * @param commentTo
     * @return
     */
    // sendfrom "fromaccount" "toaddress" amount ( minconf "comment" "comment_to" )
    public String sendFrom(String fromAccount, String toAddress, double amount, int minConfirmed, String comment, String commentTo) {
        JsonRpc20 json = new JsonRpc20.Builder().setMethod("sendfrom")
                .appendParams(fromAccount).appendParams(toAddress).appendParams(amount)
                .appendParams(minConfirmed).appendParams(comment).appendParams(commentTo).getJson();
        return this.post(json, StringValue.class);
    }

    /**
     * @param receivedAccount
     * @param tx
     * @param minConfirmed
     * @param comment
     * @param commentTo       (string, optional) A comment to store the name of the person or organization
     *                        to which you're sending the transaction. This is not part of the
     * @param subtractFeeFrom
     * @param replaceable
     * @param conf_target
     * @param mode
     * @return
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

    @NoComplete //setlabel "address" "label"
    public void setlabel(String address, String label) {
    }

    @NoComplete //sethdseed ( "newkeypool" "seed" )
    public void setHDseed() {
    }

    @NoComplete //settxfee amount
    public boolean setTxFee(double amount) {
        JsonRpc20 json = new JsonRpc20.Builder().setMethod("settxfee")
                .appendParams(amount).getJson();
        return this.post(json, BooleanValue.class).booleanValue();
    }

    @NoComplete //signmessage "address" "message"
    public String signMessage(String address, String message) {
        JsonRpc20 json = new JsonRpc20.Builder().setMethod("signmessage")
                .appendParams(address).appendParams(message).getJson();
        return this.post(json, StringValue.class);
    }

    @NoComplete
    //signrawtransactionwithwallet "hexstring" ( [{"txid":"id","vout":n,"scriptPubKey":"hex","redeemScript":"hex"},...] sighashtype )
    public void signrawtransactionwithwallet(String hexstring) {
    }

    @NoComplete //unloadwallet ( "wallet_name" )
    public void unloadwallet(String wallet) {
    }

    @NoComplete
    //walletcreatefundedpsbt [{"txid":"id","vout":n},...] [{"address":amount},{"data":"hex"},...] ( locktime ) ( replaceable ) ( options bip32derivs )
    public void walletcreatefundedpsbt(String destination) {
    }

    @NoComplete //walletlock
    public void walletLock() {
        JsonRpc20 json = new JsonRpc20.Builder().setMethod("walletlock").getJson();
        this.post(json, StringValue.class);
    }

    @NoComplete //walletpassphrase "passphrase" timeout
    public void walletPassphrase(String passphrase, int timeoutSeconds) {
        JsonRpc20 json = new JsonRpc20.Builder().setMethod("walletpassphrase")
                .appendParams(passphrase).appendParams(timeoutSeconds).getJson();
        this.post(json, StringValue.class);
    }

    @NoComplete //walletpassphrasechange "oldpassphrase" "newpassphrase"
    public void walletPassphraseChange(String oldPass, String newPass) {
        JsonRpc20 json = new JsonRpc20.Builder().setMethod("walletpassphrasechange")
                .appendParams(oldPass).appendParams(newPass).getJson();
        this.post(json, StringValue.class);
    }

    @NoComplete //walletprocesspsbt "psbt" ( sign "sighashtype" bip32derivs )
    public void walletprocesspsbt(String psbt) {
    }

}
