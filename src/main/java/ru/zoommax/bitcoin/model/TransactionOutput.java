package ru.zoommax.bitcoin.model;

import java.math.BigInteger;
import java.util.Collections;
import java.util.Map;

public interface TransactionOutput {
    Map<String, ?> toSingleMap();


    public static Map<String, ?>[] toSingleMaps(TransactionOutput[] outputs) {
        Map<String, ?>[] map = new Map[outputs.length];
        for (int i = 0; i < outputs.length; i++) {
            map[i] = outputs[i].toSingleMap();
        }
        return map;
    }

    public static class Transaction implements TransactionOutput {
        private final String address;
        private final double amount;

        public Transaction(String address, double amount) {
            this.address = address;
            this.amount = amount;
        }

        @Override
        public Map<String, ?> toSingleMap() {
            return Collections.singletonMap(address, amount);
        }
    }

    public static class Data implements TransactionOutput {
        private final byte[] data;

        public Data(byte[] data) {
            this.data = data;
        }

        @Override
        public Map<String, ?> toSingleMap() {
            return Collections.singletonMap("data", new BigInteger(data).toString(16));
        }
    }
}
