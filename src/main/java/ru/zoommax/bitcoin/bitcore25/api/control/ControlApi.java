package ru.zoommax.bitcoin.bitcore25.api.control;

import ru.zoommax.bitcoin.JsonRpc20;
import ru.zoommax.bitcoin.JsonRpcClient;
import ru.zoommax.bitcoin.annotation.ErrorBody;
import ru.zoommax.bitcoin.bitcore25.model.control.LoggerStatus;
import ru.zoommax.bitcoin.bitcore25.model.control.memoryinfo.MemoryInfo;
import ru.zoommax.bitcoin.bitcore25.model.useany.LongValue;
import ru.zoommax.bitcoin.bitcore25.model.useany.StringValue;

/**
 * The type Control api.
 */
@ErrorBody
public class ControlApi extends JsonRpcClient {

	/**
	 * Instantiates a new Control api.
	 *
	 * @param username the username
	 * @param password the password
	 * @param url      the url
	 */
	public ControlApi(String username, String password, String url){
		super(username, password, url);
	}

	/**
	 * Gets memory info.
	 *
	 * @return the memory info
	 */
	public MemoryInfo getMemoryInfo() {
		return this.post(new JsonRpc20.Builder().setMethod("getmemoryinfo").getJson(), MemoryInfo.Result.class);
	}

	/**
	 * Gets memory info in mallocinfo mode.
	 *
	 * @return the memory info
	 */
	public String getMemoryInfoMI() {
		return this.post(new JsonRpc20.Builder().setMethod("getmemoryinfo").appendParams("mallocinfo").getJson(), StringValue.class);
	}

	/**
	 * Gets rpc info.
	 *
	 * @return the rpc info
	 */
	public MemoryInfo getRpcInfo() {
		return this.post(new JsonRpc20.Builder().setMethod("getrpcinfo").getJson(), MemoryInfo.Result.class);
	}

	/**
	 * Help string.
	 *
	 * @return the string
	 */
	public String help() {
		return this.post(new JsonRpc20.Builder().setMethod("help").getJson(), StringValue.class);
	}

	/**
	 * Help string.
	 *
	 * @param method the method
	 * @return the string
	 */
	public String help(String method) {
		return this.post(new JsonRpc20.Builder().setMethod("help").appendParams(method).getJson(), StringValue.class);
	}

	/**
	 * Logging logger status.
	 *
	 * @return the logger status
	 */
	public LoggerStatus logging() {
		return this.post(new JsonRpc20.Builder().setMethod("logging").getJson(), LoggerStatus.Result.class);
	}

	/**
	 * Logging logger status.
	 *
	 * @param include_category the include category
	 * @param exclude_category the exclude category
	 * @return the logger status
	 */
	public LoggerStatus logging(String[] include_category, String[] exclude_category) {
		return this.post(new JsonRpc20.Builder().setMethod("logging").appendParams(include_category).appendParams(exclude_category).getJson(), LoggerStatus.Result.class);
	}

	/**
	 * Stop string.
	 *
	 * @return the string
	 */
	public String stop() {
		return this.post(new JsonRpc20.Builder().setMethod("stop").getJson(), StringValue.class);
	}

	/**
	 * Uptime long.
	 *
	 * @return the long
	 */
	public long uptime() {
		return this.post(new JsonRpc20.Builder().setMethod("uptime").getJson(), LongValue.class);
	}

}
