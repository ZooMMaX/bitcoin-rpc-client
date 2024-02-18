package ru.zoommax.bitcoin.bitcore25.model.wallet.gettransaction;

import lombok.Getter;
import lombok.Setter;

/**
 * The type Details.
 */
@Getter @Setter public class Details {
    /**
     * The Involves watchonly.
     */
    private boolean involvesWatchonly;
    /**
     * The Address.
     */
    private String address;
    /**
     * The Category.
     */
    private String category;
    /**
     * The Amount.
     */
    private double amount;
    /**
     * The Label.
     */
    private String label;
    /**
     * The Vout.
     */
    private double vout;
    /**
     * The Fee.
     */
    private double fee;
    /**
     * The Abandoned.
     */
    private boolean abandoned;
    /**
     * The Parent descs.
     */
    private String[] parent_descs;
}