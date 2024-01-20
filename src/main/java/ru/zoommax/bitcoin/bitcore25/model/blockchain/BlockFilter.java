package ru.zoommax.bitcoin.bitcore25.model.blockchain;

import lombok.Getter;
import lombok.Setter;
import ru.zoommax.bitcoin.JsonRpcResult;

@Getter
@Setter
public class BlockFilter {

    public static class Result extends JsonRpcResult<BlockFilter> {
    }

    private String filter;
    private String header;
}
