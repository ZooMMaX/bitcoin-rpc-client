package ru.zoommax.bitcoin.model;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The type Embedded.
 */
public class Embedded {


    /**
     * The Script.
     */
    @JsonProperty("isscript")
    private boolean script;
    /**
     * The Witness.
     */
    @JsonProperty("iswitness")
    private boolean witness;
    /**
     * The Witness version.
     */
    @JsonProperty("witness_version")
    private int witnessVersion;
    /**
     * The Witness program.
     */
    @JsonProperty("witness_program")
    private String witnessProgram;
    /**
     * The Pubkey.
     */
    private String pubkey;
    /**
     * The Address.
     */
    private String address;
    /**
     * The Script pub key.
     */
    private String scriptPubKey;

    /**
     * Is script boolean.
     *
     * @return the boolean
     */
    public boolean isScript() {
        return script;
    }

    /**
     * Sets script.
     *
     * @param script the script
     */
    public void setScript(boolean script) {
        this.script = script;
    }

    /**
     * Is witness boolean.
     *
     * @return the boolean
     */
    public boolean isWitness() {
        return witness;
    }

    /**
     * Sets witness.
     *
     * @param witness the witness
     */
    public void setWitness(boolean witness) {
        this.witness = witness;
    }

    /**
     * Gets witness version.
     *
     * @return the witness version
     */
    public int getWitnessVersion() {
        return witnessVersion;
    }

    /**
     * Sets witness version.
     *
     * @param witnessVersion the witness version
     */
    public void setWitnessVersion(int witnessVersion) {
        this.witnessVersion = witnessVersion;
    }

    /**
     * Gets witness program.
     *
     * @return the witness program
     */
    public String getWitnessProgram() {
        return witnessProgram;
    }

    /**
     * Sets witness program.
     *
     * @param witnessProgram the witness program
     */
    public void setWitnessProgram(String witnessProgram) {
        this.witnessProgram = witnessProgram;
    }

    /**
     * Gets pubkey.
     *
     * @return the pubkey
     */
    public String getPubkey() {
        return pubkey;
    }

    /**
     * Sets pubkey.
     *
     * @param pubkey the pubkey
     */
    public void setPubkey(String pubkey) {
        this.pubkey = pubkey;
    }

    /**
     * Gets address.
     *
     * @return the address
     */
    public String getAddress() {
        return address;
    }

    /**
     * Sets address.
     *
     * @param address the address
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * Gets script pub key.
     *
     * @return the script pub key
     */
    public String getScriptPubKey() {
        return scriptPubKey;
    }

    /**
     * Sets script pub key.
     *
     * @param scriptPubKey the script pub key
     */
    public void setScriptPubKey(String scriptPubKey) {
        this.scriptPubKey = scriptPubKey;
    }
}