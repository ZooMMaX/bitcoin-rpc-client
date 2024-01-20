package ru.zoommax.bitcoin.old.model;

import ru.zoommax.bitcoin.JsonRpcResult;

/**
 * The type Memory info.
 */
public class MemoryInfo {
    /**
     * The Locked.
     */
    Locked locked;

    /**
     * The type Result.
     */
    public static class Result extends JsonRpcResult<MemoryInfo> {
    }

    /**
     * The type Locked.
     */
    public static class Locked {
        /**
         * The Used.
         */
        private long used;
        /**
         * The Free.
         */
        private long free;
        /**
         * The Total.
         */
        private long total;
        /**
         * The Locked.
         */
        private long locked;
        /**
         * The Chunks used.
         */
        private int chunks_used;
        /**
         * The Chunks free.
         */
        private int chunks_free;

        /**
         * Sets used.
         *
         * @param used the used
         */
        public void setUsed(long used) {
            this.used = used;
        }

        /**
         * Gets used.
         *
         * @return the used
         */
        public long getUsed() {
            return used;
        }

        /**
         * Sets free.
         *
         * @param free the free
         */
        public void setFree(long free) {
            this.free = free;
        }

        /**
         * Gets free.
         *
         * @return the free
         */
        public long getFree() {
            return free;
        }

        /**
         * Sets total.
         *
         * @param total the total
         */
        public void setTotal(long total) {
            this.total = total;
        }

        /**
         * Gets total.
         *
         * @return the total
         */
        public long getTotal() {
            return total;
        }

        /**
         * Sets locked.
         *
         * @param locked the locked
         */
        public void setLocked(long locked) {
            this.locked = locked;
        }

        /**
         * Gets locked.
         *
         * @return the locked
         */
        public long getLocked() {
            return locked;
        }

        /**
         * Sets chunks used.
         *
         * @param chunks_used the chunks used
         */
        public void setChunks_used(int chunks_used) {
            this.chunks_used = chunks_used;
        }

        /**
         * Gets chunks used.
         *
         * @return the chunks used
         */
        public int getChunks_used() {
            return chunks_used;
        }

        /**
         * Sets chunks free.
         *
         * @param chunks_free the chunks free
         */
        public void setChunks_free(int chunks_free) {
            this.chunks_free = chunks_free;
        }

        /**
         * Gets chunks free.
         *
         * @return the chunks free
         */
        public int getChunks_free() {
            return chunks_free;
        }
    }

    /**
     * Gets locked.
     *
     * @return the locked
     */
    public Locked getLocked() {
        return locked;
    }

    /**
     * Sets locked.
     *
     * @param locked the locked
     */
    public void setLocked(Locked locked) {
        this.locked = locked;
    }
}