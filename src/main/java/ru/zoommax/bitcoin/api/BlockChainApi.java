package ru.zoommax.bitcoin.api;

import ru.zoommax.bitcoin.JsonRpc20;
import ru.zoommax.bitcoin.JsonRpcClient;
import ru.zoommax.bitcoin.annotation.NoComplete;
import ru.zoommax.bitcoin.model.*;

import java.util.Map;

public class BlockChainApi extends JsonRpcClient {

    public BlockChainApi(String username, String password, String url) {
        super(username, password, url);
    }

    public String getBestBlockHash() {
        JsonRpc20 json = new JsonRpc20.Builder().setMethod("getbestblockhash").getJson();
        return this.post(json, StringValue.class);
    }

    public Block getBlock(String hash) {
        JsonRpc20 json = new JsonRpc20.Builder().appendParams(hash).appendParams(1).setMethod("getblock").getJson();
        return this.post(json, Block.Result.class);
    }

    public BlockChainInfo getBlockChainInfo() {
        JsonRpc20 json = new JsonRpc20.Builder().setMethod("getblockchaininfo").getJson();
        return this.post(json, BlockChainInfo.Result.class);
    }

    public long getBlockCount() {
        JsonRpc20 json = new JsonRpc20.Builder().setMethod("getblockcount").getJson();
        return this.post(json, LongValue.class).longValue();
    }

    public String getBlockHash(int height) {
        JsonRpc20 json = new JsonRpc20.Builder().setMethod("getblockhash").appendParams(height).getJson();
        return this.post(json, StringValue.class);
    }

    public BlockHeader getBlockHeader(String hash) {
        JsonRpc20 json = new JsonRpc20.Builder().setMethod("getblockheader").appendParams(hash).getJson();
        return this.post(json, BlockHeader.Result.class);
    }

    /**
     * @param hash
     * @param stats BlockStats properties
     * @return
     */
    public BlockStats getBlockStats(String hash, String... stats) {
        return this.queryBlockStats(hash, stats);
    }

    /**
     * @param height
     * @param stats  BlockStats properties
     * @return
     */
    public BlockStats getBlockStats(int height, String... stats) {
        return this.queryBlockStats(height, stats);
    }

    private BlockStats queryBlockStats(Object param, String... stats) {
        JsonRpc20.Builder builder = new JsonRpc20.Builder().setMethod("getblockstats").appendParams(param);
        if (stats != null && stats.length > 0) {
            builder.appendParams(stats);
        }
        JsonRpc20 json = builder.getJson();
        return this.post(json, BlockStats.Result.class);
    }

    public ChainTip[] getChainTips() {
        JsonRpc20 json = new JsonRpc20.Builder().setMethod("getchaintips").getJson();
        return this.post(json, ChainTip.Result.class);
    }

    public ChainTxStats getChainTxStats() {
        JsonRpc20 json = new JsonRpc20.Builder().setMethod("getchaintxstats").getJson();
        return this.post(json, ChainTxStats.Result.class);
    }

    public Long getDifficulty() {
        JsonRpc20 json = new JsonRpc20.Builder().setMethod("getdifficulty").getJson();
        return this.post(json, LongValue.class).longValue();
    }

    public MemPoolInfo getMemPoolInfo() {
        JsonRpc20 json = new JsonRpc20.Builder().setMethod("getmempoolinfo").getJson();
        return this.post(json, MemPoolInfo.Result.class);
    }

    public String[] getRawMemPool() {
        JsonRpc20 json = new JsonRpc20.Builder().setMethod("getrawmempool").getJson();
        return this.post(json, ArrayValue.StringArray.class);
    }

    public Map<String, MemPoolTxInfo> getRawMemPoolTx() {
        JsonRpc20 json = new JsonRpc20.Builder().setMethod("getrawmempool").appendParams(true).getJson();
        return this.post(json, MemPoolTxInfo.MapResult.class);
    }

