package ru.zoommax.bitcoin.bitcore25.model.control.rpcinfo;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ActiveCommands {
    private String method;
    private long duration;
}
