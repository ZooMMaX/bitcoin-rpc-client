package ru.zoommax.bitcoin.old.api;

import ru.zoommax.bitcoin.JsonRpc20;
import ru.zoommax.bitcoin.JsonRpcClient;
import ru.zoommax.bitcoin.bitcore25.model.useany.BigDecimalValue;
import ru.zoommax.bitcoin.old.model.MiningInfo;
import ru.zoommax.bitcoin.bitcore25.model.useany.StringValue;

import java.math.BigDecimal;

/**
 * The type Mining api.
 */
public class MiningApi extends JsonRpcClient {
    /**
     * Instantiates a new Mining api.
     *
     * @param username the username
     * @param password the password
     * @param url      the url
     */
    public MiningApi(String username, String password, String url) {
        super(username, password, url);
    }

    /**
     * Gets block template.
     *
     * @return the block template
     */
    public String getBlockTemplate() {
        JsonRpc20 json = new JsonRpc20.Builder().setMethod("getblocktemplate").getJson();
        return this.post(json, StringValue.class);
    }

    /**
     * Gets mining info.
     *
     * @return the mining info
     */
    public MiningInfo getMiningInfo() {
        JsonRpc20 json = new JsonRpc20.Builder().setMethod("getmininginfo").getJson();
        return this.post(json, MiningInfo.Result.class);
    }

    /**
     * Gets network hash ps.
     *
     * @param nblock the nblock
     * @param height the height
     * @return the network hash ps
     */
    public BigDecimal getNetworkHashPS(int nblock, int height) {
        JsonRpc20 json = new JsonRpc20.Builder().setMethod("getnetworkhashps").appendParams(nblock).appendParams(height).getJson();
        return this.post(json, BigDecimalValue.class);
    }

    /**
     * Gets network hash ps.
     *
     * @return the network hash ps
     */
    public BigDecimal getNetworkHashPS() {
        JsonRpc20 json = new JsonRpc20.Builder().setMethod("getnetworkhashps").getJson();
        return this.post(json, BigDecimalValue.class);
    }

    /**
     * Prioritise transaction big decimal.
     *
     * @param txid     the txid
     * @param feeDelta the fee delta
     * @return the big decimal
     */
    public BigDecimal prioritiseTransaction(String txid, double feeDelta) {
        JsonRpc20 json = new JsonRpc20.Builder().setMethod("prioritisetransaction").appendParams(txid).appendParams(0).appendParams(feeDelta).getJson();
        return this.post(json, BigDecimalValue.class);
    }

    /**
     * Submit block string.
     *
     * @param hex the hex
     * @return the string
     */
    public String submitBlock(String hex) {
        JsonRpc20 json = new JsonRpc20.Builder().setMethod("submitblock").appendParams(hex).getJson();
        return this.post(json, StringValue.class);
    }

}
