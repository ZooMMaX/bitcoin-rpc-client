package ru.zoommax.bitcoin.model;

import ru.zoommax.bitcoin.JsonRpcResult;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AddedNodesInfo {
    public static class Result extends JsonRpcResult<AddedNodesInfo[]> {
    }
    private String addednode;
    private boolean connected;
    private String[] addresses;
}
