package ru.zoommax.bitcoin.api;

import ru.zoommax.bitcoin.JsonRpc20;
import ru.zoommax.bitcoin.JsonRpcClient;
import ru.zoommax.bitcoin.model.*;

import java.math.BigDecimal;
import java.util.Optional;

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
    public UtilApi(String username, String password, String url) {
        super(username, password, url);
    }

    /**
     * Create multi sig multi sig.
     *
     * @param nrequired the nrequired
     * @param keys      the keys
     * @return the multi sig
     */
// createmultisig nrequired ["key",...]
    public MultiSig createMultiSig(int nrequired, String... keys) {
        JsonRpc20 json = new JsonRpc20.Builder().setMethod("createmultisig").appendParams(nrequired).appendParams(keys).getJson();
        return this.post(json, MultiSig.Result.class);
    }

    /**
     * Estimate fee big decimal.
     *
     * @param nblocks the nblocks
     * @return the big decimal
     */
// estimatefee nblocks
    public BigDecimal estimateFee(int nblocks) {
        JsonRpc20 json = new JsonRpc20.Builder().setMethod("estimatefee").appendParams(nblocks).getJson();
        return this.post(json, BigDecimalValue.class);
    }

    /**
     * Estimate smart fee smart fee.
     *
     * @param confTarget the conf target
     * @param mode       the mode
     * @return the smart fee
     */
// estimatesmartfee conf_target ("estimate_mode")
    public SmartFee estimateSmartFee(int confTarget, Optional<BumpFee.EstimateMode> mode) {
        JsonRpc20 json = new JsonRpc20.Builder().setMethod("estimatesmartfee").appendParams(confTarget).appendParams(mode.orElse(BumpFee.EstimateMode.CONSERVATIVE)).getJson();
        return this.post(json, SmartFee.Result.class);
    }

    /**
     * Sign message with priv key string.
     *
     * @param privkey the privkey
     * @param message the message
     * @return the string
     */
// signmessagewithprivkey "privkey" "message"
    public String signMessageWithPrivKey(String privkey, String message) {
        JsonRpc20 json = new JsonRpc20.Builder().setMethod("signmessagewithprivkey").appendParams(privkey).appendParams(message).getJson();
        return this.post(json, StringValue.class);
    }

    /**
     * Validate address string.
     *
     * @param address the address
     * @return the string
     */
// validateaddress "address"
    public String validateAddress(String address) {
        JsonRpc20 json = new JsonRpc20.Builder().setMethod("validateaddress").appendParams(address).getJson();
        return this.post(json, StringValue.class);
    }

    /**
     * Verify message boolean.
     *
     * @param address   the address
     * @param signature the signature
     * @param message   the message
     * @return the boolean
     */
// verifymessage "address" "signature" "message"
    public boolean verifyMessage(String address, String signature, String message) {
        JsonRpc20 json = new JsonRpc20.Builder().setMethod("verifymessage").appendParams(address)
                .appendParams(signature).appendParams(message).getJson();
        return this.post(json, BooleanValue.class).booleanValue();
    }

}
