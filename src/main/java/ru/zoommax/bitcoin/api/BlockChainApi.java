package ru.zoommax.bitcoin.api;

import ru.zoommax.bitcoin.JsonRpc20;
import ru.zoommax.bitcoin.JsonRpcClient;
import ru.zoommax.bitcoin.annotation.NoComplete;
import ru.zoommax.bitcoin.model.*;

import java.util.Map;

/**
 * The type Block chain api.
 */
public class BlockChainApi extends JsonRpcClient {

    /**
     * Instantiates a new Block chain api.
     *
     * @param username the username
     * @param password the password
     * @param url      the url
     */
    public BlockChainApi(String username, String password, String url) {
        super(username, password, url);
    }

    /**
     * Gets best block hash.
     *
     * @return the best block hash
     */
    public String getBestBlockHash() {
        JsonRpc20 json = new JsonRpc20.Builder().setMethod("getbestblockhash").getJson();
        return this.post(json, StringValue.class);
    }

    /**
     * Gets block.
     *
     * @param hash the hash
     * @return the block
     */
    public Block getBlock(String hash) {
        JsonRpc20 json = new JsonRpc20.Builder().appendParams(hash).appendParams(1).setMethod("getblock").getJson();
        return this.post(json, Block.Result.class);
    }

    /**
     * Gets block chain info.
     *
     * @return the block chain info
     */
    public BlockChainInfo getBlockChainInfo() {
        JsonRpc20 json = new JsonRpc20.Builder().setMethod("getblockchaininfo").getJson();
        return this.post(json, BlockChainInfo.Result.class);
    }

    /**
     * Gets block count.
     *
     * @return the block count
     */
    public long getBlockCount() {
        JsonRpc20 json = new JsonRpc20.Builder().setMethod("getblockcount").getJson();
        return this.post(json, LongValue.class).longValue();
    }

    /**
     * Gets block hash.
     *
     * @param height the height
     * @return the block hash
     */
    public String getBlockHash(int height) {
        JsonRpc20 json = new JsonRpc20.Builder().setMethod("getblockhash").appendParams(height).getJson();
        return this.post(json, StringValue.class);
    }

    /**
     * Gets block header.
     *
     * @param hash the hash
     * @return the block header
     */
    public BlockHeader getBlockHeader(String hash) {
        JsonRpc20 json = new JsonRpc20.Builder().setMethod("getblockheader").appendParams(hash).getJson();
        return this.post(json, BlockHeader.Result.class);
    }

    /**
     * Gets block stats.
     *
     * @param hash  the hash
     * @param stats the stats
     * @return the block stats
     */
    public BlockStats getBlockStats(String hash, String... stats) {
        return this.queryBlockStats(hash, stats);
    }

    /**
     * Gets block stats.
     *
     * @param height the height
     * @param stats  the stats
     * @return the block stats
     */
    public BlockStats getBlockStats(int height, String... stats) {
        return this.queryBlockStats(height, stats);
    }

    /**
     * Query block stats block stats.
     *
     * @param param the param
     * @param stats the stats
     * @return the block stats
     */
    private BlockStats queryBlockStats(Object param, String... stats) {
        JsonRpc20.Builder builder = new JsonRpc20.Builder().setMethod("getblockstats").appendParams(param);
        if (stats != null && stats.length > 0) {
            builder.appendParams(stats);
        }
        JsonRpc20 json = builder.getJson();
        return this.post(json, BlockStats.Result.class);
    }

    /**
     * Get chain tips chain tip [ ].
     *
     * @return the chain tip [ ]
     */
    public ChainTip[] getChainTips() {
        JsonRpc20 json = new JsonRpc20.Builder().setMethod("getchaintips").getJson();
        return this.post(json, ChainTip.Result.class);
    }

    /**
     * Gets chain tx stats.
     *
     * @return the chain tx stats
     */
    public ChainTxStats getChainTxStats() {
        JsonRpc20 json = new JsonRpc20.Builder().setMethod("getchaintxstats").getJson();
        return this.post(json, ChainTxStats.Result.class);
    }

    /**
     * Gets difficulty.
     *
     * @return the difficulty
     */
    public Long getDifficulty() {
        JsonRpc20 json = new JsonRpc20.Builder().setMethod("getdifficulty").getJson();
        return this.post(json, LongValue.class).longValue();
    }

    /**
     * Gets mem pool info.
     *
     * @return the mem pool info
     */
    public MemPoolInfo getMemPoolInfo() {
        JsonRpc20 json = new JsonRpc20.Builder().setMethod("getmempoolinfo").getJson();
        return this.post(json, MemPoolInfo.Result.class);
    }

    /**
     * Get raw mem pool string [ ].
     *
     * @return the string [ ]
     */
    public String[] getRawMemPool() {
        JsonRpc20 json = new JsonRpc20.Builder().setMethod("getrawmempool").getJson();
        return this.post(json, ArrayValue.StringArray.class);
    }

    /**
     * Gets raw mem pool tx.
     *
     * @return the raw mem pool tx
     */
    public Map<String, MemPoolTxInfo> getRawMemPoolTx() {
        JsonRpc20 json = new JsonRpc20.Builder().setMethod("getrawmempool").appendParams(true).getJson();
        return this.post(json, MemPoolTxInfo.MapResult.class);
    }

