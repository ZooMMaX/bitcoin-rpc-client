package ru.zoommax.bitcoin.bitcore25.model.wallet.bumpfee;

import lombok.Setter;

/**
 * The type Output.
 */
@Setter
public class Output {
    /**
     * The Key.
     */
    private String key;
    /**
     * The Value.
     */
    private String value;

    /**
     * Get output object.
     *
     * @return the object
     */
    public Object getOutput(){
        return this;
    }
}
