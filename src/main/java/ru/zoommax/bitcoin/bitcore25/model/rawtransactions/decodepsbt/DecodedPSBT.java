package ru.zoommax.bitcoin.bitcore25.model.rawtransactions.decodepsbt;

import java.util.HashMap;

import lombok.Getter;
import lombok.Setter;
import ru.zoommax.bitcoin.JsonRpcResult;
import ru.zoommax.bitcoin.bitcore25.model.useany.ScriptSig;

/**
 * The type Decoded psbt.
 */
@Getter
@Setter
public class DecodedPSBT {

    /**
     * The type Result.
     */
    public static class Result extends JsonRpcResult<DecodedPSBT> {
	}

    /**
     * The Tx.
     */
    private Object tx; // TODO Create Tx Object by testing decodepsbt method;
    /**
     * The Global xpubs.
     */
    private XPub[] global_xpubs;
    /**
     * The Psbt version.
     */
    private long psbt_version;
    /**
     * The Proprietary.
     */
    private Proprietary[] proprietary;
    /**
     * The Unknown.
     */
    private HashMap<String,String> unknown;
    /**
     * The Inputs.
     */
    private Input[] inputs;
    /**
     * The Outputs.
     */
    private Output[] outputs;
    /**
     * The Fee.
     */
    private double fee;

    /**
     * The type Input.
     */
    @Getter @Setter public class Input {
        /**
         * The Non witness utxo.
         */
        private HashMap<String, String> non_witness_utxo;
        /**
         * The Witness utxo.
         */
        private WitnessUTXO witness_utxo;
        /**
         * The Partial signatures.
         */
        private HashMap<String,String> partial_signatures;
        /**
         * The Sighash.
         */
        private String sighash;
        /**
         * The Redeem script.
         */
        private Script redeem_script;
        /**
         * The Witness script.
         */
        private Script witness_script;
        /**
         * The Bip 32 derivs.
         */
        private Bip32Deriv[] bip32_derivs;
        /**
         * The Final script sig.
         */
        private ScriptSig final_scriptSig;
        /**
         * The Final scriptwitness.
         */
        private String[] final_scriptwitness;
        /**
         * The Ripemd 160 preimages.
         */
        private HashMap<String,String> ripemd160_preimages;
        /**
         * The Sha 256 preimages.
         */
        private HashMap<String,String> sha256_preimages;
        /**
         * The Hash 160 preimages.
         */
        private HashMap<String,String> hash160_preimages;
        /**
         * The Taproot key path sig.
         */
        private String taproot_key_path_sig;
        /**
         * The Taproot script path sigs.
         */
        private TaprootScriptPathSig[] taproot_script_path_sigs;
        /**
         * The Taproot scripts.
         */
        private TaprootScript[] taproot_scripts;
        /**
         * The Taproot bip 32 derivs.
         */
        private TaprootBip32Deriv[] taproot_bip32_derivs;
        /**
         * The Taproot internal key.
         */
        private String taproot_internal_key;
        /**
         * The Taproot merkle root.
         */
        private String taproot_merkle_root;
        /**
         * The Unknown.
         */
        private HashMap<String,String> unknown;
        /**
         * The Proprietary.
         */
        private Proprietary[] proprietary;
	}

    /**
     * The type Output.
     */
    @Getter @Setter public class Output {
        /**
         * The Redeem script.
         */
        private Script redeem_script;
        /**
         * The Witness script.
         */
        private Script witness_script;
        /**
         * The Bip 32 derivs.
         */
        private Bip32Deriv[] bip32_derivs;
        /**
         * The Taproot internal key.
         */
        private String taproot_internal_key;
        /**
         * The Taproot tree.
         */
        private Taproot[] taproot_tree;
        /**
         * The Taproot bip 32 derivs.
         */
        private TaprootBip32Deriv[] taproot_bip32_derivs;
        /**
         * The Unknown.
         */
        private HashMap<String,String> unknown;
        /**
         * The Proprietary.
         */
        private Proprietary[] proprietary;
	}
}
