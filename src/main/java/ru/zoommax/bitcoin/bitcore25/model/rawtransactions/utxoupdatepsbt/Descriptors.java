package ru.zoommax.bitcoin.bitcore25.model.rawtransactions.utxoupdatepsbt;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
public class Descriptors {
    List<Object> descriptors = new ArrayList<>();

    public void addOutputDescriptor(String descriptor) {
        this.descriptors.add(descriptor);
    }

    public void addOutputDescriptor(String desc, long[] range) {
        Descriptor descriptor = new Descriptor();
        descriptor.setDesc(desc);
        descriptor.setRange(range);
        this.descriptors.add(descriptor);
    }
}
