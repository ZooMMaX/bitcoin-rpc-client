package ru.zoommax.bitcoin.bitcore25.api.blockchain;

import java.util.List;

import com.fasterxml.jackson.databind.ObjectMapper;

import ru.zoommax.bitcoin.JsonRpc20;
import ru.zoommax.bitcoin.JsonRpcClient;
import ru.zoommax.bitcoin.bitcore25.model.blockchain.Block;
import ru.zoommax.bitcoin.bitcore25.model.blockchain.BlockChainInfo;
import ru.zoommax.bitcoin.bitcore25.model.blockchain.BlockFilter;
import ru.zoommax.bitcoin.bitcore25.model.blockchain.BlockHeader;
import ru.zoommax.bitcoin.bitcore25.model.blockchain.BlockStats;
import ru.zoommax.bitcoin.bitcore25.model.blockchain.ChainTxStats;
import ru.zoommax.bitcoin.bitcore25.model.blockchain.MempoolEntry;
import ru.zoommax.bitcoin.bitcore25.model.blockchain.MempoolInfo;
import ru.zoommax.bitcoin.bitcore25.model.blockchain.RawMempool;
import ru.zoommax.bitcoin.bitcore25.model.blockchain.SaveMempool;
import ru.zoommax.bitcoin.bitcore25.model.blockchain.ScanBlocks;
import ru.zoommax.bitcoin.bitcore25.model.blockchain.VerifyTxOutProof;
import ru.zoommax.bitcoin.bitcore25.model.blockchain.chaintips.ChainTips;
import ru.zoommax.bitcoin.bitcore25.model.blockchain.deploymentinfo.DeploymentInfo;
import ru.zoommax.bitcoin.bitcore25.model.blockchain.mempoolancestorsdescendants.MempoolAncestors;
import ru.zoommax.bitcoin.bitcore25.model.blockchain.mempoolancestorsdescendants.MempoolDescendants;
import ru.zoommax.bitcoin.bitcore25.model.blockchain.scantxoutset.ScanTxOutSet;
import ru.zoommax.bitcoin.bitcore25.model.blockchain.txout.TxOut;
import ru.zoommax.bitcoin.bitcore25.model.blockchain.txoutsetinfo.TxOutSetInfo;
import ru.zoommax.bitcoin.bitcore25.model.blockchain.txspendingprevout.TxSpendingPrevout;
import ru.zoommax.bitcoin.bitcore25.model.useany.BooleanValue;
import ru.zoommax.bitcoin.bitcore25.model.useany.DoubleValue;
import ru.zoommax.bitcoin.bitcore25.model.useany.LongValue;
import ru.zoommax.bitcoin.bitcore25.model.useany.StringValue;

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
		return this.post(new JsonRpc20.Builder().setMethod("getbestblockhash").getJson(), StringValue.class);
	}

	/**
	 * Gets block.
	 *
	 * @param hash the hash
	 * @return the block
	 */
	public Block getBlock(String hash) {
		return this.post(new JsonRpc20.Builder().setMethod("getblock").appendParams(hash).getJson(), Block.Result.class);
	}

	/**
	 * Gets block chain info.
	 *
	 * @return the block chain info
	 */
	public BlockChainInfo getBlockChainInfo() {
		return this.post(new JsonRpc20.Builder().setMethod("getblockchaininfo").getJson(), BlockChainInfo.Result.class);
	}

	/**
	 * Gets block count.
	 *
	 * @return the block count
	 */
	public long getBlockCount() {
		return this.post(new JsonRpc20.Builder().setMethod("getblockcount").getJson(), LongValue.class);
	}

	/**
	 * Gets block filter.
	 *
	 * @param blockHash  the block hash
	 * @param filterType the filter type
	 * @return the block filter
	 */
	public BlockFilter getBlockFilter(String blockHash, String filterType) {
		final JsonRpc20.Builder builder = new JsonRpc20.Builder().setMethod("getblockfilter").appendParams(blockHash);
		if (filterType != null && !filterType.isEmpty()) {
			builder.appendParams(filterType);
		}
		return this.post(builder.getJson(), BlockFilter.Result.class);
	}

	/**
	 * Gets block from peer.
	 *
	 * @param blockHash the block hash
	 * @param peerId    the peer id
	 */
	public void getBlockFromPeer(String blockHash, long peerId) {
		final JsonRpc20.Builder builder = new JsonRpc20.Builder().setMethod("getblockfrompeer")
				.appendParams(blockHash)
				.appendParams(peerId);
		this.post(builder.getJson(), StringValue.class);
	}

	/**
	 * Gets block hash.
	 *
	 * @param height the height
	 * @return the block hash
	 */
	public String getBlockHash(long height) {
		return this.post(new JsonRpc20.Builder().setMethod("getblockhash").appendParams(height).getJson(), StringValue.class);
	}

	/**
	 * Gets block header.
	 *
	 * @param blockHash the block hash
	 * @param verbose   the verbose
	 * @return the block header
	 */
	public BlockHeader getBlockHeader(String blockHash, boolean verbose) {
		final JsonRpc20.Builder builder = new JsonRpc20.Builder().setMethod("getblockheader").appendParams(blockHash);
		if (verbose) {
			builder.appendParams(verbose);
		}
		return this.post(builder.getJson(), BlockHeader.Result.class);
	}

	/**
	 * Gets block stats.
	 *
	 * @param hashOrHeight   the hash or height
	 * @param statsJsonArray the stats json array
	 * @return the block stats
	 */
	public BlockStats getBlockStats(Object hashOrHeight, String statsJsonArray) {
		final JsonRpc20.Builder builder = new JsonRpc20.Builder().setMethod("getblockstats");
		if (hashOrHeight instanceof String) {
			builder.appendParams(hashOrHeight);
		} else if (hashOrHeight instanceof Long) {
			builder.appendParams(hashOrHeight);
		}
		if (statsJsonArray != null && !statsJsonArray.isEmpty()) {
			builder.appendParams(statsJsonArray);
		}
		return this.post(builder.getJson(), BlockStats.Result.class);
	}

	/**
	 * Get chain tips chain tips [ ].
	 *
	 * @return the chain tips [ ]
	 */
	public ChainTips[] getChainTips() {
		return this.post(new JsonRpc20.Builder().setMethod("getchaintips").getJson(), ChainTips.Result.class);
	}

	/**
	 * Gets chain tx stats.
	 *
	 * @param nBlocks   the n blocks
	 * @param blockHash the block hash
	 * @return the chain tx stats
	 */
	public ChainTxStats getChainTxStats(long nBlocks, String blockHash) {
		final JsonRpc20.Builder builder = new JsonRpc20.Builder().setMethod("getchaintxstats").appendParams(nBlocks);
		if (blockHash != null && !blockHash.isEmpty()) {
			builder.appendParams(blockHash);
		}
		return this.post(builder.getJson(), ChainTxStats.Result.class);
	}

	/**
	 * Gets deployment info.
	 *
	 * @param blockHash the block hash
	 * @return the deployment info
	 */
	public DeploymentInfo getDeploymentInfo(String blockHash) {
		final JsonRpc20.Builder builder = new JsonRpc20.Builder().setMethod("getdeploymentinfo");
		if (blockHash != null && !blockHash.isEmpty()) {
			builder.appendParams(blockHash);
		}
		return this.post(builder.getJson(), DeploymentInfo.Result.class);
	}

	/**
	 * Gets difficulty.
	 *
	 * @return the difficulty
	 */
	public double getDifficulty() {
		return this.post(new JsonRpc20.Builder().setMethod("getdifficulty").getJson(), DoubleValue.class);
	}

	/**
	 * Gets mempool ancestors.
	 *
	 * @param txid    the txid
	 * @param verbose the verbose
	 * @return the mempool ancestors
	 */
	public Object getMempoolAncestors(String txid, boolean verbose) {
		final JsonRpc20.Builder builder = new JsonRpc20.Builder().setMethod("getmempoolancestors").appendParams(txid);
		if (verbose) {
			builder.appendParams(verbose);
			return this.post(builder.getJson(), MempoolAncestors.ResultHashMap.class);
		}
		return this.post(builder.getJson(), MempoolAncestors.ResultArray.class);
	}

	/**
	 * Gets mempool descendants.
	 *
	 * @param txid    the txid
	 * @param verbose the verbose
	 * @return the mempool descendants
	 */
	public Object getMempoolDescendants(String txid, boolean verbose) {
		final JsonRpc20.Builder builder = new JsonRpc20.Builder().setMethod("getmempooldescendants").appendParams(txid);
		if (verbose) {
			builder.appendParams(verbose);
			return this.post(builder.getJson(), MempoolDescendants.ResultHashMap.class);
		}
		return this.post(builder.getJson(), MempoolDescendants.ResultArray.class);
	}

	/**
	 * Gets mempool entry.
	 *
	 * @param txid the txid
	 * @return the mempool entry
	 */
	public MempoolEntry getMempoolEntry(String txid) {
		return this.post(new JsonRpc20.Builder().setMethod("getmempoolentry").appendParams(txid).getJson(), MempoolEntry.Result.class);
	}

	/**
	 * Gets mempool info.
	 *
	 * @return the mempool info
	 */
	public MempoolInfo getMempoolInfo() {
		return this.post(new JsonRpc20.Builder().setMethod("getmempoolinfo").getJson(), MempoolInfo.Result.class);
	}

	/**
	 * Gets raw mempool.
	 *
	 * @param verbose          the verbose
	 * @param mempool_sequence the mempool sequence
	 * @return the raw mempool
	 */
	public Object getRawMempool(boolean verbose, boolean mempool_sequence) {
		final JsonRpc20.Builder builder = new JsonRpc20.Builder().setMethod("getrawmempool");
		if (!verbose && !mempool_sequence) {
			builder.appendParams(verbose).appendParams(mempool_sequence);
			return this.post(builder.getJson(), RawMempool.ResultArray.class);
		} else if (verbose && !mempool_sequence) {
			builder.appendParams(verbose);
			return this.post(builder.getJson(), RawMempool.ResultHashMap.class);
		} else if (!verbose && mempool_sequence) {
			builder.appendParams(mempool_sequence);
			return this.post(builder.getJson(), RawMempool.ResultHashMap.class);
		} else if (verbose && mempool_sequence) {
			builder.appendParams(verbose).appendParams(false);
			return this.post(builder.getJson(), RawMempool.ResultHashMap.class);
		}
		return null;
	}

	/**
	 * Gets tx out.
	 *
	 * @param txid            the txid
	 * @param vout            the vout
	 * @param include_mempool the include mempool
	 * @return the tx out
	 */
	public TxOut getTxOut(String txid, long vout, boolean include_mempool) {
		final JsonRpc20.Builder builder = new JsonRpc20.Builder().setMethod("gettxout").appendParams(txid).appendParams(vout);
		if (include_mempool) {
			builder.appendParams(include_mempool);
		}
		return this.post(builder.getJson(), TxOut.Result.class);
	}

	/**
	 * Gets tx out proof.
	 *
	 * @param txids     the txids
	 * @param blockhash the blockhash
	 * @return the tx out proof
	 */
	public String getTxOutProof(String[] txids, String blockhash) {
		final JsonRpc20.Builder builder = new JsonRpc20.Builder().setMethod("gettxoutproof").appendParams(txids);
		if (blockhash != null && !blockhash.isEmpty()) {
			builder.appendParams(blockhash);
		}
		return this.post(builder.getJson(), StringValue.class);
	}

	/**
	 * Gets tx out set info.
	 *
	 * @param hash_type      the hash type
	 * @param hash_or_height the hash or height
	 * @param use_index      the use index
	 * @return the tx out set info
	 */
	public TxOutSetInfo getTxOutSetInfo(String hash_type, String hash_or_height, boolean use_index) {
		final JsonRpc20.Builder builder = new JsonRpc20.Builder().setMethod("gettxoutsetinfo").appendParams(hash_type).appendParams(hash_or_height);
		if (use_index) {
			builder.appendParams(use_index);
		}
		return this.post(builder.getJson(), TxOutSetInfo.Result.class);
	}

	/**
	 * Gets tx spending prevout.
	 *
	 * @param txid_vout the txid vout
	 * @return the tx spending prevout
	 */
	public TxSpendingPrevout getTxSpendingPrevout(List<String> txid_vout) {
		final String tv = new ObjectMapper().valueToTree(txid_vout).toString();
		final JsonRpc20.Builder builder = new JsonRpc20.Builder().setMethod("gettxspendingprevout").appendParams(tv);
		return this.post(builder.getJson(), TxSpendingPrevout.Result.class);
	}

	/**
	 * Precious block.
	 *
	 * @param blockhash the blockhash
	 */
	public void preciousBlock(String blockhash) {
		final JsonRpc20.Builder builder = new JsonRpc20.Builder().setMethod("preciousblock").appendParams(blockhash);
		this.post(builder.getJson(), StringValue.class);
	}

	/**
	 * Prune blockchain long.
	 *
	 * @param height the height
	 * @return the long
	 */
	public Long pruneBlockchain(long height) {
		final JsonRpc20.Builder builder = new JsonRpc20.Builder().setMethod("pruneblockchain").appendParams(height);
		return this.post(builder.getJson(), LongValue.class);
	}

	/**
	 * Save mempool save mempool.
	 *
	 * @return the save mempool
	 */
	public SaveMempool saveMempool() {
		final JsonRpc20.Builder builder = new JsonRpc20.Builder().setMethod("savemempool");
		return this.post(builder.getJson(), SaveMempool.Result.class);
	}

	/**
	 * Scan blocks scan blocks.
	 *
	 * @param action       the action
	 * @param scanobjects  the scanobjects
	 * @param start_height the start height
	 * @param stop_height  the stop height
	 * @param filtertype   the filtertype
	 * @param options      the options
	 * @return the scan blocks
	 */
	public ScanBlocks scanBlocks(String action, List<String> scanobjects, long start_height, long stop_height, String filtertype, String options) {
		final JsonRpc20.Builder builder = new JsonRpc20.Builder().setMethod("scanblocks").appendParams(action).appendParams(scanobjects).appendParams(start_height).appendParams(stop_height).appendParams(filtertype).appendParams(options);
		return this.post(builder.getJson(), ScanBlocks.Result.class);
	}

	/**
	 * Scan tx out set scan tx out set.
	 *
	 * @param action      the action
	 * @param scanobjects the scanobjects
	 * @return the scan tx out set
	 */
	public ScanTxOutSet scanTxOutSet(String action, String scanobjects) {
		final JsonRpc20.Builder builder = new JsonRpc20.Builder().setMethod("scantxoutset").appendParams(action).appendParams(scanobjects);
		return this.post(builder.getJson(), ScanTxOutSet.Result.class);
	}

	/**
	 * Verify chain boolean.
	 *
	 * @param checklevel the checklevel
	 * @param nblocks    the nblocks
	 * @return the boolean
	 */
	public boolean verifyChain(long checklevel, long nblocks) {
		final JsonRpc20.Builder builder = new JsonRpc20.Builder().setMethod("verifychain").appendParams(checklevel).appendParams(nblocks);
		return this.post(builder.getJson(), BooleanValue.class);
	}

	/**
	 * Verify tx out proof verify tx out proof.
	 *
	 * @param proof the proof
	 * @return the verify tx out proof
	 */
	public VerifyTxOutProof verifyTxOutProof(String proof) {
		final JsonRpc20.Builder builder = new JsonRpc20.Builder().setMethod("verifytxoutproof").appendParams(proof);
		return this.post(builder.getJson(), VerifyTxOutProof.Result.class);
	}
}
