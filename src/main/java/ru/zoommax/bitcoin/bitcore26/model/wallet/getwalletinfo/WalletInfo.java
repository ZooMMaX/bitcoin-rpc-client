package ru.zoommax.bitcoin.bitcore26.model.wallet.getwalletinfo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import ru.zoommax.bitcoin.JsonRpcResult;
import ru.zoommax.bitcoin.bitcore26.model.wallet.LastProcessedBlock;

@Getter
@Setter
public class WalletInfo extends ru.zoommax.bitcoin.bitcore25.model.wallet.getwalletinfo.WalletInfo{

    public static class Result extends JsonRpcResult<ru.zoommax.bitcoin.bitcore26.model.wallet.getwalletinfo.WalletInfo> {
    }

    private boolean blank;
    @JsonProperty("lastprocessedblock")
    private LastProcessedBlock lastProcessedBlock;
}
