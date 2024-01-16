package ru.zoommax.bitcoin.api;

import ru.zoommax.bitcoin.JsonRpc20;
import ru.zoommax.bitcoin.JsonRpcClient;
import ru.zoommax.bitcoin.model.ArrayValue;

public class GeneratingApi extends JsonRpcClient {

    public GeneratingApi(String username, String password, String url) {
        super(username, password, url);
    }

    public String[] generate(int count) {
        JsonRpc20 json = new JsonRpc20.Builder().setMethod("generate").appendParams(count).getJson();
        return this.post(json, ArrayValue.StringArray.class);
    }

    public String[] generateToAddress(int count, String address) {
        JsonRpc20 json = new JsonRpc20.Builder().setMethod("generatetoaddress").appendParams(count).appendParams(address).getJson();
        return this.post(json, ArrayValue.StringArray.class);
    }

}