    public String[] getMemPoolAncestors(String txHash) {
        JsonRpc20 json = new JsonRpc20.Builder().setMethod("getmempoolancestors").appendParams(txHash).getJson();
        return this.post(json, ArrayValue.StringArray.class);
    }

    public String[] getMemPoolDescendants(String txHash) {
        JsonRpc20 json = new JsonRpc20.Builder().setMethod("getmempooldescendants").appendParams(txHash).getJson();
        return this.post(json, ArrayValue.StringArray.class);
    }

    public MemPoolTxInfo getMemPoolEntry(String txHash) {
        JsonRpc20 json = new JsonRpc20.Builder().setMethod("getmempoolentry").appendParams(txHash).getJson();
        return this.post(json, MemPoolTxInfo.Result.class);
    }

    public TransactionOut getTxOut(String txHash, int n, boolean pool) {
        JsonRpc20 json = new JsonRpc20.Builder().setMethod("gettxout")
                .appendParams(txHash).appendParams(n).appendParams(pool).getJson();
        return this.post(json, TransactionOut.Result.class);
    }

    public TransactionOut getTxOutProofByBlock(String blockHash, String... txHash) {
        JsonRpc20 json = new JsonRpc20.Builder().setMethod("gettxoutproof")
                .appendParams(txHash).appendParams(blockHash).getJson();
        return this.post(json, TransactionOut.Result.class);
    }

    public String getTxOutProof(String... txHash) {
        JsonRpc20 json = new JsonRpc20.Builder().setMethod("gettxoutproof")
                .appendParams(txHash).getJson();
        return this.post(json, StringValue.class);
    }

    public TxOutSetInfo getTxOutSetInfo() {
        JsonRpc20 json = new JsonRpc20.Builder().setMethod("gettxoutsetinfo").getJson();
        return this.post(json, TxOutSetInfo.Result.class);
    }

    @NoComplete
    private String preciousBlock(String block) {
        JsonRpc20 json = new JsonRpc20.Builder().setMethod("preciousblock").appendParams(block).getJson();
        return this.post(json, StringValue.class);
    }

    @NoComplete
    private String pruneBlockChain() {
        JsonRpc20 json = new JsonRpc20.Builder().setMethod("pruneblockchain").getJson();
        return this.post(json, StringValue.class);
    }

    public String saveMemPool() {
        JsonRpc20 json = new JsonRpc20.Builder().setMethod("savemempool").getJson();
        return this.post(json, StringValue.class);
    }

    @NoComplete
    public String scanTxOutSet(ScanAction action, ScanObject... obj) {
        JsonRpc20.Builder builder = new JsonRpc20.Builder().setMethod("scantxoutset");
        if (obj != null && obj.length > 0) {
            builder.appendParams(action);
        }
        return this.post(builder.getJson(), StringValue.class);
    }

    public static enum ScanAction {
        start, abort, status
    }

    public static class ScanObject {
    }

    /**
     * @param level   (numeric, optional, 0-4, default=3) How thorough the block verification is.
     * @param nblocks (numeric, optional, default=6, 0=all) The number of blocks to check.
     * @return
     */
    public boolean verifyChain(int level, int nblocks) {
        JsonRpc20 json = new JsonRpc20.Builder().setMethod("verifychain")
                .appendParams(level).appendParams(nblocks).getJson();
        return this.post(json, BooleanValue.class).booleanValue();
    }

    /**
     * @param proof (string, required) The hex-encoded proof generated by gettxoutproof
     * @return
     */
    public boolean verifyTxOutProof(String proof) {
        JsonRpc20 json = new JsonRpc20.Builder().setMethod("verifytxoutproof")
                .appendParams(proof).getJson();
        return this.post(json, BooleanValue.class).booleanValue();
    }

    public boolean verifyOutProof(String... tx) {
        String proof = this.getTxOutProof(tx);
        return this.verifyTxOutProof(proof);
    }
}
