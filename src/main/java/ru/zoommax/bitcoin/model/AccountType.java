package ru.zoommax.bitcoin.model;

/**
 * The enum Account type.
 */
public enum AccountType {
    /**
     * Legacy account type.
     */
    legacy("legacy"),
    /**
     * P 2 sh segwit account type.
     */
    p2shSegwit("p2sh-segwit"),
    /**
     * Bech 32 account type.
     */
    bech32("bech32");
    /**
     * The Type.
     */
    private final String type;

    /**
     * Instantiates a new Account type.
     *
     * @param type the type
     */
    AccountType(String type) {
            this.type = type;
        }

    /**
     * Gets type.
     *
     * @return the type
     */
    public String getType() {
            return type;
        }
    }