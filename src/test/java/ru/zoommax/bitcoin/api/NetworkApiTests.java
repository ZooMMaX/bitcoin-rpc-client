package ru.zoommax.bitcoin.api;

import java.io.File;
import java.io.IOException;

import org.junit.Before;
import org.junit.Test;

import com.fasterxml.jackson.databind.ObjectMapper;

import ru.zoommax.bitcoin.NodeSettings;
import ru.zoommax.bitcoin.bitcore25.api.network.NetworkApi;

public class NetworkApiTests {
	private NetworkApi api;

	@Before
	public void setUp() throws IOException {
		final ObjectMapper mapper = new ObjectMapper();
		final NodeSettings settings = mapper.readValue(new File("NodeSettings.json"), NodeSettings.class);
		api = new NetworkApi(settings.getUser(), settings.getPass(), settings.getUrl());
	}

	@Test
	public void addNode() {
		api.addNode("testnode", "add");
	}

	@Test
	public void clearBanned() {
		api.clearBanned();
	}

	@Test
	public void disconnectNode() {
		api.disconnectNode();
		api.disconnectNode("testnode");
		api.disconnectNode(null, 1);
	}

	@Test
	public void getAddedNodeInfo() {
		api.getAddedNodeInfo();
		api.getAddedNodeInfo("testnode");
	}

	@Test
	public void getConnectionCount() {
		api.getConnectionCount();
	}

	@Test
	public void getNetTotals() {
		api.getNetTotals();
	}

	@Test
	public void getNetworkInfo() {
		api.getNetworkInfo();
	}

	@Test
	public void getNodeAddresses() {
		api.getNodeAddresses();
		api.getNodeAddresses(2);
	}

	@Test
	public void getPeerInfo() {
		api.getPeerInfo();
	}

	@Test
	public void getListBanned() {
		api.listBanned();
	}

	@Test
	public void ban() {
		api.setBan("", "");
	}

}
