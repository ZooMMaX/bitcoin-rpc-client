package ru.zoommax.bitcoin.bitcore25.model.control;

import lombok.Getter;
import lombok.Setter;
import ru.zoommax.bitcoin.JsonRpcResult;

/**
 * The type Logger status.
 */
@Getter
@Setter
public class LoggerStatus {

    /**
     * The type Result.
     */
    public static class Result extends JsonRpcResult<LoggerStatus> {
	}

    /**
     * The Addrman.
     */
    private boolean addrman;
    /**
     * The Bench.
     */
    private boolean bench;
    /**
     * The Blockstorage.
     */
    private boolean blockstorage;
    /**
     * The Cmpctblock.
     */
    private boolean cmpctblock;
    /**
     * The Coindb.
     */
    private boolean coindb;
    /**
     * The Estimatefee.
     */
    private boolean estimatefee;
    /**
     * The Http.
     */
    private boolean http;
    /**
     * The 2 p.
     */
    private boolean i2p;
    /**
     * The Ipc.
     */
    private boolean ipc;
    /**
     * The Leveldb.
     */
    private boolean leveldb;
    /**
     * The Libevent.
     */
    private boolean libevent;
    /**
     * The Mempool.
     */
    private boolean mempool;
    /**
     * The Mempoolrej.
     */
    private boolean mempoolrej;
    /**
     * The Net.
     */
    private boolean net;
    /**
     * The Proxy.
     */
    private boolean proxy;
    /**
     * The Prune.
     */
    private boolean prune;
    /**
     * The Qt.
     */
    private boolean qt;
    /**
     * The Rand.
     */
    private boolean rand;
    /**
     * The Reindex.
     */
    private boolean reindex;
    /**
     * The Rpc.
     */
    private boolean rpc;
    /**
     * The Scan.
     */
    private boolean scan;
    /**
     * The Selectcoins.
     */
    private boolean selectcoins;
    /**
     * The Tor.
     */
    private boolean tor;
    /**
     * The Txpackages.
     */
    private boolean txpackages;
    /**
     * The Txreconciliation.
     */
    private boolean txreconciliation;
    /**
     * The Util.
     */
    private boolean util;
    /**
     * The Validation.
     */
    private boolean validation;
    /**
     * The Walletdb.
     */
    private boolean walletdb;
    /**
     * The Zmq.
     */
    private boolean zmq;

}
