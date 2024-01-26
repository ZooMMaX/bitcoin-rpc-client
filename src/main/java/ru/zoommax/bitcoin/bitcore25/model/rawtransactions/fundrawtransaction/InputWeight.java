package ru.zoommax.bitcoin.bitcore25.model.rawtransactions.fundrawtransaction;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class InputWeight {
    private String txid;
    private long vout;
    private long weight;
}
