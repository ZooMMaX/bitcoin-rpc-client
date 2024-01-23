package ru.zoommax.bitcoin.old.api;

import ru.zoommax.bitcoin.JsonRpc20;
import ru.zoommax.bitcoin.JsonRpcClient;
import ru.zoommax.bitcoin.annotation.NoComplete;
import ru.zoommax.bitcoin.bitcore25.model.useany.StringValue;
import ru.zoommax.bitcoin.old.model.*;

import java.util.Map;

/**
 * The type Raw transactions api.
 */
public class RawTransactionsApi extends JsonRpcClient {

    /**
     * Instantiates a new Raw transactions api.
     *
     * @param username the username
     * @param password the password
     * @param url      the url
     */
    public RawTransactionsApi(String username, String password, String url) {
        super(username, password, url);
    }

    // combinepsbt ["psbt",...]

    /**
     * Combine psbt.
     *
     * @param psbt the psbt
     */
    @NoComplete
    public void combinePSBT(String... psbt) {
        JsonRpc20 json = new JsonRpc20.Builder().setMethod("combinepsbt").appendParams(psbt).getJson();
        this.post(json, StringValue.class);
    }

    //converttopsbt "hexstring" ( permitsigdata iswitness )

    /**
     * Convert to psbt.
     *
     * @param hexstring     the hexstring
     * @param permitsigdata the permitsigdata
     * @param iswitness     the iswitness
     */
    @NoComplete
    public void convertToPSBT(String hexstring, boolean permitsigdata, boolean iswitness) {
        JsonRpc20 json = new JsonRpc20.Builder().setMethod("converttopsbt").appendParams(hexstring).getJson();
        this.post(json, StringValue.class);
    }

    /**
     * Create psbt string.
     *
     * @param input   the input
     * @param outputs the outputs
     * @return the string
     */
    @NoComplete
    public String createPSBT(TransactionInput[] input, TransactionOutput[] outputs) {
        return this.createPSBT(input, outputs, 0, false);
    }

    //createpsbt [{"txid":"id","vout":n},...] [{"address":amount},{"data":"hex"},...] ( locktime ) ( replaceable )

    /**
     * Create psbt string.
     *
     * @param input       the input
     * @param outputs     the outputs
     * @param locktime    the locktime
     * @param replaceable the replaceable
     * @return the string
     */
    @NoComplete
    public String createPSBT(TransactionInput[] input, TransactionOutput[] outputs, int locktime, boolean replaceable) {
        Map<String, ?>[] map = TransactionOutput.toSingleMaps(outputs);
        JsonRpc20 json = new JsonRpc20.Builder().setMethod("createpsbt").appendParams(input).appendParams(map).getJson();
        return this.post(json, StringValue.class);
    }

    //decodepsbt "psbt"

    /**
     * Decode psbt string.
     *
     * @param psbt the psbt
     * @return the string
     */
    @NoComplete
    public String decodePSBT(String psbt) {
        JsonRpc20 json = new JsonRpc20.Builder().setMethod("decodepsbt").appendParams(psbt).getJson();
        return this.post(json, StringValue.class);
    }

    /**
     * Finalize psbt string.
     *
     * @param psbt the psbt
     * @return the string
     */
//finalizepsbt "psbt" ( extract )
    @NoComplete
    public String finalizePSBT(String psbt) {
        return this.finalizePSBT(psbt, null);
    }

    /**
     * Finalize psbt string.
     *
     * @param psbt    the psbt
     * @param extract the extract
     * @return the string
     */
    public String finalizePSBT(String psbt, String extract) {
        JsonRpc20 json = new JsonRpc20.Builder().setMethod("finalizepsbt").appendParams(psbt).appendParams(extract).getJson();
        return this.post(json, StringValue.class);
    }

    // combinerawtransaction ["hexstring",...]

    /**
     * Combine raw transaction string.
     *
     * @param hexstring the hexstring
     * @return the string
     */
    public String combineRawTransaction(String... hexstring) {
        JsonRpc20 json = new JsonRpc20.Builder().setMethod("combinerawtransaction").appendParams(hexstring).getJson();
        return this.post(json, StringValue.class);
    }

    /**
     * Create raw transaction string.
     *
     * @param input   the input
     * @param outputs the outputs
     * @return the string
     */
    public String createRawTransaction(TransactionInput[] input, TransactionOutput[] outputs) {
        return createRawTransaction(input, outputs, 0, false);
    }

    //createrawtransaction [{"txid":"id","vout":n},...] [{"address":amount},{"data":"hex"},...] ( locktime ) ( replaceable )

