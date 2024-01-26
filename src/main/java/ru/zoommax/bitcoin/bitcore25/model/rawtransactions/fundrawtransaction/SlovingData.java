package ru.zoommax.bitcoin.bitcore25.model.rawtransactions.fundrawtransaction;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
public class SlovingData {
    private final List<String> pubkeys = new ArrayList<>();
    private final List<String> scripts = new ArrayList<>();
    private final List<String> descriptors = new ArrayList<>();

    public void addPubkey(String pubkey) {
        this.pubkeys.add(pubkey);
    }

    public void addScript(String script) {
        this.scripts.add(script);
    }

    public void addDescriptor(String descriptor) {
        this.descriptors.add(descriptor);
    }

    public void addPubkeyScript(String pubkey, String script) {
        this.addPubkey(pubkey);
        this.addScript(script);
    }

    public void addPubkeyDescriptor(String pubkey, String descriptor) {
        this.addPubkey(pubkey);
        this.addDescriptor(descriptor);
    }

    public void addScriptDescriptor(String script, String descriptor) {
        this.addScript(script);
        this.addDescriptor(descriptor);
    }

    public void addAll(String pubkey, String script, String descriptor) {
        this.addPubkey(pubkey);
        this.addScript(script);
        this.addDescriptor(descriptor);
    }
}
