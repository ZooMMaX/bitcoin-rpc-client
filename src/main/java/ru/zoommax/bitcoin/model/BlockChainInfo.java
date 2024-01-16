package ru.zoommax.bitcoin.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import ru.zoommax.bitcoin.JsonRpcResult;

import java.util.List;

/**
 * The type Block chain info.
 */
public class BlockChainInfo {

    /**
     * The type Result.
     */
    public static class Result extends JsonRpcResult<BlockChainInfo> {
    }

    /**
     * The Chain.
     */
    private String chain;
    /**
     * The Blocks.
     */
    private long blocks;
    /**
     * The Headers.
     */
    private long headers;
    /**
     * The Bestblockhash.
     */
    private String bestblockhash;
    /**
     * The Difficulty.
     */
    private double difficulty;
    /**
     * The Mediantime.
     */
    private long mediantime;
    /**
     * The Verificationprogress.
     */
    private double verificationprogress;
    /**
     * The Initialblockdownload.
     */
    private boolean initialblockdownload;
    /**
     * The Chainwork.
     */
    private String chainwork;
    /**
     * The Size on disk.
     */
    @JsonProperty("size_on_disk")
    private long sizeOnDisk;
    /**
     * The Pruned.
     */
    private boolean pruned;
    /**
     * The Softforks.
     */
    private List<Softforks> softforks;
    /**
     * The Bip 9 softforks.
     */
    @JsonProperty("bip9_softforks")
    private Bip9Softforks bip9softforks;
    /**
     * The Warnings.
     */
    private String warnings;
    /**
     * The Time.
     */
    private long time;


    /**
     * Sets time.
     *
     * @param time the time
     */
    public void setTime(long time) {
        this.time = time;
    }

    /**
     * Gets time.
     *
     * @return the time
     */
    public long getTime() {
        return time;
    }

    /**
     * Sets chain.
     *
     * @param chain the chain
     */
    public void setChain(String chain) {
        this.chain = chain;
    }

    /**
     * Gets chain.
     *
     * @return the chain
     */
    public String getChain() {
        return chain;
    }

    /**
     * Sets blocks.
     *
     * @param blocks the blocks
     */
    public void setBlocks(long blocks) {
        this.blocks = blocks;
    }

    /**
     * Gets blocks.
     *
     * @return the blocks
     */
    public long getBlocks() {
        return blocks;
    }

    /**
     * Sets headers.
     *
     * @param headers the headers
     */
    public void setHeaders(long headers) {
        this.headers = headers;
    }

    /**
     * Gets headers.
     *
     * @return the headers
     */
    public long getHeaders() {
        return headers;
    }

    /**
     * Sets bestblockhash.
     *
     * @param bestblockhash the bestblockhash
     */
    public void setBestblockhash(String bestblockhash) {
        this.bestblockhash = bestblockhash;
    }

    /**
     * Gets bestblockhash.
     *
     * @return the bestblockhash
     */
    public String getBestblockhash() {
        return bestblockhash;
    }

    /**
     * Sets difficulty.
     *
     * @param difficulty the difficulty
     */
    public void setDifficulty(double difficulty) {
        this.difficulty = difficulty;
    }

    /**
     * Gets difficulty.
     *
     * @return the difficulty
     */
    public double getDifficulty() {
        return difficulty;
    }

    /**
     * Sets mediantime.
     *
     * @param mediantime the mediantime
     */
    public void setMediantime(long mediantime) {
        this.mediantime = mediantime;
    }

    /**
     * Gets mediantime.
     *
     * @return the mediantime
     */
    public long getMediantime() {
        return mediantime;
    }

    /**
     * Sets verificationprogress.
     *
     * @param verificationprogress the verificationprogress
     */
    public void setVerificationprogress(double verificationprogress) {
        this.verificationprogress = verificationprogress;
    }

    /**
     * Gets verificationprogress.
     *
     * @return the verificationprogress
     */
    public double getVerificationprogress() {
        return verificationprogress;
    }

    /**
     * Sets initialblockdownload.
     *
     * @param initialblockdownload the initialblockdownload
     */
    public void setInitialblockdownload(boolean initialblockdownload) {
        this.initialblockdownload = initialblockdownload;
    }

    /**
     * Gets initialblockdownload.
     *
     * @return the initialblockdownload
     */
    public boolean getInitialblockdownload() {
        return initialblockdownload;
    }

    /**
     * Sets chainwork.
     *
     * @param chainwork the chainwork
     */
    public void setChainwork(String chainwork) {
        this.chainwork = chainwork;
    }

    /**
     * Gets chainwork.
     *
     * @return the chainwork
     */
    public String getChainwork() {
        return chainwork;
    }

    /**
     * Sets pruned.
     *
     * @param pruned the pruned
     */
    public void setPruned(boolean pruned) {
        this.pruned = pruned;
    }

    /**
     * Gets pruned.
     *
     * @return the pruned
     */
    public boolean getPruned() {
        return pruned;
    }

    /**
     * Sets softforks.
     *
     * @param softforks the softforks
     */
    public void setSoftforks(List<Softforks> softforks) {
        this.softforks = softforks;
    }

    /**
     * Gets softforks.
     *
     * @return the softforks
     */
    public List<Softforks> getSoftforks() {
        return softforks;
    }

    /**
     * Is initialblockdownload boolean.
     *
     * @return the boolean
     */
    public boolean isInitialblockdownload() {
        return initialblockdownload;
    }

    /**
     * Gets size on disk.
     *
     * @return the size on disk
     */
    public long getSizeOnDisk() {
        return sizeOnDisk;
    }

