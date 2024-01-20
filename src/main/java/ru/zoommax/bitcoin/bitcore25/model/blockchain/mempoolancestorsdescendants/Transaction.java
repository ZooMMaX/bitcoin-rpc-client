package ru.zoommax.bitcoin.bitcore25.model.blockchain.mempoolancestorsdescendants;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Transaction {
    private long vsize;
    private long weight;
    private long time;
    private long height;
    private long descendantcount;
    private long descendantsize;
    private long ancestorcount;
    private long ancestorsize;
    private String wtxid;
    private Fees fees;
    private String[] depends;
    private String[] spentby;
    @JsonProperty("bip125-replaceable")
    private boolean bip125replaceable;
    private boolean unbroadcast;
}
