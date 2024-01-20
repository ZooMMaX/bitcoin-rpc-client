package ru.zoommax.bitcoin.old.model;

import ru.zoommax.bitcoin.JsonRpcResult;

/**
 * The type Logger status.
 */
public class LoggerStatus {
    /**
     * The type Result.
     */
    public static class Result extends JsonRpcResult<LoggerStatus> {
    }

    /**
     * The Net.
     */
    private boolean net;
    /**
     * The Tor.
     */
    private boolean tor;
    /**
     * The Mempool.
     */
    private boolean mempool;
    /**
     * The Http.
     */
    private boolean http;
    /**
     * The Bench.
     */
    private boolean bench;
    /**
     * The Zmq.
     */
    private boolean zmq;
    /**
     * The Db.
     */
    private boolean db;
    /**
     * The Rpc.
     */
    private boolean rpc;
    /**
     * The Estimatefee.
     */
    private boolean estimatefee;
    /**
     * The Addrman.
     */
    private boolean addrman;
    /**
     * The Selectcoins.
     */
    private boolean selectcoins;
    /**
     * The Reindex.
     */
    private boolean reindex;
    /**
     * The Cmpctblock.
     */
    private boolean cmpctblock;
    /**
     * The Rand.
     */
    private boolean rand;
    /**
     * The Prune.
     */
    private boolean prune;
    /**
     * The Proxy.
     */
    private boolean proxy;
    /**
     * The Mempoolrej.
     */
    private boolean mempoolrej;
    /**
     * The Libevent.
     */
    private boolean libevent;
    /**
     * The Coindb.
     */
    private boolean coindb;
    /**
     * The Qt.
     */
    private boolean qt;
    /**
     * The Leveldb.
     */
    private boolean leveldb;
    /**
     * The Blockstorage.
     */
    private boolean blockstorage;
    /**
     * The 2 p.
     */
    private boolean i2p;
    /**
     * The Ipc.
     */
    private boolean ipc;
    /**
     * The Scan.
     */
    private boolean scan;
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
     * Sets walletdb.
     *
     * @param walletdb the walletdb
     */
    public void setWalletdb(boolean walletdb) {
        this.walletdb = walletdb;
    }

    /**
     * Gets walletdb.
     *
     * @return the walletdb
     */
    public boolean getWalletdb() {
        return walletdb;
    }

    /**
     * Sets validation.
     *
     * @param validation the validation
     */
    public void setValidation(boolean validation) {
        this.validation = validation;
    }

    /**
     * Gets validation.
     *
     * @return the validation
     */
    public boolean getValidation() {
        return validation;
    }

    /**
     * Sets util.
     *
     * @param util the util
     */
    public void setUtil(boolean util) {
        this.util = util;
    }

    /**
     * Gets util.
     *
     * @return the util
     */
    public boolean getUtil() {
        return util;
    }

    /**
     * Sets txreconciliation.
     *
     * @param txreconciliation the txreconciliation
     */
    public void setTxreconciliation(boolean txreconciliation) {
        this.txreconciliation = txreconciliation;
    }

    /**
     * Gets txreconciliation.
     *
     * @return the txreconciliation
     */
    public boolean getTxreconciliation() {
        return txreconciliation;
    }

    /**
     * Sets txpackages.
     *
     * @param txpackages the txpackages
     */
    public void setTxpackages(boolean txpackages) {
        this.txpackages = txpackages;
    }

    /**
     * Gets txpackages.
     *
     * @return the txpackages
     */
    public boolean getTxpackages() {
        return txpackages;
    }

    /**
     * Sets scan.
     *
     * @param scan the scan
     */
    public void setScan(boolean scan) {
        this.scan = scan;
    }

    /**
     * Gets scan.
     *
     * @return the scan
     */
    public boolean getScan() {
        return scan;
    }

    /**
     * Sets ipc.
     *
     * @param ipc the ipc
     */
    public void setIpc(boolean ipc) {
        this.ipc = ipc;
    }

    /**
     * Gets ipc.
     *
     * @return the ipc
     */
    public boolean getIpc() {
        return ipc;
    }

    /**
     * Sets i 2 p.
     *
     * @param i2p the 2 p
     */
    public void setI2p(boolean i2p) {
        this.i2p = i2p;
    }

    /**
     * Gets i 2 p.
     *
     * @return the i 2 p
     */
    public boolean getI2p() {
        return i2p;
    }

    /**
     * Sets blockstorage.
     *
     * @param blockstorage the blockstorage
     */
    public void setBlockstorage(boolean blockstorage) {
        this.blockstorage = blockstorage;
    }

    /**
     * Gets blockstorage.
     *
     * @return the blockstorage
     */
    public boolean getBlockstorage() {
        return blockstorage;
    }

    /**
     * Sets net.
     *
     * @param net the net
     */
    public void setNet(boolean net) {
        this.net = net;
    }

    /**
     * Gets net.
     *
     * @return the net
     */
    public boolean getNet() {
        return net;
    }

    /**
     * Sets tor.
     *
     * @param tor the tor
     */
    public void setTor(boolean tor) {
        this.tor = tor;
    }

    /**
     * Gets tor.
     *
     * @return the tor
     */
    public boolean getTor() {
        return tor;
    }

    /**
     * Sets mempool.
     *
     * @param mempool the mempool
     */
    public void setMempool(boolean mempool) {
        this.mempool = mempool;
    }

