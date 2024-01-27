package ru.zoommax.bitcoin.api;

import java.io.File;
import java.io.IOException;

import org.junit.Before;
import org.junit.Test;

import com.fasterxml.jackson.databind.ObjectMapper;

import ru.zoommax.bitcoin.NodeSettings;
import ru.zoommax.bitcoin.bitcore25.api.control.ControlApi;

public class ControlApiTests {
	private ControlApi api;

	@Before
	public void setUp() throws IOException {
		final ObjectMapper mapper = new ObjectMapper();
		final NodeSettings settings = mapper.readValue(new File("NodeSettings.json"), NodeSettings.class);
		api = new ControlApi(settings.getUser(), settings.getPass(), settings.getUrl());
	}

	@Test
	public void getMemoryInfo() {
		api.getMemoryInfo();
		api.getMemoryInfoMI();
	}

	@Test
	public void getRpcInfo() {
		api.getRpcInfo();
	}

	@Test
	public void help() {
		api.help();
	}

	@Test
	public void helpWithMethod() {
		api.help("getrpcinfo");
	}

	@Test
	public void logging() {
		api.logging();
	}

	@Test
	public void loggingExt() {
		api.logging(new String[] { "all" }, new String[] { "libevent" });
	}

	@Test
	public void stop() {
		// WORKS CORRECTLY! xDD
		//api.stop();
	}

	@Test
	public void uptime() {
		api.uptime();
	}

}
