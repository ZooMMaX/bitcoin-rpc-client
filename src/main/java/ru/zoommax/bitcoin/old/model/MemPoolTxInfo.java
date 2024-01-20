package ru.zoommax.bitcoin.old.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import ru.zoommax.bitcoin.JsonRpcResult;

import java.util.List;
import java.util.Map;

/**
 * The type Mem pool tx info.
 */
public class MemPoolTxInfo {
    /**
     * The type Map result.
     */
    public static class MapResult extends JsonRpcResult<Map<String, MemPoolTxInfo>> {
    }

    /**
     * The type Result.
     */
    public static class Result extends JsonRpcResult<MemPoolTxInfo> {
    }

    /**
     * The Fees.
     */
    private Fees fees;
    /**
     * The Size.
     */
    private int size;
    /**
     * The Fee.
     */
    private double fee;
    /**
     * The Modifiedfee.
     */
    private double modifiedfee;
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
    private int descendantcount;
    /**
     * The Descendantsize.
     */
    private int descendantsize;
    /**
     * The Descendantfees.
     */
    private int descendantfees;
    /**
     * The Ancestorcount.
     */
    private int ancestorcount;
    /**
     * The Ancestorsize.
     */
    private int ancestorsize;
    /**
     * The Ancestorfees.
     */
    private int ancestorfees;
    /**
     * The Wtxid.
     */
    private String wtxid;
    /**
     * The Depends.
     */
    private List<String> depends;
    /**
     * The Spentby.
     */
    private List<String> spentby;
    /**
     * The Vsize.
     */
    private int vsize;
    /**
     * The Weight.
     */
    private int weight;
    /**
     * The Bip 125 replaceable.
     */
    @JsonProperty("bip125-replaceable")
    private boolean bip125_replaceable;
    /**
     * The Unbroadcast.
     */
    private boolean unbroadcast;

    /**
     * Sets unbroadcast.
     *
     * @param unbroadcast the unbroadcast
     */
    public void setUnbroadcast(boolean unbroadcast) {
        this.unbroadcast = unbroadcast;
    }

    /**
     * Gets unbroadcast.
     *
     * @return the unbroadcast
     */
    public boolean getUnbroadcast() {
        return unbroadcast;
    }

    /**
     * Sets bip 125 replaceable.
     *
     * @param bip125_replaceable the bip 125 replaceable
     */
    public void setBip125_replaceable(boolean bip125_replaceable) {
        this.bip125_replaceable = bip125_replaceable;
    }

    /**
     * Gets bip 125 replaceable.
     *
     * @return the bip 125 replaceable
     */
    public boolean getBip125_replaceable() {
        return bip125_replaceable;
    }

    /**
     * Sets weight.
     *
     * @param weight the weight
     */
    public void setWeight(int weight) {
        this.weight = weight;
    }

    /**
     * Gets weight.
     *
     * @return the weight
     */
    public int getWeight() {
        return weight;
    }

    /**
     * Sets vsize.
     *
     * @param vsize the vsize
     */
    public void setVsize(int vsize) {
        this.vsize = vsize;
    }

    /**
     * Gets vsize.
     *
     * @return the vsize
     */
    public int getVsize() {
        return vsize;
    }

    /**
     * Sets fees.
     *
     * @param fees the fees
     */
    public void setFees(Fees fees) {
        this.fees = fees;
    }

    /**
     * Gets fees.
     *
     * @return the fees
     */
    public Fees getFees() {
        return fees;
    }

    /**
     * Sets size.
     *
     * @param size the size
     */
    public void setSize(int size) {
        this.size = size;
    }

