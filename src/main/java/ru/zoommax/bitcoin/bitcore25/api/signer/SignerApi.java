package ru.zoommax.bitcoin.bitcore25.api.signer;

import ru.zoommax.bitcoin.JsonRpc20;
import ru.zoommax.bitcoin.JsonRpcClient;
import ru.zoommax.bitcoin.bitcore25.model.signer.SignerHolder;

public class SignerApi extends JsonRpcClient {

	public SignerApi(String username, String password, String url){
		super(username, password, url);
	}

	public SignerHolder[] enumerateSigners() {
		return this.post(new JsonRpc20.Builder().setMethod("enumeratesigners").getJson(), SignerHolder.Result.class);
	}

}
