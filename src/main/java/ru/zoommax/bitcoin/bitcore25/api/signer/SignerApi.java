package ru.zoommax.bitcoin.bitcore25.api.signer;

import ru.zoommax.bitcoin.JsonRpc20;
import ru.zoommax.bitcoin.JsonRpcClient;
import ru.zoommax.bitcoin.bitcore25.model.signer.Signers;

/**
 * The type Signer api.
 */
public class SignerApi extends JsonRpcClient {

	/**
	 * Instantiates a new Signer api.
	 *
	 * @param username the username
	 * @param password the password
	 * @param url      the url
	 */
	public SignerApi(String username, String password, String url){
		super(username, password, url);
	}

	/**
	 * Enumerate signers signers [ ].
	 *
	 * @return the signers [ ]
	 */
	public Signers[] enumerateSigners() {
		return this.post(new JsonRpc20.Builder().setMethod("enumeratesigners").getJson(), Signers.Result.class);
	}

}
