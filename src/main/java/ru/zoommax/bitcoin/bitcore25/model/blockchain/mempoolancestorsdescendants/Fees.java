package ru.zoommax.bitcoin.bitcore25.model.blockchain.mempoolancestorsdescendants;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Fees {
    private double base;
    private double modified;
    private double ancestor;
    private double descendant;
}
