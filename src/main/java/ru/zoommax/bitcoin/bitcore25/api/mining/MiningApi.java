package ru.zoommax.bitcoin.bitcore25.api.mining;

import org.jetbrains.annotations.Nullable;

import ru.zoommax.bitcoin.JsonRpc20;
import ru.zoommax.bitcoin.JsonRpcClient;
import ru.zoommax.bitcoin.annotation.ErrorBody;
import ru.zoommax.bitcoin.bitcore25.model.mining.MiningInfo;
import ru.zoommax.bitcoin.bitcore25.model.mining.blocktemplate.BlockTemplate;
import ru.zoommax.bitcoin.bitcore25.model.useany.BooleanValue;
import ru.zoommax.bitcoin.bitcore25.model.useany.LongValue;
import ru.zoommax.bitcoin.bitcore25.model.useany.StringValue;

/**
 * The type Mining api.
 */
@ErrorBody
public class MiningApi extends JsonRpcClient {

    /**
     * Instantiates a new Mining api.
     *
     * @param username the username
     * @param password the password
     * @param url      the url
     */
    public MiningApi(String username, String password, String url){
		super(username, password, url);
	}

    /**
     * Gets block template.
     *
     * @return the block template
     */
    public String getBlockTemplate() {
		return this.post(new JsonRpc20.Builder().setMethod("getblocktemplate").getJson(), StringValue.class);
	}

    /**
     * Gets block template.
     *
     * @param template_request the template request
     * @return the block template
     */
    public BlockTemplate getBlockTemplate(String template_request) {
		return this.post(new JsonRpc20.Builder().setMethod("getblocktemplate").appendParams(template_request).getJson(), BlockTemplate.Result.class);
	}

    /**
     * Gets mining info.
     *
     * @return the mining info
     */
    public MiningInfo getMiningInfo() {
		return this.post(new JsonRpc20.Builder().setMethod("getmininginfo").getJson(), MiningInfo.Result.class);
	}

    /**
     * Gets network hashps.
     *
     * @return the network hashps
     */
    public Long getNetworkHashps() {
		return this.post(new JsonRpc20.Builder().setMethod("getnetworkhashps").getJson(), LongValue.class);
	}

    /**
     * Gets network hashps.
     *
     * @param nblocks the nblocks
     * @param height  the height
     * @return the network hashps
     */
    public Long getNetworkHashps(long nblocks, long height) {
		return this.post(new JsonRpc20.Builder().setMethod("getnetworkhashps").appendParams(nblocks).appendParams(height).getJson(), LongValue.class);
	}

    /**
     * Prioritisetransaction boolean.
     *
     * @param txid      the txid
     * @param fee_delta the fee delta
     * @return the boolean
     */
    public Boolean prioritisetransaction(String txid, long fee_delta) {
		return this.post(new JsonRpc20.Builder().setMethod("prioritisetransaction").appendParams(txid).appendParams(0L).appendParams(fee_delta).getJson(), BooleanValue.class);
	}

    /**
     * Submit block string.
     *
     * @param hexdata the hexdata
     * @return the string
     */
    public @Nullable String submitBlock(String hexdata) {
		return this.post(new JsonRpc20.Builder().setMethod("submitblock").appendParams(hexdata).getJson(), StringValue.class);
	}

    /**
     * Submitheader string.
     *
     * @param hexdata the hexdata
     * @return the string
     */
    public @Nullable String submitheader(String hexdata) { // The result of this method always NULL!
		return this.post(new JsonRpc20.Builder().setMethod("submitheader").appendParams(hexdata).getJson(), StringValue.class);
	}

}
