package ru.zoommax.bitcoin.bitcore25.model.blockchain.mempoolancestorsdescendants;

import lombok.Getter;
import lombok.Setter;
import ru.zoommax.bitcoin.JsonRpcResult;

import java.util.HashMap;

@Getter
@Setter
public class MempoolDescendants {
    public static class ResultArray extends JsonRpcResult<String[]> {
    }

    public static class ResultHashMap extends JsonRpcResult<HashMap<String, Transaction>> {
    }
}
