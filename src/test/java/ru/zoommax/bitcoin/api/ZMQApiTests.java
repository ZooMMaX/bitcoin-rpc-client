package ru.zoommax.bitcoin.api;

import java.io.File;
import java.io.IOException;

import org.junit.Before;
import org.junit.Test;

import com.fasterxml.jackson.databind.ObjectMapper;

import ru.zoommax.bitcoin.NodeSettings;
import ru.zoommax.bitcoin.bitcore25.api.zmq.ZMQApi;

public class ZMQApiTests {
	private ZMQApi api;

	@Before
	public void setUp() throws IOException {
		final ObjectMapper mapper = new ObjectMapper();
		final NodeSettings settings = mapper.readValue(new File("NodeSettings.json"), NodeSettings.class);
		api = new ZMQApi(settings.getUser(), settings.getPass(), settings.getUrl());
	}

	@Test
	public void notifications() {
		api.getZMQNotifications();
	}

}
