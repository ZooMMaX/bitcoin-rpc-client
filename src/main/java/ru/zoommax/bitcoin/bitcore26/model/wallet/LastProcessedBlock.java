package ru.zoommax.bitcoin.bitcore26.model.wallet;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LastProcessedBlock {
    private String hash;
    private long height;
}
