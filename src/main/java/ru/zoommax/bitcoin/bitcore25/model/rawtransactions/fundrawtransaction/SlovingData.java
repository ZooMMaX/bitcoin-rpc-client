package ru.zoommax.bitcoin.bitcore25.model.rawtransactions.fundrawtransaction;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

/**
 * The type Sloving data.
 */
@Getter
public class SlovingData {
    /**
     * The Pubkeys.
     */
    private final List<String> pubkeys = new ArrayList<>();
    /**
     * The Scripts.
     */
    private final List<String> scripts = new ArrayList<>();
    /**
     * The Descriptors.
     */
    private final List<String> descriptors = new ArrayList<>();

    /**
     * Add pubkey.
     *
     * @param pubkey the pubkey
     */
    public void addPubkey(String pubkey) {
        this.pubkeys.add(pubkey);
    }

    /**
     * Add script.
     *
     * @param script the script
     */
    public void addScript(String script) {
        this.scripts.add(script);
    }

    /**
     * Add descriptor.
     *
     * @param descriptor the descriptor
     */
    public void addDescriptor(String descriptor) {
        this.descriptors.add(descriptor);
    }

    /**
     * Add pubkey script.
     *
     * @param pubkey the pubkey
     * @param script the script
     */
    public void addPubkeyScript(String pubkey, String script) {
        this.addPubkey(pubkey);
        this.addScript(script);
    }

    /**
     * Add pubkey descriptor.
     *
     * @param pubkey     the pubkey
     * @param descriptor the descriptor
     */
    public void addPubkeyDescriptor(String pubkey, String descriptor) {
        this.addPubkey(pubkey);
        this.addDescriptor(descriptor);
    }

    /**
     * Add script descriptor.
     *
     * @param script     the script
     * @param descriptor the descriptor
     */
    public void addScriptDescriptor(String script, String descriptor) {
        this.addScript(script);
        this.addDescriptor(descriptor);
    }

    /**
     * Add all.
     *
     * @param pubkey     the pubkey
     * @param script     the script
     * @param descriptor the descriptor
     */
    public void addAll(String pubkey, String script, String descriptor) {
        this.addPubkey(pubkey);
        this.addScript(script);
        this.addDescriptor(descriptor);
    }
}
