package ru.zoommax.bitcoin.bitcore25.api.wallet;

import java.util.Map;

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
import ru.zoommax.bitcoin.bitcore25.model.wallet.BumpFee;
import ru.zoommax.bitcoin.bitcore25.model.wallet.ImportFeedback;
import ru.zoommax.bitcoin.bitcore25.model.wallet.ListTransactions;
import ru.zoommax.bitcoin.bitcore25.model.wallet.LockUnspentOut;
import ru.zoommax.bitcoin.bitcore25.model.wallet.ReceivedTransaction;
import ru.zoommax.bitcoin.bitcore25.model.wallet.UnspentTransaction;
import ru.zoommax.bitcoin.bitcore25.model.wallet.WalletCreate;
import ru.zoommax.bitcoin.bitcore25.model.wallet.WalletDestination;
import ru.zoommax.bitcoin.bitcore25.model.wallet.descriptors.ListDescriptors;
import ru.zoommax.bitcoin.bitcore25.model.wallet.getbalances.Balances;
import ru.zoommax.bitcoin.bitcore25.model.wallet.getbalances.Mine;
import ru.zoommax.bitcoin.bitcore25.model.wallet.gettransaction.WTransaction;
import ru.zoommax.bitcoin.bitcore25.model.wallet.getwalletinfo.WalletInfo;

public class WalletApi extends JsonRpcClient {

	public WalletApi(String username, String password, String url) {
		super(username, password, url);
	}

	public void abandonTransaction(String txid) {
		this.post(new JsonRpc20.Builder().setMethod("abandontransaction").appendParams(txid).getJson(), NullValue.class);
	}

	public boolean abortRescan() {
		return this.post(new JsonRpc20.Builder().setMethod("abortrescan").getJson(), BooleanValue.class);
	}

	public MultiSig addMultiSigAddress(long nRequired, String[] keys) {
		return this.post(new JsonRpc20.Builder().setMethod("addmultisigaddress").appendParams(nRequired).appendParams(keys).getJson(), MultiSig.Result.class);
	}

	public MultiSig addMultiSigAddress(long nRequired, String[] keys, String label, String addressType) {
		return this.post(new JsonRpc20.Builder().setMethod("addmultisigaddress").appendParams(nRequired).appendParams(keys).appendParams(label).appendParams(addressType).getJson(), MultiSig.Result.class);
	}

	public void backupWallet(String destination) {
		this.post(new JsonRpc20.Builder().setMethod("backupwallet").appendParams(destination).getJson(), NullValue.class);
	}

	public BumpFee bumpFee(String txid) {
		return this.post(new JsonRpc20.Builder().setMethod("bumpfee").appendParams(txid).getJson(), BumpFee.Result.class);
	}

	public BumpFee bumpFee(String txid, Object options) { // TODO Create options argument object
		return this.post(new JsonRpc20.Builder().setMethod("bumpfee").appendParams(txid).getJson(), BumpFee.Result.class);
	}

	public WalletCreate createWallet(String walletName) {
		return this.post(new JsonRpc20.Builder().setMethod("createwallet").appendParams(walletName).getJson(), WalletCreate.Result.class);
	}

	public WalletCreate createWallet(String walletName, boolean disablePrivKeys, boolean isBlank, String passphrase) {
		return this.post(new JsonRpc20.Builder().setMethod("createwallet")
				.appendParams(walletName)
				.appendParams(disablePrivKeys)
				.appendParams(isBlank)
				.appendParams(passphrase)
				.getJson(), WalletCreate.Result.class);
	}

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

	public String dumpPrivKey(String address) {
		return this.post(new JsonRpc20.Builder().setMethod("dumpprivkey").appendParams(address).getJson(), StringValue.class);
	}

	public WalletDestination dumpWallet(String filename) {
		return this.post(new JsonRpc20.Builder().setMethod("dumpwallet").appendParams(filename).getJson(), WalletDestination.Result.class);
	}

	public String encryptWallet(String passphrase) {
		return this.post(new JsonRpc20.Builder().setMethod("encryptwallet").appendParams(passphrase).getJson(), StringValue.class);
	}

	public Map<String,AddressPurpose> getAddressesByLabel(String label) {
		return this.post(new JsonRpc20.Builder().setMethod("getaddressesbylabel").appendParams(label).getJson(), AddressPurpose.ResultMap.class);
	}

