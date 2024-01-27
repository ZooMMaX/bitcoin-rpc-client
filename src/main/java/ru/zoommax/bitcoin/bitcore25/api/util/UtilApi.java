package ru.zoommax.bitcoin.bitcore25.api.util;

import java.util.Map;

import ru.zoommax.bitcoin.JsonRpc20;
import ru.zoommax.bitcoin.JsonRpcClient;
import ru.zoommax.bitcoin.bitcore25.model.useany.ArrayValue;
import ru.zoommax.bitcoin.bitcore25.model.useany.BooleanValue;
import ru.zoommax.bitcoin.bitcore25.model.useany.StringValue;
import ru.zoommax.bitcoin.bitcore25.model.util.AddressValidation;
import ru.zoommax.bitcoin.bitcore25.model.util.DescriptorInfo;
import ru.zoommax.bitcoin.bitcore25.model.util.IndexInfo;
import ru.zoommax.bitcoin.bitcore25.model.util.MultiSig;
import ru.zoommax.bitcoin.bitcore25.model.util.SmartFee;

public class UtilApi extends JsonRpcClient {

	public UtilApi(String username, String password, String url){
		super(username, password, url);
	}

	public MultiSig createMultiSig(long nRequired, String[] keys) {
		return this.post(new JsonRpc20.Builder().setMethod("createmultisig").appendParams(nRequired).appendParams(keys).getJson(), MultiSig.Result.class);
	}

	public MultiSig createMultiSig(long nRequred, String[] keys, String addressType) {
		return this.post(new JsonRpc20.Builder().setMethod("createmultisig").appendParams(nRequred).appendParams(keys).appendParams(addressType).getJson(), MultiSig.Result.class);
	}

	public String[] deriveAddresses(String descriptor) {
		return this.post(new JsonRpc20.Builder().setMethod("deriveaddresses").appendParams(descriptor).getJson(), ArrayValue.StringArray.class);
	}

	public String[] deriveAddresses(String descriptor, long begin, long end) {
		return this.post(new JsonRpc20.Builder().setMethod("deriveaddresses").appendParams(descriptor).appendParams(new long[] { begin, end }).getJson(), ArrayValue.StringArray.class);
	}

	public SmartFee estimateSmartFee(long confTarget) {
		return this.post(new JsonRpc20.Builder().setMethod("estimatesmartfee").appendParams(confTarget).getJson(), SmartFee.Result.class);
	}

	public SmartFee estimateSmartFee(long confTarget, String estimateMode) {
		return this.post(new JsonRpc20.Builder().setMethod("estimatesmartfee").appendParams(confTarget).appendParams(estimateMode).getJson(), SmartFee.Result.class);
	}

	public DescriptorInfo getDescriptorInfo(String descriptor) {
		return this.post(new JsonRpc20.Builder().setMethod("getdescriptorinfo").appendParams(descriptor).getJson(), DescriptorInfo.Result.class);
	}

	public Map<String,IndexInfo> getIndexInfo() {
		return this.post(new JsonRpc20.Builder().setMethod("getindexinfo").getJson(), IndexInfo.ResultMap.class);
	}

	public Map<String,IndexInfo> getIndexInfo(String indexName) {
		return this.post(new JsonRpc20.Builder().setMethod("getindexinfo").appendParams(indexName).getJson(), IndexInfo.ResultMap.class);
	}

	public String signMessageWithPrivKey(String privKey, String message) {
		return this.post(new JsonRpc20.Builder().setMethod("signmessagewithprivkey").appendParams(privKey).appendParams(message).getJson(), StringValue.class);
	}

	public AddressValidation validateAddress(String address) {
		return this.post(new JsonRpc20.Builder().setMethod("validateaddress").appendParams(address).getJson(), AddressValidation.Result.class);
	}

	public boolean verifyMessage(String address, String signature, String message) {
		return this.post(new JsonRpc20.Builder().setMethod("verifymessage").appendParams(address).appendParams(signature).appendParams(message).getJson(), BooleanValue.class);
	}

}
