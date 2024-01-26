package ru.zoommax.bitcoin.api;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Before;
import org.junit.Test;
import ru.zoommax.bitcoin.NodeSettings;
import ru.zoommax.bitcoin.bitcore25.api.rawtransactions.RawTransactionsApi;
import ru.zoommax.bitcoin.bitcore25.model.rawtransactions.createpsbt.CreatePsbtRequestArgs;

import java.io.File;
import java.io.IOException;

public class RawTransactionsApiTests {
	private RawTransactionsApi api;

	@Before
	public void setUp() throws IOException {
		final ObjectMapper mapper = new ObjectMapper();
		final NodeSettings settings = mapper.readValue(new File("NodeSettings.json"), NodeSettings.class);
		api = new RawTransactionsApi(settings.getUser(), settings.getPass(), settings.getUrl());
	}

	@Test
	public void createPsbtRequestArgs(){
		CreatePsbtRequestArgs args = new CreatePsbtRequestArgs();
		args.addInput("f5b72a0c4b1d0b5b4bce3d4d1f7f0f9e5e8c9b9b9b9b9b9b9b9b9b9b9b9b9b9", 0);
		args.addInput("f5b72a0c4b1d0b5b4bce3d4d1f7f0f9e5e8c9b9b9b9b9b9b9b9b9b9b9b9b9b9", 1, 4294967295L);
		args.addOutput("2N1xZJbW9q2oQZ9P8ZoJn1j1t5t7Z1rjH8p", 0.0001, "6a", "deadbeef");
		args.addOutput("2N1xZJbW9q2oQZ9P8ZoJn1j1t5t7Z1rjH8P", 0.0001, "6b", "deadbeff");

		System.out.println(args.getInputs());
		System.out.println(args.getOutputs());
	}
}
