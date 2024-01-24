package ru.zoommax.bitcoin.bitcore25.model.rawtransactions.decodepsbt;

import java.util.HashMap;

import lombok.Getter;
import lombok.Setter;
import ru.zoommax.bitcoin.JsonRpcResult;
import ru.zoommax.bitcoin.bitcore25.model.useany.ScriptSig;

@Getter
@Setter
public class DecodedPSBT {

	public static class Result extends JsonRpcResult<DecodedPSBT> {
	}

	private Object tx; // TODO Create Tx Object by testing decodepsbt method;
	private XPub[] global_xpubs;
	private long psbt_version;
	private Proprietary[] proprietary;
	private HashMap<String,String> unknown;
	private Input[] inputs;
	private Output[] outputs;
	private double fee;

	@Getter @Setter public class Input {
		private HashMap<String, String> non_witness_utxo;
		private WitnessUTXO witness_utxo;
		private HashMap<String,String> partial_signatures;
		private String sighash;
		private Script redeem_script;
		private Script witness_script;
		private Bip32Deriv[] bip32_derivs;
		private ScriptSig final_scriptSig;
		private String[] final_scriptwitness;
		private HashMap<String,String> ripemd160_preimages;
		private HashMap<String,String> sha256_preimages;
		private HashMap<String,String> hash160_preimages;
		private String taproot_key_path_sig;
		private TaprootScriptPathSig[] taproot_script_path_sigs;
		private TaprootScript[] taproot_scripts;
		private TaprootBip32Deriv[] taproot_bip32_derivs;
		private String taproot_internal_key;
		private String taproot_merkle_root;
		private HashMap<String,String> unknown;
		private Proprietary[] proprietary;
	}

	@Getter @Setter public class Output {
		private Script redeem_script;
		private Script witness_script;
		private Bip32Deriv[] bip32_derivs;
		private String taproot_internal_key;
		private Taproot[] taproot_tree;
		private TaprootBip32Deriv[] taproot_bip32_derivs;
		private HashMap<String,String> unknown;
		private Proprietary[] proprietary;
	}
}
