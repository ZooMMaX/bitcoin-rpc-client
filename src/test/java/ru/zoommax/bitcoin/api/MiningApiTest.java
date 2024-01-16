package ru.zoommax.bitcoin.api;

import org.junit.Test;

public class MiningApiTest {
    private MiningApi api = new MiningApi("user", "pwd", "http://127.0.0.1:18332/");

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