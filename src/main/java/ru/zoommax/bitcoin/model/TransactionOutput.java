package ru.zoommax.bitcoin.model;

import java.math.BigInteger;
import java.util.Collections;
import java.util.Map;

/**
 * The interface Transaction output.
 */
public interface TransactionOutput {
    /**
     * To single map map.
     *
     * @return the map
     */
    Map<String, ?> toSingleMap();


    /**
     * To single maps map [ ].
     *
     * @param outputs the outputs
     * @return the map [ ]
     */
    public static Map<String, ?>[] toSingleMaps(TransactionOutput[] outputs) {
        Map<String, ?>[] map = new Map[outputs.length];
        for (int i = 0; i < outputs.length; i++) {
            map[i] = outputs[i].toSingleMap();
        }
        return map;
    }

    /**
     * The type Transaction.
     */
    public static class Transaction implements TransactionOutput {
        /**
         * The Address.
         */
        private final String address;
        /**
         * The Amount.
         */
        private final double amount;

        /**
         * Instantiates a new Transaction.
         *
         * @param address the address
         * @param amount  the amount
         */
        public Transaction(String address, double amount) {
            this.address = address;
            this.amount = amount;
        }

        @Override
        public Map<String, ?> toSingleMap() {
            return Collections.singletonMap(address, amount);
        }
    }

    /**
     * The type Data.
     */
    public static class Data implements TransactionOutput {
        /**
         * The Data.
         */
        private final byte[] data;

        /**
         * Instantiates a new Data.
         *
         * @param data the data
         */
        public Data(byte[] data) {
            this.data = data;
        }

        @Override
        public Map<String, ?> toSingleMap() {
            return Collections.singletonMap("data", new BigInteger(data).toString(16));
        }
    }
}
