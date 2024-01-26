package ru.zoommax.bitcoin.bitcore25.model.rawtransactions.utxoupdatepsbt;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

/**
 * The type Descriptors.
 */
@Getter
public class Descriptors {
    /**
     * The Descriptors.
     */
    List<Object> descriptors = new ArrayList<>();

    /**
     * Add descriptor.
     *
     * @param descriptor the descriptor
     */
    public void addDescriptor(String descriptor) {
        this.descriptors.add(descriptor);
    }

    /**
     * Add descriptor.
     *
     * @param desc  the desc
     * @param range the range
     */
    public void addDescriptor(String desc, long[] range) {
        Descriptor descriptor = new Descriptor();
        descriptor.setDesc(desc);
        descriptor.setRange(range);
        this.descriptors.add(descriptor);
    }
}
