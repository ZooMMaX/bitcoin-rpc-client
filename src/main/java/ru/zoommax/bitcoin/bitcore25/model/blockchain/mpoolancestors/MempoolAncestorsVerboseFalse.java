package ru.zoommax.bitcoin.bitcore25.model.blockchain.mpoolancestors;

import lombok.Getter;
import lombok.Setter;
import ru.zoommax.bitcoin.JsonRpcResult;

@Getter
@Setter
public class MempoolAncestorsVerboseFalse {
    public static class Result extends JsonRpcResult<MempoolAncestorsVerboseFalse[]> {
    }

    private String hex;

}
