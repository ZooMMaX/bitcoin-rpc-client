package ru.zoommax.bitcoin.bitcore25.model.wallet;

import lombok.Getter;
import lombok.Setter;
import ru.zoommax.bitcoin.JsonRpcResult;

/**
 * The type Address info.
 */
@Getter
@Setter
/**
 * The AddressInfo object
 *
 * Result of the getaddressinfo method
 *
 * @see <a href=
 *      "https://developer.bitcoin.org/reference/rpc/getaddressinfo.html">getaddressinfo</a>
 */
public class AddressInfo {

	/**
	 * The type Result.
	 */
	public static class Result extends JsonRpcResult<AddressInfo> {
	}

	/**
	 * The Address.
	 */
	private String address;
	/**
	 * The Script pub key.
	 */
	private String scriptPubKey;
	/**
	 * The Ismine.
	 */
	private boolean ismine;
	/**
	 * The Iswatchonly.
	 */
	private boolean iswatchonly;
	/**
	 * The Solvable.
	 */
	private boolean solvable;
	/**
	 * The Desc.
	 */
	private String desc;
	/**
	 * The Parent desc.
	 */
	private String parent_desc;
	/**
	 * The Isscript.
	 */
	private boolean isscript;
	/**
	 * The Ischange.
	 */
	private boolean ischange;
	/**
	 * The Iswitness.
	 */
	private boolean iswitness;
	/**
	 * The Witness version.
	 */
	private long witness_version;
	/**
	 * The Witness program.
	 */
	private String witness_program;
	/**
	 * The Script.
	 */
	private String script;
	/**
	 * The Hex.
	 */
	private String hex;
	/**
	 * The Pubkeys.
	 */
	private String[] pubkeys;
	/**
	 * The Sigsrequired.
	 */
	private long sigsrequired;
	/**
	 * The Pubkey.
	 */
	private String pubkey;
	/**
	 * The Embedded.
	 */
	private Object embedded; // TODO Add object for this var ;; maybe its a Map<String,String> but I'm not sure.
	/**
	 * The Iscompressed.
	 */
	private boolean iscompressed;
	/**
	 * The Timestamp.
	 */
	private long timestamp;
	/**
	 * The Hdkeypath.
	 */
	private String hdkeypath;
	/**
	 * The Hdseedid.
	 */
	private String hdseedid;
	/**
	 * The Hdmasterfingerprint.
	 */
	private String hdmasterfingerprint;
	/**
	 * The Labels.
	 */
	private String[] labels;

}