    /**
     * Gets size.
     *
     * @return the size
     */
    public int getSize() {
        return size;
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
     * Gets fee.
     *
     * @return the fee
     */
    public double getFee() {
        return fee;
    }

    /**
     * Sets modifiedfee.
     *
     * @param modifiedfee the modifiedfee
     */
    public void setModifiedfee(double modifiedfee) {
        this.modifiedfee = modifiedfee;
    }

    /**
     * Gets modifiedfee.
     *
     * @return the modifiedfee
     */
    public double getModifiedfee() {
        return modifiedfee;
    }

    /**
     * Sets time.
     *
     * @param time the time
     */
    public void setTime(long time) {
        this.time = time;
    }

    /**
     * Gets time.
     *
     * @return the time
     */
    public long getTime() {
        return time;
    }

    /**
     * Sets height.
     *
     * @param height the height
     */
    public void setHeight(long height) {
        this.height = height;
    }

    /**
     * Gets height.
     *
     * @return the height
     */
    public long getHeight() {
        return height;
    }

    /**
     * Sets descendantcount.
     *
     * @param descendantcount the descendantcount
     */
    public void setDescendantcount(int descendantcount) {
        this.descendantcount = descendantcount;
    }

    /**
     * Gets descendantcount.
     *
     * @return the descendantcount
     */
    public int getDescendantcount() {
        return descendantcount;
    }

    /**
     * Sets descendantsize.
     *
     * @param descendantsize the descendantsize
     */
    public void setDescendantsize(int descendantsize) {
        this.descendantsize = descendantsize;
    }

    /**
     * Gets descendantsize.
     *
     * @return the descendantsize
     */
    public int getDescendantsize() {
        return descendantsize;
    }

    /**
     * Sets descendantfees.
     *
     * @param descendantfees the descendantfees
     */
    public void setDescendantfees(int descendantfees) {
        this.descendantfees = descendantfees;
    }

    /**
     * Gets descendantfees.
     *
     * @return the descendantfees
     */
    public int getDescendantfees() {
        return descendantfees;
    }

    /**
     * Sets ancestorcount.
     *
     * @param ancestorcount the ancestorcount
     */
    public void setAncestorcount(int ancestorcount) {
        this.ancestorcount = ancestorcount;
    }

    /**
     * Gets ancestorcount.
     *
     * @return the ancestorcount
     */
    public int getAncestorcount() {
        return ancestorcount;
    }

    /**
     * Sets ancestorsize.
     *
     * @param ancestorsize the ancestorsize
     */
    public void setAncestorsize(int ancestorsize) {
        this.ancestorsize = ancestorsize;
    }

    /**
     * Gets ancestorsize.
     *
     * @return the ancestorsize
     */
    public int getAncestorsize() {
        return ancestorsize;
    }

    /**
     * Sets ancestorfees.
     *
     * @param ancestorfees the ancestorfees
     */
    public void setAncestorfees(int ancestorfees) {
        this.ancestorfees = ancestorfees;
    }

    /**
     * Gets ancestorfees.
     *
     * @return the ancestorfees
     */
    public int getAncestorfees() {
        return ancestorfees;
    }

    /**
     * Sets wtxid.
     *
     * @param wtxid the wtxid
     */
    public void setWtxid(String wtxid) {
        this.wtxid = wtxid;
    }

    /**
     * Gets wtxid.
     *
     * @return the wtxid
     */
    public String getWtxid() {
        return wtxid;
    }

    /**
     * Sets depends.
     *
     * @param depends the depends
     */
    public void setDepends(List<String> depends) {
        this.depends = depends;
    }

    /**
     * Gets depends.
     *
     * @return the depends
     */
    public List<String> getDepends() {
        return depends;
    }

    /**
     * Sets spentby.
     *
     * @param spentby the spentby
     */
    public void setSpentby(List<String> spentby) {
        this.spentby = spentby;
    }

    /**
     * Gets spentby.
     *
     * @return the spentby
     */
    public List<String> getSpentby() {
        return spentby;
    }

    /**
     * The type Fees.
     */
    public static class Fees {

        /**
         * The Base.
         */
        private double base;
        /**
         * The Modified.
         */
        private double modified;
        /**
         * The Ancestor.
         */
        private double ancestor;
        /**
         * The Descendant.
         */
        private double descendant;

        /**
         * Sets base.
         *
         * @param base the base
         */
        public void setBase(double base) {
            this.base = base;
        }

        /**
         * Gets base.
         *
         * @return the base
         */
        public double getBase() {
            return base;
        }

        /**
         * Sets modified.
         *
         * @param modified the modified
         */
        public void setModified(double modified) {
            this.modified = modified;
        }

        /**
         * Gets modified.
         *
         * @return the modified
         */
        public double getModified() {
            return modified;
        }

        /**
         * Sets ancestor.
         *
         * @param ancestor the ancestor
         */
        public void setAncestor(double ancestor) {
            this.ancestor = ancestor;
        }

        /**
         * Gets ancestor.
         *
         * @return the ancestor
         */
        public double getAncestor() {
            return ancestor;
        }

        /**
         * Sets descendant.
         *
         * @param descendant the descendant
         */
        public void setDescendant(double descendant) {
            this.descendant = descendant;
        }

        /**
         * Gets descendant.
         *
         * @return the descendant
         */
        public double getDescendant() {
            return descendant;
        }

    }
}