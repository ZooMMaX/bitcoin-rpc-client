package ru.zoommax.bitcoin.api;

import ru.zoommax.bitcoin.JsonRpc20;
import ru.zoommax.bitcoin.JsonRpcClient;
import ru.zoommax.bitcoin.model.*;

import java.math.BigDecimal;
import java.util.Optional;

public class UtilApi extends JsonRpcClient {
    public UtilApi(String username, String password, String url) {
        super(username, password, url);
    }

    // createmultisig nrequired ["key",...]
    public MultiSig createMultiSig(int nrequired, String... keys) {
        JsonRpc20 json = new JsonRpc20.Builder().setMethod("createmultisig").appendParams(nrequired).appendParams(keys).getJson();
        return this.post(json, MultiSig.Result.class);
    }

    // estimatefee nblocks
    public BigDecimal estimateFee(int nblocks) {
        JsonRpc20 json = new JsonRpc20.Builder().setMethod("estimatefee").appendParams(nblocks).getJson();
        return this.post(json, BigDecimalValue.class);
    }

    // estimatesmartfee conf_target ("estimate_mode")
    public SmartFee estimateSmartFee(int confTarget, Optional<BumpFee.EstimateMode> mode) {
        JsonRpc20 json = new JsonRpc20.Builder().setMethod("estimatesmartfee").appendParams(confTarget).appendParams(mode.orElse(BumpFee.EstimateMode.CONSERVATIVE)).getJson();
        return this.post(json, SmartFee.Result.class);
    }

    // signmessagewithprivkey "privkey" "message"
    public String signMessageWithPrivKey(String privkey, String message) {
        JsonRpc20 json = new JsonRpc20.Builder().setMethod("signmessagewithprivkey").appendParams(privkey).appendParams(message).getJson();
        return this.post(json, StringValue.class);
    }

    // validateaddress "address"
    public String validateAddress(String address) {
        JsonRpc20 json = new JsonRpc20.Builder().setMethod("validateaddress").appendParams(address).getJson();
        return this.post(json, StringValue.class);
    }

    // verifymessage "address" "signature" "message"
    public boolean verifyMessage(String address, String signature, String message) {
        JsonRpc20 json = new JsonRpc20.Builder().setMethod("verifymessage").appendParams(address)
                .appendParams(signature).appendParams(message).getJson();
        return this.post(json, BooleanValue.class).booleanValue();
    }

}
