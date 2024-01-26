package ru.zoommax.bitcoin.bitcore25.model.rawtransactions.fundrawtransaction;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
public class InputWeights {
    private final List<InputWeight> inputWeights = new ArrayList<>();

    public void addInputWeight(InputWeight inputWeight) {
        this.inputWeights.add(inputWeight);
    }

    public void addInputWeight(String txid, long vout, long weight) {
        InputWeight inputWeight = new InputWeight();
        inputWeight.setTxid(txid);
        inputWeight.setVout(vout);
        inputWeight.setWeight(weight);
        this.inputWeights.add(inputWeight);
    }
}
