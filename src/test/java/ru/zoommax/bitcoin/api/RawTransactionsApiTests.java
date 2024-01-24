package ru.zoommax.bitcoin.api;

import java.io.File;
import java.io.IOException;

import org.junit.Before;

import com.fasterxml.jackson.databind.ObjectMapper;

import ru.zoommax.bitcoin.NodeSettings;
import ru.zoommax.bitcoin.bitcore25.api.rawtransactions.RawTransactionsApi;

public class RawTransactionsApiTests {
	private RawTransactionsApi api;

	@Before
	public void setUp() throws IOException {
		final ObjectMapper mapper = new ObjectMapper();
		final NodeSettings settings = mapper.readValue(new File("NodeSettings.json"), NodeSettings.class);
		api = new RawTransactionsApi(settings.getUser(), settings.getPass(), settings.getUrl());
	}
}
