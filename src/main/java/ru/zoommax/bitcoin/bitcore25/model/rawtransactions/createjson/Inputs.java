package ru.zoommax.bitcoin.bitcore25.model.rawtransactions.createjson;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.ArrayList;
import java.util.List;

/**
 * The type Inputs.
 */
public class Inputs {
    /**
     * The Inputs.
     */
    private List<Input> inputs = new ArrayList<>();

    /**
     * Sets inputs.
     *
     * @param input the input
     */
    public void setInputs(Input input) {
        this.inputs.add(input);
    }

    /**
     * Gets inputs.
     *
     * @return the inputs
     */
    public String getInputs() {
        ObjectMapper mapper = new ObjectMapper();
        return mapper.valueToTree(this.inputs).toString();
    }
}
