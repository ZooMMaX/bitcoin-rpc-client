package ru.zoommax.bitcoin.api;

import ru.zoommax.bitcoin.model.AccountTransaction;
import ru.zoommax.bitcoin.model.TransactionInput;
import ru.zoommax.bitcoin.model.TransactionOutput;
import ru.zoommax.bitcoin.model.TransactionSign;
import org.junit.Test;

public class RawTransactionsApiTest {

    private RawTransactionsApi api = new RawTransactionsApi("user", "pwd", "http://127.0.0.1:18332/");
    private WalletApi wallet = new WalletApi("user", "pwd", "http://127.0.0.1:18332/");

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