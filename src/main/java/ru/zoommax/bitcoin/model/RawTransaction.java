package ru.zoommax.bitcoin.model;

import ru.zoommax.bitcoin.JsonRpcResult;

/**
 * The type Raw transaction.
 */
public class RawTransaction {
    /**
     * The type Result.
     */
    public static class Result extends JsonRpcResult<RawTransaction> {
    }

    /**
     * The Txid.
     */
    private String txid;
    /**
     * The Hash.
     */
    private String hash;
    /**
     * The Version.
     */
    private int version;
    /**
     * The Size.
     */
    private int size;
    /**
     * The Vsize.
     */
    private int vsize;
    /**
     * The Weight.
     */
    private int weight;
    /**
     * The Locktime.
     */
    private int locktime;
    /**
     * The Vin.
     */
    private TxVin[] vin;
    /**
     * The Vout.
     */
    private TxVout[] vout;
    /**
     * The Hex.
     */
    private String hex;
    /**
     * The Blockhash.
     */
    private String blockhash;
    /**
     * The Confirmations.
     */
    private int confirmations;
    /**
     * The Time.
     */
    private int time;
    /**
     * The Blocktime.
     */
    private int blocktime;

    /**
     * Sets txid.
     *
     * @param txid the txid
     */
    public void setTxid(String txid) {
        this.txid = txid;
    }

    /**
     * Gets txid.
     *
     * @return the txid
     */
    public String getTxid() {
        return txid;
    }

    /**
     * Sets hash.
     *
     * @param hash the hash
     */
    public void setHash(String hash) {
        this.hash = hash;
    }

    /**
     * Gets hash.
     *
     * @return the hash
     */
    public String getHash() {
        return hash;
    }

    /**
     * Sets version.
     *
     * @param version the version
     */
    public void setVersion(int version) {
        this.version = version;
    }

    /**
     * Gets version.
     *
     * @return the version
     */
    public int getVersion() {
        return version;
    }

    /**
     * Sets size.
     *
     * @param size the size
     */
    public void setSize(int size) {
        this.size = size;
    }

    /**
     * Gets size.
     *
     * @return the size
     */
    public int getSize() {
        return size;
    }

    /**
     * Sets vsize.
     *
     * @param vsize the vsize
     */
    public void setVsize(int vsize) {
        this.vsize = vsize;
    }

    /**
     * Gets vsize.
     *
     * @return the vsize
     */
    public int getVsize() {
        return vsize;
    }

    /**
     * Sets weight.
     *
     * @param weight the weight
     */
    public void setWeight(int weight) {
        this.weight = weight;
    }

    /**
     * Gets weight.
     *
     * @return the weight
     */
    public int getWeight() {
        return weight;
    }

    /**
     * Sets locktime.
     *
     * @param locktime the locktime
     */
    public void setLocktime(int locktime) {
        this.locktime = locktime;
    }

    /**
     * Gets locktime.
     *
     * @return the locktime
     */
    public int getLocktime() {
        return locktime;
    }

    /**
     * Get vin tx vin [ ].
     *
     * @return the tx vin [ ]
     */
    public TxVin[] getVin() {
        return vin;
    }

    /**
     * Sets vin.
     *
     * @param vin the vin
     */
    public void setVin(TxVin[] vin) {
        this.vin = vin;
    }

    /**
     * Get vout tx vout [ ].
     *
     * @return the tx vout [ ]
     */
    public TxVout[] getVout() {
        return vout;
    }

    /**
     * Sets vout.
     *
     * @param vout the vout
     */
    public void setVout(TxVout[] vout) {
        this.vout = vout;
    }

    /**
     * Gets hex.
     *
     * @return the hex
     */
    public String getHex() {
        return hex;
    }

    /**
     * Sets hex.
     *
     * @param hex the hex
     */
    public void setHex(String hex) {
        this.hex = hex;
    }

    /**
     * Gets blockhash.
     *
     * @return the blockhash
     */
    public String getBlockhash() {
        return blockhash;
    }

    /**
     * Sets blockhash.
     *
     * @param blockhash the blockhash
     */
    public void setBlockhash(String blockhash) {
        this.blockhash = blockhash;
    }

    /**
     * Gets confirmations.
     *
     * @return the confirmations
     */
    public int getConfirmations() {
        return confirmations;
    }

    /**
     * Sets confirmations.
     *
     * @param confirmations the confirmations
     */
    public void setConfirmations(int confirmations) {
        this.confirmations = confirmations;
    }

    /**
     * Gets time.
     *
     * @return the time
     */
    public int getTime() {
        return time;
    }

    /**
     * Sets time.
     *
     * @param time the time
     */
    public void setTime(int time) {
        this.time = time;
    }

    /**
     * Gets blocktime.
     *
     * @return the blocktime
     */
    public int getBlocktime() {
        return blocktime;
    }

    /**
     * Sets blocktime.
     *
     * @param blocktime the blocktime
     */
    public void setBlocktime(int blocktime) {
        this.blocktime = blocktime;
    }
}