    /**
     * Gets mempool.
     *
     * @return the mempool
     */
    public boolean getMempool() {
        return mempool;
    }

    /**
     * Sets http.
     *
     * @param http the http
     */
    public void setHttp(boolean http) {
        this.http = http;
    }

    /**
     * Gets http.
     *
     * @return the http
     */
    public boolean getHttp() {
        return http;
    }

    /**
     * Sets bench.
     *
     * @param bench the bench
     */
    public void setBench(boolean bench) {
        this.bench = bench;
    }

    /**
     * Gets bench.
     *
     * @return the bench
     */
    public boolean getBench() {
        return bench;
    }

    /**
     * Sets zmq.
     *
     * @param zmq the zmq
     */
    public void setZmq(boolean zmq) {
        this.zmq = zmq;
    }

    /**
     * Gets zmq.
     *
     * @return the zmq
     */
    public boolean getZmq() {
        return zmq;
    }

    /**
     * Sets db.
     *
     * @param db the db
     */
    public void setDb(boolean db) {
        this.db = db;
    }

    /**
     * Gets db.
     *
     * @return the db
     */
    public boolean getDb() {
        return db;
    }

    /**
     * Sets rpc.
     *
     * @param rpc the rpc
     */
    public void setRpc(boolean rpc) {
        this.rpc = rpc;
    }

    /**
     * Gets rpc.
     *
     * @return the rpc
     */
    public boolean getRpc() {
        return rpc;
    }

    /**
     * Sets estimatefee.
     *
     * @param estimatefee the estimatefee
     */
    public void setEstimatefee(boolean estimatefee) {
        this.estimatefee = estimatefee;
    }

    /**
     * Gets estimatefee.
     *
     * @return the estimatefee
     */
    public boolean getEstimatefee() {
        return estimatefee;
    }

    /**
     * Sets addrman.
     *
     * @param addrman the addrman
     */
    public void setAddrman(boolean addrman) {
        this.addrman = addrman;
    }

    /**
     * Gets addrman.
     *
     * @return the addrman
     */
    public boolean getAddrman() {
        return addrman;
    }

    /**
     * Sets selectcoins.
     *
     * @param selectcoins the selectcoins
     */
    public void setSelectcoins(boolean selectcoins) {
        this.selectcoins = selectcoins;
    }

    /**
     * Gets selectcoins.
     *
     * @return the selectcoins
     */
    public boolean getSelectcoins() {
        return selectcoins;
    }

    /**
     * Sets reindex.
     *
     * @param reindex the reindex
     */
    public void setReindex(boolean reindex) {
        this.reindex = reindex;
    }

    /**
     * Gets reindex.
     *
     * @return the reindex
     */
    public boolean getReindex() {
        return reindex;
    }

    /**
     * Sets cmpctblock.
     *
     * @param cmpctblock the cmpctblock
     */
    public void setCmpctblock(boolean cmpctblock) {
        this.cmpctblock = cmpctblock;
    }

    /**
     * Gets cmpctblock.
     *
     * @return the cmpctblock
     */
    public boolean getCmpctblock() {
        return cmpctblock;
    }

    /**
     * Sets rand.
     *
     * @param rand the rand
     */
    public void setRand(boolean rand) {
        this.rand = rand;
    }

    /**
     * Gets rand.
     *
     * @return the rand
     */
    public boolean getRand() {
        return rand;
    }

    /**
     * Sets prune.
     *
     * @param prune the prune
     */
    public void setPrune(boolean prune) {
        this.prune = prune;
    }

    /**
     * Gets prune.
     *
     * @return the prune
     */
    public boolean getPrune() {
        return prune;
    }

    /**
     * Sets proxy.
     *
     * @param proxy the proxy
     */
    public void setProxy(boolean proxy) {
        this.proxy = proxy;
    }

    /**
     * Gets proxy.
     *
     * @return the proxy
     */
    public boolean getProxy() {
        return proxy;
    }

    /**
     * Sets mempoolrej.
     *
     * @param mempoolrej the mempoolrej
     */
    public void setMempoolrej(boolean mempoolrej) {
        this.mempoolrej = mempoolrej;
    }

    /**
     * Gets mempoolrej.
     *
     * @return the mempoolrej
     */
    public boolean getMempoolrej() {
        return mempoolrej;
    }

    /**
     * Sets libevent.
     *
     * @param libevent the libevent
     */
    public void setLibevent(boolean libevent) {
        this.libevent = libevent;
    }

    /**
     * Gets libevent.
     *
     * @return the libevent
     */
    public boolean getLibevent() {
        return libevent;
    }

    /**
     * Sets coindb.
     *
     * @param coindb the coindb
     */
    public void setCoindb(boolean coindb) {
        this.coindb = coindb;
    }

    /**
     * Gets coindb.
     *
     * @return the coindb
     */
    public boolean getCoindb() {
        return coindb;
    }

    /**
     * Sets qt.
     *
     * @param qt the qt
     */
    public void setQt(boolean qt) {
        this.qt = qt;
    }

    /**
     * Gets qt.
     *
     * @return the qt
     */
    public boolean getQt() {
        return qt;
    }

    /**
     * Sets leveldb.
     *
     * @param leveldb the leveldb
     */
    public void setLeveldb(boolean leveldb) {
        this.leveldb = leveldb;
    }

    /**
     * Gets leveldb.
     *
     * @return the leveldb
     */
    public boolean getLeveldb() {
        return leveldb;
    }

}