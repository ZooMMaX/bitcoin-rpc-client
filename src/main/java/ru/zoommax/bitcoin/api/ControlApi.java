package ru.zoommax.bitcoin.api;

import ru.zoommax.bitcoin.JsonRpc20;
import ru.zoommax.bitcoin.JsonRpcClient;
import ru.zoommax.bitcoin.model.LoggerStatus;
import ru.zoommax.bitcoin.model.MemoryInfo;
import ru.zoommax.bitcoin.model.StringValue;

public class ControlApi extends JsonRpcClient {

    public ControlApi(String username, String password, String url) {
        super(username, password, url);
    }

    public MemoryInfo getMemoryInfo() {
        JsonRpc20 json = new JsonRpc20.Builder().setMethod("getmemoryinfo")
                .appendParams(MemoryInfoModel.stats).getJson();
        return this.post(json, MemoryInfo.Result.class);
    }

    public static enum MemoryInfoModel {
        stats, mallocinfo
    }

    public String help() {
        JsonRpc20 json = new JsonRpc20.Builder().setMethod("help").getJson();
        return this.post(json, StringValue.class);
    }

    public String help(String method) {
        JsonRpc20 json = new JsonRpc20.Builder().setMethod("help").appendParams(method).getJson();
        return this.post(json, StringValue.class);
    }

    public LoggerStatus logging() {
        JsonRpc20 json = new JsonRpc20.Builder().setMethod("logging").getJson();
        return this.post(json, LoggerStatus.Result.class);
    }

    public LoggerStatus logging(String[] include, String[] exclude) {
        JsonRpc20 json = new JsonRpc20.Builder().setMethod("logging").appendParams(include).appendParams(exclude).getJson();
        return this.post(json, LoggerStatus.Result.class);
    }

    public String stop(String hash) {
        JsonRpc20 json = new JsonRpc20.Builder().appendParams(hash).setMethod("stop").getJson();
        return this.post(json, StringValue.class);
    }

    public String uptime(String hash) {
        JsonRpc20 json = new JsonRpc20.Builder().appendParams(hash).setMethod("uptime").getJson();
        return this.post(json, StringValue.class);
    }


}
