package ru.zoommax.bitcoin.api;

import org.junit.Test;

public class GeneratingApiTest {
    //private static final Logger logger = LoggerFactory.getLogger(ControlApiTest.class);
    private GeneratingApi api = new GeneratingApi("user", "pwd", "http://127.0.0.1:18332/");

    @Test
    public void generate() {
        api.generate(1);
    }
}