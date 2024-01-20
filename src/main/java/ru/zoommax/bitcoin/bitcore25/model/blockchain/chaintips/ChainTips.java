package ru.zoommax.bitcoin.bitcore25.model.blockchain.chaintips;

import lombok.Getter;
import lombok.Setter;
import ru.zoommax.bitcoin.JsonRpcResult;

@Getter
@Setter
public class ChainTips {
    public static class Result extends JsonRpcResult<ChainTips[]> {
    }
    private long height;
    private String hash;
    private long branchlen;
    private ChainTipStatus status;

    public void setStatus(String status) {
        this.status = ChainTipStatus.fromString(status);
    }
}
