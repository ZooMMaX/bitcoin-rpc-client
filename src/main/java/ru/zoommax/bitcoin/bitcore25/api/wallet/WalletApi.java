package ru.zoommax.bitcoin.bitcore25.api.wallet;

import ru.zoommax.bitcoin.JsonRpc20;
import ru.zoommax.bitcoin.JsonRpcClient;
import ru.zoommax.bitcoin.bitcore25.model.useany.BooleanValue;
import ru.zoommax.bitcoin.bitcore25.model.useany.MultiSig;
import ru.zoommax.bitcoin.bitcore25.model.useany.NullValue;
import ru.zoommax.bitcoin.bitcore25.model.useany.StringValue;
import ru.zoommax.bitcoin.bitcore25.model.wallet.BumpFee;
import ru.zoommax.bitcoin.bitcore25.model.wallet.WalletCreate;
import ru.zoommax.bitcoin.bitcore25.model.wallet.WalletDumpFileInfo;

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

	public WalletDumpFileInfo dumpWallet(String filename) {
		return this.post(new JsonRpc20.Builder().setMethod("dumpwallet").appendParams(filename).getJson(), WalletDumpFileInfo.Result.class);
	}



}
