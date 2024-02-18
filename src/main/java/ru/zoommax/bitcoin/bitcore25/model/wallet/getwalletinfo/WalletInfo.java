package ru.zoommax.bitcoin.bitcore25.model.wallet.getwalletinfo;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;
import ru.zoommax.bitcoin.JsonRpcResult;
import ru.zoommax.bitcoin.bitcore25.model.wallet.getbalances.Mine;

/**
 * The type Wallet info.
 */
@Getter
@Setter
public class WalletInfo {

    /**
     * The type Result.
     */
    public static class Result extends JsonRpcResult<WalletInfo> {
	}

    /**
     * The Walletname.
     */
    private String walletname;
    /**
     * The Walletversion.
     */
    private long walletversion;
    /**
     * The Format.
     */
    private String format;
	/**
	 * @deprecated see {@link #getBalances()} {@link Mine#getTrusted()}
	 */
	@Deprecated
	private double balance;
	/**
	 * @deprecated see {@link #getBalances()} {@link Mine#getUntrusted_pending()}
	 */
	@Deprecated
	private double unconfirmed_balance;
	/**
	 * @deprecated see {@link #getBalances()} {@link Mine#getImmature()}
	 */
	@Deprecated
	private double immature_balance;
    /**
     * The Txcount.
     */
    private long txcount;
    /**
     * The Key pool oldest.
     */
    @JsonProperty("keypoololdest")
	private long keyPoolOldest;
    /**
     * The Key pool size.
     */
    @JsonProperty("keypoolsize")
	private long keyPoolSize;
    /**
     * The Key pool size hd internal.
     */
    @JsonProperty("keypoolsize_hd_internal")
	private long keyPoolSizeHDInternal;
    /**
     * The Unlocked until.
     */
    private long unlocked_until;
    /**
     * The Paytxfee.
     */
    private double paytxfee;
    /**
     * The Hdseedid.
     */
    private String hdseedid;
    /**
     * The Private keys enabled.
     */
    private boolean private_keys_enabled;
    /**
     * The Avoid reuse.
     */
    private boolean avoid_reuse;
    /**
     * The Scanning.
     */
    private Scanning scanning;
    /**
     * The Descriptors.
     */
    private boolean descriptors;
    /**
     * The External signer.
     */
    private boolean external_signer;

}
