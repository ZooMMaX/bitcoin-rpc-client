package ru.zoommax.bitcoin.api;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Before;
import org.junit.Test;
import ru.zoommax.bitcoin.NodeSettings;
import ru.zoommax.bitcoin.bitcore25.api.blockchain.BlockChainApi;

import java.io.File;
import java.io.IOException;

public class BlockChainApiTests {
    private BlockChainApi api;

    @Before
    public void setUp() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        NodeSettings settings = mapper.readValue(new File("NodeSettings.json"), NodeSettings.class);
        api = new BlockChainApi(settings.getUser(), settings.getPass(), settings.getUrl());
    }

    @Test
    public void getBestBlockHash() {
        api.getBestBlockHash();
    }

    @Test
    public void getBlock() {
        api.getBlock("000000000000002f08c27c742d5dbfa6db81d3c426ec2487f9d28da201ffded5");
    }

    @Test
    public void getBlockChainInfo() {
        api.getBlockChainInfo();
    }

    @Test
    public void getBlockCount() {
        api.getBlockCount();
    }

    @Test
    public void getBlockFilter() {
        api.getBlockFilter("000000000000002f08c27c742d5dbfa6db81d3c426ec2487f9d28da201ffded5", "basic");
    }

    @Test
    public void getBlockHash() {
        api.getBlockHash(5000);
    }

    @Test
    public void getBlockHeader() {
        api.getBlockHeader("000000000000002f08c27c742d5dbfa6db81d3c426ec2487f9d28da201ffded5", true);
    }

    @Test
    public void getChainTips() {
        api.getChainTips();
    }

    @Test
    public void getChainTxStats() {
        api.getChainTxStats(1, null);
    }

    @Test
    public void getDeploymentInfo() {
        api.getDeploymentInfo(null);
    }

    @Test
    public void getDifficulty() {
        api.getDifficulty();
    }

    @Test
    public void getMempoolAncestors() {
        api.getMempoolAncestors("1008a8251287b08e8185fc6e5e64d17ece3bb3a01b8454c51b4b8dd38bb28de4", true);
    }

    @Test
    public void getMempoolDescendants(){
        api.getMempoolDescendants("1008a8251287b08e8185fc6e5e64d17ece3bb3a01b8454c51b4b8dd38bb28de4", true);
    }
}
