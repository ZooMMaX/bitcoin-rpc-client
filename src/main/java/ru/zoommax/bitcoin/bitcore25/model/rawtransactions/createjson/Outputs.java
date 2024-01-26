package ru.zoommax.bitcoin.bitcore25.model.rawtransactions.createjson;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * The type Outputs.
 */
@Getter
@Setter
public class Outputs {
    /**
     * The Addrs.
     */
    private HashMap<String, Object> addrs = new HashMap<>();
    /**
     * The Datas.
     */
    private HashMap<String, Object> datas = new HashMap<>();

    /**
     * Add output.
     *
     * @param address the address
     * @param amount  the amount
     * @param data    the data
     * @param hex     the hex
     */
    public void addOutput(@NonNull String address, double amount, @NonNull String data, @NonNull String hex) {
        addrs.put(address, amount);
        datas.put(data, hex);
    }

    /**
     * Gets outputs.
     *
     * @return the outputs
     */
    public String getOutputs() {
        List<HashMap<String, Object>> outputs = new ArrayList<>();
        outputs.add(addrs);
        outputs.add(datas);
        ObjectMapper mapper = new ObjectMapper();
        return mapper.valueToTree(outputs).toString();
    }
}
