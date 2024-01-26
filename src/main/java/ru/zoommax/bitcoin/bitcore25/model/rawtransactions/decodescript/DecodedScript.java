package ru.zoommax.bitcoin.bitcore25.model.rawtransactions.decodescript;

import lombok.Getter;
import lombok.Setter;
import ru.zoommax.bitcoin.JsonRpcResult;

/**
 * The type Decoded script.
 */
@Getter
@Setter
public class DecodedScript {

    /**
     * The type Result.
     */
    public static class Result extends JsonRpcResult<DecodedScript> {
	}

    /**
     * The Asm.
     */
    private String asm;
    /**
     * The Desc.
     */
    private String desc;
    /**
     * The Type.
     */
    private String type;
    /**
     * The Address.
     */
    private String address;
    /**
     * The P 2 sh.
     */
    private String p2sh;
    /**
     * The Segwit.
     */
    private SegWit segwit;

}
