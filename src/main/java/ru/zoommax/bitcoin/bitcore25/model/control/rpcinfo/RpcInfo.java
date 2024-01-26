package ru.zoommax.bitcoin.bitcore25.model.control.rpcinfo;

import lombok.Getter;
import lombok.Setter;
import ru.zoommax.bitcoin.JsonRpcResult;

/**
 * The type Rpc info.
 */
@Getter
@Setter
public class RpcInfo {
    /**
     * The type Result.
     */
    public static class Result extends JsonRpcResult<RpcInfo> {
    }

    /**
     * The Active commands.
     */
    private ActiveCommands[] active_commands;
    /**
     * The Logpath.
     */
    private String logpath;
}
