package ru.zoommax.bitcoin.old.api;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Before;
import ru.zoommax.bitcoin.NodeSettings;
import ru.zoommax.bitcoin.old.model.LoggerStatus;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.io.IOException;

public class ControlApiTest {
    private static final Logger logger = LoggerFactory.getLogger(ControlApiTest.class);
    private ControlApi api;

    @Before
    public void setUp() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        NodeSettings settings = mapper.readValue(new File("NodeSettings.json"), NodeSettings.class);
        api = new ControlApi(settings.getUser(), settings.getPass(), settings.getUrl());
    }

    @Test
    public void getMemoryInfo() {
        api.getMemoryInfo();
    }

    @Test
    public void help() {
        api.help();
    }

    @Test
    public void logging() {
        LoggerStatus info = api.logging();
        LoggerStatus str = api.logging(new String[]{"all"}, new String[]{"http"});
    }

    @Test
    public void stop() {
        LoggerStatus info = api.logging();
        LoggerStatus str = api.logging(new String[]{"all"}, new String[]{"http"});
    }

    @Test
    public void uptime() {
    }
}