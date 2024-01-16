package ru.zoommax.bitcoin.api;

import ru.zoommax.bitcoin.JsonRpc20;
import ru.zoommax.bitcoin.JsonRpcClient;
import ru.zoommax.bitcoin.model.BigDecimalValue;
import ru.zoommax.bitcoin.model.MiningInfo;
import ru.zoommax.bitcoin.model.StringValue;

import java.math.BigDecimal;

public class MiningApi extends JsonRpcClient {
    public MiningApi(String username, String password, String url) {
        super(username, password, url);
    }

    public String getBlockTemplate() {
        JsonRpc20 json = new JsonRpc20.Builder().setMethod("getblocktemplate").getJson();
        return this.post(json, StringValue.class);
    }

    public MiningInfo getMiningInfo() {
        JsonRpc20 json = new JsonRpc20.Builder().setMethod("getmininginfo").getJson();
        return this.post(json, MiningInfo.Result.class);
    }

    public BigDecimal getNetworkHashPS(int nblock, int height) {
        JsonRpc20 json = new JsonRpc20.Builder().setMethod("getnetworkhashps").appendParams(nblock).appendParams(height).getJson();
        return this.post(json, BigDecimalValue.class);
    }

    public BigDecimal getNetworkHashPS() {
        JsonRpc20 json = new JsonRpc20.Builder().setMethod("getnetworkhashps").getJson();
        return this.post(json, BigDecimalValue.class);
    }

    public BigDecimal prioritiseTransaction(String txid, double feeDelta) {
        JsonRpc20 json = new JsonRpc20.Builder().setMethod("prioritisetransaction").appendParams(txid).appendParams(0).appendParams(feeDelta).getJson();
        return this.post(json, BigDecimalValue.class);
    }

    public String submitBlock(String hex) {
        JsonRpc20 json = new JsonRpc20.Builder().setMethod("submitblock").appendParams(hex).getJson();
        return this.post(json, StringValue.class);
    }

}
