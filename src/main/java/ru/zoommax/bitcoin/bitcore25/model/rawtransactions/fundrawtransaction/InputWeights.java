package ru.zoommax.bitcoin.bitcore25.model.rawtransactions.fundrawtransaction;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

/**
 * The type Input weights.
 */
@Getter
public class InputWeights {
    /**
     * The Input weights.
     */
    private final List<InputWeight> inputWeights = new ArrayList<>();

    /**
     * Add input weight.
     *
     * @param inputWeight the input weight
     */
    public void addInputWeight(InputWeight inputWeight) {
        this.inputWeights.add(inputWeight);
    }

    /**
     * Add input weight.
     *
     * @param txid   the txid
     * @param vout   the vout
     * @param weight the weight
     */
    public void addInputWeight(String txid, long vout, long weight) {
        InputWeight inputWeight = new InputWeight();
        inputWeight.setTxid(txid);
        inputWeight.setVout(vout);
        inputWeight.setWeight(weight);
        this.inputWeights.add(inputWeight);
    }
}
