package ru.zoommax.bitcoin.model;

import ru.zoommax.bitcoin.JsonRpcResult;

public class MemoryInfo {
    Locked locked;

    public static class Result extends JsonRpcResult<MemoryInfo> {
    }

    public static class Locked {
        private long used;
        private long free;
        private long total;
        private long locked;
        private int chunks_used;
        private int chunks_free;

        public void setUsed(long used) {
            this.used = used;
        }

        public long getUsed() {
            return used;
        }

        public void setFree(long free) {
            this.free = free;
        }

        public long getFree() {
            return free;
        }

        public void setTotal(long total) {
            this.total = total;
        }

        public long getTotal() {
            return total;
        }

        public void setLocked(long locked) {
            this.locked = locked;
        }

        public long getLocked() {
            return locked;
        }

        public void setChunks_used(int chunks_used) {
            this.chunks_used = chunks_used;
        }

        public int getChunks_used() {
            return chunks_used;
        }

        public void setChunks_free(int chunks_free) {
            this.chunks_free = chunks_free;
        }

        public int getChunks_free() {
            return chunks_free;
        }
    }

    public Locked getLocked() {
        return locked;
    }

    public void setLocked(Locked locked) {
        this.locked = locked;
    }
}