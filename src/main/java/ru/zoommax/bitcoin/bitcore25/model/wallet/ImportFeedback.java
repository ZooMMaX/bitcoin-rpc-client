package ru.zoommax.bitcoin.bitcore25.model.wallet;

import lombok.Getter;
import lombok.Setter;
import ru.zoommax.bitcoin.JsonRpcResult;

/**
 * The type Import feedback.
 */
@Getter
@Setter
public class ImportFeedback {

    /**
     * The type Result.
     */
    public static class Result extends JsonRpcResult<ImportFeedback[]> {
	}

    /**
     * The Success.
     */
    public boolean success;
    /**
     * The Warnings.
     */
    private String warnings;
    /**
     * The Error.
     */
    private Object[] error; // TODO JSONRPC error
}
