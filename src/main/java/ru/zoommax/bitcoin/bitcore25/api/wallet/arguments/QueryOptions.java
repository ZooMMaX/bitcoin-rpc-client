package ru.zoommax.bitcoin.bitcore25.api.wallet.arguments;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class QueryOptions {

	private double minimumAmount = 0d;
	private double maximumAmount = Double.POSITIVE_INFINITY;
	private long maximumCount = Integer.MAX_VALUE;
	private double minimumSumAmount = Double.POSITIVE_INFINITY;
	private boolean include_immature_coinbase = false;

}
