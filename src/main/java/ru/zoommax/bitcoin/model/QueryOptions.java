package ru.zoommax.bitcoin.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class QueryOptions {
    private static final ObjectMapper mapper = new ObjectMapper().setSerializationInclusion(JsonInclude.Include.NON_NULL);
    private Integer minimumAmount; // amount,       (numeric or string, optional, default=0) Minimum value of each UTXO in BTC
    private Integer maximumAmount; // amount,       (numeric or string, optional, default=unlimited) Maximum value of each UTXO in BTC
    private Integer maximumCount;  // n,            (numeric, optional, default=unlimited) Maximum number of UTXOs
    private Integer minimumSumAmount; // amount,    (numeric or string, optional, default=unlimited) Minimum sum value of all UTXOs in BTC

    public Integer getMinimumAmount() {
        return minimumAmount;
    }

    public void setMinimumAmount(Integer minimumAmount) {
        this.minimumAmount = minimumAmount;
    }

    public Integer getMaximumAmount() {
        return maximumAmount;
    }

    public void setMaximumAmount(Integer maximumAmount) {
        this.maximumAmount = maximumAmount;
    }

    public Integer getMaximumCount() {
        return maximumCount;
    }

    public void setMaximumCount(Integer maximumCount) {
        this.maximumCount = maximumCount;
    }

    public Integer getMinimumSumAmount() {
        return minimumSumAmount;
    }

    public void setMinimumSumAmount(Integer minimumSumAmount) {
        this.minimumSumAmount = minimumSumAmount;
    }

    public String toJson() {
        try {
            return mapper.writeValueAsString(this);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }
}