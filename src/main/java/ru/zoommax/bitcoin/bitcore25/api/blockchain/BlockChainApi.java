package ru.zoommax.bitcoin.bitcore25.api.blockchain;

import java.util.List;

import org.jetbrains.annotations.Nullable;

import com.fasterxml.jackson.databind.ObjectMapper;

import ru.zoommax.bitcoin.JsonRpc20;
import ru.zoommax.bitcoin.JsonRpcClient;
import ru.zoommax.bitcoin.annotation.ErrorBody;
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
import ru.zoommax.bitcoin.bitcore25.model.blockchain.TxOut;
import ru.zoommax.bitcoin.bitcore25.model.blockchain.VerifyTxOutProof;
import ru.zoommax.bitcoin.bitcore25.model.blockchain.chaintips.ChainTips;
import ru.zoommax.bitcoin.bitcore25.model.blockchain.deploymentinfo.DeploymentInfo;
import ru.zoommax.bitcoin.bitcore25.model.blockchain.mempoolancestorsdescendants.MempoolAncestors;
import ru.zoommax.bitcoin.bitcore25.model.blockchain.mempoolancestorsdescendants.MempoolDescendants;
import ru.zoommax.bitcoin.bitcore25.model.blockchain.scantxoutset.ScanTxOutSet;
import ru.zoommax.bitcoin.bitcore25.model.blockchain.txoutsetinfo.TxOutSetInfo;
import ru.zoommax.bitcoin.bitcore25.model.blockchain.txspendingprevout.TxSpendingPrevout;
import ru.zoommax.bitcoin.bitcore25.model.useany.BooleanValue;
import ru.zoommax.bitcoin.bitcore25.model.useany.DoubleValue;
import ru.zoommax.bitcoin.bitcore25.model.useany.LongValue;
import ru.zoommax.bitcoin.bitcore25.model.useany.StringValue;

/**
 * The type Block chain api.
 */
