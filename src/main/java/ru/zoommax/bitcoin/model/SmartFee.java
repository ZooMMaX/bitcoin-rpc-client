package ru.zoommax.bitcoin.model;

import ru.zoommax.bitcoin.JsonRpcResult;

/**
 * The type Smart fee.
 */
public class SmartFee {
    /**
     * The type Result.
     */
    public static class Result extends JsonRpcResult<SmartFee> {
    }

    /**
     * The Feerate.
     */
    private double feerate;
    /**
     * The Errors.
     */
    private String[] errors;
    /**
     * The Blocks.
     */
    private int blocks;

    /**
     * Sets feerate.
     *
     * @param feerate the feerate
     */
    public void setFeerate(double feerate) {
        this.feerate = feerate;
    }

    /**
     * Gets feerate.
     *
     * @return the feerate
     */
    public double getFeerate() {
        return feerate;
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

    /**
     * Sets blocks.
     *
     * @param blocks the blocks
     */
    public void setBlocks(int blocks) {
        this.blocks = blocks;
    }

    /**
     * Gets blocks.
     *
     * @return the blocks
     */
    public int getBlocks() {
        return blocks;
    }

}