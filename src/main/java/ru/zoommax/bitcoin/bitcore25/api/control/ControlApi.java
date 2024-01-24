package ru.zoommax.bitcoin.bitcore25.api.control;

import ru.zoommax.bitcoin.JsonRpc20;
import ru.zoommax.bitcoin.JsonRpcClient;
import ru.zoommax.bitcoin.annotation.ErrorBody;
import ru.zoommax.bitcoin.bitcore25.model.control.LoggerStatus;
import ru.zoommax.bitcoin.bitcore25.model.control.memoryinfo.MemoryInfo;
import ru.zoommax.bitcoin.bitcore25.model.useany.LongValue;
import ru.zoommax.bitcoin.bitcore25.model.useany.StringValue;

@ErrorBody
public class ControlApi extends JsonRpcClient {

	public ControlApi(String username, String password, String url){
		super(username, password, url);
	}

	public MemoryInfo getMemoryInfo() {
		return this.post(new JsonRpc20.Builder().setMethod("getmemoryinfo").getJson(), MemoryInfo.Result.class);
	}

	public String getMemoryInfo(String mode) {
		return this.post(new JsonRpc20.Builder().setMethod("getmemoryinfo").appendParams(mode).getJson(), StringValue.class);
	}

	public MemoryInfo getRpcInfo() {
		return this.post(new JsonRpc20.Builder().setMethod("getrpcinfo").getJson(), MemoryInfo.Result.class);
	}

	public String help() {
		return this.post(new JsonRpc20.Builder().setMethod("help").getJson(), StringValue.class);
	}

	public String help(String method) {
		return this.post(new JsonRpc20.Builder().setMethod("help").appendParams(method).getJson(), StringValue.class);
	}

	public LoggerStatus logging() {
		return this.post(new JsonRpc20.Builder().setMethod("logging").getJson(), LoggerStatus.Result.class);
	}

	public LoggerStatus logging(String[] include_category, String[] exclude_category) {
		return this.post(new JsonRpc20.Builder().setMethod("logging").appendParams(include_category).appendParams(exclude_category).getJson(), LoggerStatus.Result.class);
	}

	public String stop() {
		return this.post(new JsonRpc20.Builder().setMethod("stop").getJson(), StringValue.class);
	}

	public long uptime() {
		return this.post(new JsonRpc20.Builder().setMethod("uptime").getJson(), LongValue.class);
	}

}