@ErrorBody
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
	public BlockFilter getBlockFilter(String blockHash) {
		return this.post(new JsonRpc20.Builder().setMethod("getblockfilter").appendParams(blockHash).getJson(), BlockFilter.Result.class);
	}

	public BlockFilter getBlockFilter(String blockHash, String filterType) {
		return this.post(new JsonRpc20.Builder().setMethod("getblockfilter").appendParams(blockHash).appendParams(filterType).getJson(), BlockFilter.Result.class);
	}

	/**
	 * Gets block from peer.
	 *
	 * @param blockHash the block hash
	 * @param peerId    the peer id
	 */
	public void getBlockFromPeer(String blockHash, long peerId) {
		this.post(new JsonRpc20.Builder().setMethod("getblockfrompeer").appendParams(blockHash).appendParams(peerId).getJson(), StringValue.class);
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
	public BlockHeader getBlockHeader(String blockHash) {
		return this.post(new JsonRpc20.Builder().setMethod("getblockheader").appendParams(blockHash).getJson(), BlockHeader.Result.class);
	}

	public Object getBlockHeader(String blockHash, boolean verbose) { // if verbose true - returns BlockHeader, false - String
		if (verbose) return getBlockHeader(blockHash);
		return this.post(new JsonRpc20.Builder().setMethod("getblockheader").appendParams(blockHash).appendParams(verbose).getJson(), StringValue.class);
	}

	private JsonRpc20.Builder blockStats(String hashOrHeight) {
		final JsonRpc20.Builder builder = new JsonRpc20.Builder().setMethod("getblockstats");

		try {
			builder.appendParams(Double.valueOf(hashOrHeight).longValue());
		} catch(final NumberFormatException e) {
			builder.appendParams(hashOrHeight);
		}

		return builder;
	}

	/**
	 * Gets block stats.
	 *
	 * @param hashOrHeight   the hash or height
	 * @param statsJsonArray the stats json array
	 * @return the block stats
	 */
	public BlockStats getBlockStats(String hashOrHeight) {
		return this.post(blockStats(hashOrHeight).getJson(), BlockStats.Result.class);
	}

	public BlockStats getBlockStats(String hashOrHeight, String statsJsonArray) {
		return this.post(blockStats(hashOrHeight).appendParams(statsJsonArray).getJson(), BlockStats.Result.class);
	}

	/**
	 * Get chain tips chain tips [ ].
	 *
	 * @return the chain tips [ ]
	 */
	public ChainTips[] getChainTips() {
		return this.post(new JsonRpc20.Builder().setMethod("getchaintips").getJson(), ChainTips.Result.class);
	}

	public ChainTxStats getChainTxStats() {
		return this.post(new JsonRpc20.Builder().setMethod("getchaintxstats").getJson(), ChainTxStats.Result.class);
	}

	public ChainTxStats getChainTxStats(long nBlocks) {
		return this.post(new JsonRpc20.Builder().setMethod("getchaintxstats").appendParams(nBlocks).getJson(), ChainTxStats.Result.class);
	}

	public ChainTxStats getChainTxStats(String blockHash) {
		return this.post(new JsonRpc20.Builder().setMethod("getchaintxstats").appendParams(1 /* HERE NEED TO SET DEFAULT VALUE! */).appendParams(blockHash).getJson(), ChainTxStats.Result.class);
	}

	/**
	 * Gets chain tx stats.
	 *
	 * @param nBlocks   the n blocks
	 * @param blockHash the block hash
	 * @return the chain tx stats
	 */
	public ChainTxStats getChainTxStats(long nBlocks, String blockHash) {
		return this.post(new JsonRpc20.Builder().setMethod("getchaintxstats").appendParams(nBlocks).appendParams(blockHash).getJson(), ChainTxStats.Result.class);
	}

	public DeploymentInfo getDeploymentInfo() {
		return this.post(new JsonRpc20.Builder().setMethod("getdeploymentinfo").getJson(), DeploymentInfo.Result.class);
	}

	/**
	 * Gets deployment info.
	 *
	 * @param blockHash the block hash
	 * @return the deployment info
	 */
	public DeploymentInfo getDeploymentInfo(String blockHash) {
		return this.post(new JsonRpc20.Builder().setMethod("getdeploymentinfo").appendParams(blockHash).getJson(), DeploymentInfo.Result.class);
	}

	/**
	 * Gets difficulty.
	 *
	 * @return the difficulty
	 */
	public double getDifficulty() {
		return this.post(new JsonRpc20.Builder().setMethod("getdifficulty").getJson(), DoubleValue.class);
	}

	public String[] getMempoolAncestors(String txid) {
		return this.post(new JsonRpc20.Builder().setMethod("getmempoolancestors").appendParams(txid).getJson(), MempoolAncestors.ResultArray.class);
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
	public String[] getMempoolDescendants(String txid) {
		return this.post(new JsonRpc20.Builder().setMethod("getmempooldescendants").appendParams(txid).getJson(), MempoolDescendants.ResultArray.class);
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

	public String[] getRawMempool() {
		return this.post(new JsonRpc20.Builder().setMethod("getrawmempool").getJson(), RawMempool.ResultArray.class);
	}

	/**
	 * Gets raw mempool.
	 *
	 * @param verbose          the verbose
	 * @param mempool_sequence the mempool sequence
	 * @return the raw mempool
	 */
	public Object getRawMempool(boolean verbose, boolean mempool_sequence) {
		if (!verbose && !mempool_sequence)
			return getRawMempool();
		else {
			final JsonRpc20.Builder builder = new JsonRpc20.Builder().setMethod("getrawmempool");
			if (verbose && !mempool_sequence) {
				builder.appendParams(verbose);
				return this.post(builder.getJson(), RawMempool.ResultHashMap.class);
			} else if (!verbose && mempool_sequence) {
				builder.appendParams(mempool_sequence);
				return this.post(builder.getJson(), RawMempool.ResultHashMap.class);
			} else if (verbose && mempool_sequence) {
				builder.appendParams(verbose).appendParams(false);
				return this.post(builder.getJson(), RawMempool.ResultHashMap.class);
			}
		}
		return null;
	}

	public @Nullable TxOut getTxOut(String txid, long vout) {
		return this.post(new JsonRpc20.Builder().appendParams(txid).appendParams(vout).getJson(), TxOut.Result.class);
	}

	/**
	 * Gets tx out.
	 *
	 * @param txid            the txid
	 * @param vout            the vout
	 * @param include_mempool the include mempool
	 * @return the tx out
	 */
	public @Nullable TxOut getTxOut(String txid, long vout, boolean include_mempool) {
		return this.post(new JsonRpc20.Builder().setMethod("gettxout").appendParams(txid).appendParams(vout).appendParams(include_mempool).getJson(), TxOut.Result.class);
	}

	public String getTxOutProof(String[] txids) {
		return this.post(new JsonRpc20.Builder().setMethod("gettxoutproof").appendParams(txids).getJson(), StringValue.class);
	}

	/**
	 * Gets tx out proof.
	 *
	 * @param txids     the txids
	 * @param blockhash the blockhash
	 * @return the tx out proof
	 */
	public String getTxOutProof(String[] txids, String blockhash) {
		return this.post(new JsonRpc20.Builder().setMethod("gettxoutproof").appendParams(txids).appendParams(blockhash).getJson(), StringValue.class);
	}

	public TxOutSetInfo getTxOutSetInfo() {
		return this.post(new JsonRpc20.Builder().setMethod("gettxoutsetinfo").getJson(), TxOutSetInfo.Result.class);
	}

	public TxOutSetInfo getTxOutSetInfo(String hash_type) {
		return this.post(new JsonRpc20.Builder().setMethod("gettxoutsetinfo").appendParams(hash_type).getJson(), TxOutSetInfo.Result.class);
	}

	public TxOutSetInfo getTxOutSetInfo(String hash_type, String hash_or_height) {
		return this.post(new JsonRpc20.Builder().setMethod("gettxoutsetinfo").appendParams(hash_type).appendParams(hash_or_height).getJson(), TxOutSetInfo.Result.class);
	}

	/**
	 * Gets tx out set info.
	 *
	 * @param hash_type      the hash type
	 * @param hashOrHeight the hash or height
	 * @param use_index      the use index
	 * @return the tx out set info
	 */
	public TxOutSetInfo getTxOutSetInfo(String hash_type, String hashOrHeight, boolean use_index) {
		return this.post(new JsonRpc20.Builder().setMethod("gettxoutsetinfo").appendParams(hash_type).appendParams(hashOrHeight).appendParams(use_index).getJson(), TxOutSetInfo.Result.class);
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
	public ScanBlocks scanBlocks(String action) {
		return this.post(new JsonRpc20.Builder().setMethod("scanblocks").appendParams(action).getJson(), ScanBlocks.Result.class);
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
		return this.post(new JsonRpc20.Builder().setMethod("scanblocks").appendParams(action).appendParams(scanobjects).appendParams(start_height).appendParams(stop_height).appendParams(filtertype).appendParams(options).getJson(), ScanBlocks.Result.class);
	}

	public ScanTxOutSet scanTxOutSet(String action) {
		return this.post(new JsonRpc20.Builder().setMethod("scantxoutset").appendParams(action).getJson(), ScanTxOutSet.Result.class);
	}

	/**
	 * Scan tx out set scan tx out set.
	 *
	 * @param action      the action
	 * @param scanobjects the scanobjects
	 * @return the scan tx out set
	 */
	public ScanTxOutSet scanTxOutSet(String action, String scanobjects) {
		return this.post(new JsonRpc20.Builder().setMethod("scantxoutset").appendParams(action).appendParams(scanobjects).getJson(), ScanTxOutSet.Result.class);
	}

	public boolean verifyChain() {
		return this.post(new JsonRpc20.Builder().setMethod("verifychain").getJson(), BooleanValue.class);
	}

	/**
	 * Verify chain boolean.
	 *
	 * @param checklevel the checklevel
	 * @param nblocks    the nblocks
	 * @return the boolean
	 */
	public boolean verifyChain(long checklevel, long nblocks) {
		return this.post(new JsonRpc20.Builder().setMethod("verifychain").appendParams(checklevel).appendParams(nblocks).getJson(), BooleanValue.class);
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
