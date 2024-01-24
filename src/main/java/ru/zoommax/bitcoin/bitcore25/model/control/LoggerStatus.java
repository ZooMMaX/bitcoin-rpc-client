package ru.zoommax.bitcoin.bitcore25.model.control;

import lombok.Getter;
import lombok.Setter;
import ru.zoommax.bitcoin.JsonRpcResult;

@Getter
@Setter
public class LoggerStatus {

	public static class Result extends JsonRpcResult<LoggerStatus> {
	}

	private boolean addrman;
	private boolean bench;
	private boolean blockstorage;
	private boolean cmpctblock;
	private boolean coindb;
	private boolean estimatefee;
	private boolean http;
	private boolean i2p;
	private boolean ipc;
	private boolean leveldb;
	private boolean libevent;
	private boolean mempool;
	private boolean mempoolrej;
	private boolean net;
	private boolean proxy;
	private boolean prune;
	private boolean qt;
	private boolean rand;
	private boolean reindex;
	private boolean rpc;
	private boolean scan;
	private boolean selectcoins;
	private boolean tor;
	private boolean txpackages;
	private boolean txreconciliation;
	private boolean util;
	private boolean validation;
	private boolean walletdb;
	private boolean zmq;

}
