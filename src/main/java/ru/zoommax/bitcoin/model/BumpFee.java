package ru.zoommax.bitcoin.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import ru.zoommax.bitcoin.JsonRpcResult;

public class BumpFee {
    public static class Result extends JsonRpcResult<BumpTransactionFee> {
    }

    public static class BumpTransactionFee {
        private String txid;
        private double origfee;
        private double fee;
        private String[] errors;

        public String getTxid() {
            return txid;
        }

        public void setTxid(String txid) {
            this.txid = txid;
        }

        public double getOrigfee() {
            return origfee;
        }

        public void setOrigfee(double origfee) {
            this.origfee = origfee;
        }

        public double getFee() {
            return fee;
        }

        public void setFee(double fee) {
            this.fee = fee;
        }

        public String[] getErrors() {
            return errors;
        }

        public void setErrors(String[] errors) {
            this.errors = errors;
        }
    }

    /**
     * <pre>
     *    {
     *      "confTarget"        (numeric, optional) Confirmation target (in blocks)
     *      "totalFee"          (numeric, optional) Total fee (NOT feerate) to pay, in satoshis.
     *                          In rare cases, the actual fee paid might be slightly higher than the specified
     *                          totalFee if the tx change output has to be removed because it is too close to
     *                          the dust threshold.
     *      "replaceable"       (boolean, optional, default true) Whether the new transaction should still be
     *                          marked bip-125 replaceable. If true, the sequence numbers in the transaction will
     *                          be left unchanged from the original. If false, any input sequence numbers in the
     *                          original transaction that were less than 0xfffffffe will be increased to 0xfffffffe
     *                          so the new transaction will not be explicitly bip-125 replaceable (though it may
     *                          still be replaceable in practice, for example if it has unconfirmed ancestors which
     *                          are replaceable).
     *      "estimate_mode"     (string, optional, default=UNSET) The fee estimate mode, must be one of:
     *          "UNSET"
     *          "ECONOMICAL"
     *          "CONSERVATIVE"
     *    }
     * </pre>
     */
    public static class Options {
        private Integer confTarget;
        private Double totalFee;
        private Boolean replaceable;
        @JsonProperty("estimate_mode")
        private EstimateMode estimateMode;

        public Integer getConfTarget() {
            return confTarget;
        }

        public void setConfTarget(Integer confTarget) {
            this.confTarget = confTarget;
        }

        public Double getTotalFee() {
            return totalFee;
        }

        public void setTotalFee(Double totalFee) {
            this.totalFee = totalFee;
        }

        public Boolean getReplaceable() {
            return replaceable;
        }

        public void setReplaceable(Boolean replaceable) {
            this.replaceable = replaceable;
        }

        public EstimateMode getEstimateMode() {
            return estimateMode;
        }

        public void setEstimateMode(EstimateMode estimateMode) {
            this.estimateMode = estimateMode;
        }
    }

    public enum EstimateMode {
        UNSET, ECONOMICAL, CONSERVATIVE
    }
}
