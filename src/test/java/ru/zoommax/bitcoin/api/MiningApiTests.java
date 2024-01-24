package ru.zoommax.bitcoin.api;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Before;
import org.junit.Test;
import ru.zoommax.bitcoin.NodeSettings;
import ru.zoommax.bitcoin.bitcore25.api.control.ControlApi;
import ru.zoommax.bitcoin.bitcore25.api.mining.MiningApi;

import java.io.File;
import java.io.IOException;

public class MiningApiTests {
    private MiningApi api;

    @Before
    public void setUp() throws IOException {
        final ObjectMapper mapper = new ObjectMapper();
        final NodeSettings settings = mapper.readValue(new File("NodeSettings.json"), NodeSettings.class);
        api = new MiningApi(settings.getUser(), settings.getPass(), settings.getUrl());
    }

    @Test
    public void getBlockTemplate() {
        api.getBlockTemplate();
    }
}
