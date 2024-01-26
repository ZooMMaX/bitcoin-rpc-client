package ru.zoommax.bitcoin.bitcore25.model.mining.blocktemplate;

import java.util.Map;

import lombok.Getter;
import lombok.Setter;
import ru.zoommax.bitcoin.JsonRpcResult;
import ru.zoommax.bitcoin.bitcore25.model.useany.StringValue;

/**
 * The type Block template.
 */
@Getter
@Setter
public class BlockTemplate {

    /**
     * The type Result.
     */
    public static class Result extends JsonRpcResult<BlockTemplate> {
	}

    /**
     * The type Result non proposal.
     */
    public static class ResultNonProposal extends JsonRpcResult<StringValue> {
	}

    /**
     * The Version.
     */
    private long version;
    /**
     * The Rules.
     */
    private String[] rules;
    /**
     * The Vbavailable.
     */
    private Map<String, Long> vbavailable;
    /**
     * The Capabilities.
     */
    private String[] capabilities;
    /**
     * The Vbrequired.
     */
    private long vbrequired;
    /**
     * The Previousblockhash.
     */
    private String previousblockhash;
    /**
     * The Transactions.
     */
    private Object transactions; // TODO
    /**
     * The Coinbaseaux.
     */
    private Map<String,String> coinbaseaux;
    /**
     * The Coinbasevalue.
     */
    private long coinbasevalue;
    /**
     * The Longpollid.
     */
    private String longpollid;
    /**
     * The Target.
     */
    private String target;
    /**
     * The Mintime.
     */
    private long mintime;
    /**
     * The Mutable.
     */
    private String[] mutable;
    /**
     * The Noncerange.
     */
    private String noncerange;
    /**
     * The Sigoplimit.
     */
    private long sigoplimit;
    /**
     * The Sizelimit.
     */
    private long sizelimit;
    /**
     * The Weightlimit.
     */
    private long weightlimit;
    /**
     * The Curtime.
     */
    private long curtime;
    /**
     * The Bits.
     */
    private String bits;
    /**
     * The Height.
     */
    private long height;
    /**
     * The Signet challenge.
     */
    private String signet_challenge;
    /**
     * The Default witness commitment.
     */
    private String default_witness_commitment;

}
