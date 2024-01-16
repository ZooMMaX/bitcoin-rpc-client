package ru.zoommax.bitcoin.model;

public class ScriptSig {

    private String asm;
    private String hex;

    public void setAsm(String asm) {
        this.asm = asm;
    }

    public String getAsm() {
        return asm;
    }

    public void setHex(String hex) {
        this.hex = hex;
    }

    public String getHex() {
        return hex;
    }

}