package ru.zoommax.bitcoin.api;

import ru.zoommax.bitcoin.JsonRpc20;
import ru.zoommax.bitcoin.JsonRpcClient;
import ru.zoommax.bitcoin.model.LoggerStatus;
import ru.zoommax.bitcoin.model.MemoryInfo;
import ru.zoommax.bitcoin.model.StringValue;

/**
 * The type Control api.
 */
public class ControlApi extends JsonRpcClient {

    /**
     * Instantiates a new Control api.
     *
     * @param username the username
     * @param password the password
     * @param url      the url
     */
    public ControlApi(String username, String password, String url) {
        super(username, password, url);
    }

    /**
     * Gets memory info.
     *
     * @return the memory info
     */
    public MemoryInfo getMemoryInfo() {
        JsonRpc20 json = new JsonRpc20.Builder().setMethod("getmemoryinfo")
                .appendParams(MemoryInfoModel.stats).getJson();
        return this.post(json, MemoryInfo.Result.class);
    }

    /**
     * The enum Memory info model.
     */
    public static enum MemoryInfoModel {
        /**
         * Stats memory info model.
         */
        stats,
        /**
         * Mallocinfo memory info model.
         */
        mallocinfo
    }

    /**
     * Help string.
     *
     * @return the string
     */
    public String help() {
        JsonRpc20 json = new JsonRpc20.Builder().setMethod("help").getJson();
        return this.post(json, StringValue.class);
    }

    /**
     * Help string.
     *
     * @param method the method
     * @return the string
     */
    public String help(String method) {
        JsonRpc20 json = new JsonRpc20.Builder().setMethod("help").appendParams(method).getJson();
        return this.post(json, StringValue.class);
    }

    /**
     * Logging logger status.
     *
     * @return the logger status
     */
    public LoggerStatus logging() {
        JsonRpc20 json = new JsonRpc20.Builder().setMethod("logging").getJson();
        return this.post(json, LoggerStatus.Result.class);
    }

    /**
     * Logging logger status.
     *
     * @param include the include
     * @param exclude the exclude
     * @return the logger status
     */
    public LoggerStatus logging(String[] include, String[] exclude) {
        JsonRpc20 json = new JsonRpc20.Builder().setMethod("logging").appendParams(include).appendParams(exclude).getJson();
        return this.post(json, LoggerStatus.Result.class);
    }

    /**
     * Stop string.
     *
     * @param hash the hash
     * @return the string
     */
    public String stop(String hash) {
        JsonRpc20 json = new JsonRpc20.Builder().appendParams(hash).setMethod("stop").getJson();
        return this.post(json, StringValue.class);
    }

    /**
     * Uptime string.
     *
     * @param hash the hash
     * @return the string
     */
    public String uptime(String hash) {
        JsonRpc20 json = new JsonRpc20.Builder().appendParams(hash).setMethod("uptime").getJson();
        return this.post(json, StringValue.class);
    }


}
