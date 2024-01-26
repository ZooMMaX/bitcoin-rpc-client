package ru.zoommax.bitcoin.bitcore25.model.rawtransactions.createjson;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Getter
@Setter
public class Outputs {
    private HashMap<String, Object> addrs = new HashMap<>();
    private HashMap<String, Object> datas = new HashMap<>();

    public void addOutput(@NonNull String address, double amount, @NonNull String data, @NonNull String hex) {
        addrs.put(address, amount);
        datas.put(data, hex);
    }

    public String getOutputs() {
        List<HashMap<String, Object>> outputs = new ArrayList<>();
        outputs.add(addrs);
        outputs.add(datas);
        ObjectMapper mapper = new ObjectMapper();
        return mapper.valueToTree(outputs).toString();
    }
}
