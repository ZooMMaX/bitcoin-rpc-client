package ru.zoommax.bitcoin.old;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Before;
import ru.zoommax.bitcoin.HttpException;
import ru.zoommax.bitcoin.NodeSettings;
import ru.zoommax.bitcoin.old.api.BlockChainApi;
import org.junit.Test;
import ru.zoommax.bitcoin.old.model.*;

import java.io.File;
import java.io.IOException;
import java.util.Map;

import static org.junit.Assert.*;

public class BitcoinTest {

    private BlockChainApi api;

    @Before
    public void setUp() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        NodeSettings settings = mapper.readValue(new File("NodeSettings.json"), NodeSettings.class);
        api = new BlockChainApi(settings.getUser(), settings.getPass(), settings.getUrl());
    }

    @Test
    public void getBestBlockHash() {
        //String basic = Credentials.basic("btcrpc", "9pDbNxQJjXUpZKQNYoFQiWDqYXyyrd29");
        String hash = api.getBestBlockHash();
        // {"result":"0000000000000000000fc70207790a878fa2b7f58769454e84eeec93b1ccc1e4","error":null,"id":1}
    }

    @Test
    public void getBlock() {
        api.getBlock("000000000000002f08c27c742d5dbfa6db81d3c426ec2487f9d28da201ffded5");
    }

    @Test
    public void getblockchaininfo() {
        api.getBlockChainInfo();
    }

    @Test
    public void getBlockCount() {
        long count = api.getBlockCount();
        assertTrue(count > 100);
    }

    @Test
    public void getBlockHash() {
        String hash = api.getBlockHash(10);
        assertTrue(hash.startsWith("00000000"));
    }

    @Test
    public void getBlockHeader() {
        BlockHeader header = api.getBlockHeader("000000000000002f08c27c742d5dbfa6db81d3c426ec2487f9d28da201ffded5");
        assertEquals(2572996, header.getHeight());
    }

    @Test
    public void getBlockStats() {
        BlockStats header = api.getBlockStats(100);
        header = api.getBlockStats(header.getBlockhash(), "height", "txs");
        assertEquals(100, header.getHeight());
    }

    @Test
    public void getChainTips() {
        ChainTip[] header = api.getChainTips();
        assertTrue(header.length > 0);
    }

    @Test
    public void getChainTxStats() {
        ChainTxStats header = api.getChainTxStats();
        assertTrue(header.getWindowFinalBlockHash().startsWith("000000"));
    }

    @Test
    public void getDifficulty() {
        api.getDifficulty();
    }

    @Test
    public void getMemPoolInfo() {
        MemPoolInfo val = api.getMemPoolInfo();
        assertTrue(val.getSize() > 0);
    }

    @Test
    public void getRawMemPool() {
        String[] val = api.getRawMemPool();
        assertTrue(val.length > 0);
    }

    @Test
    public void getRawMemPoolTx() {
        Map<String, MemPoolTxInfo> val = api.getRawMemPoolTx();
        assertFalse(val.values().isEmpty());
    }

    @Test
    public void getMemPoolAncestors() {
        String[] val = api.getRawMemPool();
        api.getMemPoolAncestors(val[2]);
    }

    @Test
    public void getMemPoolDescendants() {
        String[] val = api.getRawMemPool();
        api.getMemPoolDescendants(val[2]);
    }

    @Test
    public void getMemPoolEntry() {
        String[] val = api.getRawMemPool();
        api.getMemPoolEntry(val[2]);
    }

    @Test
    public void getTxOut() {
        String tx = api.getBlock("000000000000002f08c27c742d5dbfa6db81d3c426ec2487f9d28da201ffded5").getTx()[5];
        TransactionOut val = api.getTxOut(tx, 1, true);
        assertEquals("tb1p8e2er0hylk4u56ed3ex78q2jamx36pgfx70d3200w2lyukp5t58sxnkc4q", val.getScriptPubKey().getAddress());
    }

    @Test
    public void getTxOutProof() {
        String block = "000000000000002f08c27c742d5dbfa6db81d3c426ec2487f9d28da201ffded5";
        String[] txs = api.getBlock(block).getTx();
        //TransactionOut val = api.getTxOutProofByBlock("00000000000000000008f029112b79dceff814dcf02e1902474ac8051af16a8c", tx);
        String val = api.getTxOutProof(txs[5], txs[6]);
        assertTrue(val.startsWith("0000c020827ac6cd291c21c33cdfc170d5d807959b1e67ec5"));
        try {
            api.getTxOutProof(txs[5], "9ee02950bf0f95dc08f9b05048d190eedae3095d3828a8f57262d66382768a5f");
            fail();
        } catch (HttpException ex) {
            assertEquals(-5, ex.tryJsonError().getCode());
        }
    }

    @Test
    public void verifyChain() {
        api.verifyChain(3, 6);
    }

}