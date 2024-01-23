package ru.zoommax.bitcoin.bitcore25.model.blockchain.txoutsetinfo;

import lombok.Getter;
import lombok.Setter;
import ru.zoommax.bitcoin.JsonRpcResult;

/**
 * The type Tx out set info.
 */
@Getter
@Setter
public class TxOutSetInfo {
    /**
     * The type Result.
     */
    public static class Result extends JsonRpcResult<TxOutSetInfo> {
    }

    /**
     * The Height.
     */
    private long height;
    /**
     * The Bestblock.
     */
    private String bestblock;
    /**
     * The Txouts.
     */
    private long txouts;
    /**
     * The Bogosize.
     */
    private long bogosize;
    /**
     * The Hash serialized 2.
     */
    private long hash_serialized_2;
    /**
     * The Muhash.
     */
    private String muhash;
    /**
     * The Transactions.
     */
    private long transactions;
    /**
     * The Disk size.
     */
    private long disk_size;
    /**
     * The Total amount.
     */
    private double total_amount;
    /**
     * The Total unspendable amount.
     */
    private double total_unspendable_amount;
    /**
     * The Block info.
     */
    private BlockInfo block_info;
}
