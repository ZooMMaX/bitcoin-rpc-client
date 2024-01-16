package ru.zoommax.bitcoin.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import ru.zoommax.bitcoin.JsonRpcResult;

import java.util.List;

public class BlockChainInfo {

    public static class Result extends JsonRpcResult<BlockChainInfo> {
    }

    private String chain;
    private long blocks;
    private long headers;
    private String bestblockhash;
    private double difficulty;
    private long mediantime;
    private double verificationprogress;
    private boolean initialblockdownload;
    private String chainwork;
    @JsonProperty("size_on_disk")
    private long sizeOnDisk;
    private boolean pruned;
    private List<Softforks> softforks;
    @JsonProperty("bip9_softforks")
    private Bip9Softforks bip9softforks;
    private String warnings;
    private long time;


    public void setTime(long time) {
        this.time = time;
    }
    public long getTime() {
        return time;
    }
    public void setChain(String chain) {
        this.chain = chain;
    }

    public String getChain() {
        return chain;
    }

    public void setBlocks(long blocks) {
        this.blocks = blocks;
    }

    public long getBlocks() {
        return blocks;
    }

    public void setHeaders(long headers) {
        this.headers = headers;
    }

    public long getHeaders() {
        return headers;
    }

    public void setBestblockhash(String bestblockhash) {
        this.bestblockhash = bestblockhash;
    }

    public String getBestblockhash() {
        return bestblockhash;
    }

    public void setDifficulty(double difficulty) {
        this.difficulty = difficulty;
    }

    public double getDifficulty() {
        return difficulty;
    }

    public void setMediantime(long mediantime) {
        this.mediantime = mediantime;
    }

    public long getMediantime() {
        return mediantime;
    }

    public void setVerificationprogress(double verificationprogress) {
        this.verificationprogress = verificationprogress;
    }

    public double getVerificationprogress() {
        return verificationprogress;
    }

    public void setInitialblockdownload(boolean initialblockdownload) {
        this.initialblockdownload = initialblockdownload;
    }

    public boolean getInitialblockdownload() {
        return initialblockdownload;
    }

    public void setChainwork(String chainwork) {
        this.chainwork = chainwork;
    }

    public String getChainwork() {
        return chainwork;
    }

    public void setPruned(boolean pruned) {
        this.pruned = pruned;
    }

    public boolean getPruned() {
        return pruned;
    }

    public void setSoftforks(List<Softforks> softforks) {
        this.softforks = softforks;
    }

    public List<Softforks> getSoftforks() {
        return softforks;
    }

    public boolean isInitialblockdownload() {
        return initialblockdownload;
    }

    public long getSizeOnDisk() {
        return sizeOnDisk;
    }

    public void setSizeOnDisk(long sizeOnDisk) {
        this.sizeOnDisk = sizeOnDisk;
    }

    public boolean isPruned() {
        return pruned;
    }

    public Bip9Softforks getBip9softforks() {
        return bip9softforks;
    }

    public void setBip9softforks(Bip9Softforks bip9softforks) {
        this.bip9softforks = bip9softforks;
    }

    public void setWarnings(String warnings) {
        this.warnings = warnings;
    }

    public String getWarnings() {
        return warnings;
    }

    public static class Bip9Softforks {

        private Csv csv;
        private Segwit segwit;

        public void setCsv(Csv csv) {
            this.csv = csv;
        }

        public Csv getCsv() {
            return csv;
        }

        public void setSegwit(Segwit segwit) {
            this.segwit = segwit;
        }

        public Segwit getSegwit() {
            return segwit;
        }

    }

    public static class Segwit {

        private String status;
        private long startTime;
        private long timeout;
        private long since;

        public void setStatus(String status) {
            this.status = status;
        }

        public String getStatus() {
            return status;
        }

        public void setStartTime(long startTime) {
            this.startTime = startTime;
        }

        public long getStartTime() {
            return startTime;
        }

        public void setTimeout(long timeout) {
            this.timeout = timeout;
        }

        public long getTimeout() {
            return timeout;
        }

        public void setSince(long since) {
            this.since = since;
        }

        public long getSince() {
            return since;
        }

    }

    public static class Csv {

        private String status;
        private long startTime;
        private long timeout;
        private long since;

        public void setStatus(String status) {
            this.status = status;
        }

        public String getStatus() {
            return status;
        }

        public void setStartTime(long startTime) {
            this.startTime = startTime;
        }

        public long getStartTime() {
            return startTime;
        }

        public void setTimeout(long timeout) {
            this.timeout = timeout;
        }

        public long getTimeout() {
            return timeout;
        }

        public void setSince(long since) {
            this.since = since;
        }

        public long getSince() {
            return since;
        }

    }

    public static class Softforks {

        private String id;
        private int version;
        private Reject reject;

        public void setId(String id) {
            this.id = id;
        }

        public String getId() {
            return id;
        }

        public void setVersion(int version) {
            this.version = version;
        }

        public int getVersion() {
            return version;
        }

        public void setReject(Reject reject) {
            this.reject = reject;
        }

        public Reject getReject() {
            return reject;
        }

    }

    public static class Reject {

        private boolean status;

        public void setStatus(boolean status) {
            this.status = status;
        }

        public boolean getStatus() {
            return status;
        }

    }
}