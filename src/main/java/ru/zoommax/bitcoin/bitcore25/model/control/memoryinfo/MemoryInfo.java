package ru.zoommax.bitcoin.bitcore25.model.control.memoryinfo;

import lombok.Getter;
import lombok.Setter;
import ru.zoommax.bitcoin.JsonRpcResult;
import ru.zoommax.bitcoin.bitcore25.model.useany.StringValue;

/**
 * The type Memory info.
 */
@Getter
@Setter
public class MemoryInfo {

    /**
     * The type Result.
     */
    public static class Result extends JsonRpcResult<MemoryInfo> {
	}

    /**
     * The type Result malloc info.
     */
    public static class ResultMallocInfo extends JsonRpcResult<StringValue> {
	}

    /**
     * The Locked.
     */
    private Locked locked;

}
