package ru.zoommax.bitcoin.bitcore25.api.blockchain;

import ru.zoommax.bitcoin.JsonRpc20;
import ru.zoommax.bitcoin.JsonRpcClient;
import ru.zoommax.bitcoin.bitcore25.model.DoubleValue;
import ru.zoommax.bitcoin.bitcore25.model.blockchain.*;
import ru.zoommax.bitcoin.bitcore25.model.LongValue;
import ru.zoommax.bitcoin.bitcore25.model.StringValue;
import ru.zoommax.bitcoin.bitcore25.model.blockchain.chaintips.ChainTips;
import ru.zoommax.bitcoin.bitcore25.model.blockchain.deploymentinfo.DeploymentInfo;

/**
 * The type Blockchain api.
 */
public class BlockChainApi extends JsonRpcClient {
    /**
     * Instantiates a new Blockchain api.
     *
     * @param username the username
     * @param password the password
     * @param url      the url
     */
    public BlockChainApi(String username, String password, String url) {
        super(username, password, url);
    }

    /**
     * Get best block hash string.
     *
     * @return the string
     */
    public String getBestBlockHash() {
        return this.post(new JsonRpc20.Builder().setMethod("getbestblockhash").getJson(), StringValue.class);
    }

/**
     * Get block.
     *
     * @param hash the hash of the block
     * @return {@link Block}
     */
    public Block getBlock(String hash) {
        return this.post(new JsonRpc20.Builder().setMethod("getblock").appendParams(hash).getJson(), Block.Result.class);
    }

    /**
     * Get blockchain info.
     *
     * @return {@link BlockChainInfo}
     */
    public BlockChainInfo getBlockChainInfo() {
        return this.post(new JsonRpc20.Builder().setMethod("getblockchaininfo").getJson(), BlockChainInfo.Result.class);
    }

    /**
     * Get block count.
     *
     * @return the block count
     */
    public long getBlockCount() {
        return this.post(new JsonRpc20.Builder().setMethod("getblockcount").getJson(), LongValue.class);
    }

    /**
     * Get block filter.
     * @param blockHash the block hash
     * @param filterType the filter type
     * @return {@link BlockFilter}
     */
    public BlockFilter getBlockFilter(String blockHash, String filterType) {
        JsonRpc20.Builder builder = new JsonRpc20.Builder().setMethod("getblockfilter").appendParams(blockHash);
        if (filterType != null && !filterType.isEmpty()) {
            builder.appendParams(filterType);
        }
        return this.post(builder.getJson(), BlockFilter.Result.class);
    }

    /**
     * Get block from peer.
     * @param blockHash the block hash
     * @param peerId the peer id
     */
    public void getBlockFromPeer(String blockHash, long peerId) {
        JsonRpc20.Builder builder = new JsonRpc20.Builder().setMethod("getblockfrompeer")
                .appendParams(blockHash)
                .appendParams(peerId);
        this.post(builder.getJson(), StringValue.class);
    }

    /**
     * Get block hash.
     * @param height the height
     * @return the block hash
     */
    public String getBlockHash(long height) {
        return this.post(new JsonRpc20.Builder().setMethod("getblockhash").appendParams(height).getJson(), StringValue.class);
    }

    /**
     * Get block header.
     * @param blockHash the block hash
     * @param verbose the verbose
     * @return {@link BlockHeader} the block header
     */
    public BlockHeader getBlockHeader(String blockHash, boolean verbose) {
        JsonRpc20.Builder builder = new JsonRpc20.Builder().setMethod("getblockheader").appendParams(blockHash);
        if (verbose) {
            builder.appendParams(verbose);
        }
        return this.post(builder.getJson(), BlockHeader.Result.class);
    }

    /**
     * Get block stats.
     */
    public BlockStats getBlockStats(Object hashOrHeight, String statsJsonArray) {
        JsonRpc20.Builder builder = new JsonRpc20.Builder().setMethod("getblockstats");
        if (hashOrHeight instanceof String) {
            builder.appendParams((String) hashOrHeight);
        } else if (hashOrHeight instanceof Long) {
            builder.appendParams((Long) hashOrHeight);
        }
        if (statsJsonArray != null && !statsJsonArray.isEmpty()) {
            builder.appendParams(statsJsonArray);
        }
        return this.post(builder.getJson(), BlockStats.Result.class);
    }

    /**
     * Get chain tips.
     * @return {@link ChainTips}
     */
    public ChainTips[] getChainTips() {
        return this.post(new JsonRpc20.Builder().setMethod("getchaintips").getJson(), ChainTips.Result.class);
    }

    /**
     * Get chain tx stats.
     * @param nBlocks the n blocks
     * @param blockHash the block hash
     * @return {@link ChainTxStats}
     */
    public ChainTxStats getChainTxStats(long nBlocks, String blockHash) {
        JsonRpc20.Builder builder = new JsonRpc20.Builder().setMethod("getchaintxstats").appendParams(nBlocks);
        if (blockHash != null && !blockHash.isEmpty()) {
            builder.appendParams(blockHash);
        }
        return this.post(builder.getJson(), ChainTxStats.Result.class);
    }

    /**
     * Get deployment info.
     * @return {@link  DeploymentInfo} the deployment info
     */
    public DeploymentInfo getDeploymentInfo(String blockHash) {
        JsonRpc20.Builder builder = new JsonRpc20.Builder().setMethod("getdeploymentinfo");
        if (blockHash != null && !blockHash.isEmpty()) {
            builder.appendParams(blockHash);
        }
        return this.post(builder.getJson(), DeploymentInfo.Result.class);
    }

    /**
     * Get difficulty.
     * @return the difficulty
     */
    public double getDifficulty() {
        return this.post(new JsonRpc20.Builder().setMethod("getdifficulty").getJson(), DoubleValue.class);
    }
}
