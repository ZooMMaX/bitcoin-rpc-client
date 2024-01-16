package ru.zoommax.bitcoin.api;

import org.junit.Assert;
import org.junit.Test;

public class NetworkApiTest {
    private NetworkApi api = new NetworkApi("user", "pwd", "http://127.0.0.1:18332/");

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