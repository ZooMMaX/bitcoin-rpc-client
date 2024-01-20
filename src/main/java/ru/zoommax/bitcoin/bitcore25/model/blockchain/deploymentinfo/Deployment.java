package ru.zoommax.bitcoin.bitcore25.model.blockchain.deploymentinfo;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Deployment {
    private String type;
    private long height;
    private boolean active;
    private Bip9 bip9;
}
