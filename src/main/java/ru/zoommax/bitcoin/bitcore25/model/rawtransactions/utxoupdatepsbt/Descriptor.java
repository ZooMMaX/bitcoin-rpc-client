package ru.zoommax.bitcoin.bitcore25.model.rawtransactions.utxoupdatepsbt;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Descriptor {
    private String desc;
    private long[] range;
}
