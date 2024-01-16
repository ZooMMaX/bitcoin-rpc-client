package ru.zoommax.bitcoin.api;

import ru.zoommax.bitcoin.JsonRpc20;
import ru.zoommax.bitcoin.JsonRpcClient;
import ru.zoommax.bitcoin.annotation.NoComplete;
import ru.zoommax.bitcoin.model.*;

import java.util.Map;

public class RawTransactionsApi extends JsonRpcClient {

    public RawTransactionsApi(String username, String password, String url) {
        super(username, password, url);
    }

    // combinepsbt ["psbt",...]

    /**
     * @param psbt (string) A base64 string of a PSBT
     */
    @NoComplete
    public void combinePSBT(String... psbt) {
        JsonRpc20 json = new JsonRpc20.Builder().setMethod("combinepsbt").appendParams(psbt).getJson();
        this.post(json, StringValue.class);
    }

    //converttopsbt "hexstring" ( permitsigdata iswitness )

    /**
     * @param hexstring The hex string of a raw transaction
     * @return
     */
    @NoComplete
    public void convertToPSBT(String hexstring, boolean permitsigdata, boolean iswitness) {
        JsonRpc20 json = new JsonRpc20.Builder().setMethod("converttopsbt").appendParams(hexstring).getJson();
        this.post(json, StringValue.class);
    }

    @NoComplete
    public String createPSBT(TransactionInput[] input, TransactionOutput[] outputs) {
        return this.createPSBT(input, outputs, 0, false);
    }

    //createpsbt [{"txid":"id","vout":n},...] [{"address":amount},{"data":"hex"},...] ( locktime ) ( replaceable )

    /**
     * @param input
     * @param outputs
     * @param locktime
     * @param replaceable
     * @return hex
     */
    @NoComplete
    public String createPSBT(TransactionInput[] input, TransactionOutput[] outputs, int locktime, boolean replaceable) {
        Map<String, ?>[] map = TransactionOutput.toSingleMaps(outputs);
        JsonRpc20 json = new JsonRpc20.Builder().setMethod("createpsbt").appendParams(input).appendParams(map).getJson();
        return this.post(json, StringValue.class);
    }

    //decodepsbt "psbt"

    /**
     * @param psbt The PSBT base64 string
     * @return
     */
    @NoComplete
    public String decodePSBT(String psbt) {
        JsonRpc20 json = new JsonRpc20.Builder().setMethod("decodepsbt").appendParams(psbt).getJson();
        return this.post(json, StringValue.class);
    }

    //finalizepsbt "psbt" ( extract )
    @NoComplete
    public String finalizePSBT(String psbt) {
        return this.finalizePSBT(psbt, null);
    }

    public String finalizePSBT(String psbt, String extract) {
        JsonRpc20 json = new JsonRpc20.Builder().setMethod("finalizepsbt").appendParams(psbt).appendParams(extract).getJson();
        return this.post(json, StringValue.class);
    }

    // combinerawtransaction ["hexstring",...]

    /**
     * @param hexstring (string) A transaction hexstring
     * @return hex-encoded raw transaction
     */
    public String combineRawTransaction(String... hexstring) {
        JsonRpc20 json = new JsonRpc20.Builder().setMethod("combinerawtransaction").appendParams(hexstring).getJson();
        return this.post(json, StringValue.class);
    }

    /**
     * @param input
     * @param outputs
     * @return base64hex
     */
    public String createRawTransaction(TransactionInput[] input, TransactionOutput[] outputs) {
        return createRawTransaction(input, outputs, 0, false);
    }

    //createrawtransaction [{"txid":"id","vout":n},...] [{"address":amount},{"data":"hex"},...] ( locktime ) ( replaceable )

    /**
     * @param input
     * @param outputs
     * @param locktime
     * @param replaceable
     * @return hex
     */
    public String createRawTransaction(TransactionInput[] input, TransactionOutput[] outputs, int locktime, boolean replaceable) {
        Map<String, ?>[] out = TransactionOutput.toSingleMaps(outputs);
        JsonRpc20 json = new JsonRpc20.Builder().setMethod("createrawtransaction")
                .appendParams(input)
                .appendParams(out)
                .appendParams(locktime).appendParams(replaceable).getJson();
        return this.post(json, StringValue.class);
    }

    //decoderawtransaction "hexstring" ( iswitness )
    public RawTransaction decodeRawTransaction(String hexstring, boolean iswitness) {
        JsonRpc20 json = new JsonRpc20.Builder().setMethod("decoderawtransaction").appendParams(hexstring).appendParams(iswitness).getJson();
        return this.post(json, RawTransaction.Result.class);
    }

    //decodescript "hexstring"
    public ScriptPubKey decodeScript(String hexstring) {
        JsonRpc20 json = new JsonRpc20.Builder().setMethod("decodescript").appendParams(hexstring).getJson();
        return this.post(json, ScriptPubKey.Result.class);
    }

    //fundrawtransaction "hexstring" ( options iswitness )
    public void fundRawTransaction(String hexstring) {
        JsonRpc20 json = new JsonRpc20.Builder().setMethod("fundrawtransaction").appendParams(hexstring).getJson();
        this.post(json, StringValue.class);
    }

    //getrawtransaction "txid" ( verbose "blockhash" )
    public RawTransaction getRawTransaction(String txid) {
        boolean verbose = true;
        JsonRpc20 json = new JsonRpc20.Builder().setMethod("getrawtransaction").appendParams(txid).appendParams(verbose).getJson();
        return this.post(json, RawTransaction.Result.class);
    }

    public String getRawTransactionHex(String txid) {
        boolean verbose = false;
        JsonRpc20 json = new JsonRpc20.Builder().setMethod("getrawtransaction").appendParams(txid).appendParams(verbose).getJson();
        return this.post(json, StringValue.class);
    }

    //sendrawtransaction "hexstring" ( allowhighfees )
    public String sendRawTransaction(String hexstring) {
        return this.sendRawTransaction(hexstring, false);
    }

    public String sendRawTransaction(String hexstring, boolean allowhighfees) {
        JsonRpc20 json = new JsonRpc20.Builder().setMethod("sendrawtransaction").appendParams(hexstring).appendParams(allowhighfees).getJson();
        return this.post(json, StringValue.class);
    }

    //signrawtransaction "hexstring" ( [{"txid":"id","vout":n,"scriptPubKey":"hex","redeemScript":"hex"},...] ["privatekey1",...] sighashtype )
    public TransactionSign signRawTransaction(String hexstring) {
        JsonRpc20 json = new JsonRpc20.Builder().setMethod("signrawtransaction").appendParams(hexstring).getJson();
        return this.post(json, TransactionSign.Result.class);
    }

    //signrawtransactionwithkey "hexstring" ["privatekey1",...] ( [{"txid":"id","vout":n,"scriptPubKey":"hex","redeemScript":"hex"},...] sighashtype )
    public String signRawTransactionWithKey(String hexstring, String... privkeys) {
        JsonRpc20 json = new JsonRpc20.Builder().setMethod("signrawtransactionwithkey").appendParams(hexstring).appendParams(privkeys).getJson();
        return this.post(json, StringValue.class);
    }

    //testmempoolaccept ["rawtxs"] ( allowhighfees )
    public PoolAccept testMemPoolAccept(String rawtxs) {
        JsonRpc20 json = new JsonRpc20.Builder().setMethod("testmempoolaccept").appendParams(new String[]{rawtxs}).getJson();
        return this.post(json, PoolAccept.Result.class)[0];
    }

}
