package ru.zoommax.bitcoin.bitcore25.model.control.rpcinfo;

import lombok.Getter;
import lombok.Setter;

/**
 * The type Active commands.
 */
@Getter
@Setter
public class ActiveCommands {
    /**
     * The Method.
     */
    private String method;
    /**
     * The Duration.
     */
    private long duration;
}
