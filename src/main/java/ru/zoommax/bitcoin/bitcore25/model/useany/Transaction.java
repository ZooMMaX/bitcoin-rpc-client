package ru.zoommax.bitcoin.bitcore25.model.useany;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;

/**
 * The type Transaction.
 *
 */
@Getter
@Setter
public class Transaction { // TODO Check correct naming due to ru.zoommax.bitcoin.bitcore25.model.wallet.WTransaction
	/**
	 * The Vsize.
	 */
	private long vsize;
	/**
	 * The Weight.
	 */
	private long weight;
	/**
	 * The Time.
	 */
	private long time;
	/**
	 * The Height.
	 */
	private long height;
	/**
	 * The Descendantcount.
	 */
	private long descendantcount;
	/**
	 * The Descendantsize.
	 */
	private long descendantsize;
	/**
	 * The Ancestorcount.
	 */
	private long ancestorcount;
	/**
	 * The Ancestorsize.
	 */
	private long ancestorsize;
	/**
	 * The Wtxid.
	 */
	private String wtxid;
	/**
	 * The Fees.
	 */
	private Fees fees;
	/**
	 * The Depends.
	 */
	private String[] depends;
	/**
	 * The Spentby.
	 */
	private String[] spentby;
	/**
	 * The Bip 125 replaceable.
	 */
	@JsonProperty("bip125-replaceable")
	private boolean bip125replaceable;
	/**
	 * The Unbroadcast.
	 */
	private boolean unbroadcast;
}