    /**
     * Create raw transaction string.
     *
     * @param input       the input
     * @param outputs     the outputs
     * @param locktime    the locktime
     * @param replaceable the replaceable
     * @return the string
     */
    public String createRawTransaction(TransactionInput[] input, TransactionOutput[] outputs, int locktime, boolean replaceable) {
        Map<String, ?>[] out = TransactionOutput.toSingleMaps(outputs);
        JsonRpc20 json = new JsonRpc20.Builder().setMethod("createrawtransaction")
                .appendParams(input)
                .appendParams(out)
                .appendParams(locktime).appendParams(replaceable).getJson();
        return this.post(json, StringValue.class);
    }

    /**
     * Decode raw transaction raw transaction.
     *
     * @param hexstring the hexstring
     * @param iswitness the iswitness
     * @return the raw transaction
     */
//decoderawtransaction "hexstring" ( iswitness )
    public RawTransaction decodeRawTransaction(String hexstring, boolean iswitness) {
        JsonRpc20 json = new JsonRpc20.Builder().setMethod("decoderawtransaction").appendParams(hexstring).appendParams(iswitness).getJson();
        return this.post(json, RawTransaction.Result.class);
    }

    /**
     * Decode script script pub key.
     *
     * @param hexstring the hexstring
     * @return the script pub key
     */
//decodescript "hexstring"
    public ScriptPubKey decodeScript(String hexstring) {
        JsonRpc20 json = new JsonRpc20.Builder().setMethod("decodescript").appendParams(hexstring).getJson();
        return this.post(json, ScriptPubKey.Result.class);
    }

    /**
     * Fund raw transaction.
     *
     * @param hexstring the hexstring
     */
//fundrawtransaction "hexstring" ( options iswitness )
    public void fundRawTransaction(String hexstring) {
        JsonRpc20 json = new JsonRpc20.Builder().setMethod("fundrawtransaction").appendParams(hexstring).getJson();
        this.post(json, StringValue.class);
    }

    /**
     * Gets raw transaction.
     *
     * @param txid the txid
     * @return the raw transaction
     */
//getrawtransaction "txid" ( verbose "blockhash" )
    public RawTransaction getRawTransaction(String txid) {
        boolean verbose = true;
        JsonRpc20 json = new JsonRpc20.Builder().setMethod("getrawtransaction").appendParams(txid).appendParams(verbose).getJson();
        return this.post(json, RawTransaction.Result.class);
    }

    /**
     * Gets raw transaction hex.
     *
     * @param txid the txid
     * @return the raw transaction hex
     */
    public String getRawTransactionHex(String txid) {
        boolean verbose = false;
        JsonRpc20 json = new JsonRpc20.Builder().setMethod("getrawtransaction").appendParams(txid).appendParams(verbose).getJson();
        return this.post(json, StringValue.class);
    }

    /**
     * Send raw transaction string.
     *
     * @param hexstring the hexstring
     * @return the string
     */
//sendrawtransaction "hexstring" ( allowhighfees )
    public String sendRawTransaction(String hexstring) {
        return this.sendRawTransaction(hexstring, false);
    }

    /**
     * Send raw transaction string.
     *
     * @param hexstring     the hexstring
     * @param allowhighfees the allowhighfees
     * @return the string
     */
    public String sendRawTransaction(String hexstring, boolean allowhighfees) {
        JsonRpc20 json = new JsonRpc20.Builder().setMethod("sendrawtransaction").appendParams(hexstring).appendParams(allowhighfees).getJson();
        return this.post(json, StringValue.class);
    }

    /**
     * Sign raw transaction transaction sign.
     *
     * @param hexstring the hexstring
     * @return the transaction sign
     */
//signrawtransaction "hexstring" ( [{"txid":"id","vout":n,"scriptPubKey":"hex","redeemScript":"hex"},...] ["privatekey1",...] sighashtype )
    public TransactionSign signRawTransaction(String hexstring) {
        JsonRpc20 json = new JsonRpc20.Builder().setMethod("signrawtransaction").appendParams(hexstring).getJson();
        return this.post(json, TransactionSign.Result.class);
    }

    /**
     * Sign raw transaction with key string.
     *
     * @param hexstring the hexstring
     * @param privkeys  the privkeys
     * @return the string
     */
//signrawtransactionwithkey "hexstring" ["privatekey1",...] ( [{"txid":"id","vout":n,"scriptPubKey":"hex","redeemScript":"hex"},...] sighashtype )
    public String signRawTransactionWithKey(String hexstring, String... privkeys) {
        JsonRpc20 json = new JsonRpc20.Builder().setMethod("signrawtransactionwithkey").appendParams(hexstring).appendParams(privkeys).getJson();
        return this.post(json, StringValue.class);
    }

    /**
     * Test mem pool accept pool accept.
     *
     * @param rawtxs the rawtxs
     * @return the pool accept
     */
//testmempoolaccept ["rawtxs"] ( allowhighfees )
    public PoolAccept testMemPoolAccept(String rawtxs) {
        JsonRpc20 json = new JsonRpc20.Builder().setMethod("testmempoolaccept").appendParams(new String[]{rawtxs}).getJson();
        return this.post(json, PoolAccept.Result.class)[0];
    }

}
