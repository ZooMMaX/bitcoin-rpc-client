package ru.zoommax.bitcoin.model;

/**
 * The enum Account type.
 */
public enum AccountType {
    /**
     * The Legacy.
     */
    legacy("legacy"),
    /**
     * The P 2 sh segwit.
     */
    p2shSegwit("p2sh-segwit"),
    /**
     * The Bech 32.
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