    /**
     * Sets size on disk.
     *
     * @param sizeOnDisk the size on disk
     */
    public void setSizeOnDisk(long sizeOnDisk) {
        this.sizeOnDisk = sizeOnDisk;
    }

    /**
     * Is pruned boolean.
     *
     * @return the boolean
     */
    public boolean isPruned() {
        return pruned;
    }

    /**
     * Gets bip 9 softforks.
     *
     * @return the bip 9 softforks
     */
    public Bip9Softforks getBip9softforks() {
        return bip9softforks;
    }

    /**
     * Sets bip 9 softforks.
     *
     * @param bip9softforks the bip 9 softforks
     */
    public void setBip9softforks(Bip9Softforks bip9softforks) {
        this.bip9softforks = bip9softforks;
    }

    /**
     * Sets warnings.
     *
     * @param warnings the warnings
     */
    public void setWarnings(String warnings) {
        this.warnings = warnings;
    }

    /**
     * Gets warnings.
     *
     * @return the warnings
     */
    public String getWarnings() {
        return warnings;
    }

    /**
     * The type Bip 9 softforks.
     */
    public static class Bip9Softforks {

        /**
         * The Csv.
         */
        private Csv csv;
        /**
         * The Segwit.
         */
        private Segwit segwit;

        /**
         * Sets csv.
         *
         * @param csv the csv
         */
        public void setCsv(Csv csv) {
            this.csv = csv;
        }

        /**
         * Gets csv.
         *
         * @return the csv
         */
        public Csv getCsv() {
            return csv;
        }

        /**
         * Sets segwit.
         *
         * @param segwit the segwit
         */
        public void setSegwit(Segwit segwit) {
            this.segwit = segwit;
        }

        /**
         * Gets segwit.
         *
         * @return the segwit
         */
        public Segwit getSegwit() {
            return segwit;
        }

    }

    /**
     * The type Segwit.
     */
    public static class Segwit {

        /**
         * The Status.
         */
        private String status;
        /**
         * The Start time.
         */
        private long startTime;
        /**
         * The Timeout.
         */
        private long timeout;
        /**
         * The Since.
         */
        private long since;

        /**
         * Sets status.
         *
         * @param status the status
         */
        public void setStatus(String status) {
            this.status = status;
        }

        /**
         * Gets status.
         *
         * @return the status
         */
        public String getStatus() {
            return status;
        }

        /**
         * Sets start time.
         *
         * @param startTime the start time
         */
        public void setStartTime(long startTime) {
            this.startTime = startTime;
        }

        /**
         * Gets start time.
         *
         * @return the start time
         */
        public long getStartTime() {
            return startTime;
        }

        /**
         * Sets timeout.
         *
         * @param timeout the timeout
         */
        public void setTimeout(long timeout) {
            this.timeout = timeout;
        }

        /**
         * Gets timeout.
         *
         * @return the timeout
         */
        public long getTimeout() {
            return timeout;
        }

        /**
         * Sets since.
         *
         * @param since the since
         */
        public void setSince(long since) {
            this.since = since;
        }

        /**
         * Gets since.
         *
         * @return the since
         */
        public long getSince() {
            return since;
        }

    }

    /**
     * The type Csv.
     */
    public static class Csv {

        /**
         * The Status.
         */
        private String status;
        /**
         * The Start time.
         */
        private long startTime;
        /**
         * The Timeout.
         */
        private long timeout;
        /**
         * The Since.
         */
        private long since;

        /**
         * Sets status.
         *
         * @param status the status
         */
        public void setStatus(String status) {
            this.status = status;
        }

        /**
         * Gets status.
         *
         * @return the status
         */
        public String getStatus() {
            return status;
        }

        /**
         * Sets start time.
         *
         * @param startTime the start time
         */
        public void setStartTime(long startTime) {
            this.startTime = startTime;
        }

        /**
         * Gets start time.
         *
         * @return the start time
         */
        public long getStartTime() {
            return startTime;
        }

        /**
         * Sets timeout.
         *
         * @param timeout the timeout
         */
        public void setTimeout(long timeout) {
            this.timeout = timeout;
        }

        /**
         * Gets timeout.
         *
         * @return the timeout
         */
        public long getTimeout() {
            return timeout;
        }

        /**
         * Sets since.
         *
         * @param since the since
         */
        public void setSince(long since) {
            this.since = since;
        }

        /**
         * Gets since.
         *
         * @return the since
         */
        public long getSince() {
            return since;
        }

    }

    /**
     * The type Softforks.
     */
    public static class Softforks {

        /**
         * The Id.
         */
        private String id;
        /**
         * The Version.
         */
        private int version;
        /**
         * The Reject.
         */
        private Reject reject;

        /**
         * Sets id.
         *
         * @param id the id
         */
        public void setId(String id) {
            this.id = id;
        }

        /**
         * Gets id.
         *
         * @return the id
         */
        public String getId() {
            return id;
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
         * Sets reject.
         *
         * @param reject the reject
         */
        public void setReject(Reject reject) {
            this.reject = reject;
        }

        /**
         * Gets reject.
         *
         * @return the reject
         */
        public Reject getReject() {
            return reject;
        }

    }

    /**
     * The type Reject.
     */
    public static class Reject {

        /**
         * The Status.
         */
        private boolean status;

        /**
         * Sets status.
         *
         * @param status the status
         */
        public void setStatus(boolean status) {
            this.status = status;
        }

        /**
         * Gets status.
         *
         * @return the status
         */
        public boolean getStatus() {
            return status;
        }

    }
}