    /**
     * Get mem pool ancestors string [ ].
     *
     * @param txHash the tx hash
     * @return the string [ ]
     */
    public String[] getMemPoolAncestors(String txHash) {
        JsonRpc20 json = new JsonRpc20.Builder().setMethod("getmempoolancestors").appendParams(txHash).getJson();
        return this.post(json, ArrayValue.StringArray.class);
    }

    /**
     * Get mem pool descendants string [ ].
     *
     * @param txHash the tx hash
     * @return the string [ ]
     */
    public String[] getMemPoolDescendants(String txHash) {
        JsonRpc20 json = new JsonRpc20.Builder().setMethod("getmempooldescendants").appendParams(txHash).getJson();
        return this.post(json, ArrayValue.StringArray.class);
    }

    /**
     * Gets mem pool entry.
     *
     * @param txHash the tx hash
     * @return the mem pool entry
     */
    public MemPoolTxInfo getMemPoolEntry(String txHash) {
        JsonRpc20 json = new JsonRpc20.Builder().setMethod("getmempoolentry").appendParams(txHash).getJson();
        return this.post(json, MemPoolTxInfo.Result.class);
    }

    /**
     * Gets tx out.
     *
     * @param txHash the tx hash
     * @param n      the n
     * @param pool   the pool
     * @return the tx out
     */
    public TransactionOut getTxOut(String txHash, int n, boolean pool) {
        JsonRpc20 json = new JsonRpc20.Builder().setMethod("gettxout")
                .appendParams(txHash).appendParams(n).appendParams(pool).getJson();
        return this.post(json, TransactionOut.Result.class);
    }

    /**
     * Gets tx out proof by block.
     *
     * @param blockHash the block hash
     * @param txHash    the tx hash
     * @return the tx out proof by block
     */
    public TransactionOut getTxOutProofByBlock(String blockHash, String... txHash) {
        JsonRpc20 json = new JsonRpc20.Builder().setMethod("gettxoutproof")
                .appendParams(txHash).appendParams(blockHash).getJson();
        return this.post(json, TransactionOut.Result.class);
    }

    /**
     * Gets tx out proof.
     *
     * @param txHash the tx hash
     * @return the tx out proof
     */
    public String getTxOutProof(String... txHash) {
        JsonRpc20 json = new JsonRpc20.Builder().setMethod("gettxoutproof")
                .appendParams(txHash).getJson();
        return this.post(json, StringValue.class);
    }

    /**
     * Gets tx out set info.
     *
     * @return the tx out set info
     */
    public TxOutSetInfo getTxOutSetInfo() {
        JsonRpc20 json = new JsonRpc20.Builder().setMethod("gettxoutsetinfo").getJson();
        return this.post(json, TxOutSetInfo.Result.class);
    }

    /**
     * Precious block string.
     *
     * @param block the block
     * @return the string
     */
    @NoComplete
    private String preciousBlock(String block) {
        JsonRpc20 json = new JsonRpc20.Builder().setMethod("preciousblock").appendParams(block).getJson();
        return this.post(json, StringValue.class);
    }

    /**
     * Prune block chain string.
     *
     * @return the string
     */
    @NoComplete
    private String pruneBlockChain() {
        JsonRpc20 json = new JsonRpc20.Builder().setMethod("pruneblockchain").getJson();
        return this.post(json, StringValue.class);
    }

    /**
     * Save mem pool string.
     *
     * @return the string
     */
    public String saveMemPool() {
        JsonRpc20 json = new JsonRpc20.Builder().setMethod("savemempool").getJson();
        return this.post(json, StringValue.class);
    }

    /**
     * Scan tx out set string.
     *
     * @param action the action
     * @param obj    the obj
     * @return the string
     */
    @NoComplete
    public String scanTxOutSet(ScanAction action, ScanObject... obj) {
        JsonRpc20.Builder builder = new JsonRpc20.Builder().setMethod("scantxoutset");
        if (obj != null && obj.length > 0) {
            builder.appendParams(action);
        }
        return this.post(builder.getJson(), StringValue.class);
    }

    /**
     * The enum Scan action.
     */
    public static enum ScanAction {
        /**
         * The Start.
         */
        start,
        /**
         * The Abort.
         */
        abort,
        /**
         * The Status.
         */
        status
    }

    /**
     * The type Scan object.
     */
    public static class ScanObject {
    }

    /**
     * Verify chain boolean.
     *
     * @param level   the level
     * @param nblocks the nblocks
     * @return the boolean
     */
    public boolean verifyChain(int level, int nblocks) {
        JsonRpc20 json = new JsonRpc20.Builder().setMethod("verifychain")
                .appendParams(level).appendParams(nblocks).getJson();
        return this.post(json, BooleanValue.class).booleanValue();
    }

    /**
     * Verify tx out proof boolean.
     *
     * @param proof the proof
     * @return the boolean
     */
    public boolean verifyTxOutProof(String proof) {
        JsonRpc20 json = new JsonRpc20.Builder().setMethod("verifytxoutproof")
                .appendParams(proof).getJson();
        return this.post(json, BooleanValue.class).booleanValue();
    }

    /**
     * Verify out proof boolean.
     *
     * @param tx the tx
     * @return the boolean
     */
    public boolean verifyOutProof(String... tx) {
        String proof = this.getTxOutProof(tx);
        return this.verifyTxOutProof(proof);
    }
}
