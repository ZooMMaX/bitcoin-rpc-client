package ru.zoommax.bitcoin.bitcore25.api.util;

import java.util.Map;

import ru.zoommax.bitcoin.JsonRpc20;
import ru.zoommax.bitcoin.JsonRpcClient;
import ru.zoommax.bitcoin.bitcore25.model.useany.ArrayValue;
import ru.zoommax.bitcoin.bitcore25.model.useany.BooleanValue;
import ru.zoommax.bitcoin.bitcore25.model.useany.MultiSig;
import ru.zoommax.bitcoin.bitcore25.model.useany.StringValue;
import ru.zoommax.bitcoin.bitcore25.model.util.AddressValidation;
import ru.zoommax.bitcoin.bitcore25.model.util.DescriptorInfo;
import ru.zoommax.bitcoin.bitcore25.model.util.IndexInfo;
import ru.zoommax.bitcoin.bitcore25.model.util.SmartFee;

/**
 * The type Util api.
 */
public class UtilApi extends JsonRpcClient {

    /**
     * Instantiates a new Util api.
     *
     * @param username the username
     * @param password the password
     * @param url      the url
     */
    public UtilApi(String username, String password, String url){
		super(username, password, url);
	}

    /**
     * Create multi sig multi sig.
     *
     * @param nRequired the n required
     * @param keys      the keys
     * @return the multi sig
     */
    public MultiSig createMultiSig(long nRequired, String[] keys) {
		return this.post(new JsonRpc20.Builder().setMethod("createmultisig").appendParams(nRequired).appendParams(keys).getJson(), MultiSig.Result.class);
	}

    /**
     * Create multi sig multi sig.
     *
     * @param nRequred    the n requred
     * @param keys        the keys
     * @param addressType the address type
     * @return the multi sig
     */
    public MultiSig createMultiSig(long nRequred, String[] keys, String addressType) {
		return this.post(new JsonRpc20.Builder().setMethod("createmultisig").appendParams(nRequred).appendParams(keys).appendParams(addressType).getJson(), MultiSig.Result.class);
	}

    /**
     * Derive addresses string [ ].
     *
     * @param descriptor the descriptor
     * @return the string [ ]
     */
    public String[] deriveAddresses(String descriptor) {
		return this.post(new JsonRpc20.Builder().setMethod("deriveaddresses").appendParams(descriptor).getJson(), ArrayValue.StringArray.class);
	}

    /**
     * Derive addresses string [ ].
     *
     * @param descriptor the descriptor
     * @param begin      the begin
     * @param end        the end
     * @return the string [ ]
     */
    public String[] deriveAddresses(String descriptor, long begin, long end) {
		return this.post(new JsonRpc20.Builder().setMethod("deriveaddresses").appendParams(descriptor).appendParams(new long[] { begin, end }).getJson(), ArrayValue.StringArray.class);
	}

    /**
     * Estimate smart fee smart fee.
     *
     * @param confTarget the conf target
     * @return the smart fee
     */
    public SmartFee estimateSmartFee(long confTarget) {
		return this.post(new JsonRpc20.Builder().setMethod("estimatesmartfee").appendParams(confTarget).getJson(), SmartFee.Result.class);
	}

    /**
     * Estimate smart fee smart fee.
     *
     * @param confTarget   the conf target
     * @param estimateMode the estimate mode
     * @return the smart fee
     */
    public SmartFee estimateSmartFee(long confTarget, String estimateMode) {
		return this.post(new JsonRpc20.Builder().setMethod("estimatesmartfee").appendParams(confTarget).appendParams(estimateMode).getJson(), SmartFee.Result.class);
	}

    /**
     * Gets descriptor info.
     *
     * @param descriptor the descriptor
     * @return the descriptor info
     */
    public DescriptorInfo getDescriptorInfo(String descriptor) {
		return this.post(new JsonRpc20.Builder().setMethod("getdescriptorinfo").appendParams(descriptor).getJson(), DescriptorInfo.Result.class);
	}

    /**
     * Gets index info.
     *
     * @return the index info
     */
    public Map<String,IndexInfo> getIndexInfo() {
		return this.post(new JsonRpc20.Builder().setMethod("getindexinfo").getJson(), IndexInfo.ResultMap.class);
	}

    /**
     * Gets index info.
     *
     * @param indexName the index name
     * @return the index info
     */
    public Map<String,IndexInfo> getIndexInfo(String indexName) {
		return this.post(new JsonRpc20.Builder().setMethod("getindexinfo").appendParams(indexName).getJson(), IndexInfo.ResultMap.class);
	}

    /**
     * Sign message with priv key string.
     *
     * @param privKey the priv key
     * @param message the message
     * @return the string
     */
    public String signMessageWithPrivKey(String privKey, String message) {
		return this.post(new JsonRpc20.Builder().setMethod("signmessagewithprivkey").appendParams(privKey).appendParams(message).getJson(), StringValue.class);
	}

    /**
     * Validate address address validation.
     *
     * @param address the address
     * @return the address validation
     */
    public AddressValidation validateAddress(String address) {
		return this.post(new JsonRpc20.Builder().setMethod("validateaddress").appendParams(address).getJson(), AddressValidation.Result.class);
	}

    /**
     * Verify message boolean.
     *
     * @param address   the address
     * @param signature the signature
     * @param message   the message
     * @return the boolean
     */
    public boolean verifyMessage(String address, String signature, String message) {
		return this.post(new JsonRpc20.Builder().setMethod("verifymessage").appendParams(address).appendParams(signature).appendParams(message).getJson(), BooleanValue.class);
	}

}
