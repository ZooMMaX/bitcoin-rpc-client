package ru.zoommax.bitcoin.bitcore25.api.rawtransactions;

import ru.zoommax.bitcoin.JsonRpc20;
import ru.zoommax.bitcoin.JsonRpcClient;
import ru.zoommax.bitcoin.bitcore25.model.rawtransactions.FinalizedPSBT;
import ru.zoommax.bitcoin.bitcore25.model.rawtransactions.FundResult;
import ru.zoommax.bitcoin.bitcore25.model.rawtransactions.TestMempool;
import ru.zoommax.bitcoin.bitcore25.model.rawtransactions.createpsbt.CreatePsbtRequestArgs;
import ru.zoommax.bitcoin.bitcore25.model.rawtransactions.decodepsbt.DecodedPSBT;
import ru.zoommax.bitcoin.bitcore25.model.rawtransactions.decoderawtransaction.DecodedRawTransaction;
import ru.zoommax.bitcoin.bitcore25.model.rawtransactions.decodescript.DecodedScript;
import ru.zoommax.bitcoin.bitcore25.model.rawtransactions.psbt.PSBT;
import ru.zoommax.bitcoin.bitcore25.model.rawtransactions.signrawwithkey.SignRawTransactionWithKey;
import ru.zoommax.bitcoin.bitcore25.model.useany.StringValue;

public class RawTransactionsApi extends JsonRpcClient {

	public RawTransactionsApi(String username, String password, String url){
		super(username, password, url);
	}

	public PSBT analyzePsbt(String psbt) {
		return this.post(new JsonRpc20.Builder().setMethod("analyzepsbt").appendParams(psbt).getJson(), PSBT.Result.class);
	}

	public String combinePsbt(String[] txs) { // TODO Maybe this method parameters is JSON array
		return this.post(new JsonRpc20.Builder().setMethod("combinepsbt").appendParams(txs).getJson(), StringValue.class);
	}

	public String combineRawTransaction(String[] txs) { // TODO Maybe this method parameters is JSON array
		return this.post(new JsonRpc20.Builder().setMethod("combinerawtransaction").appendParams(txs).getJson(), StringValue.class);
	}

	public String convertToPsbt(String hex) {
		return this.post(new JsonRpc20.Builder().setMethod("converttopsbt").appendParams(hex).getJson(), StringValue.class);
	}

	public String convertToPsbt(String hex, boolean permitSigData) {
		return this.post(new JsonRpc20.Builder().setMethod("converttopsbt").appendParams(hex).appendParams(permitSigData).getJson(), StringValue.class);
	}

	public String convertToPsbt(String hex, boolean permitSigData, boolean isWitness) {
		return this.post(new JsonRpc20.Builder().setMethod("converttopsbt").appendParams(hex).appendParams(permitSigData).appendParams(isWitness).getJson(), StringValue.class);
	}

	public String createPsbt(CreatePsbtRequestArgs args) {
		return this.post(new JsonRpc20.Builder().setMethod("createpsbt").appendParams(args.getInputs()).appendParams(args.getOutputs()).getJson(), StringValue.class);
	}

	public String createPsbt(CreatePsbtRequestArgs args, long lockTime) {
		return this.post(new JsonRpc20.Builder().setMethod("createpsbt").appendParams(args.getInputs()).appendParams(args.getOutputs()).appendParams(lockTime).getJson(), StringValue.class);
	}

	public String createPsbt(CreatePsbtRequestArgs args, long lockTime, boolean replaceable) {
		return this.post(new JsonRpc20.Builder().setMethod("createpsbt").appendParams(args.getInputs()).appendParams(args.getOutputs()).appendParams(lockTime).appendParams(replaceable).getJson(), StringValue.class);
	}

	public String createRawTransaction(Object[] inputs, Object[] outputs) { // TODO Complete this method
		return this.post(new JsonRpc20.Builder().setMethod("createrawtransaction").appendParams(inputs).appendParams(outputs).getJson(), StringValue.class);
	}

	public String createRawTransaction(Object[] inputs, Object[] outputs, long lockTime) { // TODO Complete this method
		return this.post(new JsonRpc20.Builder().setMethod("createrawtransaction").appendParams(inputs).appendParams(outputs).appendParams(lockTime).getJson(), StringValue.class);
	}

	public String createRawTransaction(Object[] inputs, Object[] outputs, long lockTime, boolean replaceable) { // TODO Complete this method
		return this.post(new JsonRpc20.Builder().setMethod("createrawtransaction").appendParams(inputs).appendParams(outputs).appendParams(lockTime).appendParams(replaceable).getJson(), StringValue.class);
	}

