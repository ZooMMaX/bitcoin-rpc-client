package ru.zoommax.bitcoin.bitcore25.model.blockchain.txoutsetinfo;

import lombok.Getter;
import lombok.Setter;

/**
 * The type Block info.
 */
@Getter
@Setter
public class BlockInfo {
    /**
     * The Prevout spent.
     */
    private double prevout_spent;
    /**
     * The Coinbase.
     */
    private long coinbase;
    /**
     * The New outputs ex coinbase.
     */
    private long new_outputs_ex_coinbase;
    /**
     * The Uspendable.
     */
    private long uspendable;
    /**
     * The Unspendables.
     */
    private Unspendables unspendables;
}
