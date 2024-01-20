package ru.zoommax.bitcoin.old.model;

import ru.zoommax.bitcoin.JsonRpcResult;
import lombok.Getter;
import lombok.Setter;

/**
 * The type Added nodes info.
 */
@Getter
@Setter
public class AddedNodesInfo {
    /**
     * The type Result.
     */
    public static class Result extends JsonRpcResult<AddedNodesInfo[]> {
    }

    /**
     * The Addednode.
     */
    private String addednode;
    /**
     * The Connected.
     */
    private boolean connected;
    /**
     * The Addresses.
     */
    private String[] addresses;
}
