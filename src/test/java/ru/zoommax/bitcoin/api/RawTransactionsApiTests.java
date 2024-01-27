package ru.zoommax.bitcoin.api;

import java.io.File;
import java.io.IOException;

import org.junit.Before;
import org.junit.Test;

import com.fasterxml.jackson.databind.ObjectMapper;

import ru.zoommax.bitcoin.NodeSettings;
import ru.zoommax.bitcoin.bitcore25.api.rawtransactions.RawTransactionsApi;
import ru.zoommax.bitcoin.bitcore25.model.rawtransactions.createjson.PsbtRequestArgsJson;
import ru.zoommax.bitcoin.bitcore25.model.rawtransactions.fundrawtransaction.InputWeights;
import ru.zoommax.bitcoin.bitcore25.model.rawtransactions.fundrawtransaction.Options;
import ru.zoommax.bitcoin.bitcore25.model.rawtransactions.fundrawtransaction.SlovingData;
import ru.zoommax.bitcoin.bitcore25.model.rawtransactions.utxoupdatepsbt.Descriptors;

public class RawTransactionsApiTests {
	private RawTransactionsApi api;

	@Before
	public void setUp() throws IOException {
		final ObjectMapper mapper = new ObjectMapper();
		final NodeSettings settings = mapper.readValue(new File("NodeSettings.json"), NodeSettings.class);
		api = new RawTransactionsApi(settings.getUser(), settings.getPass(), settings.getUrl());
	}

	@Test
	public void createPsbtRequestArgs() {
		final PsbtRequestArgsJson args = new PsbtRequestArgsJson();
		args.addInput("f5b72a0c4b1d0b5b4bce3d4d1f7f0f9e5e8c9b9b9b9b9b9b9b9b9b9b9b9b9b9", 0);
		args.addInput("f5b72a0c4b1d0b5b4bce3d4d1f7f0f9e5e8c9b9b9b9b9b9b9b9b9b9b9b9b9b9", 1, 4294967295L);
		args.addOutput("2N1xZJbW9q2oQZ9P8ZoJn1j1t5t7Z1rjH8p", 0.0001, "6a", "deadbeef");
		args.addOutput("2N1xZJbW9q2oQZ9P8ZoJn1j1t5t7Z1rjH8P", 0.0001, "6b", "deadbeff");

		System.out.println(args.getInputs());
		System.out.println(args.getOutputs());
	}

	@Test
	public void inputWeights() {
		final InputWeights inputWeights = new InputWeights();
		inputWeights.addInputWeight("f5b72a0c4b1d0b5b4bce3d4d1f7f0f9e5e8c9b9b9b9b9b9b9b9b9b9b9b9b9b9", 0, 100);
		inputWeights.addInputWeight("f5b72a0c4b1d0b5b4bce3d4d1f7f0f9e5e8c9b9b9b9b9b9b9b9b9b9b9b9b9bf", 1, 200);
		final SlovingData slovingData = new SlovingData();
		slovingData.addAll("6a", "deadbeef", "desc");
		slovingData.addAll("6b", "deadbeff", "desc");

		final Options options = Options.builder()
				.add_inputs(true)
				.include_unsafe(true)
				.minconf(1)
				.maxconf(9999999)
				.changeAddress("2N1xZJbW9q2oQZ9P8ZoJn1j1t5t7Z1rjH8p")
				.changePosition(0)
				.change_type("legacy")
				.includeWatching(true)
				.lockUnspents(true)
				.fee_rate(0.0001)
				.feeRate(0.0001)
				.subtractFeeFromOutputs(new long[]{0})
				.inputWeights(inputWeights.getInputWeights())
				.conf_target(6)
				.estimate_mode("UNSET")
				.replaceable(true)
				.solving_data(slovingData)
				.build();
		System.out.println(new ObjectMapper().valueToTree(options).toString());
	}

	@Test
	public void descriptors() {
		final Descriptors descriptors = new Descriptors();
		descriptors.addDescriptor("string");
		final long[] longs = new long[]{1, 2};
		descriptors.addDescriptor("string", longs);
		System.out.println(new ObjectMapper().valueToTree(descriptors).toString());
	}
}
