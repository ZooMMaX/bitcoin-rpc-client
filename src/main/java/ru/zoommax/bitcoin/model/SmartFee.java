package ru.zoommax.bitcoin.model;

import ru.zoommax.bitcoin.JsonRpcResult;

public class SmartFee {
    public static class Result extends JsonRpcResult<SmartFee> {
    }

    private double feerate;
    private String[] errors;
    private int blocks;

    public void setFeerate(double feerate) {
        this.feerate = feerate;
    }

    public double getFeerate() {
        return feerate;
    }

    public String[] getErrors() {
        return errors;
    }

    public void setErrors(String[] errors) {
        this.errors = errors;
    }

    public void setBlocks(int blocks) {
        this.blocks = blocks;
    }

    public int getBlocks() {
        return blocks;
    }

}