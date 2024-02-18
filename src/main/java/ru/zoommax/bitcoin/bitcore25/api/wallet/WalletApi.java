package ru.zoommax.bitcoin.bitcore25.api.wallet;

import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import ru.zoommax.bitcoin.JsonRpc20;
import ru.zoommax.bitcoin.JsonRpcClient;
import ru.zoommax.bitcoin.bitcore25.model.useany.ArrayValue;
import ru.zoommax.bitcoin.bitcore25.model.useany.BooleanValue;
import ru.zoommax.bitcoin.bitcore25.model.useany.DoubleValue;
import ru.zoommax.bitcoin.bitcore25.model.useany.MultiSig;
import ru.zoommax.bitcoin.bitcore25.model.useany.NullValue;
import ru.zoommax.bitcoin.bitcore25.model.useany.StringValue;
import ru.zoommax.bitcoin.bitcore25.model.wallet.AddressInfo;
import ru.zoommax.bitcoin.bitcore25.model.wallet.AddressPurpose;
import ru.zoommax.bitcoin.bitcore25.model.wallet.bumpfee.BumpFee;
import ru.zoommax.bitcoin.bitcore25.model.wallet.ImportFeedback;
import ru.zoommax.bitcoin.bitcore25.model.wallet.ListTransactions;
import ru.zoommax.bitcoin.bitcore25.model.wallet.LoadWallet;
import ru.zoommax.bitcoin.bitcore25.model.wallet.LockUnspentOut;
import ru.zoommax.bitcoin.bitcore25.model.wallet.MigrateWallet;
import ru.zoommax.bitcoin.bitcore25.model.wallet.ReceivedTransaction;
import ru.zoommax.bitcoin.bitcore25.model.wallet.UnspentTransaction;
import ru.zoommax.bitcoin.bitcore25.model.wallet.WalletCreate;
import ru.zoommax.bitcoin.bitcore25.model.wallet.WalletDestination;
import ru.zoommax.bitcoin.bitcore25.model.wallet.bumpfee.BumpFeeOptions;
import ru.zoommax.bitcoin.bitcore25.model.wallet.descriptors.ListDescriptors;
import ru.zoommax.bitcoin.bitcore25.model.wallet.getbalances.Balances;
import ru.zoommax.bitcoin.bitcore25.model.wallet.getbalances.Mine;
import ru.zoommax.bitcoin.bitcore25.model.wallet.gettransaction.WTransaction;
import ru.zoommax.bitcoin.bitcore25.model.wallet.getwalletinfo.WalletInfo;
import ru.zoommax.bitcoin.bitcore25.model.wallet.listwalletsdir.ListWalletsDir;

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
	public void abandonTransaction(String txid) {
		this.post(new JsonRpc20.Builder().setMethod("abandontransaction").appendParams(txid).getJson(), NullValue.class);
	}

	/**
	 * Abort rescan boolean.
	 *
	 * @return the boolean
	 */
	public boolean abortRescan() {
		return this.post(new JsonRpc20.Builder().setMethod("abortrescan").getJson(), BooleanValue.class);
	}

	/**
	 * Add multi sig address multi sig.
	 *
	 * @param nRequired the n required
	 * @param keys      the keys
	 * @return the multi sig
	 */
	public MultiSig addMultiSigAddress(long nRequired, String[] keys) {
		return this.post(new JsonRpc20.Builder().setMethod("addmultisigaddress").appendParams(nRequired).appendParams(keys).getJson(), MultiSig.Result.class);
	}

	/**
	 * Add multi sig address multi sig.
	 *
	 * @param nRequired   the n required
	 * @param keys        the keys
	 * @param label       the label
	 * @param addressType the address type
	 * @return the multi sig
	 */
	public MultiSig addMultiSigAddress(long nRequired, String[] keys, String label, String addressType) {
		return this.post(new JsonRpc20.Builder().setMethod("addmultisigaddress").appendParams(nRequired).appendParams(keys).appendParams(label).appendParams(addressType).getJson(), MultiSig.Result.class);
	}

	/**
	 * Backup wallet.
	 *
	 * @param destination the destination
	 */
	public void backupWallet(String destination) {
		this.post(new JsonRpc20.Builder().setMethod("backupwallet").appendParams(destination).getJson(), NullValue.class);
	}

	/**
	 * Bump fee bump fee.
	 *
	 * @param txid the txid
	 * @return the bump fee
	 */
	public BumpFee bumpFee(String txid) {
		return this.post(new JsonRpc20.Builder().setMethod("bumpfee").appendParams(txid).getJson(), BumpFee.Result.class);
	}

	/**
	 * Bump fee bump fee.
	 *
	 * @param txid    the txid
	 * @param options the options
	 * @return the bump fee
	 */
	public BumpFee bumpFee(String txid, BumpFeeOptions options) {
		ObjectMapper mapper = new ObjectMapper();
		String json = "";
		if (options != null){
            try {
                json = mapper.writeValueAsString(options);
				return this.post(new JsonRpc20.Builder().setMethod("bumpfee").appendParams(txid).appendParams(json).getJson(), BumpFee.Result.class);
            } catch (JsonProcessingException e) {
                throw new RuntimeException(e);
            }
        }
		return this.post(new JsonRpc20.Builder().setMethod("bumpfee").appendParams(txid).getJson(), BumpFee.Result.class);
	}

	/**
	 * Create wallet wallet create.
	 *
	 * @param walletName the wallet name
	 * @return the wallet create
	 */
	public WalletCreate createWallet(String walletName) {
		return this.post(new JsonRpc20.Builder().setMethod("createwallet").appendParams(walletName).getJson(), WalletCreate.Result.class);
	}

	/**
	 * Create wallet wallet create.
	 *
	 * @param walletName      the wallet name
	 * @param disablePrivKeys the disable priv keys
	 * @param isBlank         the is blank
	 * @param passphrase      the passphrase
	 * @return the wallet create
	 */
	public WalletCreate createWallet(String walletName, boolean disablePrivKeys, boolean isBlank, String passphrase) {
		return this.post(new JsonRpc20.Builder().setMethod("createwallet")
				.appendParams(walletName)
				.appendParams(disablePrivKeys)
				.appendParams(isBlank)
				.appendParams(passphrase)
				.getJson(), WalletCreate.Result.class);
	}

	/**
	 * Create wallet wallet create.
	 *
	 * @param walletName         the wallet name
	 * @param disablePrivKeys    the disable priv keys
	 * @param isBlank            the is blank
	 * @param passphrase         the passphrase
	 * @param avoidReuse         the avoid reuse
	 * @param createDescriptors  the create descriptors
	 * @param loadOnStart        the load on start
	 * @param useExternalSigners the use external signers
	 * @return the wallet create
	 */
	public WalletCreate createWallet(String walletName, boolean disablePrivKeys, boolean isBlank, String passphrase, boolean avoidReuse, boolean createDescriptors, boolean loadOnStart, boolean useExternalSigners) {
		return this.post(new JsonRpc20.Builder().setMethod("createwallet")
				.appendParams(walletName)
				.appendParams(disablePrivKeys)
				.appendParams(isBlank)
				.appendParams(passphrase)
				.appendParams(avoidReuse)
				.appendParams(createDescriptors)
				.appendParams(loadOnStart)
				.appendParams(useExternalSigners)
				.getJson(), WalletCreate.Result.class);
	}

	/**
	 * Dump priv key string.
	 *
	 * @param address the address
	 * @return the string
	 */
	public String dumpPrivKey(String address) {
		return this.post(new JsonRpc20.Builder().setMethod("dumpprivkey").appendParams(address).getJson(), StringValue.class);
	}

	/**
	 * Dump wallet wallet destination.
	 *
	 * @param filename the filename
	 * @return the wallet destination
	 */
	public WalletDestination dumpWallet(String filename) {
		return this.post(new JsonRpc20.Builder().setMethod("dumpwallet").appendParams(filename).getJson(), WalletDestination.Result.class);
	}

	/**
	 * Encrypt wallet string.
	 *
	 * @param passphrase the passphrase
	 * @return the string
	 */
	public String encryptWallet(String passphrase) {
		return this.post(new JsonRpc20.Builder().setMethod("encryptwallet").appendParams(passphrase).getJson(), StringValue.class);
	}

	/**
	 * Gets addresses by label.
	 *
	 * @param label the label
	 * @return the addresses by label
	 */
	public Map<String,AddressPurpose> getAddressesByLabel(String label) {
		return this.post(new JsonRpc20.Builder().setMethod("getaddressesbylabel").appendParams(label).getJson(), AddressPurpose.ResultMap.class);
	}

	/**
	 * Gets address info.
	 *
	 * @param address the address
	 * @return the address info
	 */
	public AddressInfo getAddressInfo(String address) {
		return this.post(new JsonRpc20.Builder().setMethod("getaddressinfo").appendParams(address).getJson(), AddressInfo.Result.class);
	}

	/**
	 * Gets balance.
	 *
	 * @return the balance
	 */
	public double getBalance() {
		return this.post(new JsonRpc20.Builder().setMethod("getbalance").getJson(), DoubleValue.class);
	}

	/**
	 * Gets balance.
	 *
	 * @param minConfirm       the min confirm
	 * @param includeWatchOnly the include watch only
	 * @param avoidReuse       the avoid reuse
	 * @return the balance
	 */
	public double getBalance(long minConfirm, boolean includeWatchOnly, boolean avoidReuse) {
		return this.post(new JsonRpc20.Builder().setMethod("getbalance").appendParams("*").appendParams(minConfirm).appendParams(includeWatchOnly).appendParams(avoidReuse).getJson(), DoubleValue.class);
	}

	/**
	 * Gets balances.
	 *
	 * @return the balances
	 */
	public Balances getBalances() {
		return this.post(new JsonRpc20.Builder().setMethod("getbalances").getJson(), Balances.Result.class);
	}

	/**
	 * Gets new address.
	 *
	 * @return the new address
	 */
	public String getNewAddress() {
		return this.post(new JsonRpc20.Builder().setMethod("getnewaddress").getJson(), StringValue.class);
	}

	/**
	 * Gets new address.
	 *
	 * @param label       the label
	 * @param addressType the address type
	 * @return the new address
	 */
	public String getNewAddress(String label, String addressType) {
		return this.post(new JsonRpc20.Builder().setMethod("getnewaddress").appendParams(label).appendParams(addressType).getJson(), StringValue.class);
	}

	/**
	 * Gets raw change address.
	 *
	 * @return the raw change address
	 */
	public String getRawChangeAddress() {
		return this.post(new JsonRpc20.Builder().setMethod("getrawchangeaddress").getJson(), StringValue.class);
	}

	/**
	 * Gets raw change address.
	 *
	 * @param addressType the address type
	 * @return the raw change address
	 */
	public String getRawChangeAddress(String addressType) {
		return this.post(new JsonRpc20.Builder().setMethod("getrawchangeaddress").appendParams(addressType).getJson(), StringValue.class);
	}

	/**
	 * Gets received by address.
	 *
	 * @param address the address
	 * @return the received by address
	 */
	public double getReceivedByAddress(String address) {
		return this.post(new JsonRpc20.Builder().setMethod("getreceivedbyaddress").appendParams(address).getJson(), DoubleValue.class);
	}

	/**
	 * Gets received by address.
	 *
	 * @param address                 the address
	 * @param minConfirm              the min confirm
	 * @param includeImmatureCoinbase the include immature coinbase
	 * @return the received by address
	 */
	public double getReceivedByAddress(String address, long minConfirm, boolean includeImmatureCoinbase) {
		return this.post(new JsonRpc20.Builder().setMethod("getreceivedbyaddress").appendParams(address).appendParams(minConfirm).appendParams(includeImmatureCoinbase).getJson(), DoubleValue.class);
	}

	/**
	 * Gets received by label.
	 *
	 * @param label the label
	 * @return the received by label
	 */
	public double getReceivedByLabel(String label) {
		return this.post(new JsonRpc20.Builder().setMethod("getreceivedbylabel").appendParams(label).getJson(), DoubleValue.class);
	}

	/**
	 * Gets received by label.
	 *
	 * @param label                   the label
	 * @param minConfirm              the min confirm
	 * @param includeImmatureCoinbase the include immature coinbase
	 * @return the received by label
	 */
	public double getReceivedByLabel(String label, long minConfirm, boolean includeImmatureCoinbase) {
		return this.post(new JsonRpc20.Builder().setMethod("getreceivedbylabel").appendParams(label).appendParams(minConfirm).appendParams(includeImmatureCoinbase).getJson(), DoubleValue.class);
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
	 * @deprecated see {@link #getBalances()}
	 * @return summ amount of unconfirmed transactions
	 */
	@Deprecated()
	public double getUnconfirmedBalance() {
		return this.post(new JsonRpc20.Builder().setMethod("getunconfirmedbalance").getJson(), DoubleValue.class);
	}

	/**
	 * Gets wallet info.
	 *
	 * @return the wallet info
	 */
	public WalletInfo getWalletInfo() {
		return this.post(new JsonRpc20.Builder().setMethod("getwalletinfo").getJson(), WalletInfo.Result.class);
	}

	/**
	 * Import address.
	 *
	 * @param address the address
	 */
	public void importAddress(String address) {
		this.post(new JsonRpc20.Builder().setMethod("importaddress").appendParams(address).getJson(), NullValue.class);
	}

	/**
	 * Import address.
	 *
	 * @param address the address
	 * @param label   the label
	 */
	public void importAddress(String address, String label) {
		this.post(new JsonRpc20.Builder().setMethod("importaddress").appendParams(address).appendParams(label).getJson(), NullValue.class);
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
		this.post(new JsonRpc20.Builder().setMethod("importaddress").appendParams(address).appendParams(label).appendParams(rescan).appendParams(p2sh).getJson(), NullValue.class);
	}

	/**
	 * Import descriptors import feedback [ ].
	 *
	 * @param requests the requests
	 * @return the import feedback [ ]
	 */
	public ImportFeedback[] importDescriptors(Object[] requests) { // TODO Create requests object
		return this.post(new JsonRpc20.Builder().setMethod("importdescriptors").appendParams(requests).getJson(), ImportFeedback.Result.class);
	}

	/**
	 * Import multi import feedback [ ].
	 *
	 * @param requests the requests
	 * @return the import feedback [ ]
	 */
	public ImportFeedback[] importMulti(Object[] requests) { // TODO Create requests object
		return this.post(new JsonRpc20.Builder().setMethod("importmulti").appendParams(requests).getJson(), ImportFeedback.Result.class);
	}

	/**
	 * Import multi import feedback [ ].
	 *
	 * @param requests the requests
	 * @param options  the options
	 * @return the import feedback [ ]
	 */
	public ImportFeedback[] importMulti(Object[] requests, Object options) { // TODO Create requests object, Options object
		return this.post(new JsonRpc20.Builder().setMethod("importmulti").appendParams(requests).getJson(), ImportFeedback.Result.class);
	}

	/**
	 * Import priv key.
	 *
	 * @param privkey the privkey
	 */
	public void importPrivKey(String privkey) {
		this.post(new JsonRpc20.Builder().setMethod("importprivkey").appendParams(privkey).getJson(), NullValue.class);
	}

	/**
	 * Import priv key.
	 *
	 * @param privkey the privkey
	 * @param label   the label
	 */
	public void importPrivKey(String privkey, String label) {
		this.post(new JsonRpc20.Builder().setMethod("importprivkey").appendParams(privkey).appendParams(label).getJson(), NullValue.class);
	}

	/**
	 * Import priv key.
	 *
	 * @param privkey the privkey
	 * @param label   the label
	 * @param rescan  the rescan
	 */
	public void importPrivKey(String privkey, String label, boolean rescan) {
		this.post(new JsonRpc20.Builder().setMethod("importprivkey").appendParams(privkey).appendParams(label).appendParams(rescan).getJson(), NullValue.class);
	}

	/**
	 * Import pub key.
	 *
	 * @param pubkey the pubkey
	 */
	public void importPubKey(String pubkey) {
		this.post(new JsonRpc20.Builder().setMethod("importpubkey").appendParams(pubkey).getJson(), NullValue.class);
	}

	/**
	 * Import pub key.
	 *
	 * @param pubkey the pubkey
	 * @param label  the label
	 */
	public void importPubKey(String pubkey, String label) {
		this.post(new JsonRpc20.Builder().setMethod("importpubkey").appendParams(pubkey).appendParams(label).getJson(), NullValue.class);
	}

	/**
	 * Import pub key.
	 *
	 * @param pubkey the pubkey
	 * @param label  the label
	 * @param rescan the rescan
	 */
	public void importPubKey(String pubkey, String label, boolean rescan) {
		this.post(new JsonRpc20.Builder().setMethod("importpubkey").appendParams(pubkey).appendParams(label).appendParams(rescan).getJson(), NullValue.class);
	}

	/**
	 * Import pruned funds.
	 *
	 * @param rawtransaction the rawtransaction
	 * @param txOutProof     the tx out proof
	 */
	public void importPrunedFunds(String rawtransaction, String txOutProof) {
		this.post(new JsonRpc20.Builder().setMethod("importprunedfunds").appendParams(rawtransaction).appendParams(txOutProof).getJson(), NullValue.class);
	}

	/**
	 * Import wallet.
	 *
	 * @param fileName the file name
	 */
	public void importWallet(String fileName) {
		this.post(new JsonRpc20.Builder().setMethod("importWallet").appendParams(fileName).getJson(), NullValue.class);
	}

	/**
	 * Key pool refill.
	 */
	public void keyPoolRefill() {
		this.post(new JsonRpc20.Builder().setMethod("keypoolrefill").getJson(), NullValue.class);
	}

	/**
	 * Key pool refill.
	 *
	 * @param newSize the new size
	 */
	public void keyPoolRefill(long newSize) {
		this.post(new JsonRpc20.Builder().setMethod("keypoolrefill").appendParams(newSize).getJson(), NullValue.class);
	}

	/**
	 * List address groupings object [ ] [ ] [ ].
	 *
	 * @return the object [ ] [ ] [ ]
	 */
	public Object[][][] listAddressGroupings() {
		return this.post(new JsonRpc20.Builder().setMethod("listaddressgroupings").getJson(), ArrayValue.ThreeArray.class);
	}

	/**
	 * List descriptors list descriptors.
	 *
	 * @return the list descriptors
	 */
	public ListDescriptors listDescriptors() {
		return this.post(new JsonRpc20.Builder().setMethod("listdescriptors").getJson(), ListDescriptors.Result.class);
	}

	/**
	 * List descriptors list descriptors.
	 *
	 * @param showPrivate the show private
	 * @return the list descriptors
	 */
	public ListDescriptors listDescriptors(boolean showPrivate) {
		return this.post(new JsonRpc20.Builder().setMethod("listdescriptors").appendParams(showPrivate).getJson(), ListDescriptors.Result.class);
	}

	/**
	 * List labels string [ ].
	 *
	 * @return the string [ ]
	 */
	public String[] listLabels() {
		return this.post(new JsonRpc20.Builder().setMethod("listlabels").getJson(), ArrayValue.StringArray.class);
	}

	/**
	 * List labels string [ ].
	 *
	 * @param purpose the purpose
	 * @return the string [ ]
	 */
	public String[] listLabels(String purpose) {
		return this.post(new JsonRpc20.Builder().setMethod("listlabels").appendParams(purpose).getJson(), ArrayValue.StringArray.class);
	}

	/**
	 * List lock unspent lock unspent out [ ].
	 *
	 * @return the lock unspent out [ ]
	 */
	public LockUnspentOut[] listLockUnspent() {
		return this.post(new JsonRpc20.Builder().setMethod("listlockunspent").getJson(), LockUnspentOut.Result.class);
	}

	/**
	 * List received by address received transaction [ ].
	 *
	 * @return the received transaction [ ]
	 */
	public ReceivedTransaction[] listReceivedByAddress() {
		return this.post(new JsonRpc20.Builder().setMethod("listreceivedbyaddress").getJson(), ReceivedTransaction.Result.class);
	}

	/**
	 * List received by address received transaction [ ].
	 *
	 * @param minConfirm              the min confirm
	 * @param includeEmpty            the include empty
	 * @param includeWatchOnly        the include watch only
	 * @param addressFilter           the address filter
	 * @param includeImmatureCoinbase the include immature coinbase
	 * @return the received transaction [ ]
	 */
	public ReceivedTransaction[] listReceivedByAddress(long minConfirm, boolean includeEmpty, boolean includeWatchOnly, String addressFilter, boolean includeImmatureCoinbase) {
		return this.post(new JsonRpc20.Builder().setMethod("listreceivedbyaddress").appendParams(minConfirm).appendParams(includeEmpty).appendParams(includeWatchOnly).appendParams(addressFilter).appendParams(includeImmatureCoinbase).getJson(), ReceivedTransaction.Result.class);
	}

	/**
	 * List received by label received transaction [ ].
	 *
	 * @return the received transaction [ ]
	 */
	public ReceivedTransaction[] listReceivedByLabel() {
		return this.post(new JsonRpc20.Builder().setMethod("listreceivedbylabel").getJson(), ReceivedTransaction.Result.class);
	}

	/**
	 * List received by label received transaction [ ].
	 *
	 * @param minConfirm              the min confirm
	 * @param includeEmpty            the include empty
	 * @param includeWatchOnly        the include watch only
	 * @param addressFilter           the address filter
	 * @param includeImmatureCoinbase the include immature coinbase
	 * @return the received transaction [ ]
	 */
	public ReceivedTransaction[] listReceivedByLabel(long minConfirm, boolean includeEmpty, boolean includeWatchOnly, String addressFilter, boolean includeImmatureCoinbase) {
		return this.post(new JsonRpc20.Builder().setMethod("listreceivedbylabel").appendParams(minConfirm).appendParams(includeEmpty).appendParams(includeWatchOnly).appendParams(addressFilter).appendParams(includeImmatureCoinbase).getJson(), ReceivedTransaction.Result.class);
	}

	/**
	 * List since block list transactions.
	 *
	 * @return the list transactions
	 */
	public ListTransactions listSinceBlock() {
		return this.post(new JsonRpc20.Builder().setMethod("listsinceblock").getJson(), ListTransactions.Result.class);
	}

	/**
	 * List since block list transactions.
	 *
	 * @param blockHash     the block hash
	 * @param targetConfirm the target confirm
	 * @return the list transactions
	 */
	public ListTransactions listSinceBlock(String blockHash, long targetConfirm) {
		return this.post(new JsonRpc20.Builder().setMethod("listsinceblock").appendParams(blockHash).appendParams(targetConfirm).getJson(), ListTransactions.Result.class);
	}

	/**
	 * List since block list transactions.
	 *
	 * @param blockHash        the block hash
	 * @param targetConfirm    the target confirm
	 * @param includeWatchOnly the include watch only
	 * @param includeRemoved   the include removed
	 * @param includeChange    the include change
	 * @param label            the label
	 * @return the list transactions
	 */
	public ListTransactions listSinceBlock(String blockHash, long targetConfirm, boolean includeWatchOnly, boolean includeRemoved, boolean includeChange, String label) {
		return this.post(new JsonRpc20.Builder().setMethod("listsinceblock").appendParams(blockHash).appendParams(targetConfirm).appendParams(includeWatchOnly).appendParams(includeRemoved).appendParams(includeChange).appendParams(label).getJson(), ListTransactions.Result.class);
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

	/**
	 * List unspent unspent transaction [ ].
	 *
	 * @return the unspent transaction [ ]
	 */
	public UnspentTransaction[] listUnspent() {
		return this.post(new JsonRpc20.Builder().setMethod("listunspent").getJson(), UnspentTransaction.ResultArray.class);
	}

	/**
	 * List unspent unspent transaction [ ].
	 *
	 * @param minConfirm the min confirm
	 * @param maxConfirm the max confirm
	 * @return the unspent transaction [ ]
	 */
	public UnspentTransaction[] listUnspent(long minConfirm, long maxConfirm) {
		return this.post(new JsonRpc20.Builder().setMethod("listunspent").appendParams(minConfirm).appendParams(maxConfirm).getJson(), UnspentTransaction.ResultArray.class);
	}

	/**
	 * List unspent unspent transaction [ ].
	 *
	 * @param minConfirm the min confirm
	 * @param maxConfirm the max confirm
	 * @param addresses  the addresses
	 * @return the unspent transaction [ ]
	 */
	public UnspentTransaction[] listUnspent(long minConfirm, long maxConfirm, String[] addresses) {
		return this.post(new JsonRpc20.Builder().setMethod("listunspent").appendParams(minConfirm).appendParams(maxConfirm).appendParams(addresses).getJson(), UnspentTransaction.ResultArray.class);
	}

	/**
	 * List unspent unspent transaction [ ].
	 *
	 * @param minConfirm    the min confirm
	 * @param maxConfirm    the max confirm
	 * @param addresses     the addresses
	 * @param includeUnsafe the include unsafe
	 * @return the unspent transaction [ ]
	 */
	public UnspentTransaction[] listUnspent(long minConfirm, long maxConfirm, String[] addresses, boolean includeUnsafe) {
		return this.post(new JsonRpc20.Builder().setMethod("listunspent").appendParams(minConfirm).appendParams(maxConfirm).appendParams(addresses).appendParams(includeUnsafe).getJson(), UnspentTransaction.ResultArray.class);
	}

	/**
	 * List unspent unspent transaction [ ].
	 *
	 * @param minConfirm    the min confirm
	 * @param maxConfirm    the max confirm
	 * @param addresses     the addresses
	 * @param includeUnsafe the include unsafe
	 * @param queryOptions  the query options
	 * @return the unspent transaction [ ]
	 */
	public UnspentTransaction[] listUnspent(long minConfirm, long maxConfirm, String[] addresses, boolean includeUnsafe, Object queryOptions) { // TODO Create QueryOptions argument object
		return this.post(new JsonRpc20.Builder().setMethod("listunspent").appendParams(minConfirm).appendParams(maxConfirm).appendParams(addresses).appendParams(includeUnsafe).appendParams(queryOptions).getJson(), UnspentTransaction.ResultArray.class);
	}

	/**
	 * List wallets dir list wallets dir.
	 *
	 * @return the list wallets dir
	 */
	public ListWalletsDir listWalletsDir() {
		return this.post(new JsonRpc20.Builder().setMethod("listwalletdir").getJson(), ListWalletsDir.Result.class);
	}

	/**
	 * List wallets string [ ].
	 *
	 * @return the string [ ]
	 */
	public String[] listWallets() {
		return this.post(new JsonRpc20.Builder().setMethod("listwallets").getJson(), ArrayValue.StringArray.class);
	}

	/**
	 * Load wallet load wallet.
	 *
	 * @param fileName the file name
	 * @return the load wallet
	 */
	public LoadWallet loadWallet(String fileName) {
		return this.post(new JsonRpc20.Builder().setMethod("loadwallet").appendParams(fileName).getJson(), LoadWallet.Result.class);
	}

	/**
	 * Load wallet load wallet.
	 *
	 * @param fileName      the file name
	 * @param loadOnStartup the load on startup
	 * @return the load wallet
	 */
	public LoadWallet loadWallet(String fileName, boolean loadOnStartup) {
		return this.post(new JsonRpc20.Builder().setMethod("loadwallet").appendParams(fileName).appendParams(loadOnStartup).getJson(), LoadWallet.Result.class);
	}

	/**
	 * Lock unspent boolean.
	 *
	 * @param unlock the unlock
	 * @return the boolean
	 */
	public boolean lockUnspent(boolean unlock) {
		return this.post(new JsonRpc20.Builder().setMethod("lockunspent").appendParams(unlock).getJson(), BooleanValue.class);
	}

	/**
	 * Lock unspent boolean.
	 *
	 * @param unlock       the unlock
	 * @param transactions the transactions
	 * @return the boolean
	 */
	public boolean lockUnspent(boolean unlock, Object[] transactions) { // TODO Complete Argument object 'transactions'
		return this.post(new JsonRpc20.Builder().setMethod("lockunspent").appendParams(unlock).appendParams(transactions).getJson(), BooleanValue.class);
	}

	/**
	 * Lock unspent boolean.
	 *
	 * @param unlock       the unlock
	 * @param transactions the transactions
	 * @param persistent   the persistent
	 * @return the boolean
	 */
	public boolean lockUnspent(boolean unlock, Object[] transactions, boolean persistent) {
		return this.post(new JsonRpc20.Builder().setMethod("lockunspent").appendParams(unlock).appendParams(transactions).appendParams(persistent).getJson(), BooleanValue.class);
	}

	/**
	 * Migrate wallet migrate wallet.
	 *
	 * @return the migrate wallet
	 */
	public MigrateWallet migrateWallet() {
		return this.post(new JsonRpc20.Builder().setMethod("migratewallet").getJson(), MigrateWallet.Result.class);
	}

	/**
	 * Migrate wallet migrate wallet.
	 *
	 * @param walletName the wallet name
	 * @param passPhrase the pass phrase
	 * @return the migrate wallet
	 */
	public MigrateWallet migrateWallet(String walletName, String passPhrase) {
		return this.post(new JsonRpc20.Builder().setMethod("migratewallet").appendParams(walletName).appendParams(passPhrase).getJson(), MigrateWallet.Result.class);
	}

	/**
	 * New keypool.
	 */
	public void newKeypool() {
		this.post(new JsonRpc20.Builder().setMethod("newkeypool").getJson(), NullValue.class);
	}

}
