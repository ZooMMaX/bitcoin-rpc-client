package ru.zoommax.bitcoin.api;

import ru.zoommax.bitcoin.JsonRpc20;
import ru.zoommax.bitcoin.JsonRpcClient;
import ru.zoommax.bitcoin.model.ArrayValue;

/**
 * The type Generating api.
 */
public class GeneratingApi extends JsonRpcClient {

    /**
     * Instantiates a new Generating api.
     *
     * @param username the username
     * @param password the password
     * @param url      the url
     */
    public GeneratingApi(String username, String password, String url) {
        super(username, password, url);
    }

    /**
     * Generate string [ ].
     *
     * @param count the count
     * @return the string [ ]
     */
    public String[] generate(int count) {
        JsonRpc20 json = new JsonRpc20.Builder().setMethod("generate").appendParams(count).getJson();
        return this.post(json, ArrayValue.StringArray.class);
    }

    /**
     * Generate to address string [ ].
     *
     * @param count   the count
     * @param address the address
     * @return the string [ ]
     */
    public String[] generateToAddress(int count, String address) {
        JsonRpc20 json = new JsonRpc20.Builder().setMethod("generatetoaddress").appendParams(count).appendParams(address).getJson();
        return this.post(json, ArrayValue.StringArray.class);
    }

}
