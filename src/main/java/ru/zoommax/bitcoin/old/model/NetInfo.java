package ru.zoommax.bitcoin.old.model;

import ru.zoommax.bitcoin.JsonRpcResult;

/**
 * The type Net info.
 */
public class NetInfo {
    /**
     * The type Result.
     */
    public static class Result extends JsonRpcResult<NetInfo> {
    }

    /**
     * The Totalbytesrecv.
     */
    private int totalbytesrecv;
    /**
     * The Totalbytessent.
     */
    private int totalbytessent;
    /**
     * The Timemillis.
     */
    private long timemillis;
    /**
     * The Uploadtarget.
     */
    private UploadTarget uploadtarget;

    /**
     * Sets totalbytesrecv.
     *
     * @param totalbytesrecv the totalbytesrecv
     */
    public void setTotalbytesrecv(int totalbytesrecv) {
        this.totalbytesrecv = totalbytesrecv;
    }

    /**
     * Gets totalbytesrecv.
     *
     * @return the totalbytesrecv
     */
    public int getTotalbytesrecv() {
        return totalbytesrecv;
    }

    /**
     * Sets totalbytessent.
     *
     * @param totalbytessent the totalbytessent
     */
    public void setTotalbytessent(int totalbytessent) {
        this.totalbytessent = totalbytessent;
    }

    /**
     * Gets totalbytessent.
     *
     * @return the totalbytessent
     */
    public int getTotalbytessent() {
        return totalbytessent;
    }

    /**
     * Sets timemillis.
     *
     * @param timemillis the timemillis
     */
    public void setTimemillis(long timemillis) {
        this.timemillis = timemillis;
    }

    /**
     * Gets timemillis.
     *
     * @return the timemillis
     */
    public long getTimemillis() {
        return timemillis;
    }

    /**
     * Sets uploadtarget.
     *
     * @param uploadtarget the uploadtarget
     */
    public void setUploadtarget(UploadTarget uploadtarget) {
        this.uploadtarget = uploadtarget;
    }

    /**
     * Gets uploadtarget.
     *
     * @return the uploadtarget
     */
    public UploadTarget getUploadtarget() {
        return uploadtarget;
    }

}