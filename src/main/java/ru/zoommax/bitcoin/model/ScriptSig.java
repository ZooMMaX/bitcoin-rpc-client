package ru.zoommax.bitcoin.model;

/**
 * The type Script sig.
 */
public class ScriptSig {

    /**
     * The Asm.
     */
    private String asm;
    /**
     * The Hex.
     */
    private String hex;

    /**
     * Sets asm.
     *
     * @param asm the asm
     */
    public void setAsm(String asm) {
        this.asm = asm;
    }

    /**
     * Gets asm.
     *
     * @return the asm
     */
    public String getAsm() {
        return asm;
    }

    /**
     * Sets hex.
     *
     * @param hex the hex
     */
    public void setHex(String hex) {
        this.hex = hex;
    }

    /**
     * Gets hex.
     *
     * @return the hex
     */
    public String getHex() {
        return hex;
    }

}