	public AddressInfo getAddressInfo(String address) {
		return this.post(new JsonRpc20.Builder().setMethod("getaddressinfo").appendParams(address).getJson(), AddressInfo.Result.class);
	}

	public double getBalance() {
		return this.post(new JsonRpc20.Builder().setMethod("getbalance").getJson(), DoubleValue.class);
	}

	public double getBalance(long minConfirm, boolean includeWatchOnly, boolean avoidReuse) {
		return this.post(new JsonRpc20.Builder().setMethod("getbalance").appendParams("*").appendParams(minConfirm).appendParams(includeWatchOnly).appendParams(avoidReuse).getJson(), DoubleValue.class);
	}

	public Balances getBalances() {
		return this.post(new JsonRpc20.Builder().setMethod("getbalances").getJson(), Balances.Result.class);
	}

	public String getNewAddress() {
		return this.post(new JsonRpc20.Builder().setMethod("getnewaddress").getJson(), StringValue.class);
	}

	public String getNewAddress(String label, String addressType) {
		return this.post(new JsonRpc20.Builder().setMethod("getnewaddress").appendParams(label).appendParams(addressType).getJson(), StringValue.class);
	}

	public String getRawChangeAddress() {
		return this.post(new JsonRpc20.Builder().setMethod("getrawchangeaddress").getJson(), StringValue.class);
	}

	public String getRawChangeAddress(String addressType) {
		return this.post(new JsonRpc20.Builder().setMethod("getrawchangeaddress").appendParams(addressType).getJson(), StringValue.class);
	}

	public double getReceivedByAddress(String address) {
		return this.post(new JsonRpc20.Builder().setMethod("getreceivedbyaddress").appendParams(address).getJson(), DoubleValue.class);
	}

	public double getReceivedByAddress(String address, long minConfirm, boolean includeImmatureCoinbase) {
		return this.post(new JsonRpc20.Builder().setMethod("getreceivedbyaddress").appendParams(address).appendParams(minConfirm).appendParams(includeImmatureCoinbase).getJson(), DoubleValue.class);
	}

	public double getReceivedByLabel(String label) {
		return this.post(new JsonRpc20.Builder().setMethod("getreceivedbylabel").appendParams(label).getJson(), DoubleValue.class);
	}

	public double getReceivedByLabel(String label, long minConfirm, boolean includeImmatureCoinbase) {
		return this.post(new JsonRpc20.Builder().setMethod("getreceivedbylabel").appendParams(label).appendParams(minConfirm).appendParams(includeImmatureCoinbase).getJson(), DoubleValue.class);
	}

	public WTransaction getTransaction(String txid) {
		return this.post(new JsonRpc20.Builder().setMethod("gettransaction").appendParams(txid).getJson(), WTransaction.Result.class);
	}

	public WTransaction getTransaction(String txid, boolean includeWatchOnly, boolean verbose) {
		return this.post(new JsonRpc20.Builder().setMethod("gettransaction").appendParams(txid).appendParams(includeWatchOnly).appendParams(verbose).getJson(), WTransaction.Result.class);
	}

	/**
	 * @deprecated see {@link #getBalances()} {@link Mine#getUntrusted_pending()}
	 * @return summ amount of unconfirmed transactions
	 */
	@Deprecated()
	public double getUnconfirmedBalance() {
		return this.post(new JsonRpc20.Builder().setMethod("getunconfirmedbalance").getJson(), DoubleValue.class);
	}

	public WalletInfo getWalletInfo() {
		return this.post(new JsonRpc20.Builder().setMethod("getwalletinfo").getJson(), WalletInfo.Result.class);
	}

	public void importAddress(String address) {
		this.post(new JsonRpc20.Builder().setMethod("importaddress").appendParams(address).getJson(), NullValue.class);
	}

	public void importAddress(String address, String label) {
		this.post(new JsonRpc20.Builder().setMethod("importaddress").appendParams(address).appendParams(label).getJson(), NullValue.class);
	}

	public void importAddress(String address, String label, boolean rescan, boolean p2sh) {
		this.post(new JsonRpc20.Builder().setMethod("importaddress").appendParams(address).appendParams(label).appendParams(rescan).appendParams(p2sh).getJson(), NullValue.class);
	}

