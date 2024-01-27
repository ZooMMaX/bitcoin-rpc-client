package ru.zoommax.bitcoin.bitcore25.model.rawtransactions.fundrawtransaction;

import java.util.List;

import lombok.Builder;
import lombok.Getter;

/**
 * The type Options.
 */
@Builder
@Getter
public class Options {
	/**
	 * The Add inputs.
	 */
	private boolean add_inputs;
	/**
	 * The Include unsafe.
	 */
	private boolean include_unsafe;
	/**
	 * The Minconf.
	 */
	private long minconf;
	/**
	 * The Maxconf.
	 */
	private long maxconf;
	/**
	 * The Change address.
	 */
	private String changeAddress;
	/**
	 * The Change position.
	 */
	private long changePosition;
	/**
	 * The Change type.
	 */
	private String change_type;
	/**
	 * The Include watching.
	 */
	private boolean includeWatching;
	/**
	 * The Lock unspents.
	 */
	private boolean lockUnspents;
	/**
	 * The Fee rate.
	 */
	private double fee_rate;
	/**
	 * The Fee rate.
	 */
	private double feeRate;
	/**
	 * The Subtract fee from outputs.
	 */
	private long[] subtractFeeFromOutputs;
	/**
	 * The Input weights.
	 */
	private List<InputWeight> inputWeights;
	/**
	 * The Conf target.
	 */
	private long conf_target;
	/**
	 * The Estimate mode.
	 */
	private String estimate_mode;
	/**
	 * The Replaceable.
	 */
	private boolean replaceable;
	/**
	 * The Solving data.
	 */
	private SlovingData solving_data;
}
