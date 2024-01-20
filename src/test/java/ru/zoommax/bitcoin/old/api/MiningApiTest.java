package ru.zoommax.bitcoin.old.api;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Before;
import org.junit.Test;
import ru.zoommax.bitcoin.NodeSettings;

import java.io.File;
import java.io.IOException;

public class MiningApiTest {
    private MiningApi api;

    @Before
    public void setUp() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        NodeSettings settings = mapper.readValue(new File("NodeSettings.json"), NodeSettings.class);
        api = new MiningApi(settings.getUser(), settings.getPass(), settings.getUrl());
    }

    @Test
    public void getBlockTemplate() {
        api.getBlockTemplate();
    }
    @Test
    public void getMiningInfo(){
        api.getMiningInfo();
    }

    @Test
    public void getNetworkHashPS() {
        api.getNetworkHashPS();
    }

    @Test
    public void prioritiseTransaction() {
        //api.prioritiseTransaction();
    }
}