package ru.zoommax.bitcoin.bitcore25.model.wallet.getwalletinfo;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;
import ru.zoommax.bitcoin.JsonRpcResult;
import ru.zoommax.bitcoin.bitcore25.model.wallet.getbalances.Mine;

@Getter
@Setter
public class WalletInfo {

	public static class Result extends JsonRpcResult<WalletInfo> {
	}

	private String walletname;
	private long walletversion;
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
	private long txcount;
	@JsonProperty("keypoololdest")
	private long keyPoolOldest;
	@JsonProperty("keypoolsize")
	private long keyPoolSize;
	@JsonProperty("keypoolsize_hd_internal")
	private long keyPoolSizeHDInternal;
	private long unlocked_until;
	private double paytxfee;
	private String hdseedid;
	private boolean private_keys_enabled;
	private boolean avoid_reuse;
	private Scanning scanning;
	private boolean descriptors;
	private boolean external_signer;

}
