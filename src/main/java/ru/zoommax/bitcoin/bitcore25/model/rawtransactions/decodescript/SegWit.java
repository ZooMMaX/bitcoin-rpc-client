package ru.zoommax.bitcoin.bitcore25.model.rawtransactions.decodescript;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;

/**
 * The type Seg wit.
 */
@Getter @Setter public class SegWit {
    /**
     * The Asm.
     */
    private String asm;
    /**
     * The Hex.
     */
    private String hex;
    /**
     * The Type.
     */
    private String type;
    /**
     * The Address.
     */
    private String address;
    /**
     * The Desc.
     */
    private String desc;
    /**
     * The P 2 sh segwit.
     */
    @JsonProperty("p2sh-segwit")
	private String p2sh_segwit;
}