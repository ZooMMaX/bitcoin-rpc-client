package ru.zoommax.bitcoin.bitcore25.api.rawtransactions;

import com.fasterxml.jackson.databind.ObjectMapper;
import ru.zoommax.bitcoin.JsonRpc20;
import ru.zoommax.bitcoin.JsonRpcClient;
import ru.zoommax.bitcoin.bitcore25.model.rawtransactions.*;
import ru.zoommax.bitcoin.bitcore25.model.rawtransactions.createjson.PsbtRequestArgsJson;
import ru.zoommax.bitcoin.bitcore25.model.rawtransactions.decodepsbt.DecodedPSBT;
import ru.zoommax.bitcoin.bitcore25.model.rawtransactions.decoderawtransaction.DecodedRawTransaction;
import ru.zoommax.bitcoin.bitcore25.model.rawtransactions.decodescript.DecodedScript;
import ru.zoommax.bitcoin.bitcore25.model.rawtransactions.fundrawtransaction.Options;
import ru.zoommax.bitcoin.bitcore25.model.rawtransactions.psbt.PSBT;
import ru.zoommax.bitcoin.bitcore25.model.rawtransactions.signrawwithkey.SignRawTransactionWithKey;
import ru.zoommax.bitcoin.bitcore25.model.rawtransactions.utxoupdatepsbt.Descriptors;
import ru.zoommax.bitcoin.bitcore25.model.useany.StringValue;

public class RawTransactionsApi extends JsonRpcClient {

	public RawTransactionsApi(String username, String password, String url){
		super(username, password, url);
	}

	public PSBT analyzePsbt(String psbt) {
		return this.post(new JsonRpc20.Builder().setMethod("analyzepsbt").appendParams(psbt).getJson(), PSBT.Result.class);
	}

	public String combinePsbt(String[] txs) {
		ObjectMapper mapper = new ObjectMapper();
		String json = mapper.valueToTree(txs).toString();
		return this.post(new JsonRpc20.Builder().setMethod("combinepsbt").appendParams(json).getJson(), StringValue.class);
	}

	public String combineRawTransaction(String[] txs) {
		ObjectMapper mapper = new ObjectMapper();
		String json = mapper.valueToTree(txs).toString();
		return this.post(new JsonRpc20.Builder().setMethod("combinerawtransaction").appendParams(json).getJson(), StringValue.class);
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

	public String createPsbt(CreatePsbt args) {
		return this.post(new JsonRpc20.Builder().setMethod("createpsbt").appendParams(args.getInputs()).appendParams(args.getOutputs()).getJson(), StringValue.class);
	}

	public String createPsbt(CreatePsbt args, long lockTime) {
		return this.post(new JsonRpc20.Builder().setMethod("createpsbt").appendParams(args.getInputs()).appendParams(args.getOutputs()).appendParams(lockTime).getJson(), StringValue.class);
	}

	public String createPsbt(CreatePsbt args, long lockTime, boolean replaceable) {
		return this.post(new JsonRpc20.Builder().setMethod("createpsbt").appendParams(args.getInputs()).appendParams(args.getOutputs()).appendParams(lockTime).appendParams(replaceable).getJson(), StringValue.class);
	}

	public String createRawTransaction(CreateRawTransaction args) {
		return this.post(new JsonRpc20.Builder().setMethod("createrawtransaction").appendParams(args.getInputs()).appendParams(args.getOutputs()).getJson(), StringValue.class);
	}

	public String createRawTransaction(CreateRawTransaction args, long lockTime) {
		return this.post(new JsonRpc20.Builder().setMethod("createrawtransaction").appendParams(args.getInputs()).appendParams(args.getOutputs()).appendParams(lockTime).getJson(), StringValue.class);
	}

	public String createRawTransaction(CreateRawTransaction args, long lockTime, boolean replaceable) {
		return this.post(new JsonRpc20.Builder().setMethod("createrawtransaction").appendParams(args.getInputs()).appendParams(args.getOutputs()).appendParams(lockTime).appendParams(replaceable).getJson(), StringValue.class);
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

	public FundResult fundRawTransaction(String hex, Options options, boolean isWitness) {
		ObjectMapper mapper = new ObjectMapper();
		String json = mapper.valueToTree(options).toString();
		return this.post(new JsonRpc20.Builder().setMethod("fundrawtransaction").appendParams(hex).appendParams(json).appendParams(isWitness).getJson(), FundResult.Result.class);
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

	public String utxoUpdatePsbt(String psbt, Descriptors descriptors) {
		ObjectMapper mapper = new ObjectMapper();
		String json = mapper.valueToTree(descriptors).toString();
		return this.post(new JsonRpc20.Builder().setMethod("utxoupdatepsbt").appendParams(psbt).appendParams(json).getJson(), StringValue.class);
	}

}
