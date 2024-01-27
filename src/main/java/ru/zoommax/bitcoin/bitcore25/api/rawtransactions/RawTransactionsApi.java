package ru.zoommax.bitcoin.bitcore25.api.rawtransactions;

import com.fasterxml.jackson.databind.ObjectMapper;

import ru.zoommax.bitcoin.JsonRpc20;
import ru.zoommax.bitcoin.JsonRpcClient;
import ru.zoommax.bitcoin.bitcore25.model.rawtransactions.CreatePsbt;
import ru.zoommax.bitcoin.bitcore25.model.rawtransactions.CreateRawTransaction;
import ru.zoommax.bitcoin.bitcore25.model.rawtransactions.FinalizedPSBT;
import ru.zoommax.bitcoin.bitcore25.model.rawtransactions.FundResult;
import ru.zoommax.bitcoin.bitcore25.model.rawtransactions.TestMempool;
import ru.zoommax.bitcoin.bitcore25.model.rawtransactions.decodepsbt.DecodedPSBT;
import ru.zoommax.bitcoin.bitcore25.model.rawtransactions.decodescript.DecodedScript;
import ru.zoommax.bitcoin.bitcore25.model.rawtransactions.fundrawtransaction.Options;
import ru.zoommax.bitcoin.bitcore25.model.rawtransactions.psbt.PSBT;
import ru.zoommax.bitcoin.bitcore25.model.rawtransactions.signrawwithkey.SignRawTransactionWithKey;
import ru.zoommax.bitcoin.bitcore25.model.rawtransactions.utxoupdatepsbt.Descriptors;
import ru.zoommax.bitcoin.bitcore25.model.useany.StringValue;
import ru.zoommax.bitcoin.bitcore25.model.useany.decoderawtransaction.DecodedRawTransaction;

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
	public RawTransactionsApi(String username, String password, String url){
		super(username, password, url);
	}

	/**
	 * Analyze psbt psbt.
	 *
	 * @param psbt the psbt
	 * @return the psbt
	 */
	public PSBT analyzePsbt(String psbt) {
		return this.post(new JsonRpc20.Builder().setMethod("analyzepsbt").appendParams(psbt).getJson(), PSBT.Result.class);
	}

	/**
	 * Combine psbt string.
	 *
	 * @param txs the txs
	 * @return the string
	 */
	public String combinePsbt(String[] txs) {
		final ObjectMapper mapper = new ObjectMapper();
		final String json = mapper.valueToTree(txs).toString();
		return this.post(new JsonRpc20.Builder().setMethod("combinepsbt").appendParams(json).getJson(), StringValue.class);
	}

	/**
	 * Combine raw transaction string.
	 *
	 * @param txs the txs
	 * @return the string
	 */
	public String combineRawTransaction(String[] txs) {
		final ObjectMapper mapper = new ObjectMapper();
		final String json = mapper.valueToTree(txs).toString();
		return this.post(new JsonRpc20.Builder().setMethod("combinerawtransaction").appendParams(json).getJson(), StringValue.class);
	}

	/**
	 * Convert to psbt string.
	 *
	 * @param hex the hex
	 * @return the string
	 */
	public String convertToPsbt(String hex) {
		return this.post(new JsonRpc20.Builder().setMethod("converttopsbt").appendParams(hex).getJson(), StringValue.class);
	}

	/**
	 * Convert to psbt string.
	 *
	 * @param hex           the hex
	 * @param permitSigData the permit sig data
	 * @return the string
	 */
	public String convertToPsbt(String hex, boolean permitSigData) {
		return this.post(new JsonRpc20.Builder().setMethod("converttopsbt").appendParams(hex).appendParams(permitSigData).getJson(), StringValue.class);
	}

	/**
	 * Convert to psbt string.
	 *
	 * @param hex           the hex
	 * @param permitSigData the permit sig data
	 * @param isWitness     the is witness
	 * @return the string
	 */
	public String convertToPsbt(String hex, boolean permitSigData, boolean isWitness) {
		return this.post(new JsonRpc20.Builder().setMethod("converttopsbt").appendParams(hex).appendParams(permitSigData).appendParams(isWitness).getJson(), StringValue.class);
	}

	/**
	 * Create psbt string.
	 *
	 * @param args the args
	 * @return the string
	 */
	public String createPsbt(CreatePsbt args) {
		return this.post(new JsonRpc20.Builder().setMethod("createpsbt").appendParams(args.getInputs()).appendParams(args.getOutputs()).getJson(), StringValue.class);
	}

	/**
	 * Create psbt string.
	 *
	 * @param args     the args
	 * @param lockTime the lock time
	 * @return the string
	 */
	public String createPsbt(CreatePsbt args, long lockTime) {
		return this.post(new JsonRpc20.Builder().setMethod("createpsbt").appendParams(args.getInputs()).appendParams(args.getOutputs()).appendParams(lockTime).getJson(), StringValue.class);
	}

	/**
	 * Create psbt string.
	 *
	 * @param args        the args
	 * @param lockTime    the lock time
	 * @param replaceable the replaceable
	 * @return the string
	 */
	public String createPsbt(CreatePsbt args, long lockTime, boolean replaceable) {
		return this.post(new JsonRpc20.Builder().setMethod("createpsbt").appendParams(args.getInputs()).appendParams(args.getOutputs()).appendParams(lockTime).appendParams(replaceable).getJson(), StringValue.class);
	}

	/**
	 * Create raw transaction string.
	 *
	 * @param args the args
	 * @return the string
	 */
	public String createRawTransaction(CreateRawTransaction args) {
		return this.post(new JsonRpc20.Builder().setMethod("createrawtransaction").appendParams(args.getInputs()).appendParams(args.getOutputs()).getJson(), StringValue.class);
	}

	/**
	 * Create raw transaction string.
	 *
	 * @param args     the args
	 * @param lockTime the lock time
	 * @return the string
	 */
	public String createRawTransaction(CreateRawTransaction args, long lockTime) {
		return this.post(new JsonRpc20.Builder().setMethod("createrawtransaction").appendParams(args.getInputs()).appendParams(args.getOutputs()).appendParams(lockTime).getJson(), StringValue.class);
	}

	/**
	 * Create raw transaction string.
	 *
	 * @param args        the args
	 * @param lockTime    the lock time
	 * @param replaceable the replaceable
	 * @return the string
	 */
	public String createRawTransaction(CreateRawTransaction args, long lockTime, boolean replaceable) {
		return this.post(new JsonRpc20.Builder().setMethod("createrawtransaction").appendParams(args.getInputs()).appendParams(args.getOutputs()).appendParams(lockTime).appendParams(replaceable).getJson(), StringValue.class);
	}

	/**
	 * Decode psbt decoded psbt.
	 *
	 * @param psbt the psbt
	 * @return the decoded psbt
	 */
	public DecodedPSBT decodePsbt(String psbt) {
		return this.post(new JsonRpc20.Builder().setMethod("decodepsbt").appendParams(psbt).getJson(), DecodedPSBT.Result.class);
	}

	/**
	 * Decode raw transaction decoded raw transaction.
	 *
	 * @param hex the hex
	 * @return the decoded raw transaction
	 */
	public DecodedRawTransaction decodeRawTransaction(String hex) {
		return this.post(new JsonRpc20.Builder().setMethod("decoderawtransaction").appendParams(hex).getJson(), DecodedRawTransaction.Result.class);
	}

	/**
	 * Decode raw transaction decoded raw transaction.
	 *
	 * @param hex       the hex
	 * @param isWitness the is witness
	 * @return the decoded raw transaction
	 */
	public DecodedRawTransaction decodeRawTransaction(String hex, boolean isWitness) {
		return this.post(new JsonRpc20.Builder().setMethod("decoderawtransaction").appendParams(hex).appendParams(isWitness).getJson(), DecodedRawTransaction.Result.class);
	}

	/**
	 * Decode script decoded script.
	 *
	 * @param hex the hex
	 * @return the decoded script
	 */
	public DecodedScript decodeScript(String hex) {
		return this.post(new JsonRpc20.Builder().setMethod("decodescript").appendParams(hex).getJson(), DecodedScript.Result.class);
	}

	/**
	 * Finalizepsbt finalized psbt.
	 *
	 * @param psbt the psbt
	 * @return the finalized psbt
	 */
	public FinalizedPSBT finalizepsbt(String psbt) {
		return this.post(new JsonRpc20.Builder().setMethod("finalizepsbt").appendParams(psbt).getJson(), FinalizedPSBT.Result.class);
	}

	/**
	 * Finalizepsbt finalized psbt.
	 *
	 * @param psbt    the psbt
	 * @param extract the extract
	 * @return the finalized psbt
	 */
	public FinalizedPSBT finalizepsbt(String psbt, boolean extract) {
		return this.post(new JsonRpc20.Builder().setMethod("finalizepsbt").appendParams(psbt).appendParams(extract).getJson(), FinalizedPSBT.Result.class);
	}

	/**
	 * Fund raw transaction fund result.
	 *
	 * @param hex the hex
	 * @return the fund result
	 */
	public FundResult fundRawTransaction(String hex) {
		return this.post(new JsonRpc20.Builder().setMethod("fundrawtransaction").appendParams(hex).getJson(), FundResult.Result.class);
	}

	/**
	 * Fund raw transaction fund result.
	 *
	 * @param hex       the hex
	 * @param options   the options
	 * @param isWitness the is witness
	 * @return the fund result
	 */
	public FundResult fundRawTransaction(String hex, Options options, boolean isWitness) {
		final ObjectMapper mapper = new ObjectMapper();
		final String json = mapper.valueToTree(options).toString();
		return this.post(new JsonRpc20.Builder().setMethod("fundrawtransaction").appendParams(hex).appendParams(json).appendParams(isWitness).getJson(), FundResult.Result.class);
	}

	/**
	 * Gets raw transaction v 0.
	 *
	 * @param txid the txid
	 * @return the raw transaction v 0
	 */
	// make verbosity=1 and verbosity=2
	public String getRawTransactionV0(String txid) {
		return this.post(new JsonRpc20.Builder().setMethod("getrawtransaction").appendParams(txid).getJson(), StringValue.class);
	}

	/**
	 * Join psbts string.
	 *
	 * @param txs the txs
	 * @return the string
	 */
	public String joinPsbts(String[] txs) {
		return this.post(new JsonRpc20.Builder().setMethod("joinpsbts").appendParams(txs).getJson(), StringValue.class);
	}

	/**
	 * Send raw transaction string.
	 *
	 * @param hex the hex
	 * @return the string
	 */
	public String sendRawTransaction(String hex) {
		return this.post(new JsonRpc20.Builder().setMethod("sendrawtransaction").appendParams(hex).getJson(), StringValue.class);
	}

	/**
	 * Send raw transaction string.
	 *
	 * @param hex           the hex
	 * @param maxFeeRate    the max fee rate
	 * @param maxBurnAmount the max burn amount
	 * @return the string
	 */
	public String sendRawTransaction(String hex, double maxFeeRate, double maxBurnAmount) {
		return this.post(new JsonRpc20.Builder().setMethod("sendrawtransaction").appendParams(hex).appendParams(maxFeeRate).appendParams(maxBurnAmount).getJson(), StringValue.class);
	}

	/**
	 * Sign raw transaction with key sign raw transaction with key.
	 *
	 * @param hex      the hex
	 * @param privKeys the priv keys
	 * @return the sign raw transaction with key
	 */
	public SignRawTransactionWithKey signRawTransactionWithKey(String hex, String[] privKeys) {
		return this.post(new JsonRpc20.Builder().setMethod("signrawtransactionwithkey").appendParams(hex).appendParams(privKeys).getJson(), SignRawTransactionWithKey.Result.class);
	}

	/**
	 * Sign raw transaction with key sign raw transaction with key.
	 *
	 * @param hex         the hex
	 * @param privKeys    the priv keys
	 * @param prevTxs     the prev txs
	 * @param sigHashType the sig hash type
	 * @return the sign raw transaction with key
	 */
	public SignRawTransactionWithKey signRawTransactionWithKey(String hex, String[] privKeys, Object[] prevTxs, String sigHashType) {
		return this.post(new JsonRpc20.Builder().setMethod("signrawtransactionwithkey").appendParams(hex).appendParams(privKeys).appendParams(prevTxs).appendParams(sigHashType).getJson(), SignRawTransactionWithKey.Result.class);
	}

	/**
	 * Test mempool accept test mempool [ ].
	 *
	 * @param rawtxs the rawtxs
	 * @return the test mempool [ ]
	 */
	public TestMempool[] testMempoolAccept(String[] rawtxs) {
		return this.post(new JsonRpc20.Builder().setMethod("testmempoolaccept").appendParams(rawtxs).getJson(), TestMempool.Result.class);
	}

	/**
	 * Test mempool accept test mempool [ ].
	 *
	 * @param rawtxs     the rawtxs
	 * @param maxFeeRate the max fee rate
	 * @return the test mempool [ ]
	 */
	public TestMempool[] testMempoolAccept(String[] rawtxs, double maxFeeRate) {
		return this.post(new JsonRpc20.Builder().setMethod("testmempoolaccept").appendParams(rawtxs).appendParams(maxFeeRate).getJson(), TestMempool.Result.class);
	}

	/**
	 * Utxo update psbt string.
	 *
	 * @param psbt the psbt
	 * @return the string
	 */
	public String utxoUpdatePsbt(String psbt) {
		return this.post(new JsonRpc20.Builder().setMethod("utxoupdatepsbt").appendParams(psbt).getJson(), StringValue.class);
	}

	/**
	 * Utxo update psbt string.
	 *
	 * @param psbt        the psbt
	 * @param descriptors the descriptors
	 * @return the string
	 */
	public String utxoUpdatePsbt(String psbt, Descriptors descriptors) {
		final ObjectMapper mapper = new ObjectMapper();
		final String json = mapper.valueToTree(descriptors).toString();
		return this.post(new JsonRpc20.Builder().setMethod("utxoupdatepsbt").appendParams(psbt).appendParams(json).getJson(), StringValue.class);
	}

}
