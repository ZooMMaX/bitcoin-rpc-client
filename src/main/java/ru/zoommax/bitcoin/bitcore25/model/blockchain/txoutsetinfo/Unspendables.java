package ru.zoommax.bitcoin.bitcore25.model.blockchain.txoutsetinfo;

import lombok.Getter;
import lombok.Setter;

/**
 * The type Unspendables.
 */
@Getter
@Setter
public class Unspendables {
    /**
     * The Genesis block.
     */
    private long genesis_block;
    /**
     * The Bip 30.
     */
    private long bip30;
    /**
     * The Scripts.
     */
    private long scripts;
    /**
     * The Unclaimed rewards.
     */
    private long unclaimed_rewards;
}
