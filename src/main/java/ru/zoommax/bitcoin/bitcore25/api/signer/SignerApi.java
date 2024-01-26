package ru.zoommax.bitcoin.bitcore25.api.signer;

import ru.zoommax.bitcoin.JsonRpc20;
import ru.zoommax.bitcoin.JsonRpcClient;
import ru.zoommax.bitcoin.bitcore25.model.signer.Signers;

public class SignerApi extends JsonRpcClient {

	public SignerApi(String username, String password, String url){
		super(username, password, url);
	}

	public Signers[] enumerateSigners() {
		return this.post(new JsonRpc20.Builder().setMethod("enumeratesigners").getJson(), Signers.Result.class);
	}

}
