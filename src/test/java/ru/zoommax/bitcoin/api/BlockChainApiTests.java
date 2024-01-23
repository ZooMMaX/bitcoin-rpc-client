package ru.zoommax.bitcoin.api;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Before;
import org.junit.Test;
import ru.zoommax.bitcoin.NodeSettings;
import ru.zoommax.bitcoin.bitcore25.api.blockchain.BlockChainApi;
import ru.zoommax.bitcoin.bitcore25.model.blockchain.txspendingprevout.TxidVoutObj;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

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

    @Test
    public void getMempoolEntry() {
        api.getMempoolEntry("bb9f3638c26c16c1ca6972b2254beb13a3743e15c906490c94f327f04b9f8d13");
    }

    @Test
    public void getMempoolInfo() {
        api.getMempoolInfo();
    }

    @Test
    public void getRawMempool() {
        api.getRawMempool(true, true);
    }

    @Test
    public void getTxOut() {
        api.getTxOut("bb9f3638c26c16c1ca6972b2254beb13a3743e15c906490c94f327f04b9f8d13", 0, true);
    }

    @Test
    public void getTxOutProof() {
        api.getTxOutProof(new String[]{"bb9f3638c26c16c1ca6972b2254beb13a3743e15c906490c94f327f04b9f8d13"}, "0000000000000026933efb355468df206e3d57638eca663613fa6a604bd8aeab");
    }

    @Test
    public void getTxOutSetInfo() {
        api.getTxOutSetInfo("","",true);
    }

    @Test
    public void  getTxSpendingPrevout() {
        List<String> spendingtxids = new ArrayList<>();
        spendingtxids.add(new TxidVoutObj("bb9f3638c26c16c1ca6972b2254beb13a3743e15c906490c94f327f04b9f8d13", 1).getJsonObject());
        api.getTxSpendingPrevout(spendingtxids);
    }

    @Test
    public void preciousBlock() {
        api.preciousBlock("000000000000002f08c27c742d5dbfa6db81d3c426ec2487f9d28da201ffded5");
    }

    @Test
    public void pruneBlockchain() {
        api.pruneBlockchain(2575445);
    }

    @Test
    public void saveMempool() {
        api.saveMempool();
    }
}
