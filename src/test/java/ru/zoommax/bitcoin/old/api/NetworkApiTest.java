package ru.zoommax.bitcoin.old.api;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import ru.zoommax.bitcoin.NodeSettings;

import java.io.File;
import java.io.IOException;

public class NetworkApiTest {
    private NetworkApi api;

    @Before
    public void setUp() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        NodeSettings settings = mapper.readValue(new File("NodeSettings.json"), NodeSettings.class);
        api = new NetworkApi(settings.getUser(), settings.getPass(), settings.getUrl());
    }

    @Test
    public void addNode() {
        api.addNode("", NetworkApi.Options.add);
    }

    @Test
    public void clearBanned() {
        api.clearBanned();
    }

    @Test
    public void disconnectNode() {
        api.disconnectNode("");
        Assert.fail();
    }


    @Test
    public void testGetAddedNodeInfo() {
        api.getAddedNodeInfo("");
        Assert.fail();
    }

    @Test
    public void getAddedNodeInfo() {
        api.getAddedNodeInfo();
        Assert.fail();
    }

    @Test
    public void getConnectionCount() {
        api.getConnectionCount();
    }

    @Test
    public void getNetTotals() {
        api.getNetTotals();
    }

    @Test
    public void getNetworkInfo() {
        api.getNetworkInfo();
    }

    @Test
    public void getPeerInfo() {
        api.getPeerInfo();
        Assert.fail();
    }

    @Test
    public void listBanned() {
        api.listBanned();
        Assert.fail();
    }

    @Test
    public void ping() {
        api.ping();
    }

    @Test
    public void setBan() {
        api.setBan("", NetworkApi.BanOptions.add);
        Assert.fail();
    }

    @Test
    public void setNetworkActive() {
        api.setNetworkActive(true);
    }
}