	public ImportFeedback[] importDescriptors(Object[] requests) { // TODO Create requests object
		return this.post(new JsonRpc20.Builder().setMethod("importdescriptors").appendParams(requests).getJson(), ImportFeedback.Result.class);
	}

	public ImportFeedback[] importMulti(Object[] requests) { // TODO Create requests object
		return this.post(new JsonRpc20.Builder().setMethod("importmulti").appendParams(requests).getJson(), ImportFeedback.Result.class);
	}

	public ImportFeedback[] importMulti(Object[] requests, Object options) { // TODO Create requests object, Options object
		return this.post(new JsonRpc20.Builder().setMethod("importmulti").appendParams(requests).getJson(), ImportFeedback.Result.class);
	}

	public void importPrivKey(String privkey) {
		this.post(new JsonRpc20.Builder().setMethod("importprivkey").appendParams(privkey).getJson(), NullValue.class);
	}

	public void importPrivKey(String privkey, String label) {
		this.post(new JsonRpc20.Builder().setMethod("importprivkey").appendParams(privkey).appendParams(label).getJson(), NullValue.class);
	}

	public void importPrivKey(String privkey, String label, boolean rescan) {
		this.post(new JsonRpc20.Builder().setMethod("importprivkey").appendParams(privkey).appendParams(label).appendParams(rescan).getJson(), NullValue.class);
	}

	public void importPubKey(String pubkey) {
		this.post(new JsonRpc20.Builder().setMethod("importpubkey").appendParams(pubkey).getJson(), NullValue.class);
	}

	public void importPubKey(String pubkey, String label) {
		this.post(new JsonRpc20.Builder().setMethod("importpubkey").appendParams(pubkey).appendParams(label).getJson(), NullValue.class);
	}

	public void importPubKey(String pubkey, String label, boolean rescan) {
		this.post(new JsonRpc20.Builder().setMethod("importpubkey").appendParams(pubkey).appendParams(label).appendParams(rescan).getJson(), NullValue.class);
	}

	public void importPrunedFunds(String rawtransaction, String txOutProof) {
		this.post(new JsonRpc20.Builder().setMethod("importprunedfunds").appendParams(rawtransaction).appendParams(txOutProof).getJson(), NullValue.class);
	}

	public void importWallet(String fileName) {
		this.post(new JsonRpc20.Builder().setMethod("importWallet").appendParams(fileName).getJson(), NullValue.class);
	}

	public void keyPoolRefill() {
		this.post(new JsonRpc20.Builder().setMethod("keypoolrefill").getJson(), NullValue.class);
	}

	public void keyPoolRefill(long newSize) {
		this.post(new JsonRpc20.Builder().setMethod("keypoolrefill").appendParams(newSize).getJson(), NullValue.class);
	}

	public Object[][][] listAddressGroupings() {
		return this.post(new JsonRpc20.Builder().setMethod("listaddressgroupings").getJson(), ArrayValue.ThreeArray.class);
	}

	public ListDescriptors listDescriptors() {
		return this.post(new JsonRpc20.Builder().setMethod("listdescriptors").getJson(), ListDescriptors.Result.class);
	}

	public ListDescriptors listDescriptors(boolean showPrivate) {
		return this.post(new JsonRpc20.Builder().setMethod("listdescriptors").appendParams(showPrivate).getJson(), ListDescriptors.Result.class);
	}

	public String[] listLabels() {
		return this.post(new JsonRpc20.Builder().setMethod("listlabels").getJson(), ArrayValue.StringArray.class);
	}

	public String[] listLabels(String purpose) {
		return this.post(new JsonRpc20.Builder().setMethod("listlabels").appendParams(purpose).getJson(), ArrayValue.StringArray.class);
	}

	public LockUnspentOut[] listLockUnspent() {
		return this.post(new JsonRpc20.Builder().setMethod("listlockunspent").getJson(), LockUnspentOut.Result.class);
	}

	public ReceivedTransaction[] listReceivedByAddress() {
		return this.post(new JsonRpc20.Builder().setMethod("listreceivedbyaddress").getJson(), ReceivedTransaction.Result.class);
	}