	public DecodedPSBT decodePsbt(String psbt) {
		return this.post(new JsonRpc20.Builder().setMethod("decodepsbt").appendParams(psbt).getJson(), DecodedPSBT.Result.class);
	}

	public DecodedRawTransaction decodeRawTransaction(String hex) {
		return this.post(new JsonRpc20.Builder().setMethod("decoderawtransaction").appendParams(hex).getJson(), DecodedRawTransaction.Result.class);
	}

	public DecodedRawTransaction decodeRawTransaction(String hex, boolean isWitness) {
		return this.post(new JsonRpc20.Builder().setMethod("decoderawtransaction").appendParams(hex).appendParams(isWitness).getJson(), DecodedRawTransaction.Result.class);
	}

	public DecodedScript decodeScript(String hex) {
		return this.post(new JsonRpc20.Builder().setMethod("decodescript").appendParams(hex).getJson(), DecodedScript.Result.class);
	}

	public FinalizedPSBT finalizepsbt(String psbt) {
		return this.post(new JsonRpc20.Builder().setMethod("finalizepsbt").appendParams(psbt).getJson(), FinalizedPSBT.Result.class);
	}

	public FinalizedPSBT finalizepsbt(String psbt, boolean extract) {
		return this.post(new JsonRpc20.Builder().setMethod("finalizepsbt").appendParams(psbt).appendParams(extract).getJson(), FinalizedPSBT.Result.class);
	}

	public FundResult fundRawTransaction(String hex) {
		return this.post(new JsonRpc20.Builder().setMethod("fundrawtransaction").appendParams(hex).getJson(), FundResult.Result.class);
	}

	public FundResult fundRawTransaction(String hex, Object options, boolean isWitness) { // Complete this (Object options)
		return this.post(new JsonRpc20.Builder().setMethod("fundrawtransaction").appendParams(hex).appendParams(options).appendParams(isWitness).getJson(), FundResult.Result.class);
	}

	// make verbosity=1 and verbosity=2
	public String getRawTransactionV0(String txid) {
		return this.post(new JsonRpc20.Builder().setMethod("getrawtransaction").appendParams(txid).getJson(), StringValue.class);
	}

	public String joinPsbts(String[] txs) {
		return this.post(new JsonRpc20.Builder().setMethod("joinpsbts").appendParams(txs).getJson(), StringValue.class);
	}

	public String sendRawTransaction(String hex) {
		return this.post(new JsonRpc20.Builder().setMethod("sendrawtransaction").appendParams(hex).getJson(), StringValue.class);
	}

	public String sendRawTransaction(String hex, double maxFeeRate, double maxBurnAmount) {
		return this.post(new JsonRpc20.Builder().setMethod("sendrawtransaction").appendParams(hex).appendParams(maxFeeRate).appendParams(maxBurnAmount).getJson(), StringValue.class);
	}

	public SignRawTransactionWithKey signRawTransactionWithKey(String hex, String[] privKeys) {
		return this.post(new JsonRpc20.Builder().setMethod("signrawtransactionwithkey").appendParams(hex).appendParams(privKeys).getJson(), SignRawTransactionWithKey.Result.class);
	}

	public SignRawTransactionWithKey signRawTransactionWithKey(String hex, String[] privKeys, Object[] prevTxs, String sigHashType) {
		return this.post(new JsonRpc20.Builder().setMethod("signrawtransactionwithkey").appendParams(hex).appendParams(privKeys).appendParams(prevTxs).appendParams(sigHashType).getJson(), SignRawTransactionWithKey.Result.class);
	}

	public TestMempool[] testMempoolAccept(String[] rawtxs) {
		return this.post(new JsonRpc20.Builder().setMethod("testmempoolaccept").appendParams(rawtxs).getJson(), TestMempool.Result.class);
	}

	public TestMempool[] testMempoolAccept(String[] rawtxs, double maxFeeRate) {
		return this.post(new JsonRpc20.Builder().setMethod("testmempoolaccept").appendParams(rawtxs).appendParams(maxFeeRate).getJson(), TestMempool.Result.class);
	}

	public String utxoUpdatePsbt(String psbt) {
		return this.post(new JsonRpc20.Builder().setMethod("utxoupdatepsbt").appendParams(psbt).getJson(), StringValue.class);
	}

	public String utxoUpdatePsbt(String psbt, Object[] descriptors) { // Complete this (Object[] descriptors)
		return this.post(new JsonRpc20.Builder().setMethod("utxoupdatepsbt").appendParams(psbt).appendParams(descriptors).getJson(), StringValue.class);
	}

}
