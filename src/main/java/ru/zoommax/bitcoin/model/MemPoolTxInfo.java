package ru.zoommax.bitcoin.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import ru.zoommax.bitcoin.JsonRpcResult;

import java.util.List;
import java.util.Map;

public class MemPoolTxInfo {
    public static class MapResult extends JsonRpcResult<Map<String, MemPoolTxInfo>> {
    }
    public static class Result extends JsonRpcResult<MemPoolTxInfo> {
    }

    private Fees fees;
    private int size;
    private double fee;
    private double modifiedfee;
    private long time;
    private long height;
    private int descendantcount;
    private int descendantsize;
    private int descendantfees;
    private int ancestorcount;
    private int ancestorsize;
    private int ancestorfees;
    private String wtxid;
    private List<String> depends;
    private List<String> spentby;
    private int vsize;
    private int weight;
    @JsonProperty("bip125-replaceable")
    private boolean bip125_replaceable;
    private boolean unbroadcast;

    public void setUnbroadcast(boolean unbroadcast) {
        this.unbroadcast = unbroadcast;
    }

    public boolean getUnbroadcast() {
        return unbroadcast;
    }

    public void setBip125_replaceable(boolean bip125_replaceable) {
        this.bip125_replaceable = bip125_replaceable;
    }

    public boolean getBip125_replaceable() {
        return bip125_replaceable;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    public void setVsize(int vsize) {
        this.vsize = vsize;
    }

    public int getVsize() {
        return vsize;
    }

    public void setFees(Fees fees) {
        this.fees = fees;
    }

    public Fees getFees() {
        return fees;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    public void setFee(double fee) {
        this.fee = fee;
    }

    public double getFee() {
        return fee;
    }

    public void setModifiedfee(double modifiedfee) {
        this.modifiedfee = modifiedfee;
    }

    public double getModifiedfee() {
        return modifiedfee;
    }

    public void setTime(long time) {
        this.time = time;
    }

    public long getTime() {
        return time;
    }

    public void setHeight(long height) {
        this.height = height;
    }

    public long getHeight() {
        return height;
    }

    public void setDescendantcount(int descendantcount) {
        this.descendantcount = descendantcount;
    }

    public int getDescendantcount() {
        return descendantcount;
    }

    public void setDescendantsize(int descendantsize) {
        this.descendantsize = descendantsize;
    }

    public int getDescendantsize() {
        return descendantsize;
    }

    public void setDescendantfees(int descendantfees) {
        this.descendantfees = descendantfees;
    }

    public int getDescendantfees() {
        return descendantfees;
    }

    public void setAncestorcount(int ancestorcount) {
        this.ancestorcount = ancestorcount;
    }

    public int getAncestorcount() {
        return ancestorcount;
    }

    public void setAncestorsize(int ancestorsize) {
        this.ancestorsize = ancestorsize;
    }

    public int getAncestorsize() {
        return ancestorsize;
    }

    public void setAncestorfees(int ancestorfees) {
        this.ancestorfees = ancestorfees;
    }

    public int getAncestorfees() {
        return ancestorfees;
    }

    public void setWtxid(String wtxid) {
        this.wtxid = wtxid;
    }

    public String getWtxid() {
        return wtxid;
    }

    public void setDepends(List<String> depends) {
        this.depends = depends;
    }

    public List<String> getDepends() {
        return depends;
    }

    public void setSpentby(List<String> spentby) {
        this.spentby = spentby;
    }

    public List<String> getSpentby() {
        return spentby;
    }

    public static class Fees {

        private double base;
        private double modified;
        private double ancestor;
        private double descendant;

        public void setBase(double base) {
            this.base = base;
        }

        public double getBase() {
            return base;
        }

        public void setModified(double modified) {
            this.modified = modified;
        }

        public double getModified() {
            return modified;
        }

        public void setAncestor(double ancestor) {
            this.ancestor = ancestor;
        }

        public double getAncestor() {
            return ancestor;
        }

        public void setDescendant(double descendant) {
            this.descendant = descendant;
        }

        public double getDescendant() {
            return descendant;
        }

    }
}