package ru.zoommax.bitcoin.old.api;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Before;
import ru.zoommax.bitcoin.NodeSettings;
import ru.zoommax.bitcoin.old.model.AccountTransaction;
import ru.zoommax.bitcoin.old.model.TransactionInput;
import ru.zoommax.bitcoin.old.model.TransactionOutput;
import ru.zoommax.bitcoin.old.model.TransactionSign;
import org.junit.Test;

import java.io.File;
import java.io.IOException;

public class RawTransactionsApiTest {
    private WalletApi wallet;

    private RawTransactionsApi api;

    @Before
    public void setUp() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        NodeSettings settings = mapper.readValue(new File("NodeSettings.json"), NodeSettings.class);
        api = new RawTransactionsApi(settings.getUser(), settings.getPass(), settings.getUrl());
        wallet = new WalletApi(settings.getUser(), settings.getPass(), settings.getUrl());
    }

    @Test
    public void combineRawTransaction() {
        //api.combineRawTransaction();
    }

    @Test
    public void createRawTransaction() {
        AccountTransaction[] txs = wallet.listTransactions();
        AccountTransaction tx0 = txs[0];
        TransactionInput in = tx0.toTransactionInput();

        String address = wallet.getAccountAddress("target");
        TransactionOutput out = new TransactionOutput.Transaction(address, tx0.getAmount() - 0.001);
        String hex = api.createRawTransaction(new TransactionInput[]{in}, new TransactionOutput[]{out, new TransactionOutput.Data("test message".getBytes())});
        TransactionSign signHex = api.signRawTransaction(hex);
        api.sendRawTransaction(signHex.getHex());
    }

    @Test
    public void testCreateRawTransaction() {
    }

    @Test
    public void decodeRawTransaction() {
    }

    @Test
    public void decodeScript() {
    }

    @Test
    public void fundRawTransaction() {
    }

    @Test
    public void getRawTransaction() {
    }

    @Test
    public void getRawTransactionHex() {
    }

    @Test
    public void sendRawTransaction() {
    }

    @Test
    public void testSendRawTransaction() {
    }

    @Test
    public void signRawTransaction() {
    }

    @Test
    public void signRawTransactionWithKey() {
    }

    @Test
    public void testMemPoolAccept() {
    }
}