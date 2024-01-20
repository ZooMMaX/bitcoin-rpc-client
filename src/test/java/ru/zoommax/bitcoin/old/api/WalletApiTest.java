package ru.zoommax.bitcoin.old.api;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Before;
import ru.zoommax.bitcoin.NodeSettings;
import ru.zoommax.bitcoin.old.model.AccountTransaction;
import ru.zoommax.bitcoin.old.model.AccountType;
import ru.zoommax.bitcoin.old.model.WalletInfo;
import ru.zoommax.bitcoin.old.model.WalletTransaction;
import org.junit.Assert;
import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.math.BigDecimal;

import static org.junit.Assert.*;

public class WalletApiTest {

    private WalletApi api;
    private RawTransactionsApi txapi;

    @Before
    public void setUp() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        NodeSettings settings = mapper.readValue(new File("NodeSettings.json"), NodeSettings.class);
        api = new WalletApi(settings.getUser(), settings.getPass(), settings.getUrl());
        txapi = new RawTransactionsApi(settings.getUser(), settings.getPass(), settings.getUrl());
    }

    @Test
    public void testGetNewAddress() {
        {
            //mqzVGj7zVBpDWUaARroejuRHVkTCKZUoF3
            api.getNewAddress("legacy", AccountType.legacy);
            //2MtRi17d2R41E2CNKr4JJC54tdCRe6q5u17
            api.getNewAddress("p2shSegwit", AccountType.p2shSegwit);
            //bcrt1qjlw72z0cthvx8sz5h9d4acnda6k2hjd8hd89uv
            String address = api.getNewAddress("bech32", AccountType.bech32);
            assertEquals(44, address.length());
        }
        String address = api.getNewAddress();
        assertEquals(35, address.length());
        String prevkey = api.dumpPrivateKey(address);
        assertEquals(52, prevkey.length());
    }

    @Test
    public void testImportAddress() {
        api.importAddress("1EVbakhm8HiXXwqsmX4mexCXPiq5Ym7jjK", "");
    }

    @Test
    public void testListTransactions() {
        api.listTransactions("");
        AccountTransaction[] txs = api.listTransactions();
        for (AccountTransaction tx : txs) {
            txapi.getRawTransaction(tx.getTxid());
            //System.out.println(String.format("%s, %s, %s, %s, %s", rtx.getVin()[0].getVout(), rtx.getVout()[0].getN(), tx.getTxid(), tx.getVout(), tx.getBlockindex()));
        }
    }

    @Test
    public void testGetAccountAddress_GetAccount() {
        String eg = "test";
        String addr = api.getAccountAddress(eg);
        assertNotNull(addr);
        api.getAddressInfo(addr);
        String acc = api.getAccount(addr);
        assertEquals(eg, acc);
    }

    @Test
    public void testSendFrom() {
        //2NDF1TpMjYqHGtj7BekRX9Eohvz8gHVnhaB :: cVbZxoFUvCFpkjtqrSiRWDHsWC9mSDd7aMr5Eg91Yp1khNt8EeGe
        String txid = api.sendFrom("", "2NDF1TpMjYqHGtj7BekRX9Eohvz8gHVnhaB", 0.1);
        assertEquals(64, txid.length());
        txid = api.sendFrom("", "2NDF1TpMjYqHGtj7BekRX9Eohvz8gHVnhaB", 0.1, 1, "hello", "test");
        assertEquals(64, txid.length());
    }

    @Test
    public void listLabels() {
        String[] strings = api.listLabels();
        assertTrue(strings.length > 0);
        strings = api.listLabels(WalletApi.Purpose.receive);
    }

    @Test
    public void listLockUnspent() {
    }

    @Test
    public void getTransaction() {
        String hash = "975963a54b2131f526fd9cfa9309c91dc4ec4bdce64b101cfe69e059f579c70a";
        WalletTransaction wt = api.getTransaction(hash, false);
        System.out.println(wt);
        BigDecimal de = api.getUnconfirmedBalance();
        System.out.println(de);
        WalletInfo info = api.getWalletInfo();
        Assert.assertNotNull(info.getWalletname());
    }

    @Test
    public void importPrivateKey() {
        String hash = "975963a54b2131f526fd9cfa9309c91dc4ec4bdce64b101cfe69e059f579c70a";
        String label = api.listAccountsName()[0];
        String add = api.getAddressesByAccount(label)[0];
        String ss = api.dumpPrivateKey(add);
        api.importPrivateKey(ss, label, false);

    }
}