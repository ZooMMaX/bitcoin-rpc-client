package ru.zoommax.bitcoin.bitcore25.model.wallet;

import lombok.Getter;
import lombok.Setter;
import ru.zoommax.bitcoin.JsonRpcResult;

@Getter
@Setter
public class AddressInfo {

	public static class Result extends JsonRpcResult<AddressInfo> {
	}

	private String address;
	private String scriptPubKey;
	private boolean ismine;
	private boolean iswatchonly;
	private boolean solvable;
	private String desc;
	private String parent_desc;
	private boolean isscript;
	private boolean ischange;
	private boolean iswitness;
	private long witness_version;
	private String witness_program;
	private String script;
	private String hex;
	private String[] pubkeys;
	private long sigsrequired;
	private String pubkey;
	private Object embedded; // TODO Add object for this var ;; maybe its a Map<String,String> but I'm not sure.
	private boolean iscompressed;
	private long timestamp;
	private String hdkeypath;
	private String hdseedid;
	private String hdmasterfingerprint;
	private String[] labels;

}
