package ru.zoommax.bitcoin.bitcore25.model.control.rpcinfo;

import lombok.Getter;
import lombok.Setter;
import ru.zoommax.bitcoin.JsonRpcResult;

@Getter
@Setter
public class RpcInfo {
    public static class Result extends JsonRpcResult<RpcInfo> {
    }

    private ActiveCommands[] active_commands;
    private String logpath;
}