	public ReceivedTransaction[] listReceivedByAddress(long minConfirm, boolean includeEmpty, boolean includeWatchOnly, String addressFilter, boolean includeImmatureCoinbase) {
		return this.post(new JsonRpc20.Builder().setMethod("listreceivedbyaddress").appendParams(minConfirm).appendParams(includeEmpty).appendParams(includeWatchOnly).appendParams(addressFilter).appendParams(includeImmatureCoinbase).getJson(), ReceivedTransaction.Result.class);
	}

	public ReceivedTransaction[] listReceivedByLabel() {
		return this.post(new JsonRpc20.Builder().setMethod("listreceivedbylabel").getJson(), ReceivedTransaction.Result.class);
	}

	public ReceivedTransaction[] listReceivedByLabel(long minConfirm, boolean includeEmpty, boolean includeWatchOnly, String addressFilter, boolean includeImmatureCoinbase) {
		return this.post(new JsonRpc20.Builder().setMethod("listreceivedbylabel").appendParams(minConfirm).appendParams(includeEmpty).appendParams(includeWatchOnly).appendParams(addressFilter).appendParams(includeImmatureCoinbase).getJson(), ReceivedTransaction.Result.class);
	}

	public ListTransactions listSinceBlock() {
		return this.post(new JsonRpc20.Builder().setMethod("listsinceblock").getJson(), ListTransactions.Result.class);
	}

	public ListTransactions listSinceBlock(String blockHash, long targetConfirm) {
		return this.post(new JsonRpc20.Builder().setMethod("listsinceblock").appendParams(blockHash).appendParams(targetConfirm).getJson(), ListTransactions.Result.class);
	}

	public ListTransactions listSinceBlock(String blockHash, long targetConfirm, boolean includeWatchOnly, boolean includeRemoved, boolean includeChange, String label) {
		return this.post(new JsonRpc20.Builder().setMethod("listsinceblock").appendParams(blockHash).appendParams(targetConfirm).appendParams(includeWatchOnly).appendParams(includeRemoved).appendParams(includeChange).appendParams(label).getJson(), ListTransactions.Result.class);
	}

	public WTransaction[] listTransactions() {
		return this.post(new JsonRpc20.Builder().setMethod("listtransactions").getJson(), WTransaction.ResultArray.class);
	}

	public WTransaction[] listTransactions(String label, long count, long skip, boolean includeWatchOnly) {
		return this.post(new JsonRpc20.Builder().setMethod("listtransactions").appendParams(label).appendParams(count).appendParams(skip).appendParams(includeWatchOnly).getJson(), WTransaction.ResultArray.class);
	}

	public UnspentTransaction[] listUnspent() {
		return this.post(new JsonRpc20.Builder().setMethod("listunspent").getJson(), UnspentTransaction.ResultArray.class);
	}

	public UnspentTransaction[] listUnspent(long minConfirm, long maxConfirm) {
		return this.post(new JsonRpc20.Builder().setMethod("listunspent").appendParams(minConfirm).appendParams(maxConfirm).getJson(), UnspentTransaction.ResultArray.class);
	}

	public UnspentTransaction[] listUnspent(long minConfirm, long maxConfirm, String[] addresses) {
		return this.post(new JsonRpc20.Builder().setMethod("listunspent").appendParams(minConfirm).appendParams(maxConfirm).appendParams(addresses).getJson(), UnspentTransaction.ResultArray.class);
	}

	public UnspentTransaction[] listUnspent(long minConfirm, long maxConfirm, String[] addresses, boolean includeUnsafe) {
		return this.post(new JsonRpc20.Builder().setMethod("listunspent").appendParams(minConfirm).appendParams(maxConfirm).appendParams(addresses).appendParams(includeUnsafe).getJson(), UnspentTransaction.ResultArray.class);
	}

	public UnspentTransaction[] listUnspent(long minConfirm, long maxConfirm, String[] addresses, boolean includeUnsafe, Object queryOptions) { // TODO Create QueryOptions argument object
		return this.post(new JsonRpc20.Builder().setMethod("listunspent").appendParams(minConfirm).appendParams(maxConfirm).appendParams(addresses).appendParams(includeUnsafe).appendParams(queryOptions).getJson(), UnspentTransaction.ResultArray.class);
	}

}
