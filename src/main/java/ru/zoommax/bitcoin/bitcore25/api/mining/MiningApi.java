package ru.zoommax.bitcoin.bitcore25.api.mining;

import org.jetbrains.annotations.Nullable;

import ru.zoommax.bitcoin.JsonRpc20;
import ru.zoommax.bitcoin.JsonRpcClient;
import ru.zoommax.bitcoin.bitcore25.model.mining.MiningInfo;
import ru.zoommax.bitcoin.bitcore25.model.useany.BooleanValue;
import ru.zoommax.bitcoin.bitcore25.model.useany.LongValue;
import ru.zoommax.bitcoin.bitcore25.model.useany.StringValue;

public class MiningApi extends JsonRpcClient {

	public MiningApi(String username, String password, String url){
		super(username, password, url);
	}

	public String getBlockTemplate() {
		return this.post(new JsonRpc20.Builder().setMethod("getblocktemplate").getJson(), StringValue.class);
	} // TODO extend method;

	public MiningInfo getMiningInfo() {
		return this.post(new JsonRpc20.Builder().setMethod("getmininginfo").getJson(), MiningInfo.Result.class);
	}

	public Long getNetworkHashps() {
		return this.post(new JsonRpc20.Builder().setMethod("getnetworkhashps").getJson(), LongValue.class);
	}

	public Long getNetworkHashps(long nblocks, long height) {
		return this.post(new JsonRpc20.Builder().setMethod("getnetworkhashps").appendParams(nblocks).appendParams(height).getJson(), LongValue.class);
	}

	public Boolean prioritisetransaction(String txid, long fee_delta) {
		return this.post(new JsonRpc20.Builder().setMethod("prioritisetransaction").appendParams(txid).appendParams(0L).appendParams(fee_delta).getJson(), BooleanValue.class);
	}

	public @Nullable String submitBlock(String hexdata) {
		return this.post(new JsonRpc20.Builder().setMethod("submitblock").appendParams(hexdata).getJson(), StringValue.class);
	}

	public @Nullable String submitheader(String hexdata) { // The result of this method always NULL!
		return this.post(new JsonRpc20.Builder().setMethod("submitheader").appendParams(hexdata).getJson(), StringValue.class);
	}

}
