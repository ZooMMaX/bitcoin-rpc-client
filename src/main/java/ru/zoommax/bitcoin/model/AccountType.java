package ru.zoommax.bitcoin.model;

public enum AccountType {
        legacy("legacy"), p2shSegwit("p2sh-segwit"), bech32("bech32");
        private final String type;

        AccountType(String type) {
            this.type = type;
        }

        public String getType() {
            return type;
        }
    }