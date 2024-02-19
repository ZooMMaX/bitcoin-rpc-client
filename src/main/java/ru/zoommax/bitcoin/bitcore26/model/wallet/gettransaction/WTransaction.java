package ru.zoommax.bitcoin.bitcore26.model.wallet.gettransaction;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import ru.zoommax.bitcoin.bitcore26.model.wallet.LastProcessedBlock;

@Getter
@Setter
public class WTransaction extends ru.zoommax.bitcoin.bitcore25.model.wallet.gettransaction.WTransaction{
    public static class Result extends ru.zoommax.bitcoin.JsonRpcResult<WTransaction> {
    }

    public static class ResultArray extends ru.zoommax.bitcoin.JsonRpcResult<WTransaction[]> {
    }

    @JsonProperty("bip125-replaceable")
    private String bip125Replaceable;

    @JsonProperty("lastprocessedblock")
    private LastProcessedBlock lastProcessedBlock;

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
}
