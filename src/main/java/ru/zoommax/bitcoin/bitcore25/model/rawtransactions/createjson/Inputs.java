package ru.zoommax.bitcoin.bitcore25.model.rawtransactions.createjson;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.ArrayList;
import java.util.List;

public class Inputs {
    private List<Input> inputs = new ArrayList<>();

    public void setInputs(Input input) {
        this.inputs.add(input);
    }

    public String getInputs() {
        ObjectMapper mapper = new ObjectMapper();
        return mapper.valueToTree(this.inputs).toString();
    }
}
