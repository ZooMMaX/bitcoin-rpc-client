package ru.zoommax.bitcoin.old.api;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Before;
import org.junit.Test;
import ru.zoommax.bitcoin.NodeSettings;

import java.io.File;
import java.io.IOException;

public class GeneratingApiTest {
    private GeneratingApi api;

    @Before
    public void setUp() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        //private static final Logger logger = LoggerFactory.getLogger(ControlApiTest.class);
        NodeSettings settings = mapper.readValue(new File("NodeSettings.json"), NodeSettings.class);
        api = new GeneratingApi(settings.getUser(), settings.getPass(), settings.getUrl());
    }

    @Test
    public void generate() {
        api.generate(1);
    }
}