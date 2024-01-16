package ru.zoommax.bitcoin.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * The type Query options.
 */
public class QueryOptions {
    /**
     * The constant mapper.
     */
    private static final ObjectMapper mapper = new ObjectMapper().setSerializationInclusion(JsonInclude.Include.NON_NULL);
    /**
     * The Minimum amount.
     */
    private Integer minimumAmount; // amount,       (numeric or string, optional, default=0) Minimum value of each UTXO in BTC
    /**
     * The Maximum amount.
     */
    private Integer maximumAmount; // amount,       (numeric or string, optional, default=unlimited) Maximum value of each UTXO in BTC
    /**
     * The Maximum count.
     */
    private Integer maximumCount;  // n,            (numeric, optional, default=unlimited) Maximum number of UTXOs
    /**
     * The Minimum sum amount.
     */
    private Integer minimumSumAmount; // amount,    (numeric or string, optional, default=unlimited) Minimum sum value of all UTXOs in BTC

    /**
     * Gets minimum amount.
     *
     * @return the minimum amount
     */
    public Integer getMinimumAmount() {
        return minimumAmount;
    }

    /**
     * Sets minimum amount.
     *
     * @param minimumAmount the minimum amount
     */
    public void setMinimumAmount(Integer minimumAmount) {
        this.minimumAmount = minimumAmount;
    }

    /**
     * Gets maximum amount.
     *
     * @return the maximum amount
     */
    public Integer getMaximumAmount() {
        return maximumAmount;
    }

    /**
     * Sets maximum amount.
     *
     * @param maximumAmount the maximum amount
     */
    public void setMaximumAmount(Integer maximumAmount) {
        this.maximumAmount = maximumAmount;
    }

    /**
     * Gets maximum count.
     *
     * @return the maximum count
     */
    public Integer getMaximumCount() {
        return maximumCount;
    }

    /**
     * Sets maximum count.
     *
     * @param maximumCount the maximum count
     */
    public void setMaximumCount(Integer maximumCount) {
        this.maximumCount = maximumCount;
    }

    /**
     * Gets minimum sum amount.
     *
     * @return the minimum sum amount
     */
    public Integer getMinimumSumAmount() {
        return minimumSumAmount;
    }

    /**
     * Sets minimum sum amount.
     *
     * @param minimumSumAmount the minimum sum amount
     */
    public void setMinimumSumAmount(Integer minimumSumAmount) {
        this.minimumSumAmount = minimumSumAmount;
    }

    /**
     * To json string.
     *
     * @return the string
     */
    public String toJson() {
        try {
            return mapper.writeValueAsString(this);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }
}