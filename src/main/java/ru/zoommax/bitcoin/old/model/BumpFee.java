package ru.zoommax.bitcoin.old.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import ru.zoommax.bitcoin.JsonRpcResult;

/**
 * The type Bump fee.
 */
public class BumpFee {
    /**
     * The type Result.
     */
    public static class Result extends JsonRpcResult<BumpTransactionFee> {
    }

    /**
     * The type Bump transaction fee.
     */
    public static class BumpTransactionFee {
        /**
         * The Txid.
         */
        private String txid;
        /**
         * The Origfee.
         */
        private double origfee;
        /**
         * The Fee.
         */
        private double fee;
        /**
         * The Errors.
         */
        private String[] errors;

        /**
         * Gets txid.
         *
         * @return the txid
         */
        public String getTxid() {
            return txid;
        }

        /**
         * Sets txid.
         *
         * @param txid the txid
         */
        public void setTxid(String txid) {
            this.txid = txid;
        }

        /**
         * Gets origfee.
         *
         * @return the origfee
         */
        public double getOrigfee() {
            return origfee;
        }

        /**
         * Sets origfee.
         *
         * @param origfee the origfee
         */
        public void setOrigfee(double origfee) {
            this.origfee = origfee;
        }

        /**
         * Gets fee.
         *
         * @return the fee
         */
        public double getFee() {
            return fee;
        }

        /**
         * Sets fee.
         *
         * @param fee the fee
         */
        public void setFee(double fee) {
            this.fee = fee;
        }

        /**
         * Get errors string [ ].
         *
         * @return the string [ ]
         */
        public String[] getErrors() {
            return errors;
        }

        /**
         * Sets errors.
         *
         * @param errors the errors
         */
        public void setErrors(String[] errors) {
            this.errors = errors;
        }
    }

    /**
     * The type Options.
     */
    public static class Options {
        /**
         * The Conf target.
         */
        private Integer confTarget;
        /**
         * The Total fee.
         */
        private Double totalFee;
        /**
         * The Replaceable.
         */
        private Boolean replaceable;
        /**
         * The Estimate mode.
         */
        @JsonProperty("estimate_mode")
        private EstimateMode estimateMode;

        /**
         * Gets conf target.
         *
         * @return the conf target
         */
        public Integer getConfTarget() {
            return confTarget;
        }

        /**
         * Sets conf target.
         *
         * @param confTarget the conf target
         */
        public void setConfTarget(Integer confTarget) {
            this.confTarget = confTarget;
        }

        /**
         * Gets total fee.
         *
         * @return the total fee
         */
        public Double getTotalFee() {
            return totalFee;
        }

        /**
         * Sets total fee.
         *
         * @param totalFee the total fee
         */
        public void setTotalFee(Double totalFee) {
            this.totalFee = totalFee;
        }

        /**
         * Gets replaceable.
         *
         * @return the replaceable
         */
        public Boolean getReplaceable() {
            return replaceable;
        }

        /**
         * Sets replaceable.
         *
         * @param replaceable the replaceable
         */
        public void setReplaceable(Boolean replaceable) {
            this.replaceable = replaceable;
        }

        /**
         * Gets estimate mode.
         *
         * @return the estimate mode
         */
        public EstimateMode getEstimateMode() {
            return estimateMode;
        }

        /**
         * Sets estimate mode.
         *
         * @param estimateMode the estimate mode
         */
        public void setEstimateMode(EstimateMode estimateMode) {
            this.estimateMode = estimateMode;
        }
    }

    /**
     * The enum Estimate mode.
     */
    public enum EstimateMode {
        /**
         * Unset estimate mode.
         */
        UNSET,
        /**
         * Economical estimate mode.
         */
        ECONOMICAL,
        /**
         * Conservative estimate mode.
         */
        CONSERVATIVE
    }
}
