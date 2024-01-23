package ru.zoommax.bitcoin.bitcore25.model.blockchain.deploymentinfo;

import lombok.Getter;
import lombok.Setter;

/**
 * The type Deployment.
 */
@Getter
@Setter
public class Deployment {
    /**
     * The Type.
     */
    private String type;
    /**
     * The Height.
     */
    private long height;
    /**
     * The Active.
     */
    private boolean active;
    /**
     * The Bip 9.
     */
    private Bip9 bip9;
}
