package ru.zoommax.bitcoin.bitcore25.model.rawtransactions.createpsbt;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Input {
    private String txid;
    private long vout;
    private long sequence;
}
